(ns rich4clojure.elementary.problem-004
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Intro to Lists =
;; By 4Clojure user: dbyrne
;; Difficulty: Elementary
;; 
;; Lists can be constructed with either a function or a
;; quoted form.
;; 
;; Note: You can't redefine `__` to solve this problem.
;; You will need to replace `__` in the `(tests ...)`
;; form.

(def __ :tests-will-fail)

(comment
  
  )

(tests
  (list :a :b :c) := '(:a :b :c))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/447fba2735f190ec4786a4b2cf7d5b76