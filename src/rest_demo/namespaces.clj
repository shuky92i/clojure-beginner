(ns rest-demo.namespaces
  (:require [clojure.string])
  )

(defn -main
  []
  (println (clojure.string/capitalize "hello"))
  )

(-main)