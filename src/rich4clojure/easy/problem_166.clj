(ns rich4clojure.easy.problem-166
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Comparisons =
;; By 4Clojure user: daowen
;; Difficulty: Easy
;; 
;; For any orderable data type it's possible to derive all
;; of the basic comparison operations (<, ≤, =, ≠, ≥, and
;; >) from a single operation (any operator but = or ≠
;; will work). Write a function that takes three
;; arguments, a less than operator for the data and two
;; items to compare. The function should return a keyword
;; describing the relationship between the two items. The
;; keywords for the relationship between x and y are as
;; follows:
;; 
;; * x = y → :eq
;; * x > y → :gt
;; * x < y → :lt

(def __ :tests-will-fail)

(comment
  
  )

(tests
 :gt := (__ < 5 1)
 :eq := (__ (fn [x y] (< (count x) (count y))) "pear" "plum")
 :lt := (__ (fn [x y] (< (mod x 5) (mod y 5))) 21 3)
 :gt := (__ > 0 2))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/6057fba465c3af1d06a9703d4ebdc7d1