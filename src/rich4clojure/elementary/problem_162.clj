(ns rich4clojure.elementary.problem-162
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Logical falsity and truth =
;; By 4Clojure user: hangkous
;; Difficulty: Elementary
;; Tags: [logic]
;; 
;; In Clojure, only nil and false represent the values of
;; logical falsity in conditional tests - anything else is
;; logical truth.

(def __ 1)

(comment
  
  )

(tests
  __ := (if-not false 1 0)
  __ := (if-not nil 1 0)
  __ := (if true 1 0)
  __ := (if [] 1 0)
  __ := (if [0] 1 0)
  __ := (if 0 1 0)
  __ := (if 1 1 0))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/ef5021f621afad511d1a4b5505fc231f