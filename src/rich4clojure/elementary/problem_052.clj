(ns rich4clojure.elementary.problem-052
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Intro to Destructuring =
;; By 4Clojure user: amalloy
;; Difficulty: Elementary
;; Tags: [destructuring]
;; 
;; Let bindings and function parameter lists support
;; destructuring.

(def __ :tests-will-fail)

(comment
  
  )

(tests
  [2 4] := (let [[a b c d e] [0 1 2 3 4]] __))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/631d47dbf5b3f286f54a74fd58bb0e00