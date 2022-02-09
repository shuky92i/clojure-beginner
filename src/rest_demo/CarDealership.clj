(ns rest-demo.CarDealership)

(defn IsCodeValid
  [code]
  (defstruct coupon :Name :Discount)
  (def validCoupon (struct coupon "20Percent" 0.8))
  (if (= (:Name validCoupon) code)
    true
    false
    )
  )

(defn GetCarPrices
  [budget, code]
  (def cars {"bmw" 60000, "ferrari" 100000, "fiat" 20000})
  (if (IsCodeValid code)
    (do
      (println "The code is valid")
      (def discount (:Discount validCoupon))
      )
    (do
      (println "The code is invalid")
      )
    )
  )

(GetCarPrices 22 "20Percent")
