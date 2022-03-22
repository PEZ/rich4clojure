(ns rich4clojure.medium.problem-105
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Identify keys and values =
;; By 4Clojure user: amalloy
;; Difficulty: Medium
;; Tags: [maps seqs]
;; 
;; Given an input sequence of keywords and numbers, create
;; a map such that each key in the map is a keyword, and
;; the value is a sequence of all the numbers (if any)
;; between it and the next keyword in the sequence.

(defn solution [coll]
  (let [result {}
        prepared  (for [[k v] (partition 2 (partition-by type coll))]
                    (if (= 1 (count k))
                      [(first k) (vec v)]
                      (let [[head & tail] (reverse k)]
                        (cons [head (vec v)]
                              (for [new-k tail]
                                [new-k []])))))]
   (into {} (apply list* prepared))))

(defn solution
  "use arguments tricks and use hash-map to keep the results"
  [coll]
  (letfn [(build-map [a c [x & y]]
            (if x
              (if (ifn? x)
                (build-map (assoc a x []) x y)
                (build-map (update-in a [c] conj x) c y))
              a))]
    (build-map {} nil coll)))
;; no matter       ^
;; ________________| 
;; is nil "=" or any other, if the first element is keyword, ifn? will be true. 
;; It will skip the c

(def __ solution)

(comment
  
  )

(tests
  {} := (__ [])
  {:a [1]} := (__ [:a 1])
  {:a [1], :b [2]} := (__ [:a 1, :b 2])
  {:a [1 2 3], :b [], :c [4]} := (__ [:a 1 2 3 :b :c 4]))
;; Share your solution, and/or check how others did it:
;; https://gist.github.com/da9a4c4197dc581cb9635fe8358bc62d
