(ns rich4clojure.easy.problem-090
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Cartesian Product =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; Tags: [set-theory]
;; 
;; Write a function which calculates the Cartesian product
;; of two sets.

(def __ :tests-will-fail)

(comment
  
  )

(tests
  (__ #{"ace" "king" "queen"} #{"&#9824;" "&#9829;" "&#9830;" "&#9827;"}) :=
   #{["ace"   "&#9824;"] ["ace"   "&#9829;"] ["ace"   "&#9830;"] ["ace"   "&#9827;"]
     ["king"  "&#9824;"] ["king"  "&#9829;"] ["king"  "&#9830;"] ["king"  "&#9827;"]
     ["queen" "&#9824;"] ["queen" "&#9829;"] ["queen" "&#9830;"] ["queen" "&#9827;"]}
  (__ #{1 2 3} #{4 5}) :=
   #{[1 4] [2 4] [3 4] [1 5] [2 5] [3 5]}
  300 := (count (__ (into #{} (range 10))
                  (into #{} (range 30)))))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/0522d05068eda17584d75260e44c2d93