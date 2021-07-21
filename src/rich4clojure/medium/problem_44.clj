(ns rich4clojure.medium.problem-44
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Rotate Sequence =
;; By 4Clojure user: dbyrne
;; Difficulty: Medium
;; Tags: [seqs]
;; 
;; Write a function which can rotate a sequence in either
;; direction.

(def __ :tests-will-fail)

(comment
  
  )

(tests
 (__ 2 [1 2 3 4 5]) := (quote (3 4 5 1 2))
 (__ -2 [1 2 3 4 5]) := (quote (4 5 1 2 3))
 (__ 6 [1 2 3 4 5]) := (quote (2 3 4 5 1))
 (__ 1 (quote (:a :b :c))) := (quote (:b :c :a))
 (__ -4 (quote (:a :b :c))) := (quote (:c :a :b)))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/2a419f3d9e0c22be01179175f6a7d2f0