(ns rich4clojure.easy.problem-099
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Product Digits =
;; By 4Clojure user: jneira
;; Difficulty: Easy
;; Tags: [math seqs]
;; 
;; Write a function which multiplies two numbers and
;; returns the result as a sequence of its digits.
(defn multiply-digits
  [a b]
  (let [n (* a b)
        digits (fn digit-fun [n]
                 (if (= n 0)
                   nil
                   (concat (digit-fun (quot n 10)) [(mod n 10)])))]
    (digits n)))

(def __ multiply-digits)

(comment
  
  )

(tests
  (__ 1 1) := [1]
  (__ 99 9) := [8 9 1]
  (__ 999 99) := [9 8 9 0 1])

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/2a889ddd7c667b5b738f9a61d14f3958
