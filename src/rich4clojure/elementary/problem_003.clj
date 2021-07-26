(ns rich4clojure.elementary.problem-003
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Intro to Strings =
;; By 4Clojure user: dbyrne
;; Difficulty: Elementary
;; 
;; Clojure strings are Java strings. This means that you
;; can use any of the Java string methods on Clojure
;; strings.

(def __ :tests-will-fail)

(comment
  
  )

(tests
  __ := (.toUpperCase "hello world"))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/a9e56d5eec902a5e74c4261f3ed3b0ed