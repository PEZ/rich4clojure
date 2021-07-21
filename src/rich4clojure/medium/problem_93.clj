(ns rich4clojure.medium.problem-93
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Partially Flatten a Sequence =
;; By 4Clojure user: dbyrne
;; Difficulty: Medium
;; Tags: [seqs]
;; 
;; Write a function which flattens any nested combination
;; of sequential things (lists, vectors, etc.), but
;; maintains the lowest level sequential items. The result
;; should be a sequence of sequences with only one level
;; of nesting.

(comment
  
  )

(tests
 (__ [["Do"] ["Nothing"]]) := [["Do"] ["Nothing"]]
 (__ [[[[:a :b]]] [[:c :d]] [:e :f]]) := [[:a :b] [:c :d] [:e :f]]
 (__ (quote ((1 2) ((3 4) ((((5 6)))))))) := (quote ((1 2) (3 4) (5 6))))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/9510d5981c9fc900634ab838fad7db5e