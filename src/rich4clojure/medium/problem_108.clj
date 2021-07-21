(ns rich4clojure.medium.problem-108
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Lazy Searching =
;; By 4Clojure user: amalloy
;; Difficulty: Medium
;; Tags: [seqs sorting]
;; 
;; Given any number of sequences, each sorted from
;; smallest to largest, find the smallest single number
;; which appears in all of the sequences. The sequences
;; may be infinite, so be careful to search lazily.

(comment
  
  )

(tests
 3 := (__ [3 4 5])
 4 := (__ [1 2 3 4 5 6 7] [0.5 3/2 4 19])
 7 := (__ (range) (range 0 100 7/6) [2 3 5 7 11 13])
 64 := (__ (map (fn* [p1__16217#] (* p1__16217# p1__16217# p1__16217#)) (range)) (filter (fn* [p1__16218#] (zero? (bit-and p1__16218# (dec p1__16218#)))) (range)) (iterate inc 20)))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/4a0485cfb64ebc165afeffc2406b5669