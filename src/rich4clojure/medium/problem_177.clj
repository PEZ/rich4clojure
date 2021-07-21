(ns rich4clojure.medium.problem-177
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Balancing Brackets =
;; By 4Clojure user: daowen
;; Difficulty: Medium
;; Tags: [parsing]
;; 
;; When parsing a snippet of code it's often a good idea
;; to do a sanity check to see if all the brackets match
;; up. Write a function that takes in a string and returns
;; truthy if all square [] round () and curly {} brackets
;; are properly paired and legally nested, or returns
;; falsey otherwise.

(def __ :tests-will-fail)

(comment
  
  )

(tests
 This string has no brackets. := 
 class Test {
      public static void main(String[] args) {
        System.out.println("Hello world.");
      }
    } := 
 (__ "(start, end]") := 
 (__ "())") := 
 (__ "[ { ] } ") := 
 ([]([(()){()}(()(()))(([[]]({}()))())]((((()())))))) := 
 (__ "([]([(()){()}(()(()))(([[]]({}([)))())]((((()()))))))") := 
 (__ "[") := )

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/6b8d50ee0811042bdc646dc9060037e8