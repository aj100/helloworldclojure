(defproject helloworld "0.1.0"
  :description "Simple Hello World app for Clojure"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/tools.cli "0.3.1"]]
  :main helloworld.core
  :aot [helloworld.core])
