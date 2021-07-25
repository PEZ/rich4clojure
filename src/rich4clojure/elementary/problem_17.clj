(ns rich4clojure.elementary.problem-17
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Sequences: map =
;; By 4Clojure user: dbyrne
;; Difficulty: Elementary
;; 
;; The map function takes two arguments: a function (f)
;; and a sequence (s). Map returns a new sequence
;; consisting of the result of applying f to each item of
;; s. Do not confuse the map function with the map data
;; structure.

(def __ :tests-will-fail)

(comment
  
  )

(tests
  __ := (map #(+ % 5) '(1 2 3)))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/39980dc3c5893db22fe13359c3f8c72c