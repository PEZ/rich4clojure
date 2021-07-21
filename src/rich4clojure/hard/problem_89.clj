(ns rich4clojure.hard.problem-89
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Graph Tour =
;; By 4Clojure user: lucas1000001
;; Difficulty: Hard
;; Tags: [graph-theory]
;; 
;; Starting with a graph you must write a function that
;; returns true if it is possible to make a tour of the
;; graph in which every edge is visited exactly once.
;; 
;; 
;; The graph is represented by a vector of tuples, where
;; each tuple represents a single edge.
;; 
;; 
;; The rules are:
;; 
;; 
;; - You can start at any node.
;; 
;; - You must visit each edge exactly once.
;; 
;; - All edges are undirected.

(comment
  
  )

(tests
 true := (__ [[:a :b]])
 false := (__ [[:a :a] [:b :b]])
 false := (__ [[:a :b] [:a :b] [:a :c] [:c :a] [:a :d] [:b :d] [:c :d]])
 true := (__ [[1 2] [2 3] [3 4] [4 1]])
 true := (__ [[:a :b] [:a :c] [:c :b] [:a :e] [:b :e] [:a :d] [:b :d] [:c :e] [:d :e] [:c :f] [:d :f]])
 false := (__ [[1 2] [2 3] [2 4] [2 5]]))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/af87973306f77532cbc396513392babc