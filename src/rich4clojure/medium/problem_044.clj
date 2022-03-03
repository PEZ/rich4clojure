(ns rich4clojure.medium.problem-044
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Rotate Sequence =
;; By 4Clojure user: dbyrne
;; Difficulty: Medium
;; Tags: [seqs]
;; 
;; Write a function which can rotate a sequence in either
;; direction.

(defn rot-vector [n xs]
  (let [length (count xs)]
  (concat (drop (mod n length) xs)
          (take (mod n length) xs))))

(def __ rot-vector)

(comment
  (mod 5 -2)
(mod 3 -9)
(mod 6 5)
(mod -4 -3)
  (take (mod -2 5) [1 2 3 4 5])
  )

(tests
  (__ 2 [1 2 3 4 5]) := '(3 4 5 1 2)
  (__ -2 [1 2 3 4 5]) := '(4 5 1 2 3)
  (__ 6 [1 2 3 4 5]) := '(2 3 4 5 1)
  (__ 1 '(:a :b :c)) := '(:b :c :a)
  (__ -4 '(:a :b :c)) := '(:c :a :b))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/2a419f3d9e0c22be01179175f6a7d2f0__
