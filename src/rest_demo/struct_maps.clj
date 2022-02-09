(ns rest-demo.struct-maps)

(defn Pets
  []
  (defstruct pet :PetType :PetName)
  (def myPet (struct pet "dog" "Fido"))
  (println myPet)

  (def myOtherPet (struct-map pet :PetName "fifi" :PetType "cat"))
  (println myOtherPet)
  (println (:PetName myOtherPet))
  (println (:PetType myOtherPet))

  (def myNewPet (assoc myPet :PetName "max"))
  (println myNewPet)

  (def myNewOtherPet (assoc myOtherPet :PetAge 10))
  (println myNewOtherPet)
  )

(Pets)