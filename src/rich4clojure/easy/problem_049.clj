(ns rich4clojure.easy.problem-049
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Split a sequence =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; Tags: [seqs core-functions]
;; 
;; Write a function which will split a sequence into two
;; parts.

(def restricted [split-at])

(def __ :tests-will-fail)

(comment
  
  )

(tests
  (__ 3 [1 2 3 4 5 6]) := [[1 2 3] [4 5 6]]
  (__ 1 [:a :b :c :d]) := [[:a] [:b :c :d]]
  (__ 2 [[1 2] [3 4] [5 6]]) := [[[1 2] [3 4]] [[5 6]]])

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/27721e1df66462290127eb4a0775915a