(ns rich4clojure.medium.problem-112
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Sequs Horribilis =
;; By 4Clojure user: ghoseb
;; Difficulty: Medium
;; Tags: [seqs]
;; 
;; Create a function which takes an integer and a nested
;; collection of integers as arguments. Analyze the
;; elements of the input collection and return a sequence
;; which maintains the nested structure, and which
;; includes all elements starting from the head whose sum
;; is less than or equal to the input integer.

(comment
  
  )

(tests
 (__ 10 [1 2 [3 [4 5] 6] 7]) := (quote (1 2 (3 (4))))
 (__ 30 [1 2 [3 [4 [5 [6 [7 8]] 9]] 10] 11]) := (quote (1 2 (3 (4 (5 (6 (7)))))))
 (__ 9 (range)) := (quote (0 1 2 3))
 (__ 1 [[[[[1]]]]]) := (quote (((((1))))))
 (__ 0 [1 2 [3 [4 5] 6] 7]) := (quote ())
 (__ 0 [0 0 [0 [0]]]) := (quote (0 0 (0 (0))))
 (__ 1 [-10 [1 [2 3 [4 5 [6 7 [8]]]]]]) := (quote (-10 (1 (2 3 (4))))))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/dfcf8ebb019b5ab679b66d1f812edddf