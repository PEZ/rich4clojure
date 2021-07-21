(ns rich4clojure.medium.problem-76
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Intro to Trampoline =
;; By 4Clojure user: dbyrne
;; Difficulty: Medium
;; Tags: [recursion]
;; 
;; The trampoline function takes a function f and a
;; variable number of parameters. Trampoline calls f with
;; any parameters that were supplied. If f returns a
;; function, trampoline calls that function with no
;; arguments. This is repeated, until the return value is
;; not a function, and then trampoline returns that
;; non-function value. This is useful for implementing
;; mutually recursive algorithms in a way that won't
;; consume the stack.

(def __ :tests-will-fail)

(comment
  
  )

(tests
 __ := (letfn [(foo [x y] (fn* [] (bar (conj x y) y))) (bar [x y] (if (> (last x) 10) x (fn* [] (foo x (+ 2 y)))))] (trampoline foo [] 1)))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/d43e270986333e278bdcf6431cc2ffd4