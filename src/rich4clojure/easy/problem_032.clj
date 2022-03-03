(ns rich4clojure.easy.problem-032
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Duplicate a Sequence =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; Tags: [seqs]
;; 
;; Write a function which duplicates each element of a
;; sequence.
(defn solution [coll]
  (interleave coll coll))


(def __ solution)

(comment
  (flatten (map (partial repeat 2) [ 1 2 3 4]))
  )

(tests
  (__ [1 2 3]) := '(1 1 2 2 3 3)
  (__ [:a :a :b :b]) := '(:a :a :a :a :b :b :b :b)
  (__ [[1 2] [3 4]]) := '([1 2] [1 2] [3 4] [3 4])
  (__ [[1 2] [3 4]]) := '([1 2] [1 2] [3 4] [3 4]))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/9e936a6097fdb1fd7a8418a22e3e1170