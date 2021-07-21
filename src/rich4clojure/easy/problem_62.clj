(ns rich4clojure.easy.problem-62
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Re-implement Iterate =
;; By 4Clojure user: amalloy
;; Difficulty: Easy
;; Tags: [seqs core-functions]
;; 
;; Given a side-effect free function f and an initial
;; value x write a function which returns an infinite lazy
;; sequence of x, (f x), (f (f x)), (f (f (f x))), etc.

(def restricted [iterate])

(comment
  
  )

(tests
 (take 5 (__ (fn* [p1__16210#] (* 2 p1__16210#)) 1)) := [1 2 4 8 16]
 (take 100 (__ inc 0)) := (take 100 (range))
 (take 9 (__ (fn* [p1__16211#] (inc (mod p1__16211# 3))) 1)) := (take 9 (cycle [1 2 3])))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/8d8c071f4df40d8671599b0882174b44