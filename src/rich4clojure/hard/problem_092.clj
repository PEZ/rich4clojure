(ns rich4clojure.hard.problem-092
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Read Roman numerals =
;; By 4Clojure user: amalloy
;; Difficulty: Hard
;; Tags: [strings math]
;; 
;; Roman numerals are easy to recognize, but not everyone
;; knows all the rules necessary to work with them. Write
;; a function to parse a Roman-numeral string and return
;; the number it represents.
;; 
;; 
;; You can assume that the input will be well-formed, in
;; upper-case, and follow the subtractive principle. You
;; don't need to handle any numbers greater than MMMCMXCIX
;; (3999), the largest number representable with ordinary
;; letters.
(defn solution [x]
  (let [y {\I 1 \V 5 \X 10 \L 50
           \C 100 \D 500 \M 1000}]
    (apply +
     (reduce
      #(let [z (y %2)]
        (conj %1 (if (>= z (last %1))
        z
        (- z))))
      [0]
      (reverse x)))))

(def __ solution)

(comment
  
  )

(tests
  14 := (__ "XIV")
  827 := (__ "DCCCXXVII")
  3999 := (__ "MMMCMXCIX")
  48 := (__ "XLVIII"))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/08b1683167d5da70037757a6be3efe0a
