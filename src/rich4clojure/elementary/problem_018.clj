(ns rich4clojure.elementary.problem-018
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Sequences: filter =
;; By 4Clojure user: dbyrne
;; Difficulty: Elementary
;; 
;; The filter function takes two arguments: a predicate
;; function (f) and a sequence (s). Filter returns a new
;; sequence consisting of all the items of s for which (f
;; item) returns true.

(def __ :tests-will-fail)

(comment
  
  )

(tests
  __ := (filter #(> % 5) '(3 4 5 6 7)))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/5f4df173b9c2f1075262f0f821d83ab0