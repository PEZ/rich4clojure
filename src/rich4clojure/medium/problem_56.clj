(ns rich4clojure.medium.problem-56
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Find Distinct Items =
;; By 4Clojure user: dbyrne
;; Difficulty: Medium
;; Tags: [seqs core-functions]
;; 
;; Write a function which removes the duplicates from a
;; sequence. Order of the items must be maintained.

(def restricted [distinct])

(def __ :tests-will-fail)

(comment
  
  )

(tests
  (__ [1 2 1 3 1 2 4]) := [1 2 3 4]
  (__ [:a :a :b :b :c :c]) := [:a :b :c]
  (__ '([2 4] [1 2] [1 3] [1 3])) := '([2 4] [1 2] [1 3])
  (__ (range 50)) := (range 50))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/a509841669465f47ccd96fe847387b3e