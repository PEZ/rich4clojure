(ns rich4clojure.easy.problem-157
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Indexing Sequences =
;; By 4Clojure user: jaycfields
;; Difficulty: Easy
;; Tags: [seqs]
;; 
;; Transform a sequence into a sequence of pairs
;; containing the original elements along with their
;; index.

(def __ :tests-will-fail)

(comment
  
  )

(tests
 (__ [:a :b :c]) := [[:a 0] [:b 1] [:c 2]]
 (__ [0 1 3]) := (quote ((0 0) (1 1) (3 2)))
 (__ [[:foo] {:bar :baz}]) := [[[:foo] 0] [{:bar :baz} 1]])

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/efa257369fd08ba1dcef6bec34d04ede