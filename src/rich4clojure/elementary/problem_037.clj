(ns rich4clojure.elementary.problem-037
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Regular Expressions =
;; By 4Clojure user: dbyrne
;; Difficulty: Elementary
;; Tags: [regex syntax]
;; 
;; Regex patterns are supported with a special reader tag.


(def __ :to-fail)

(comment
  (reduce #(if (< % %2) %2 %) 1 [1 2 3 4])
  )

(tests
  __ := (apply str (re-seq #"[A-Z]+" "bA1B3Ce ")))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/48ee58ab81946ddf8038f739536b7249