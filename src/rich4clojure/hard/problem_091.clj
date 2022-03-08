(ns rich4clojure.hard.problem-091
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
;; todo:
;; 1: build graph from the edge set
;; 2: graph-dfs on graph start one vertex
;; 3: all nodes have path cover 
(def __ :tests-will-fail)

(comment
  
  )

(tests
  true := (__ #{[:a :a]})
  true := (__ #{[:a :b]})
  false := (__ #{[1 2] [2 3] [3 1]
               [4 5] [5 6] [6 4]})
  true := (__ #{[1 2] [2 3] [3 1]
              [4 5] [5 6] [6 4] [3 4]})
  false := (__ #{[:a :b] [:b :c] [:c :d]
               [:x :y] [:d :a] [:b :e]})
  true := (__ #{[:a :b] [:b :c] [:c :d]
              [:x :y] [:d :a] [:b :e] [:x :a]}))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/8b02371d00dc7b202887d2acf58f3be8
