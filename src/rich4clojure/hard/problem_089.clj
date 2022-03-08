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

(defn build-graph2 [edges m]
  (if-let [[k v] (first edges)]
    (build-graph2 (rest edges) (assoc m k (if (contains? m k)
                                           (into (m k) [v])
                                           [v])))
    m))
;; todo: build edge graph to do
;; [:a :b] - [:a :c] - [:c :b]
;; use #{:a :b} to avoid the order
(defn edge-links
  "transfer the edge into node then build the graph"
  [edges]
  (let [edge-in-set (into #{} (map #(into #{} %) edges))]
    (for [e1 edge-in-set
          e2 edge-in-set
          :when (and  (seq (clojure.set/intersection e1 e2)) (not (= e1 e2)))]
      [(str e1) (str e2)] )))

(defn find-paths
  "not working for complex one to multiple edges!"
  [graph start seen]
  (if (some #(= start %) seen)
    seen
    (for [n (graph start)]
      (find-paths graph n (conj seen start)))))

(defn visited?
  "Predicate which returns true if the node v has been visited already, false otherwise.
  [reference](http://dnaeon.github.io/graphs-and-clojure/)"
  [v coll]
  (some #(= % v) coll))


(defn find-neighbors
  "Returns the sequence of neighbors for the given node"
  [v coll]
  (get coll v))

(defn graph-dfs
  "Traverses a graph in Depth First Search (DFS)"
  [graph v]
  (loop [stack   (vector v) ;; Use a stack to store nodes we need to explore
         visited []]        ;; A vector to store the sequence of visited nodes
    (if (empty? stack)      ;; Base case - return visited nodes if the stack is empty
      visited
      (let [v           (peek stack)
            neighbors   (find-neighbors v graph)
            not-visited (filter (complement #(visited? % visited)) neighbors)
            new-stack   (into (pop stack) not-visited)]
        (if (visited? v visited)
          (recur new-stack visited)
          (recur new-stack (conj visited v)))))))

(defn graph-bfs
  "Traverses a graph in Breadth First Search (BFS)."
  [graph v]
  (loop [queue   (conj clojure.lang.PersistentQueue/EMPTY v) ;; Use a queue to store the nodes we need to explore
         visited []]                                         ;; A vector to store the sequence of visited nodes
    (if (empty? queue) visited                               ;; Base case - return visited nodes if the queue is empty
        (let [v           (peek queue)
              neighbors   (find-neighbors v graph)
              not-visited (filter (complement #(visited? % visited)) neighbors)
              new-queue   (apply conj (pop queue) not-visited)]
          (if (visited? v visited)
            (recur new-queue visited)
            (recur new-queue (conj visited v)))))))

(def edges [[:a :b] [:a :c] [:c :b] [:a :e]
              [:b :e] [:a :d] [:b :d] [:c :e]
            [:d :e] [:c :f] [:d :f]])

(def g (build-graph edges {}))

(defn check-edges-closure
  [edges]
  (let [g (build-graph2 edges {})
        nodes (into #{} (flatten edges))
        possible-paths (map #(into #{} %) (for [n nodes] (graph-dfs g n)))]
    (if  (some #(= nodes %) possible-paths)
      true false)))

(def __ check-edges-closure)

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
