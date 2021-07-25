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

(def __ :tests-will-fail)

(comment
  
  )

(tests
  [divides #{[8 4] [9 3] [4 2] [27 9]}] :=
  (= (__ divides) #{[4 2] [8 4] [8 2] [9 3] [27 9] [27 3]})
  [more-legs
      #{["cat" "man"] ["man" "snake"] ["spider" "cat"]}] :=
  (= (__ more-legs)
     #{["cat" "man"] ["cat" "snake"] ["man" "snake"]
       ["spider" "cat"] ["spider" "man"] ["spider" "snake"]})
  [progeny
      #{["father" "son"] ["uncle" "cousin"] ["son" "grandson"]}] :=
  (= (__ progeny)
     #{["father" "son"] ["father" "grandson"]
       ["uncle" "cousin"] ["son" "grandson"]}))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/7935c4eab565b94f96df9da4190b3509