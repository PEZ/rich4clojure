(ns rich4clojure.easy.problem-146
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Trees into tables =
;; By 4Clojure user: amalloy
;; Difficulty: Easy
;; Tags: [seqs maps]
;; 
;; Because Clojure's for macro allows you to "walk" over
;; multiple sequences in a nested fashion, it is excellent
;; for transforming all sorts of sequences. If you don't
;; want a sequence as your final output (say you want a
;; map), you are often still best-off using for, because
;; you can produce a sequence and feed it into a map, for
;; example.
;; 
;; 
;; For this problem, your goal is to "flatten" a map of
;; hashmaps. Each key in your output map should be the
;; "path" 1 that you would have to take in the original
;; map to get to a value, so for example {1 {2 3}} should
;; result in {[1 2] 3}. You only need to flatten one level
;; of maps: if one of the values is a map, just leave it
;; alone.
;; 
;; 
;; 1 That is, (get-in original [k1 k2]) should be the
;; same as (get result [k1 k2])

(def __ :tests-will-fail)

(comment
  
  )

(tests
 (__ (quote {a {p 1, q 2}, b {m 3, n 4}})) := (quote {[a p] 1, [a q] 2, [b m] 3, [b n] 4})
 (__ (quote {[1] {a b, c d}, [2] {q r, s t, u v, w x}})) := (quote {[[1] a] b, [[1] c] d, [[2] q] r, [[2] s] t, [[2] u] v, [[2] w] x})
 (__ (quote {m {1 [a b c], 3 nil}})) := (quote {[m 1] [a b c], [m 3] nil}))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/47dc764177c635896e91c4e4a090903c