(ns rich4clojure.medium.problem-105
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Identify keys and values =
;; By 4Clojure user: amalloy
;; Difficulty: Medium
;; Tags: [maps seqs]
;; 
;; Given an input sequence of keywords and numbers, create
;; a map such that each key in the map is a keyword, and
;; the value is a sequence of all the numbers (if any)
;; between it and the next keyword in the sequence.

(comment
  
  )

(tests
 {} := (__ [])
 {:a [1]} := (__ [:a 1])
 {:a [1], :b [2]} := (__ [:a 1 :b 2])
 {:a [1 2 3], :b [], :c [4]} := (__ [:a 1 2 3 :b :c 4]))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/da9a4c4197dc581cb9635fe8358bc62d