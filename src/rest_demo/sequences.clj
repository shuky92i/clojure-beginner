(ns rest-demo.sequences)

(defn Seq
  []
  (def colors (seq ["red" "green" "blue"]))
  (println colors)

  (println (cons "yellow" colors)) ; Add element at the begging of the sequence
  (println (cons colors "yellow"))

  (println (conj colors "yellow")) ; Add element in a way that makes sense for the structure
  (println (conj ["red" "green" "blue"] "yellow")) ; For example vector appends at the end

  (println (concat colors (seq ["black" "white"]))) ; Concat 2 seqs into a new seq

  (println (distinct (seq [1 2 3 5 3 5 2 4]))) ; Get distinct elements in a sequence

  (println (reverse colors)) ; Reverse elements

  (println (first colors)) ; First element of seq

  (println (rest colors)) ; All elements but first one

  (println (last colors)) ; last element of seq

  (println (sort (seq [3 2 67 8 1 55 3 -1]))) ; Sort a sequence
  )

(Seq)