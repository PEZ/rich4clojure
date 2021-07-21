(ns rich4clojure.easy.problem-153
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Pairwise Disjoint Sets =
;; By 4Clojure user: maximental
;; Difficulty: Easy
;; Tags: [set-theory]
;; 
;; Given a set of sets, create a function which returns
;; true if no two of those sets have any elements in
;; common 1 and false otherwise. Some of the test cases
;; are a bit tricky, so pay a little more attention to
;; them.
;; 
;; 
;; 1 Such sets are usually called pairwise disjoint or
;; mutually disjoint .

(def __ :tests-will-fail)

(comment
  
  )

(tests
 (__ #{#{\L \P} #{\E \e \R} #{\U} #{\s} #{\.}}) := true
 (__ #{#{:c :b :a} #{:e :c :b :d :a} #{:c :b :d :a} #{:b :a} #{:a}}) := false
 (__ #{#{1 [3 4] 2 [5]} #{[1 2 3] [4 5]} #{4 3 5 [2] [1]} #{[3 4 5] [1 2]}}) := true
 (__ #{#{(quote (quote f)) (quote (quote a)) (quote (quote c))} #{(quote c) (quote e) (quote d)} #{(quote b) (quote a)} #{(quote h) (quote f) (quote i) (quote g)}}) := true
 (__ #{#{#{} #{:z} #{:y :z :x} #{:y :x}} #{(quote (:x :y :z)) (quote (:z)) (quote (:x :y)) (quote ())} #{(quote [:x :y :z]) [] {} [:x :y] [:z]}}) := false
 (__ #{#{(symbol "true") (quote false)} #{(keyword "yes") :pez.build4clojure/no} #{:yes :no} #{0 (class 1)} #{false (= "true")} #{(class (quote 1)) (int \0)}}) := false
 (__ #{#{distinct?} #{(fn* [p1__16906#] (-> p1__16906#)) (fn* [p1__16905#] (-> p1__16905#))} #{(fn* [p1__16909#] (-> p1__16909#)) (fn* [p1__16907#] (-> p1__16907#)) (fn* [p1__16908#] (-> p1__16908#))} #{(fn* [p1__16911#] (-> p1__16911#)) (fn* [p1__16910#] (-> p1__16910#)) (fn* [p1__16912#] (-> p1__16912#))}}) := true
 (__ #{#{contains? set nil? (do)} #{} #{mapcat (quote +) (quote *) (comment mapcat)} #{(quote mapcat) ((fn* [] (-> *))) +}}) := false)

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/2993425c507c8be6d1abeae28f8e2511