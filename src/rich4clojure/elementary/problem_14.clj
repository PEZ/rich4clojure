(ns rich4clojure.elementary.problem-14
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Intro to Functions =
;; By 4Clojure user: dbyrne
;; Difficulty: Elementary
;; 
;; Clojure has many different ways to create functions.

(def __ :tests-will-fail)

(comment
  
  )

(tests
  __ := ((fn add-five [x] (+ x 5)) 3)
  __ := ((fn [x] (+ x 5)) 3)
  __ := (#(+ % 5) 3)
  __ := ((partial + 5) 3))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/08da0019981a566de6550e692c959a24