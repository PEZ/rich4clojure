(ns rich4clojure.hard.problem-082
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Word Chains =
;; By 4Clojure user: dbyrne
;; Difficulty: Hard
;; Tags: [seqs]
;; 
;; A word chain consists of a set of words ordered so that
;; each word differs by only one letter from the words
;; directly before and after it. The one letter difference
;; can be either an insertion, a deletion, or a
;; substitution. Here is an example word chain:
;; 
;; 
;; cat -> cot -> coat -> oat -> hat -> hot -> hog -> dog
;; 
;; 
;; Write a function which takes a sequence of words, and
;; returns true if they can be arranged into one
;; continuous word chain, and false if they cannot.

(defn edit-dist 
  "Edit distance between two words
   refer to: https://en.wikipedia.org/wiki/Levenshtein_distance"
  [a b] 
  (cond 
    (not (or a b)) 0 
    (not b) (count a) 
    (not a) (count b) 
    :else (let [ra (next a) rb (next b)] 
            (if (= (first a) (first b)) 
              (edit-dist ra rb) 
              (+ 1 (min 
                    (edit-dist ra rb) 
                    (edit-dist ra b) 
                    (edit-dist a rb)))))))
(defn to-graph [word-set]
  (into {} 
        (for [s word-set] 
          [s (filter #(= 1 (edit-dist s %)) word-set)])))

(defn find-paths [graph start seen]
        (for [n (graph start)]
          (if (seen start)
            seen
            (find-paths graph n (conj seen start)))))

(def solution 
  (fn [word-set]
    (letfn [(edit-dist [a b] 
              (cond 
                (not (or a b)) 0 
                (not b) (count a) 
                (not a) (count b) 
                :else (let [ra (next a) rb (next b)] 
                        (if (= (first a) (first b)) 
                          (edit-dist ra rb) 
                          (+ 1 (min 
                                (edit-dist ra rb) 
                                (edit-dist ra b) 
                                (edit-dist a rb)))))))
            (find-paths [graph start seen] 
              (if (seen start) 
                seen
                (for [n (graph start)] 
                  (find-paths graph n (conj seen start)))))] 
      (let [graph (into {} 
                        (for [s word-set] 
                          [s (filter #(= 1 (edit-dist s %)) word-set)]))]
        (if (some (fn [w] 
                    (some #(= word-set %) 
                          (flatten (find-paths graph w #{})))) 
                  word-set) 
          true false)))))

(def __ solution)

(comment
  
  )

(tests
  true := (__ #{"hat" "coat" "dog" "cat" "oat" "cot" "hot" "hog"})
  false := (__ #{"cot" "hot" "bat" "fat"})
  false := (__ #{"to" "top" "stop" "tops" "toss"})
  true := (__ #{"spout" "do" "pot" "pout" "spot" "dot"})
  true := (__ #{"share" "hares" "shares" "hare" "are"})
  false := (__ #{"share" "hares" "hare" "are"}))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/9f1e130d45a4eb86b174a532a79b69b1
