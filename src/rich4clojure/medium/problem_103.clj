(ns rich4clojure.medium.problem-103
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Generating k-combinations =
;; By 4Clojure user: patsp
;; Difficulty: Medium
;; Tags: [seqs combinatorics]
;; 
;; Given a sequence S consisting of n elements generate
;; all k-combinations of S, i. e. generate all possible
;; sets consisting of k distinct elements taken from S.
;; 
;; The number of k-combinations for a sequence is equal
;; to the binomial coefficient .

(def __ :tests-will-fail)

(comment
  
  )

(tests
 (__ 1 #{4 6 5}) := #{#{6} #{5} #{4}}
 (__ 10 #{4 6 5}) := #{}
 (__ 2 #{0 1 2}) := #{#{0 1} #{1 2} #{0 2}}
 (__ 3 #{0 1 4 3 2}) := #{#{0 4 3} #{0 1 4} #{4 3 2} #{0 1 2} #{0 1 3} #{1 3 2} #{0 3 2} #{1 4 3} #{1 4 2} #{0 4 2}}
 (__ 4 #{"efg" "abc" [1 2 3] :a}) := #{#{"efg" "abc" [1 2 3] :a}}
 (__ 2 #{"efg" "abc" [1 2 3] :a}) := #{#{[1 2 3] :a} #{"efg" :a} #{"abc" :a} #{"abc" [1 2 3]} #{"efg" "abc"} #{"efg" [1 2 3]}})

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/59cc791bc18d235646673dd8b8b8b66f