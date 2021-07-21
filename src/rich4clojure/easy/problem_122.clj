(ns rich4clojure.easy.problem-122
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Read a binary number =
;; By 4Clojure user: mikera
;; Difficulty: Easy
;; 
;; Convert a binary number, provided in the form of a
;; string, to its numerical value.

(comment
  
  )

(tests
 0 := (__ "0")
 7 := (__ "111")
 8 := (__ "1000")
 9 := (__ "1001")
 255 := (__ "11111111")
 1365 := (__ "10101010101")
 65535 := (__ "1111111111111111"))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/561d7a007e4aa32a0c66655ef9e802c7