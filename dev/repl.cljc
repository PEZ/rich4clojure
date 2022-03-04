(ns repl
  (:require [hyperfiddle.rcf]))

  ; wait to enable tests until after app namespaces are loaded (intended for subsequent REPL interactions) 

#?(:clj  (alter-var-root #'hyperfiddle.rcf/*enabled* (constantly true))
   :cljs (set! hyperfiddle.rcf/*enabled* true))

; subsequent REPL interactions will run tests

; prevent test execution during cljs hot code reload
;#?(:cljs (defn ^:dev/before-load stop [] (set! hyperfiddle.rcf/*enabled* false)))
;; #?(:cljs (defn ^:dev/after-load start [] (set! hyperfiddle.rcf/*enabled* true)))

(println "RCF enabled!")