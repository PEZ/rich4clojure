(ns rich4clojure.medium.problem-086
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Happy numbers =
;; By 4Clojure user: daviddavis
;; Difficulty: Medium
;; Tags: [math]
;; 
;; Happy numbers are positive integers that follow a
;; particular formula: take each individual digit, square
;; it, and then sum the squares to get a new number.
;; Repeat with the new number and eventually, you might
;; get to a number whose squared sum is 1. This is a happy
;; number. An unhappy number (or sad number) is one that
;; loops endlessly. Write a function that determines if a
;; number is happy or not.
(defn solution [n]
  (letfn [(check [n i]
                  (let [str-n (str n)
                        str-n-vec (re-seq #"\d" str-n)
                        n-digits (map #(Integer/parseInt %) str-n-vec)
                        square-sum (apply + (map #(* % %) n-digits))]
                    (if (= square-sum 1)
                      true
                      (if (< i 10)
                        (check square-sum (inc i))
                        false))))]
    (try  (check n 0)
          (finally false))))

(def __ solution)

(comment
  
  )

(tests
  (__ 7) := true
  (__ 986543210) := true
  (__ 2) := false
  (__ 3) := false)

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/b921948244dc0417fc716fe31cecb359
