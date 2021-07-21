(ns rich4clojure.medium.problem-132
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Insert between two items =
;; By 4Clojure user: srid
;; Difficulty: Medium
;; Tags: [seqs core-functions]
;; 
;; Write a function that takes a two-argument predicate, a
;; value, and a collection; and returns a new collection
;; where the value is inserted between every two items
;; that satisfy the predicate.

(comment
  
  )

(tests
 (quote (1 :less 6 :less 7 4 3)) := (__ < :less [1 6 7 4 3])
 (quote (2)) := (__ > :more [2])
 [0 1 :x 2 :x 3 :x 4] := (__ (fn* [p1__16221# p2__16222#] (and (pos? p1__16221#) (< p1__16221# p2__16222#))) :x (range 5))
 (__ > :more ()) := 
 [0 1 :same 1 2 3 :same 5 8 13 :same 21] := (take 12 (->> [0 1] (iterate (fn [[a b]] [b (+ a b)])) (map first) (__ (fn [a b] (= (mod a 2) (mod b 2))) :same))))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/742e221111abc4aa551e4f99214e962f