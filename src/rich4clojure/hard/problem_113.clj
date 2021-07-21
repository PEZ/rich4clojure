(ns rich4clojure.hard.problem-113
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Making Data Dance =
;; By 4Clojure user: amcnamara
;; Difficulty: Hard
;; Tags: [types]
;; 
;; Write a function that takes a variable number of
;; integer arguments. If the output is coerced into a
;; string, it should return a comma (and space) separated
;; list of the inputs sorted smallest to largest. If the
;; output is coerced into a sequence, it should return a
;; seq of unique input elements in the same order as they
;; were entered.

(def restricted [proxy])

(def __ :tests-will-fail)

(comment
  
  )

(tests
 1, 2, 3 := (str (__ 2 1 3))
 (quote (2 1 3)) := (seq (__ 2 1 3))
 (quote (2 1 3)) := (seq (__ 2 1 3 3 1 2))
 (quote (1)) := (seq (apply __ (repeat 5 1)))
 1, 1, 1, 1, 1 := (str (apply __ (repeat 5 1)))
 (= nil (seq (__))) := (= "" (str (__))))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/5a33bc5bed21cf8105bcdc239b25e2de