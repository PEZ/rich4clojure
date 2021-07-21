(ns rich4clojure.easy.problem-30
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Compress a Sequence =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; Tags: [seqs]
;; 
;; Write a function which removes consecutive duplicates
;; from a sequence.

(def __ :tests-will-fail)

(comment
  
  )

(tests
 (apply str (__ "Leeeeeerrroyyy")) := Leroy
 (__ [1 1 2 3 3 2 2 3]) := (quote (1 2 3 2 3))
 (__ [[1 2] [1 2] [3 4] [1 2]]) := (quote ([1 2] [3 4] [1 2])))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/92a4bd13aaa6bffb80d7724de2c8e64d