(ns rich4clojure.hard.problem-082
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
  true := (__ #{"hat" "coat" "dog" "cat" "oat" "cot" "hot" "hog"})
  false := (__ #{"cot" "hot" "bat" "fat"})
  false := (__ #{"to" "top" "stop" "tops" "toss"})
  true := (__ #{"spout" "do" "pot" "pout" "spot" "dot"})
  true := (__ #{"share" "hares" "shares" "hare" "are"})
  false := (__ #{"share" "hares" "hare" "are"}))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/9f1e130d45a4eb86b174a532a79b69b1