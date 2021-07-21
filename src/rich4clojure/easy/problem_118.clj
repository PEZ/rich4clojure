(ns rich4clojure.easy.problem-118
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Re-implement Map =
;; By 4Clojure user: semisight
;; Difficulty: Easy
;; Tags: [core-seqs]
;; 
;; Map is one of the core elements of a functional
;; programming language. Given a function f and an input
;; sequence s, return a lazy sequence of (f x) for each
;; element x in s .

(def restricted [map map-indexed mapcat for])

(comment
  
  )

(tests
 [3 4 5 6 7] := (__ inc [2 3 4 5 6])
 (repeat 10 nil) := (__ (fn [_] nil) (range 10))
 [1000000 1000001] := (->> (__ inc (range)) (drop (dec 1000000)) (take 2)))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/PEZ/fcd991cd17eb81a7e9a42d84a0cda89f