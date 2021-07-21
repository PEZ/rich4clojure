(ns rich4clojure.hard.problem-91
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Graph Connectivity =
;; By 4Clojure user: lucas1000001
;; Difficulty: Hard
;; Tags: [graph-theory]
;; 
;; Given a graph, determine whether the graph is
;; connected. A connected graph is such that a path exists
;; between any two given nodes.
;; 
;; 
;; -Your function must return true if the graph is
;; connected and false otherwise.
;; 
;; 
;; -You will be given a set of tuples representing the
;; edges of a graph. Each member of a tuple being a
;; vertex/node in the graph.
;; 
;; 
;; -Each edge is undirected (can be traversed either
;; direction).

(comment
  
  )

(tests
 true := (__ #{[:a :a]})
 true := (__ #{[:a :b]})
 false := (__ #{[2 3] [6 4] [5 6] [4 5] [3 1] [1 2]})
 true := (__ #{[2 3] [3 4] [6 4] [5 6] [4 5] [3 1] [1 2]})
 false := (__ #{[:b :e] [:c :d] [:x :y] [:a :b] [:d :a] [:b :c]})
 true := (__ #{[:b :e] [:c :d] [:x :y] [:a :b] [:d :a] [:x :a] [:b :c]}))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/8b02371d00dc7b202887d2acf58f3be8