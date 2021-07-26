(ns rich4clojure.elementary.problem-035
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Local bindings =
;; By 4Clojure user: amalloy
;; Difficulty: Elementary
;; Tags: [syntax]
;; 
;; Clojure lets you give local names to values using the
;; special let-form.

(def __ :tests-will-fail)

(comment
  
  )

(tests
  __ := (let [x 5] (+ 2 x))
  __ := (let [x 3, y 10] (- y x))
  __ := (let [x 21] (let [y 3] (/ x y))))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/b42371c75b1ec96c39aecb3c3c1a539f