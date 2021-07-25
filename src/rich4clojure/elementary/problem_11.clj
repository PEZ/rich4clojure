(ns rich4clojure.elementary.problem-11
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Maps: conj =
;; By 4Clojure user: dbyrne
;; Difficulty: Elementary
;; 
;; When operating on a map, the conj function returns a
;; new map with one or more key-value pairs "added".

(def __ :tests-will-fail)

(comment
  
  )

(tests
  {:a 1, :b 2, :c 3} := (conj {:a 1} __ [:c 3]))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/3a6532504180b1b65534b75a804d6f82