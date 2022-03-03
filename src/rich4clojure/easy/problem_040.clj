(ns rich4clojure.easy.problem-040
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Interpose a Seq =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; Tags: [seqs core-functions]
;; 
;; Write a function which separates the items of a
;; sequence by an arbitrary value.

(def restricted [interpose])

(defn solution [sep coll]
  (rest (interleave (repeat sep) coll)))

(def __ solution)

(comment
  (solution ", " ["one" "two" "three"])
  )

(tests
  (__ 0 [1 2 3]) := [1 0 2 0 3]
  (apply str (__ ", " ["one" "two" "three"])) := "one, two, three"
  (__ :z [:a :b :c :d]) := [:a :z :b :z :c :z :d])

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/4f5ffbf020d90a968db4f99478cf358e