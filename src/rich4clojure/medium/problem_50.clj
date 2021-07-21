(ns rich4clojure.medium.problem-50
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Split by Type =
;; By 4Clojure user: dbyrne
;; Difficulty: Medium
;; Tags: [seqs]
;; 
;; Write a function which takes a sequence consisting of
;; items with different types and splits them up into a
;; set of homogeneous sub-sequences. The internal order of
;; each sub-sequence should be maintained, but the
;; sub-sequences themselves can be returned in any order
;; (this is why 'set' is used in the test cases).

(def __ :tests-will-fail)

(comment
  
  )

(tests
 (set (__ [1 :a 2 :b 3 :c])) := #{[:a :b :c] [1 2 3]}
 (set (__ [:a "foo" "bar" :b])) := #{[:a :b] ["foo" "bar"]}
 (set (__ [[1 2] :a [3 4] 5 6 :b])) := #{[:a :b] [[1 2] [3 4]] [5 6]})

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/56425d809382d4b9f773a2d379cc26e0