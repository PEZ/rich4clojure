(ns rich4clojure.easy.problem-027
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Palindrome Detector =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; Tags: [seqs]
;; 
;; Write a function which returns true if the given
;; sequence is a palindrome.
;; 
;; 
;; Hint: "racecar" does not equal '(\r \a \c \e \c \a \r)

(def __ :tests-will-fail)

(comment
  
  )

(tests
  (__ '(1 2 3 4 5)) := false
  (__ "racecar") := true
  (__ [:foo :bar :foo]) := true
  (__ '(1 1 3 3 1 1)) := true
  (__ '(:a :b :c)) := false)

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/a9620760aad9da40c497f5750087a095
