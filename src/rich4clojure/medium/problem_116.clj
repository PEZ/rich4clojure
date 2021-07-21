(ns rich4clojure.medium.problem-116
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Prime Sandwich =
;; By 4Clojure user: amcnamara
;; Difficulty: Medium
;; Tags: [math]
;; 
;; A balanced prime is a prime number which is also the
;; mean of the primes directly before and after it in the
;; sequence of valid primes. Create a function which takes
;; an integer n, and returns true iff it is a balanced
;; prime.

(def __ :tests-will-fail)

(comment
  
  )

(tests
 false := (__ 4)
 true := (__ 563)
 1103 := (nth (filter __ (range)) 15))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/286f071c259fb6861c10beb7411bde48