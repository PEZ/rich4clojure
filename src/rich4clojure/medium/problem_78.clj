(ns rich4clojure.medium.problem-78
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Reimplement Trampoline =
;; By 4Clojure user: dbyrne
;; Difficulty: Medium
;; Tags: [core-functions]
;; 
;; Reimplement the function described in "Intro to
;; Trampoline" .

(def restricted [trampoline])

(comment
  
  )

(tests
 (letfn [(triple [x] (fn* [] (sub-two (* 3 x)))) (sub-two [x] (fn* [] (stop? (- x 2)))) (stop? [x] (if (> x 50) x (fn* [] (triple x))))] (__ triple 2)) := 82
 (letfn [(my-even? [x] (if (zero? x) true (fn* [] (my-odd? (dec x))))) (my-odd? [x] (if (zero? x) false (fn* [] (my-even? (dec x)))))] (map (partial __ my-even?) (range 6))) := [true false true false true false])

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/1849f2788191d83171adfe7d10b9294e