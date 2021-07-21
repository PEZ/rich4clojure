(ns rich4clojure.hard.problem-106
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Number Maze =
;; By 4Clojure user: lucas1000001
;; Difficulty: Hard
;; Tags: [numbers]
;; 
;; Given a pair of numbers, the start and end point, find
;; a path between the two using only three possible
;; operations:
;; * double
;; * halve (odd numbers cannot be halved)
;; * add 2
;; 
;; Find the shortest path through the "maze". Because
;; there are multiple shortest paths, you must return the
;; length of the shortest path, not the path itself.

(def __ :tests-will-fail)

(comment
  
  )

(tests
 1 := (__ 1 1)
 3 := (__ 3 12)
 3 := (__ 12 3)
 3 := (__ 5 9)
 9 := (__ 9 2)
 5 := (__ 9 12))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/efc7fec9d73f816c75a782476873e83d