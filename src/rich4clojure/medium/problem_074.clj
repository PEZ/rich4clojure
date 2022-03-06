(ns rich4clojure.medium.problem-074
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Filter Perfect Squares =
;; By 4Clojure user: dbyrne
;; Difficulty: Medium
;; 
;; Given a string of comma separated integers, write a
;; function which returns a new comma separated string
;; that only contains the numbers which are perfect
;; squares.

(defn solution [s]
  (let [n-vec (map #(Integer/parseInt %) (re-seq #"\d+" s))
        is_squares? (fn [n]
                      (let [n_sqrt (int (Math/sqrt n))
                            nn (int (Math/pow n_sqrt 2))]
                        (= n nn)))
        n-vec-squares (filter is_squares? n-vec)]
    (apply str (interpose "," (map str  n-vec-squares))) ))

(def __ solution)

(comment
  
  )

(tests
  (__ "4,5,6,7,8,9") := "4,9"
  (__ "15,16,25,36,37") := "16,25,36")

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/b90fcac09b35c74a07228dea603ddc73
