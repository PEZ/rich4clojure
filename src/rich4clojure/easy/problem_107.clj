(ns rich4clojure.easy.problem-107
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Simple closures =
;; By 4Clojure user: amalloy
;; Difficulty: Easy
;; Tags: [higher-order-functions math]
;; 
;; Lexical scope and first-class functions are two of the
;; most basic building blocks of a functional language
;; like Clojure. When you combine the two together, you
;; get something very powerful called lexical closures.
;; With these, you can exercise a great deal of control
;; over the lifetime of your local bindings, saving their
;; values for use later, long after the code you're
;; running now has finished.
;; 
;; 
;; It can be hard to follow in the abstract, so let's
;; build a simple closure. Given a positive integer n,
;; return a function (f x) which computes x n. Observe
;; that the effect of this is to preserve the value of n
;; for use outside the scope in which it is defined.

(def __ :tests-will-fail)

(comment
  
  )

(tests
  256 := ((__ 2) 16),
       ((__ 8) 2)
  [1 8 27 64] := (map (__ 3) [1 2 3 4])
  [1 2 4 8 16] := (map #((__ %) 2) [0 1 2 3 4]))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/e94c74af8688f5eca19b4979df86f5f9