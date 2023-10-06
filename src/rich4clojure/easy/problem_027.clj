(ns rich4clojure.easy.problem-027
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Palindrome Detector =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; Tags: [seqs]
;; 
;; Write a function which returns true if the given
;; sequence is a palindrome.
;; 
;; 
;; Hint: "racecar" does not equal '(\r \a \c \e \c \a \r)

(def __ (fn [coll] 
          (loop [s 0 
                 e (- (count coll) 1)] 
            (cond 
              (> s e) true
              (not= (nth coll s) (nth coll e)) false 
              :else (recur (+ s 1) (- e 1))))))

;;someone else solution
(def s1 #(loop [coll %]
           (cond
             (empty? coll) true
             (not= (first coll) (last coll)) false
             :else (recur (butlast (rest coll))))))
(comment

  (time (__ '(1 2 3 4 5)))
  (time (__ "racecar"))
  (time (__ [:foo :bar :foo]))
  (time (__ '(1 1 3 3 1 1)))
  (time (__ '(:a :b :c)))
  (println "the other solution")
  (time (s1 '(1 2 3 4 5)))
  (time (s1 "racecar"))
  (time (s1 [:foo :bar :foo]))
  (time (s1 '(1 1 3 3 1 1)))
  (time (s1 '(:a :b :c)))
  )

(tests
  (__ '(1 2 3 4 5)) :=
  (__ "racecar") :=
  (__ [:foo :bar :foo]) :=
  (__ '(1 1 3 3 1 1)) :=
  (__ '(:a :b :c)) :=)

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/a9620760aad9da40c497f5750087a095