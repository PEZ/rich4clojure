(ns rich4clojure.elementary.problem-57
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Simple Recursion =
;; By 4Clojure user: dbyrne
;; Difficulty: Elementary
;; Tags: [recursion]
;; 
;; A recursive function is a function which calls itself.
;; This is one of the fundamental techniques used in
;; functional programming.

(comment
  
  )

(tests
 __ := ((fn foo [x] (when (> x 0) (conj (foo (dec x)) x))) 5))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/c9b7a459e83135bcb56a2a1148e87216