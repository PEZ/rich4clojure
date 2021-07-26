(ns rich4clojure.hard.problem-092
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Read Roman numerals =
;; By 4Clojure user: amalloy
;; Difficulty: Hard
;; Tags: [strings math]
;; 
;; Roman numerals are easy to recognize, but not everyone
;; knows all the rules necessary to work with them. Write
;; a function to parse a Roman-numeral string and return
;; the number it represents.
;; 
;; 
;; You can assume that the input will be well-formed, in
;; upper-case, and follow the subtractive principle. You
;; don't need to handle any numbers greater than MMMCMXCIX
;; (3999), the largest number representable with ordinary
;; letters.

(def __ :tests-will-fail)

(comment
  
  )

(tests
  14 := (__ "XIV")
  827 := (__ "DCCCXXVII")
  3999 := (__ "MMMCMXCIX")
  48 := (__ "XLVIII"))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/08b1683167d5da70037757a6be3efe0a