(ns rich4clojure.easy.problem-028
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Flatten a Sequence =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; Tags: [seqs core-functions]
;; 
;; Write a function which flattens a sequence.

(def restricted [flatten])

(defn my-flatten [s]
          (reduce
           #(concat %
                    (if (coll? %2) (my-flatten %2) [%2])) [] s))

(def __ my-flatten)

(comment
  (my-flatten '((1 2) 3 [4 [5 6]]))
  )

(tests
  (__ '((1 2) 3 [4 [5 6]])) := '(1 2 3 4 5 6)
  (__ ["a" ["b"] "c"]) := '("a" "b" "c")
  (__ '((((:a))))) := '(:a))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/0c6e3c48cac7434882ca4b2c71ebfce1