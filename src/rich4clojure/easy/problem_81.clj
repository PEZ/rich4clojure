(ns rich4clojure.easy.problem-81
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Set Intersection =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; Tags: [set-theory]
;; 
;; Write a function which returns the intersection of two
;; sets. The intersection is the sub-set of items that
;; each set has in common.

(def restricted [intersection])

(def __ :tests-will-fail)

(comment
  
  )

(tests
 (__ #{0 1 3 2} #{4 3 2 5}) := #{3 2}
 (__ #{0 1 2} #{4 3 5}) := #{}
 (__ #{:c :b :d :a} #{:e :c :d :f :a}) := #{:c :d :a})

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/a51be488815f09d5d8e68e93d16f61e8