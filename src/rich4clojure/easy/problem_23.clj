(ns rich4clojure.easy.problem-23
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Reverse a Sequence =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; Tags: [seqs core-functions]
;; 
;; Write a function which reverses a sequence.

(def restricted [reverse rseq])

(def __ :tests-will-fail)

(comment
  
  )

(tests
 (__ [1 2 3 4 5]) := [5 4 3 2 1]
 (__ (sorted-set 5 7 2 7)) := (quote (7 5 2))
 (__ [[1 2] [3 4] [5 6]]) := [[5 6] [3 4] [1 2]])

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/904085bff870b46beca9c51605e1b3fc