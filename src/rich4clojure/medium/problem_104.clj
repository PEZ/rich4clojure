(ns rich4clojure.medium.problem-104
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Write Roman Numerals =
;; By 4Clojure user: 0x89
;; Difficulty: Medium
;; Tags: [strings math]
;; 
;; This is the inverse of Problem 92, but much easier.
;; Given an integer smaller than 4000, return the
;; corresponding roman numeral in uppercase, adhering to
;; the subtractive principle .

(def __ :tests-will-fail)

(comment
  
  )

(tests
  "I" := (__ 1)
  "XXX" := (__ 30)
  "IV" := (__ 4)
  "CXL" := (__ 140)
  "DCCCXXVII" := (__ 827)
  "MMMCMXCIX" := (__ 3999)
  "XLVIII" := (__ 48))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/99336a4cfdbb80b30d640f4b51134a42