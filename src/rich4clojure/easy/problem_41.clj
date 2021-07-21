(ns rich4clojure.easy.problem-41
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Drop Every Nth Item =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; Tags: [seqs]
;; 
;; Write a function which drops every Nth item from a
;; sequence.

(def __ :tests-will-fail)

(comment
  
  )

(tests
 (__ [1 2 3 4 5 6 7 8] 3) := [1 2 4 5 7 8]
 (__ [:a :b :c :d :e :f] 2) := [:a :c :e]
 (__ [1 2 3 4 5 6] 4) := [1 2 3 5 6])

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/03788b118a3d7923f7aae143e8ef1aee