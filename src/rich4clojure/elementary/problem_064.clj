(ns rich4clojure.elementary.problem-064
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Intro to Reduce =
;; By 4Clojure user: citizen428
;; Difficulty: Elementary
;; Tags: [seqs]
;; 
;; Reduce takes a 2 argument function and an optional
;; starting value. It then applies the function to the
;; first 2 items in the sequence (or the starting value
;; and the first element of the sequence). In the next
;; iteration the function will be called on the previous
;; return value and the next item from the sequence, thus
;; reducing the entire collection to one value. Don't
;; worry, it's not as complicated as it sounds.

(def __ :tests-will-fail)

(comment
  
  )

(tests
  15 := (reduce __ [1 2 3 4 5])
  0 := (reduce __ [])
  6 := (reduce __ 1 [2 3]))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/94e7ff60b2323d795e30e8d7e185b72e