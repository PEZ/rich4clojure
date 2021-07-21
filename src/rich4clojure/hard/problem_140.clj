(ns rich4clojure.hard.problem-140
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Veitch, Please! =
;; By 4Clojure user: amcnamara
;; Difficulty: Hard
;; Tags: [math circuit-design]
;; 
;; Create a function which accepts as input a boolean
;; algebra function in the form of a set of sets, where
;; the inner sets are collections of symbols corresponding
;; to the input boolean variables which satisfy the
;; function (the inputs of the inner sets are conjoint,
;; and the sets themselves are disjoint... also known as
;; canonical minterms). Note: capitalized symbols
;; represent truth, and lower-case symbols represent
;; negation of the inputs. Your function must return the
;; minimal function which is logically equivalent to the
;; input.
;; 
;; 
;; PS — You may want to give this a read before
;; proceeding: K-Maps

(def __ :tests-will-fail)

(comment
  
  )

(tests
 (__ #{#{(quote A) (quote B) (quote C) (quote d)} #{(quote B) (quote C) (quote a) (quote d)} #{(quote A) (quote B) (quote c) (quote d)} #{(quote A) (quote C) (quote b) (quote d)} #{(quote A) (quote C) (quote b) (quote D)} #{(quote A) (quote b) (quote c) (quote d)} #{(quote A) (quote b) (quote c) (quote D)} #{(quote A) (quote B) (quote c) (quote D)}}) := #{#{(quote A) (quote c)} #{(quote A) (quote b)} #{(quote B) (quote C) (quote d)}}
 (__ #{#{(quote A) (quote B) (quote C) (quote d)} #{(quote A) (quote B) (quote C) (quote D)}}) := #{#{(quote A) (quote B) (quote C)}}
 (__ #{#{(quote b) (quote c) (quote a) (quote d)} #{(quote B) (quote c) (quote a) (quote d)} #{(quote b) (quote c) (quote a) (quote D)} #{(quote A) (quote B) (quote C) (quote d)} #{(quote A) (quote C) (quote b) (quote d)} #{(quote A) (quote C) (quote b) (quote D)} #{(quote B) (quote c) (quote a) (quote D)} #{(quote A) (quote B) (quote C) (quote D)}}) := #{#{(quote c) (quote a)} #{(quote A) (quote C)}}
 (__ #{#{(quote C) (quote b) (quote a)} #{(quote B) (quote C) (quote a)} #{(quote B) (quote c) (quote a)} #{(quote b) (quote c) (quote a)}}) := #{#{(quote a)}}
 (__ #{#{(quote B) (quote c) (quote a) (quote d)} #{(quote b) (quote c) (quote a) (quote D)} #{(quote A) (quote B) (quote C) (quote d)} #{(quote A) (quote C) (quote b) (quote D)} #{(quote B) (quote C) (quote a) (quote D)} #{(quote A) (quote B) (quote c) (quote D)}}) := #{#{(quote B) (quote c) (quote a) (quote d)} #{(quote b) (quote c) (quote a) (quote D)} #{(quote A) (quote B) (quote C) (quote d)} #{(quote A) (quote C) (quote b) (quote D)} #{(quote B) (quote C) (quote a) (quote D)} #{(quote A) (quote B) (quote c) (quote D)}}
 (__ #{#{(quote b) (quote c) (quote a) (quote d)} #{(quote B) (quote c) (quote a) (quote d)} #{(quote b) (quote c) (quote a) (quote D)} #{(quote A) (quote B) (quote c) (quote d)} #{(quote B) (quote c) (quote a) (quote D)} #{(quote A) (quote B) (quote c) (quote D)}}) := #{#{(quote c) (quote a)} #{(quote B) (quote c)}}
 (__ #{#{(quote B) (quote c) (quote a) (quote d)} #{(quote b) (quote c) (quote a) (quote D)} #{(quote A) (quote B) (quote C) (quote d)} #{(quote B) (quote C) (quote a) (quote d)} #{(quote A) (quote B) (quote c) (quote d)} #{(quote A) (quote C) (quote b) (quote D)} #{(quote A) (quote b) (quote c) (quote D)} #{(quote C) (quote b) (quote a) (quote D)}}) := #{#{(quote B) (quote d)} #{(quote b) (quote D)}}
 (__ #{#{(quote b) (quote c) (quote a) (quote d)} #{(quote A) (quote C) (quote b) (quote d)} #{(quote C) (quote b) (quote a) (quote d)} #{(quote A) (quote b) (quote c) (quote d)} #{(quote B) (quote C) (quote a) (quote D)} #{(quote B) (quote c) (quote a) (quote D)} #{(quote A) (quote B) (quote c) (quote D)} #{(quote A) (quote B) (quote C) (quote D)}}) := #{#{(quote b) (quote d)} #{(quote B) (quote D)}})

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/27a9305db8ae02a33054c1b730c2ef6d