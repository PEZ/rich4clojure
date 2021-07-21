(ns rich4clojure.easy.problem-126
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Through the Looking Class =
;; By 4Clojure user: amcnamara
;; Difficulty: Easy
;; Tags: [fun brain-teaser]
;; 
;; Enter a value which satisfies the following:

(def __ :tests-will-fail)

(comment
  
  )

(tests
 [x __] := (and (= (class x) x) x))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/8b24bd0cf40098ec3875dde7ecf3fc5c