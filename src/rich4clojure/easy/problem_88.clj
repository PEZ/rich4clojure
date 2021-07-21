(ns rich4clojure.easy.problem-88
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Symmetric Difference =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; Tags: [set-theory]
;; 
;; Write a function which returns the symmetric difference
;; of two sets. The symmetric difference is the set of
;; items belonging to one but not both of the two sets.

(comment
  
  )

(tests
 (__ #{1 4 6 3 2 5} #{7 1 3 5}) := #{7 4 6 2}
 (__ #{:c :b :a} #{}) := #{:c :b :a}
 (__ #{} #{4 6 5}) := #{4 6 5}
 (__ #{[2 3] [1 2]} #{[2 3] [3 4]}) := #{[3 4] [1 2]})

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/b78bc7de41bb6cef6ca18c1e924bb5ac