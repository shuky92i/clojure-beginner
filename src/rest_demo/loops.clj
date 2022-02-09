(ns rest-demo.loops)

(defn Loop
  []
  (println "\nLoop:")
  (loop [x 0]
    (when (< x 10)
      (println x)
      (recur (inc x))
      )
    ))

(defn DoTimes
  []
  (println "\nDoTimes:")
  (dotimes [x 10]
    (println x)
    ))

(defn WhileDo
  [count]
  (println "\nWhileDo:")
  (def x (atom 0))
  (while (< @x count)
    (do
      (println @x)
      (swap! x inc))
    ))

(defn DoSeq
  [seq]
  (println "\nDoSeq:")
  (doseq [x seq]
    (println (inc x))
    ))

(Loop)
(DoTimes)
(WhileDo 10)
(DoSeq [6 3 5 7 8 5 3])