(ns rich4clojure.medium.problem-078
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Reimplement Trampoline =
;; By 4Clojure user: dbyrne
;; Difficulty: Medium
;; Tags: [core-functions]
;; 
;; Reimplement the function described in "Intro to
;; Trampoline" .

(def restricted [trampoline])

(def __ :tests-will-fail)

(comment
  
  )

(tests
  (letfn [(triple [x] #(sub-two (* 3 x)))
          (sub-two [x] #(stop?(- x 2)))
          (stop? [x] (if (> x 50) x #(triple x)))]
    (__ triple 2)) :=
  82
  (letfn [(my-even? [x] (if (zero? x) true #(my-odd? (dec x))))
          (my-odd? [x] (if (zero? x) false #(my-even? (dec x))))]
    (map (partial __ my-even?) (range 6))) :=
  [true false true false true false])

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/1849f2788191d83171adfe7d10b9294e