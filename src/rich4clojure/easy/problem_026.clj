(ns rich4clojure.easy.problem-026
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Fibonacci Sequence =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; Tags: [Fibonacci seqs]
;; 
;; Write a function which returns the first X fibonacci
;; numbers.

(def __ (fn [n] 
          (cond
            (= n 1) '(1)
            (= n 2) '(1 1)
            :else (loop [first 1
                         second 1
                         res [1 1]]
                    (if (= (count res) n)
                      res
                      (recur second (+ first second) (conj res (+ first second))))))))

(comment
  (__ 60)
  )

(tests
  (__ 3) := '(1 1 2)
  (__ 6) := '(1 1 2 3 5 8)
  (__ 8) := '(1 1 2 3 5 8 13 21))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/87153a8e55b56058703e5bca6f8ba62a