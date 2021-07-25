(ns rich4clojure.medium.problem-60
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Sequence Reductions =
;; By 4Clojure user: dbyrne
;; Difficulty: Medium
;; Tags: [seqs core-functions]
;; 
;; Write a function which behaves like reduce, but returns
;; each intermediate value of the reduction. Your function
;; must accept either two or three arguments, and the
;; return sequence must be lazy.

(def restricted [reductions])

(def __ :tests-will-fail)

(comment
  
  )

(tests
  (take 5 (__ + (range))) := [0 1 3 6 10]
  (__ conj [1] [2 3 4]) := [[1] [1 2] [1 2 3] [1 2 3 4]]
  (last (__ * 2 [3 4 5])) := (reduce * 2 [3 4 5]) 120)

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/4688fc26154649a2735f14264938fa3b