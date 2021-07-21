(ns rich4clojure.easy.problem-143
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = dot product =
;; By 4Clojure user: bloop
;; Difficulty: Easy
;; Tags: [seqs math]
;; 
;; Create a function that computes the dot product of two
;; sequences. You may assume that the vectors will have
;; the same length.

(def __ :tests-will-fail)

(comment
  
  )

(tests
 0 := (__ [0 1 0] [1 0 0])
 3 := (__ [1 1 1] [1 1 1])
 32 := (__ [1 2 3] [4 5 6])
 256 := (__ [2 5 6] [100 10 1]))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/9b1601d03554162866074ac2fd15f4de