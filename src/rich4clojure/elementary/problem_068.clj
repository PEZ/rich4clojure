(ns rich4clojure.elementary.problem-068
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Recurring Theme =
;; By 4Clojure user: dbyrne
;; Difficulty: Elementary
;; Tags: [recursion]
;; 
;; Clojure only has one non-stack-consuming looping
;; construct: recur. Either a function or a loop can be
;; used as the recursion point. Either way, recur rebinds
;; the bindings of the recursion point to the values it is
;; passed. Recur must be called from the tail-position,
;; and calling it elsewhere will result in an error.

(def __ [7 6 5 4 3])

(comment
  
  )

(tests
  __ :=
  (loop [x 5
         result []]
    (if (> x 0)
      (recur (dec x) (conj result (+ 2 x)))
      result)))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/9a8b99903466666209d3edbe4288ed70