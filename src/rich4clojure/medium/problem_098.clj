(ns rich4clojure.medium.problem-098
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Equivalence Classes =
;; By 4Clojure user: drcabana
;; Difficulty: Medium
;; 
;; A function f defined on a domain D induces an
;; equivalence relation on D, as follows: a is equivalent
;; to b with respect to f if and only if (f a) is equal to
;; (f b). Write a function with arguments f and D that
;; computes the equivalence classes of D with respect to
;; f.

(def __ :tests-will-fail)

(comment
  
  )

(tests
  (__ #(* % %) #{-2 -1 0 1 2}) :=
   #{#{0} #{1 -1} #{2 -2}}
  (__ #(rem % 3) #{0 1 2 3 4 5 }) :=
   #{#{0 3} #{1 4} #{2 5}}
  (__ identity #{0 1 2 3 4}) :=
   #{#{0} #{1} #{2} #{3} #{4}}
  (__ (constantly true) #{0 1 2 3 4}) :=
   #{#{0 1 2 3 4}})

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/b297be9d61e94036a84cfc8de6374ee8