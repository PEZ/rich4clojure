(ns rich4clojure.easy.problem-096
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Beauty is Symmetry =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; Tags: [trees]
;; 
;; Let us define a binary tree as "symmetric" if the left
;; half of the tree is the mirror image of the right half
;; of the tree. Write a predicate to determine whether or
;; not a given binary tree is symmetric. (see To Tree, or
;; not to Tree for a reminder on the tree representation
;; we're using).
(defn m [y]
  (if (nil? y)
    nil
    [(first y)
     (m (last y))
     (m (second y))]))

(defn solution [x]
  (= (second x) (m (last x))))

(def __ solution)

(comment
  
  )

(tests
  (__ '(:a (:b nil nil) (:b nil nil))) := true
  (__ '(:a (:b nil nil) nil)) := false
  (__ '(:a (:b nil nil) (:c nil nil))) := false
  (__ [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]]
          [2 [3 nil [4 [6 nil nil] [5 nil nil]]] nil]]) :=
   true
  (__ [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]]
          [2 [3 nil [4 [5 nil nil] [6 nil nil]]] nil]]) :=
   false
  (__ [1 [2 nil [3 [4 [5 nil nil] [6 nil nil]] nil]]
          [2 [3 nil [4 [6 nil nil] nil]] nil]]) :=
   false)

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/74f30ddf0d4ce94f886ccf412d51a099
