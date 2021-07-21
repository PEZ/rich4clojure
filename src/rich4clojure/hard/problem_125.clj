(ns rich4clojure.hard.problem-125
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Gus' Quinundrum =
;; By 4Clojure user: amcnamara
;; Difficulty: Hard
;; Tags: [logic fun brain-teaser]
;; 
;; Create a function of no arguments which returns a
;; string that is an exact copy of the function itself.
;; 
;; 
;; Hint: read this if you get stuck (this question is
;; harder than it first appears); but it's worth the
;; effort to solve it independently if you can!
;; 
;; 
;; Fun fact: Gus is the name of the 4Clojure dragon .

(def __ :tests-will-fail)

(comment
  
  )

(tests
 (str (quote __)) := (__))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/d3ec1d923933de20ce7ba66afe6a8d45