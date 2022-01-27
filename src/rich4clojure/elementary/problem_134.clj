(ns rich4clojure.elementary.problem-134
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = A nil key =
;; By 4Clojure user: goranjovic
;; Difficulty: Elementary
;; Tags: [maps]
;; 
;; Write a function which, given a key and map, returns
;; true iff the map contains an entry with that key and
;; its value is nil.

(def __ :tests-will-fail)

(comment
  
  )

(tests
  true := (__ :a {:a nil :b 2})
  false := (__ :b {:a nil :b 2})
  false := (__ :c {:a nil :b 2}))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/70ba70e1e4e0f249a90bc99bda5f8aff
