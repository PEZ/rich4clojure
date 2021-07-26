(ns rich4clojure.easy.problem-048
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Intro to some =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; 
;; The some function takes a predicate function and a
;; collection. It returns the first logical true value of
;; (predicate x) where x is an item in the collection.

(def __ :tests-will-fail)

(comment
  
  )

(tests
  __ := (some #{2 7 6} [5 6 7 8])
  __ := (some #(when (even? %) %) [5 6 7 8]))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/e8d9e038324cff43641994d657d9ec93