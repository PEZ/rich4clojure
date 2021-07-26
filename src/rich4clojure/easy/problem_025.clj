(ns rich4clojure.easy.problem-025
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Find the odd numbers =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; Tags: [seqs]
;; 
;; Write a function which returns only the odd numbers
;; from a sequence.

(def __ :tests-will-fail)

(comment
  
  )

(tests
  (__ #{1 2 3 4 5}) := '(1 3 5)
  (__ [4 2 1 6]) := '(1)
  (__ [2 2 4 6]) := '()
  (__ [1 1 1 3]) := '(1 1 1 3))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/5e9cf292d770f5e9dfabe8f4a9e10be3