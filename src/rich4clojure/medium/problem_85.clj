(ns rich4clojure.medium.problem-85
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Power Set =
;; By 4Clojure user: peteris
;; Difficulty: Medium
;; Tags: [set-theory]
;; 
;; Write a function which generates the power set of a
;; given set. The power set of a set x is the set of all
;; subsets of x, including the empty set and x itself.

(def __ :tests-will-fail)

(comment
  
  )

(tests
 (__ #{1 :a}) := #{#{1 :a} #{} #{1} #{:a}}
 (__ #{}) := #{#{}}
 (__ #{1 3 2}) := #{#{} #{3} #{2} #{1} #{1 3 2} #{1 3} #{1 2} #{3 2}}
 (count (__ (into #{} (range 10)))) := 1024)

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/ace16b73b8ec73ae84d8c83ceff9e568