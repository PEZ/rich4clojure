(ns rich4clojure.medium.problem-110
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Sequence of pronunciations =
;; By 4Clojure user: mlni
;; Difficulty: Medium
;; Tags: [seqs]
;; 
;; Write a function that returns a lazy sequence of
;; "pronunciations" of a sequence of numbers. A
;; pronunciation of each element in the sequence consists
;; of the number of repeating identical numbers and the
;; number itself. For example, [1 1] is pronounced as [2
;; 1] ("two ones"), which in turn is pronounced as [1 2 1
;; 1] ("one two, one one").
;; 
;; Your function should accept an initial sequence of
;; numbers, and return an infinite lazy sequence of
;; pronunciations, each element being a pronunciation of
;; the previous element.

(def __ :tests-will-fail)

(comment
  
  )

(tests
  [[1 1] [2 1] [1 2 1 1]] := (take 3 (__ [1]))
  [3 1 2 4] := (first (__ [1 1 1 4 4]))
  [1 1 1 3 2 1 3 2 1 1] := (nth (__ [1]) 6)
  338 := (count (nth (__ [3 2]) 15)))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/f4169b69fdd707f14ae92e5b006ff4b0