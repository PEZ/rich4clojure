(ns rich4clojure.hard.problem-119
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Win at Tic-Tac-Toe =
;; By 4Clojure user: shockbob
;; Difficulty: Hard
;; Tags: [game]
;; 
;; As in Problem 73, a tic-tac-toe board is represented by
;; a two dimensional vector. X is represented by :x, O is
;; represented by :o, and empty is represented by :e.
;; Create a function that accepts a game piece and board
;; as arguments, and returns a set (possibly empty) of all
;; valid board placements of the game piece which would
;; result in an immediate win.
;; 
;; 
;; Board coordinates should be as in calls to get-in. For
;; example, [0 1] is the topmost row, center position.

(comment
  
  )

(tests
 (__ :x [[:o :e :e] [:o :x :o] [:x :x :e]]) := #{[2 2] [0 2] [0 1]}
 (__ :x [[:x :o :o] [:x :x :e] [:e :o :e]]) := #{[2 2] [2 0] [1 2]}
 (__ :x [[:x :e :x] [:o :x :o] [:e :o :e]]) := #{[2 2] [2 0] [0 1]}
 (__ :x [[:x :x :o] [:e :e :e] [:e :e :e]]) := #{}
 (__ :o [[:x :x :o] [:o :e :o] [:x :e :e]]) := #{[2 2] [1 1]})

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/26a87db9c4e1431abdf0f60ee3513ad8