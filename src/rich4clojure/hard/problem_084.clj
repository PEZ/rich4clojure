(ns rich4clojure.hard.problem-084
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Transitive Closure =
;; By 4Clojure user: dbyrne
;; Difficulty: Hard
;; Tags: [set-theory]
;; 
;; Write a function which generates the transitive closure
;; of a binary relation. The relation will be represented
;; as a set of 2 item vectors.
 (defn find-edges2 [g start seen]     
         (if-let [n (g start)]
           (recur g n (conj  seen start))
           (if (some #(= start %) (vals g))
             (conj seen start)
             seen)))

(defn all-pairs
  [a-vec cache]
  (let [head (first a-vec)
        body (rest a-vec)]
    (if (seq body)
      (let [new-cache  (into [] (for [i body] [head i]))]
        (into cache (all-pairs (rest a-vec) new-cache)))
      cache)))

(defn find-edges
  "find all the chained nodes out of graph, {v0 -> v1, v1 -> v2}
  call: (persistent! (find-edges graph 8 (transient [])))"
  [g start seen]     
         (if-let [n (g start)]
               (and (conj! seen start) (recur g n seen))
             (conj! seen start)))

(defn build-graph [vec-vec]
  (into {} vec-vec))

(defn solution 
  [vec-vec]
  (let [graph (build-graph vec-vec)]
    (reduce #(clojure.set/union % %2)
            (for [n (keys graph)] (into #{} (all-pairs (find-edges2 graph n []) []))))))

(def __ solution)

(comment
  (__ #{["father" "son"] ["uncle" "cousin"] ["son" "grandson"]} )
  )

(tests
  [divides #{[8 4] [9 3] [4 2] [27 9]}] :=
  (= (__ divides) #{[4 2] [8 4] [8 2] [9 3] [27 9] [27 3]})
  [more-legs
      #{["cat" "man"] ["man" "snake"] ["spider" "cat"]}] :=
  (= (__ more-legs)
     #{["cat" "man"] ["cat" "snake"] ["man" "snake"]
       ["spider" "cat"] ["spider" "man"] ["spider" "snake"]})
  [progeny
      #{["father" "son"] ["uncle" "cousin"] ["son" "grandson"]}] :=
  (= (__ progeny)
     #{["father" "son"] ["father" "grandson"]
       ["uncle" "cousin"] ["son" "grandson"]}))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/7935c4eab565b94f96df9da4190b3509
