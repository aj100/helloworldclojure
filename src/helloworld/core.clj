(ns helloworld.core
  (:require [clojure.tools.cli :refer [parse-opts]])
  (:gen-class :main true))

(def cli-options [["-h" "--help"]])

(def usage "usage: java -jar helloworld.jar <YourName> [--help]")

(defn -main [& args]
  (let [argmap (parse-opts args cli-options)
        help-flag (-> argmap :options :help)
        arg-count (count args)]

       (if (or help-flag (not= arg-count 1))
           (println usage)
           (println (str "Hello, " (first args))))))

