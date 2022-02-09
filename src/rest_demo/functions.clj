(ns rest-demo.functions
  (:gen-class))

(defn -main
  "First function"
  []
  (println "My name is shuky")
  (println "Loving clojure so far")
  (+ 2 5))

#(println "Hello")

(def increment (fn [x] (+ x 1)))

(defn increment_set
  [x]
  (map increment x))

(defn DataTypes []
  (def integer 1)
  (def float 1.25)
  (def scientific_float 1.25e-12)
  (def hex 0xfbfc)
  (def nll nil)
  (def bol true)
  (def string "Hello")
  (def keyword 'thanks)

  (def status true)
  (def STATUS false)

  (println integer)
  (println float)
  (println scientific_float)
  (println hex)
  (println nll)
  (println bol)
  (println string)
  (println keyword)
  
  (println status)
  (println STATUS)
  )

(DataTypes)
