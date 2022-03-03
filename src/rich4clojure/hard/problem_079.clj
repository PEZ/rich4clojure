(ns rich4clojure.hard.problem-079
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Triangle Minimal Path =
;; By 4Clojure user: dbyrne
;; Difficulty: Hard
;; Tags: [graph-theory]
;; 
;; Write a function which calculates the sum of the
;; minimal path through a triangle. The triangle is
;; represented as a collection of vectors. The path should
;; start at the top of the triangle and move to an
;; adjacent number on the next row until the bottom of the
;; triangle is reached.

(defn dow-stairs-neighbours 
  "derive the next level index based on the current index"
  [current]
  (let [delta [0 1]]
    [current (inc current)])
  )

(defn minimum-path [tri-rows]
  (let [min-values-each-row (apply map min tri-rows)
        ]))

(def __ :tests-will-fail)

(comment
  (def tri-rows '([1]
            [2 4]
           [5 1 4]
          [2 3 4 5]))
  (apply + (map #(apply min %) tri-rows))
  )

(tests
  7 := (__ '([1]
            [2 4]
           [5 1 4]
          [2 3 4 5]))
  20 := (__ '([3]
             [2 4]
            [1 9 3]
           [9 9 2 4]
          [4 6 6 7 8]
         [5 7 3 5 1 4])))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/de67b77aadddea34b2f4997952d4f101