(ns rich4clojure.easy.problem-24
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Sum It All Up =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; Tags: [seqs]
;; 
;; Write a function which returns the sum of a sequence of
;; numbers.

(def __ :tests-will-fail)

(comment
  
  )

(tests
  (__ [1 2 3]) := 6
  (__ (list 0 -2 5 5)) := 8
  (__ #{4 2 1}) := 7
  (__ '(0 0 -1)) := -1
  (__ '(1 10 3)) := 14)

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/feb88ed305b672c9897330561da6b331