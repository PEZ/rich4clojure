(ns rich4clojure.easy.problem-097
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Pascal's Triangle =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; 
;; Pascal's triangle is a triangle of numbers computed
;; using the following rules:
;; 
;; 
;; - The first row is 1.
;; 
;; - Each successive row is computed by adding together
;; adjacent numbers in the row above, and adding a 1 to
;; the beginning and end of the row.
;; 
;; 
;; Write a function which returns the nth row of Pascal's
;; Triangle.

(def __ :tests-will-fail)

(comment
  
  )

(tests
  (__ 1) := [1]
  (map __ (range 1 6)) :=
   [     [1]
        [1 1]
       [1 2 1]
      [1 3 3 1]
     [1 4 6 4 1]]
  (__ 11) :=
   [1 10 45 120 210 252 210 120 45 10 1])

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/8f92cec20d7adca8acce102adcbd01c8