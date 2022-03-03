(ns rich4clojure.hard.problem-053
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Longest Increasing Sub-Seq =
;; By 4Clojure user: dbyrne
;; Difficulty: Hard
;; Tags: [seqs]
;; 
;; Given a vector of integers, find the longest
;; consecutive sub-sequence of increasing numbers. If two
;; sub-sequences have the same length, use the one that
;; occurs first. An increasing sub-sequence must have a
;; length of 2 or greater to qualify.

(defn partition-between
[split? s]
(let [switch (reductions = true (map split? s (rest s)))]
(->> switch
(map list s)
(partition-by second)
(map (partial map first)))))

(defn longest-subseq
[s]
(let [partitioned (partition-between < s)]
(->> partitioned
(filter #(> (count %) 1))
(reduce (fn [acc v] (if (> (count v) (count acc)) v acc)) []))))


(defn partition-by-equal-one
  [xs]
  (let [switch (reductions = true 
                           (map #(= 1 %) 
                                (map - (rest xs) (pop xs))))]
    (->> switch
         (map list xs)
         (partition-by second)
         (map (partial map first)))))

(defn longest-subseq-ones
  "use equal one as indicators"
  [xs]
  (let [partitioned (partition-by-equal-one xs)
        sorted (sort-by count partitioned)
        output (vec (last sorted))]
    (if (> (count output) 1)
      output
      [])))

(def __ longest-subseq-ones)

(comment
  (partition-by-equal-one [1 0 1 2 3 0 4 5])
  (let [coll [7 6 5 4 3 2 3]]
  (reductions = true                
         (map #(= 1 %) 
         (map - (rest coll) (pop coll)))))

  (__ [5 6 1 3 2 7])
  (__ [2 3 3 4 5 1 2 3 4])
  )
  )


(tests
  (__ [1 0 1 2 3 0 4 5]) := [0 1 2 3]
  (__ [5 6 1 3 2 7]) := [5 6]
  (__ [2 3 3 4 5]) := [3 4 5]
  (__ [7 6 5 4]) := [])

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/2cd6e7158b0ea3d24d125c997a0f8d1e


