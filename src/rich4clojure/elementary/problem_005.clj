(ns rich4clojure.elementary.problem-005
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Lists: conj =
;; By 4Clojure user: dbyrne
;; Difficulty: Elementary
;; 
;; When operating on a list, the conj function will return
;; a new list with one or more items "added" to the front.
;; 
;; Note that there are two test cases, but you are
;; expected to supply only one answer, which will cause
;; all the tests to pass.

(def __ '(1 2 3 4))

(comment
  
  )

(tests
  __ := (conj '(2 3 4) 1)
  __ := (conj '(3 4) 2 1))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/efe2f5aa74f08899ea993bdfaab8da59