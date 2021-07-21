(ns rich4clojure.easy.problem-28
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Flatten a Sequence =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; Tags: [seqs core-functions]
;; 
;; Write a function which flattens a sequence.

(def restricted [flatten])

(comment
  
  )

(tests
 (__ (quote ((1 2) 3 [4 [5 6]]))) := (quote (1 2 3 4 5 6))
 (__ ["a" ["b"] "c"]) := (quote ("a" "b" "c"))
 (__ (quote ((((:a)))))) := (quote (:a)))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/0c6e3c48cac7434882ca4b2c71ebfce1