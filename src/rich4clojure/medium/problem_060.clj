(ns rich4clojure.medium.problem-060
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Sequence Reductions =
;; By 4Clojure user: dbyrne
;; Difficulty: Medium
;; Tags: [seqs core-functions]
;; 
;; Write a function which behaves like reduce, but returns
;; each intermediate value of the reduction. Your function
;; must accept either two or three arguments, and the
;; return sequence must be lazy.

(def restricted [reductions])

(def __ :tests-will-fail)

(defn my-redus 
  ([f coll]
   (lazy-seq 
    (if-let [s (seq coll)]
      (my-redus f (first s) (rest s))
      (list (f)))))
  ([f init coll]
   (if (reduced? init)
     (list @init)
     (cons init
           (lazy-seq
            (when-let [s (seq coll)]
              (my-redus f (f init (first s)) (rest s))))))))

(def __ my-redus)

(comment
  (take 5 (my-redus + (range)))

)  
  

(tests
  (take 5 (__ + (range))) := [0 1 3 6 10]
  (__ conj [1] [2 3 4]) := [[1] [1 2] [1 2 3] [1 2 3 4]]
  (last (__ * 2 [3 4 5])) := (reduce * 2 [3 4 5]) 120)

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/4688fc26154649a2735f14264938fa3b
