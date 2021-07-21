(ns rich4clojure.hard.problem-79
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Triangle Minimal Path =
;; By 4Clojure user: dbyrne
;; Difficulty: Hard
;; Tags: [graph-theory]
;; 
;; Write a function which calculates the sum of the
;; minimal path through a triangle. The triangle is
;; represented as a collection of vectors. The path should
;; start at the top of the triangle and move to an
;; adjacent number on the next row until the bottom of the
;; triangle is reached.

(def __ :tests-will-fail)

(comment
  
  )

(tests
 7 := (__ (quote ([1] [2 4] [5 1 4] [2 3 4 5])))
 20 := (__ (quote ([3] [2 4] [1 9 3] [9 9 2 4] [4 6 6 7 8] [5 7 3 5 1 4]))))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/de67b77aadddea34b2f4997952d4f101