(ns rich4clojure.medium.problem-114
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Global take-while =
;; By 4Clojure user: amalloy
;; Difficulty: Medium
;; Tags: [seqs higher-order-functions]
;; 
;; take-while is great for filtering sequences, but it
;; limited: you can only examine a single item of the
;; sequence at a time. What if you need to keep track of
;; some state as you go over the sequence?
;; 
;; 
;; Write a function which accepts an integer n, a
;; predicate p, and a sequence. It should return a lazy
;; sequence of items in the list up to, but not including,
;; the n th item that satisfies the predicate.

(comment
  
  )

(tests
 [2 3 5 7 11 13] := (__ 4 (fn* [p1__16219#] (= 2 (mod p1__16219# 3))) [2 3 5 7 11 13 17 19 23])
 ["this" "is" "a" "sentence"] := (__ 3 (fn* [p1__16220#] (some #{\i} p1__16220#)) ["this" "is" "a" "sentence" "i" "wrote"])
 ["this" "is"] := (__ 1 #{"a"} ["this" "is" "a" "sentence" "i" "wrote"]))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/9d1067c73d424ab77b3b6f1941f3c7a9