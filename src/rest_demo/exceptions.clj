(ns rest-demo.exceptions)

(defn ExHandling
  [x]
  (try
    (inc x)
    (catch ClassCastException e (println "Caught exception:" (.getMessage e)))
    (catch Exception e (println "Caught generic exception"))
    (finally (println "Clearnup and move on.."))
    )
  )

(ExHandling "3")