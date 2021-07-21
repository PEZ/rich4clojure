(ns rich4clojure.hard.problem-84
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Transitive Closure =
;; By 4Clojure user: dbyrne
;; Difficulty: Hard
;; Tags: [set-theory]
;; 
;; Write a function which generates the transitive closure
;; of a binary relation. The relation will be represented
;; as a set of 2 item vectors.

(comment
  
  )

(tests
 [divides #{[27 9] [8 4] [4 2] [9 3]}] := (= (__ divides) #{[27 9] [27 3] [8 4] [4 2] [9 3] [8 2]})
 [more-legs #{["man" "snake"] ["cat" "man"] ["spider" "cat"]}] := (= (__ more-legs) #{["man" "snake"] ["spider" "man"] ["cat" "man"] ["cat" "snake"] ["spider" "snake"] ["spider" "cat"]})
 [progeny #{["son" "grandson"] ["uncle" "cousin"] ["father" "son"]}] := (= (__ progeny) #{["son" "grandson"] ["uncle" "cousin"] ["father" "son"] ["father" "grandson"]}))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/7935c4eab565b94f96df9da4190b3509