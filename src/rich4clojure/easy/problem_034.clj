(ns rich4clojure.easy.problem-034
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Implement range =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; Tags: [seqs core-functions]
;; 
;; Write a function which creates a list of all integers
;; in a given range.

(def restricted [range])

(def __ :tests-will-fail)

(comment
  
  )

(tests
  (__ 1 4) := '(1 2 3)
  (__ -2 2) := '(-2 -1 0 1)
  (__ 5 8) := '(5 6 7))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/6ebd843c6422d507efa327bee4bf0b50