(ns rich4clojure.hard.problem-073
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

;; (defn partition-by-identity [xs]
;;   (partition-by identity xs))
(use 'clojure.set)

(defn into-set [xs]
  (into #{} xs))

(defn ttt-transfer-to-vertical [board]
  (apply map vector board))

(defn ttt-extract-cross [board]
  "user index directly (0 0) (1 1) (2 2), (0 2) (1 1) (2 0)
   get-in: https://stackoverflow.com/questions/23447084/clojure-access-element-of-2d-vector"
  (let [l [[0 0] [1 1] [2 2]]
        r [[0 2] [1 1] [2 0]]]
    (vector 
     (into-set (map #(get-in board %) l))
     (into-set (map #(get-in board %) r)))))

(defn ttt-collect-line-set [board]
  (map into-set board))

;; (defn ttt-line-partition [board]
;;   (->> 
;;    board
;;        (map partition-by-identity)
;;        (filter #(= 1 (count %)))))

(defn decide-winner [line-sets]
 (let [what-left (filter #(= 1 (count %)) line-sets)
       outcome (apply union what-left)]
   (cond
     (contains? outcome :x) :x
     (contains? outcome :o) :o
     :else :e)))

(defn tic-tac-toe-winner [board]
(let [h (decide-winner (ttt-collect-line-set board))
      v (decide-winner (ttt-collect-line-set (ttt-transfer-to-vertical board)))
      c (decide-winner (ttt-extract-cross board))
      to-be-decide (into #{} [h v c])]
  (cond
    (contains? to-be-decide :x) :x
    (contains? to-be-decide :o) :o
     :else nil)))

(def __ tic-tac-toe-winner)

(comment
  (def dummy-board [[:e :e :e]
                    [:e :x :o]
                    [:o :x :e]])

  (->> dummy-board
       (map into-set)
       (filter #(= 1 (count %))))
  (ttt-extract-cross dummy-board)
  (ttt-transfer-to-vertical dummy-board)
  ;; (partition-by-identity (dummy-board 1))
  ;; (map partition-by-identity dummy-board)
  ;; (ttt-line-partition dummy-board)
  ;; (ttt-line-partition (ttt-transfer-to-vertical dummy-board))

  (map #(get-in dummy-board %) [[0 0] [1 1] [2 2]])
  (ttt-extract-cross dummy-board)
  (filter #(= 1 count (%))  (ttt-collect-line-set dummy-board))
  (decide-winner (ttt-collect-line-set dummy-board))
  (tic-tac-toe-winner dummy-board)

(decide-winner (ttt-collect-line-set dummy-board))
(decide-winner (ttt-collect-line-set (ttt-transfer-to-vertical dummy-board)))
(decide-winner (ttt-extract-cross dummy-board))
  )

(tests
  nil := (__ [[:e :e :e]
              [:e :e :e]
              [:e :e :e]])
  :x := (__ [[:x :e :o]
             [:x :e :e]
             [:x :e :o]])
  :o := (__ [[:e :x :e]
             [:o :o :o]
             [:x :e :x]])
  nil := (__ [[:x :e :o]
              [:x :x :e]
              [:o :x :o]])
  :x := (__ [[:x :e :e]
             [:o :x :e]
             [:o :e :x]])
  :o := (__ [[:x :e :o]
             [:x :o :e]
             [:o :e :x]])
  nil := (__ [[:x :o :x]
              [:x :o :x]
              [:o :x :o]]))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/949f75d5329f9d7c290db7fe69ced4d7