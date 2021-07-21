(ns rich4clojure.easy.problem-45
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Intro to Iterate =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; Tags: [seqs]
;; 
;; The iterate function can be used to produce an infinite
;; lazy sequence.

(comment
  
  )

(tests
 __ := (take 5 (iterate (fn* [p1__16204#] (+ 3 p1__16204#)) 1)))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/f1da413cb1110daf97898dbf73113894