(ns rich4clojure.hard.problem-82
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Word Chains =
;; By 4Clojure user: dbyrne
;; Difficulty: Hard
;; Tags: [seqs]
;; 
;; A word chain consists of a set of words ordered so that
;; each word differs by only one letter from the words
;; directly before and after it. The one letter difference
;; can be either an insertion, a deletion, or a
;; substitution. Here is an example word chain:
;; 
;; 
;; cat -> cot -> coat -> oat -> hat -> hot -> hog -> dog
;; 
;; 
;; Write a function which takes a sequence of words, and
;; returns true if they can be arranged into one
;; continuous word chain, and false if they cannot.

(def __ :tests-will-fail)

(comment
  
  )

(tests
 true := (__ #{"dog" "oat" "cot" "coat" "hot" "hat" "hog" "cat"})
 false := (__ #{"cot" "hot" "bat" "fat"})
 false := (__ #{"stop" "top" "tops" "toss" "to"})
 true := (__ #{"spot" "pot" "spout" "dot" "pout" "do"})
 true := (__ #{"shares" "are" "hare" "hares" "share"})
 false := (__ #{"are" "hare" "hares" "share"}))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/9f1e130d45a4eb86b174a532a79b69b1