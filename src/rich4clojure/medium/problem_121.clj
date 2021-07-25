(ns rich4clojure.medium.problem-121
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Universal Computation Engine =
;; By 4Clojure user: mlni
;; Difficulty: Medium
;; Tags: [functions]
;; 
;; Given a mathematical formula in prefix notation, return
;; a function that calculates the value of the formula.
;; The formula can contain nested calculations using the
;; four basic mathematical operators, numeric constants,
;; and symbols representing variables. The returned
;; function has to accept a single parameter containing
;; the map of variable names to their values.

(def restricted [eval resolve])

(def __ :tests-will-fail)

(comment
  
  )

(tests
  2 := ((__ '(/ a b))
      '{b 8 a 16})
  8 := ((__ '(+ a b 2))
      '{a 2 b 4})
  [6 0 -4] :=
     (map (__ '(* (+ 2 a)
  	              (- 10 b)))
	        '[{a 1 b 8}
	          {b 5 a -2}
	          {a 2 b 11}])
  1 := ((__ '(/ (+ x 2)
              (* 3 (+ y 1))))
      '{x 4 y 1}))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/8056f0c78af9f89d919db9f42c22cb48