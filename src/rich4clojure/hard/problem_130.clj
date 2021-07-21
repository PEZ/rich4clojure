(ns rich4clojure.hard.problem-130
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Tree reparenting =
;; By 4Clojure user: chouser
;; Difficulty: Hard
;; Tags: [tree]
;; 
;; Every node of a tree is connected to each of its
;; children as well as its parent. One can imagine
;; grabbing one node of a tree and dragging it up to the
;; root position, leaving all connections intact. For
;; example, below on the left is a binary tree. By pulling
;; the "c" node up to the root, we obtain the tree on the
;; right.
;; 
;; 
;; Note it is no longer binary as "c" had three
;; connections total -- two children and one parent.
;; 
;; Each node is represented as a vector, which always has
;; at least one element giving the name of the node as a
;; symbol. Subsequent items in the vector represent the
;; children of the node. Because the children are ordered
;; it's important that the tree you return keeps the
;; children of each node in order and that the old parent
;; node, if any, is appended on the right.
;; 
;; Your function will be given two args -- the name of
;; the node that should become the new root, and the tree
;; to transform.

(def __ :tests-will-fail)

(comment
  
  )

(tests
 (quote (n)) := (__ (quote n) (quote (n)))
 (quote (a (t (e)))) := (__ (quote a) (quote (t (e) (a))))
 (quote (e (t (a)))) := (__ (quote e) (quote (a (t (e)))))
 (quote (a (b (c)))) := (__ (quote a) (quote (c (b (a)))))
 (quote (d (b (c) (e) (a (f (g) (h)))))) := (__ (quote d) (quote (a (b (c) (d) (e)) (f (g) (h)))))
 (quote (c (d) (e) (b (f (g) (h)) (a (i (j (k) (l)) (m (n) (o))))))) := (__ (quote c) (quote (a (b (c (d) (e)) (f (g) (h))) (i (j (k) (l)) (m (n) (o)))))))

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/58bf3dd77606f53cced382363c343ed4