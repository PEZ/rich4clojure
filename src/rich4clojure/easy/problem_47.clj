(ns rich4clojure.easy.problem-47
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Contain Yourself =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; 
;; The contains? function checks if a KEY is present in a
;; given collection. This often leads beginner clojurians
;; to use it incorrectly with numerically indexed
;; collections like vectors and lists.

(comment
  
  )

(tests
 #{4 6 5} := __
 [1 1 1 1 1] := __
 {4 :a, 2 :b} := __
 (contains? [1 2 4] __) := )

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/cbcede67c0c350f7d800b078a5c0f525