(ns rich4clojure.medium.problem-75
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Euler's Totient Function =
;; By 4Clojure user: dbyrne
;; Difficulty: Medium
;; 
;; Two numbers are coprime if their greatest common
;; divisor equals 1. Euler's totient function f(x) is
;; defined as the number of positive integers less than x
;; which are coprime to x. The special case f(1) equals 1.
;; Write a function which calculates Euler's totient
;; function.

(comment
  
  )

(tests
 (__ 1) := 1
 (__ 10) := (count (quote (1 3 7 9)))
 (__ 40) := 16
 (__ 99) := 60)

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/da5e5c50f14f015708f967e20b450874