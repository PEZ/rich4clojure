(ns rich4clojure.easy.problem-083
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = A Half-Truth =
;; By 4Clojure user: cmeier
;; Difficulty: Easy
;; 
;; Write a function which takes a variable number of
;; booleans. Your function should return true if some of
;; the parameters are true, but not all of the parameters
;; are true. Otherwise your function should return false.
(defn solution [& coll]
  (> (count (into #{} coll)) 1))

(def __ solution)

(comment
  
  )

(tests
  false := (__ false false)
  true := (__ true false)
  false := (__ true)
  true := (__ false true false)
  false := (__ true true true)
  true := (__ true true true false))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/7fa7142a58af04b16b35d31ab00248a6
