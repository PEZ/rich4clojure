(ns rich4clojure.medium.problem-158
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Decurry =
;; By 4Clojure user: amcnamara
;; Difficulty: Medium
;; Tags: [partial-functions]
;; 
;; Write a function that accepts a curried function of
;; unknown arity n. Return an equivalent function of n
;; arguments.
;; 
;; You may wish to read this .

(def __ :tests-will-fail)

(comment
  
  )

(tests
  10 := ((__ (fn [a]
             (fn [b]
               (fn [c]
                 (fn [d]
                   (+ a b c d))))))
       1 2 3 4)
  24 := ((__ (fn [a]
             (fn [b]
               (fn [c]
                 (fn [d]
                   (* a b c d))))))
       1 2 3 4)
  25 := ((__ (fn [a]
             (fn [b]
               (* a b))))
       5 5))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/8bdf1dba5225cd748e4d53545f7f68f7