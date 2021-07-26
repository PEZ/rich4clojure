(ns rich4clojure.medium.problem-043
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Reverse Interleave =
;; By 4Clojure user: amalloy
;; Difficulty: Medium
;; Tags: [seqs]
;; 
;; Write a function which reverses the interleave process
;; into x number of subsequences.

(def __ :tests-will-fail)

(comment
  
  )

(tests
  (__ [1 2 3 4 5 6] 2) := '((1 3 5) (2 4 6))
  (__ (range 9) 3) := '((0 3 6) (1 4 7) (2 5 8))
  (__ (range 10) 5) := '((0 5) (1 6) (2 7) (3 8) (4 9)))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/22a521dbd7918006dd82f9617e7a92a7