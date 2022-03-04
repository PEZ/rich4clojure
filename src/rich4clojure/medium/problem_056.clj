(ns rich4clojure.medium.problem-056
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Find Distinct Items =
;; By 4Clojure user: dbyrne
;; Difficulty: Medium
;; Tags: [seqs core-functions]
;; 
;; Write a function which removes the duplicates from a
;; sequence. Order of the items must be maintained.

(def restricted [distinct])

(defn solution
  [coll]
  (letfn [(step [xs seen]
            (when-let [s (seq xs)]
              (if (contains?  seen (first xs))
                (recur (rest s) seen)
                (cons (first xs) (step (rest s) (conj seen (first xs)))))))]
    (step coll #{})))

  (def __ solution)

(comment
  (solution [1 2 1 3 1 2 4] )
  )

(tests
  (__ [1 2 1 3 1 2 4]) := [1 2 3 4]
  (__ [:a :a :b :b :c :c]) := [:a :b :c]
  (__ '([2 4] [1 2] [1 3] [1 3])) := '([2 4] [1 2] [1 3])
  (__ (range 50)) := (range 50))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/a509841669465f47ccd96fe847387b3e
