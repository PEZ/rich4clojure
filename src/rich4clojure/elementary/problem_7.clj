(ns rich4clojure.elementary.problem-7
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Vectors: conj =
;; By 4Clojure user: dbyrne
;; Difficulty: Elementary
;; 
;; When operating on a Vector, the conj function will
;; return a new vector with one or more items "added" to
;; the end.

(def __ :tests-will-fail)

(comment
  
  )

(tests
 __ := (conj [1 2 3] 4)
 __ := (conj [1 2] 3 4))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/5863d15b78b837e8cdfeb5e97e23d28b