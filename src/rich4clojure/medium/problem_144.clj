(ns rich4clojure.medium.problem-144
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Oscilrate =
;; By 4Clojure user: bloop
;; Difficulty: Medium
;; Tags: [sequences]
;; 
;; Write an oscillating iterate: a function that takes an
;; initial value and a variable number of functions. It
;; should return a lazy sequence of the functions applied
;; to the value in order, restarting from the first
;; function after it hits the end.

(def __ :tests-will-fail)

(comment
  
  )

(tests
  (take 3 (__ 3.14 int double)) := [3.14 3 3.0]
  (take 5 (__ 3 #(- % 3) #(+ 5 %))) := [3 0 5 2 7]
  (take 12 (__ 0 inc dec inc dec inc)) := [0 1 0 1 0 1 2 1 2 1 2 3])

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/91327b30de4e44c5f3b17d0c17a50e3e