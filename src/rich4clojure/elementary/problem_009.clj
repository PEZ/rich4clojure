(ns rich4clojure.elementary.problem-009
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Sets: conj =
;; By 4Clojure user: dbyrne
;; Difficulty: Elementary
;; 
;; When operating on a set, the conj function returns a
;; new set with one or more keys "added".

(def __ :tests-will-fail)

(comment
  
  )

(tests
  #{1 2 3 4} := (conj #{1 4 3} __))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/ad6c54ca6259cd67274a902f2d0be1ff