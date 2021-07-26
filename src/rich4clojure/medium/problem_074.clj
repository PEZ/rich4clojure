(ns rich4clojure.medium.problem-074
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Filter Perfect Squares =
;; By 4Clojure user: dbyrne
;; Difficulty: Medium
;; 
;; Given a string of comma separated integers, write a
;; function which returns a new comma separated string
;; that only contains the numbers which are perfect
;; squares.

(def __ :tests-will-fail)

(comment
  
  )

(tests
  (__ "4,5,6,7,8,9") := "4,9"
  (__ "15,16,25,36,37") := "16,25,36")

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/b90fcac09b35c74a07228dea603ddc73