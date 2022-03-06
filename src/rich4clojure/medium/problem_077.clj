(ns rich4clojure.medium.problem-077
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Anagram Finder =
;; By 4Clojure user: dbyrne
;; Difficulty: Medium
;; 
;; Write a function which finds all the anagrams in a
;; vector of words. A word x is an anagram of word y if
;; all the letters in x can be rearranged in a different
;; order to form y. Your function should return a set of
;; sets, where each sub-set is a group of words which are
;; anagrams of each other. Each sub-set should have at
;; least two words. Words without any anagrams should not
;; be included in the result.

(defn solution [word-vec]
  (let [dict-word (map #(vector (group-by identity %) %) word-vec )
        merge-entity (fn [m e]
                       (let [[k v] e]
                         (if (contains? m k)
                           (assoc m k (conj (get m k) v))
                           (assoc m k [v]))))
        reduced-after-merge (reduce merge-entity {} dict-word)
        anagrams-vec (filter #(> (count %) 1) (vals reduced-after-merge))]
        (into #{} (map #(into #{} %) anagrams-vec))))

(defn solution2 
  "use sorted string as key"
  [word-vec]
  (let [dict-word (map #(vector (sort %) %) word-vec )
        merge-entity (fn [m e]
                       (let [[k v] e]
                         (if (contains? m k)
                           (assoc m k (conj (get m k) v))
                           (assoc m k [v]))))
        reduced-after-merge (reduce merge-entity {} dict-word)
        anagrams-vec (filter #(> (count %) 1) (vals reduced-after-merge))]
        (into #{} (map #(into #{} %) anagrams-vec))))

(defn solution3 
  "use merge-with into to simplify the merge-entity"
  [word-vec]
  (for [[_ x]
        (apply merge-with into 
               (for [s word-vec]
                 {(sort s) #{s}})) :when (< 1 (count x))]
    (into #{} x)))

(def __ solution3)

(comment
  (#(into #{}
              (for [[_ x]
                    (apply merge-with into
                           (for [s %] {(apply sorted-set s) #{s}}))
                    :when (< 1 (count x))]
                x)) ["meat" "mat" "team" "mate" "eat"])
  )

(tests
  (__ ["meat" "mat" "team" "mate" "eat"]) :=
   #{#{"meat" "team" "mate"}}
  (__ ["veer" "lake" "item" "kale" "mite" "ever"]) :=
   #{#{"veer" "ever"} #{"lake" "kale"} #{"mite" "item"}})

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/0ffdaf0cd713a4df991004e0fccf19ac
