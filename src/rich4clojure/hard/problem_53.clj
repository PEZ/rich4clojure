(ns rich4clojure.hard.problem-53
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Longest Increasing Sub-Seq =
;; By 4Clojure user: dbyrne
;; Difficulty: Hard
;; Tags: [seqs]
;; 
;; Given a vector of integers, find the longest
;; consecutive sub-sequence of increasing numbers. If two
;; sub-sequences have the same length, use the one that
;; occurs first. An increasing sub-sequence must have a
;; length of 2 or greater to qualify.

(comment
  
  )

(tests
 (__ [1 0 1 2 3 0 4 5]) := [0 1 2 3]
 (__ [5 6 1 3 2 7]) := [5 6]
 (__ [2 3 3 4 5]) := [3 4 5]
 (__ [7 6 5 4]) := [])

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/2cd6e7158b0ea3d24d125c997a0f8d1e