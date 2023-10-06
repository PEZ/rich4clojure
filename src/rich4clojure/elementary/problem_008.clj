(ns rich4clojure.elementary.problem-008
  (:require [hyperfiddle.rcf :refer [tests]]
            [clojure.set]))

;; = Intro to Sets =
;; By 4Clojure user: dbyrne
;; Difficulty: Elementary
;; 
;; Sets are collections of unique values.

(def __ #{:a :b :c :d})

(comment
  
  )

(tests
  __ := (set '(:a :a :b :c :c :c :c :d :d))
  __ := (clojure.set/union #{:a :b :c} #{:b :c :d}))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/d1f6098dff344875902737842e15543f