(ns rich4clojure.hard.problem-73
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Analyze a Tic-Tac-Toe Board =
;; By 4Clojure user: fotland
;; Difficulty: Hard
;; Tags: [game]
;; 
;; A tic-tac-toe board is represented by a two dimensional
;; vector. X is represented by :x, O is represented by :o,
;; and empty is represented by :e. A player wins by
;; placing three Xs or three Os in a horizontal, vertical,
;; or diagonal row. Write a function which analyzes a
;; tic-tac-toe board and returns :x if X has won, :o if O
;; has won, and nil if neither player has won.

(comment
  
  )

(tests
  := (__ [[:e :e :e] [:e :e :e] [:e :e :e]])
 :x := (__ [[:x :e :o] [:x :e :e] [:x :e :o]])
 :o := (__ [[:e :x :e] [:o :o :o] [:x :e :x]])
  := (__ [[:x :e :o] [:x :x :e] [:o :x :o]])
 :x := (__ [[:x :e :e] [:o :x :e] [:o :e :x]])
 :o := (__ [[:x :e :o] [:x :o :e] [:o :e :x]])
  := (__ [[:x :o :x] [:x :o :x] [:o :x :o]]))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/949f75d5329f9d7c290db7fe69ced4d7