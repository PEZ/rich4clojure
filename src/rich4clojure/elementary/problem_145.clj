(ns rich4clojure.elementary.problem-145
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = For the win =
;; By 4Clojure user: amalloy
;; Difficulty: Elementary
;; Tags: [core-functions seqs]
;; 
;; Clojure's for macro is a tremendously versatile
;; mechanism for producing a sequence based on some other
;; sequence(s). It can take some time to understand how to
;; use it properly, but that investment will be paid back
;; with clear, concise sequence-wrangling later. With that
;; in mind, read over these for expressions and try to see
;; how each of them produces the same result.

(def __ :tests-will-fail)

(comment
  
  )

(tests
  __ := (for [x (range 40)
            :when (= 1 (rem x 4))]
        x)
  __ := (for [x (iterate #(+ 4 %) 0)
            :let [z (inc x)]
            :while (< z 40)]
        z)
  __ := (for [[x y] (partition 2 (range 20))]
        (+ x y)))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/6d7ba65546171142f8d109ee54829a36