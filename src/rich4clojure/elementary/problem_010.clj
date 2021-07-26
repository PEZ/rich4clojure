(ns rich4clojure.elementary.problem-010
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Intro to Maps =
;; By 4Clojure user: dbyrne
;; Difficulty: Elementary
;; 
;; Maps store key-value pairs. Both maps and keywords can
;; be used as lookup functions. Commas can be used to make
;; maps more readable, but they are not required.

(def __ :tests-will-fail)

(comment
  
  )

(tests
  __ := ((hash-map :a 10, :b 20, :c 30) :b)
  __ := (:b {:a 10, :b 20, :c 30}))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/cc20ba916a1f806dccb489d01ea6037b