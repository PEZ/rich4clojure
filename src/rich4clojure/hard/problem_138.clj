(ns rich4clojure.hard.problem-138
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Squares Squared =
;; By 4Clojure user: amcnamara
;; Difficulty: Hard
;; Tags: [data-juggling]
;; 
;; Create a function of two integer arguments: the start
;; and end, respectively. You must create a vector of
;; strings which renders a 45° rotated square of integers
;; which are successive squares from the start point up to
;; and including the end point. If a number comprises
;; multiple digits, wrap them around the shape
;; individually. If there are not enough digits to
;; complete the shape, fill in the rest with asterisk
;; characters. The direction of the drawing should be
;; clockwise, starting from the center of the shape and
;; working outwards, with the initial direction being down
;; and to the right.

(comment
  
  )

(tests
 (__ 2 2) := ["2"]
 (__ 2 4) := [" 2 " "* 4" " * "]
 (__ 3 81) := [" 3 " "1 9" " 8 "]
 (__ 4 20) := [" 4 " "* 1" " 6 "]
 (__ 2 256) := ["  6  " " 5 * " "2 2 *" " 6 4 " "  1  "]
 (__ 10 10000) := ["   0   " "  1 0  " " 0 1 0 " "* 0 0 0" " * 1 * " "  * *  " "   *   "])

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/6c062309b30e92df2388c081427a5fd4