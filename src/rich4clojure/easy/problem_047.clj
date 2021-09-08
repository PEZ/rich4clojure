(ns rich4clojure.easy.problem-047
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Contain Yourself =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; 
;; The contains? function checks if a KEY is present in a
;; given collection. This often leads beginner clojurians
;; to use it incorrectly with numerically indexed
;; collections like vectors and lists.

(def __ :tests-will-fail)

(comment
  
  )

(tests
  (contains? #{4 5 6} __) := true
  (contains? [1 1 1 1 1] __) := true
  (contains? {4 :a 2 :b} __) := true
  (contains? [1 2 4] __) := false)

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/cbcede67c0c350f7d800b078a5c0f525
