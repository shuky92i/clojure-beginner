(ns rest-demo.destructuring)

(defn Destruct
  []
  (def myVect [1 2 3 4 5]) ; Extracting from vector
  (let [[a b c] myVect] (println a b c))
  (let [[a b & rest] myVect] (println a b rest))

  (def myMap {'name "John" 'lastName "Smith"}) ; Extracting from map
  (let [{a 'name b 'lastName} myMap] (println a b))

  )

(Destruct)