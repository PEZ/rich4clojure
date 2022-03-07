(ns rich4clojure.hard.problem-089
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
(defn build-graph [edges m]
        (if-let [[k v] (first edges)]
          (if (contains? m k)
            (build-graph (rest edges) (assoc m k (into (m k) [v])))
            (build-graph (rest edges) (assoc m k [v])))
          m))

(defn find-paths [graph start seen]
        (for [n (graph start)]
          (if (some #(= start %) seen)
            seen
            (find-paths graph n (conj seen start)))))

(def edges [[:a :b] [:a :c] [:c :b] [:a :e]
              [:b :e] [:a :d] [:b :d] [:c :e]
            [:d :e] [:c :f] [:d :f]])

(def g (build-graph edges {}))

(def __ :tests-will-fail)

(comment
  
  )

(tests
  true := (__ [[:a :b]])
  false := (__ [[:a :a] [:b :b]])
  false := (__ [[:a :b] [:a :b] [:a :c] [:c :a]
               [:a :d] [:b :d] [:c :d]])
  true := (__ [[1 2] [2 3] [3 4] [4 1]])
  true := (__ [[:a :b] [:a :c] [:c :b] [:a :e]
              [:b :e] [:a :d] [:b :d] [:c :e]
              [:d :e] [:c :f] [:d :f]])
  false := (__ [[1 2] [2 3] [2 4] [2 5]]))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/af87973306f77532cbc396513392babc
