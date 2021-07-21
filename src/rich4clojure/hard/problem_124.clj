(ns rich4clojure.hard.problem-124
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Analyze Reversi =
;; By 4Clojure user: shockbob
;; Difficulty: Hard
;; Tags: [game]
;; 
;; Reversi is normally played on an 8 by 8 board. In this
;; problem, a 4 by 4 board is represented as a
;; two-dimensional vector with black, white, and empty
;; pieces represented by 'b, 'w, and 'e, respectively.
;; Create a function that accepts a game board and color
;; as arguments, and returns a map of legal moves for that
;; color. Each key should be the coordinates of a legal
;; move, and its value a set of the coordinates of the
;; pieces flipped by that move.
;; 
;; 
;; Board coordinates should be as in calls to get-in. For
;; example, [0 1] is the topmost row, second column from
;; the left.

(comment
  
  )

(tests
 {[1 3] #{[1 2]}, [0 2] #{[1 2]}, [3 1] #{[2 1]}, [2 0] #{[2 1]}} := (__ (quote [[e e e e] [e w b e] [e b w e] [e e e e]]) (quote w))
 {[3 2] #{[2 2]}, [3 0] #{[2 1]}, [1 0] #{[1 1]}} := (__ (quote [[e e e e] [e w b e] [w w w e] [e e e e]]) (quote b))
 {[0 3] #{[1 2]}, [1 3] #{[1 2]}, [3 3] #{[2 2]}, [2 3] #{[2 2]}} := (__ (quote [[e e e e] [e w b e] [w w b e] [e e b e]]) (quote w))
 {[0 3] #{[2 1] [1 2]}, [1 3] #{[1 2]}, [2 3] #{[2 2] [2 1]}} := (__ (quote [[e e w e] [b b w e] [b w w e] [b w w w]]) (quote b)))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/8a958ec70d026ea9435e9c03f6538cc0