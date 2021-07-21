(ns rich4clojure.medium.problem-131
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Sum Some Set Subsets =
;; By 4Clojure user: amcnamara
;; Difficulty: Medium
;; Tags: [math]
;; 
;; Given a variable number of sets of integers, create a
;; function which returns true iff all of the sets have a
;; non-empty subset with an equivalent summation.

(def __ :tests-will-fail)

(comment
  
  )

(tests
 true := (__ #{1 -1 99} #{888 -2 2} #{-3 7777 3})
 false := (__ #{1} #{2} #{3} #{4})
 true := (__ #{1})
 false := (__ #{1 -3 51 9} #{0} #{33 2 9 81})
 true := (__ #{1 3 5} #{4 11 9} #{-3 3 12} #{-2 4 -3 10})
 false := (__ #{-4 -2 -1 -6 -3 -5} #{7 1 4 6 3 2 9 5 8})
 true := (__ #{7 1 3 5} #{4 6 2 8})
 true := (__ #{7 -1 15 3 11 -9 -13 -5} #{1 13 -3 -15 -7 -11 9 5} #{-4 1 -2 4 -1 -8 2 8})
 true := (__ #{-4 7 1 -2 -8 -6 3 9 5 -10} #{4 -1 -3 6 2 -7 -9 10 -5 8}))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/208b537ca9e4b62751cfa7aa4fdc2461