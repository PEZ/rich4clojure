(ns rich4clojure.easy.problem-51
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Advanced Destructuring =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; Tags: [destructuring]
;; 
;; Here is an example of some more sophisticated
;; destructuring.

(comment
  
  )

(tests
 [1 2 [3 4 5] [1 2 3 4 5]] := (let [[a b & c :as d] __] [a b c d]))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/d4eb7ceb4ae05468135c920a39be2bf8