(ns digitos.numero
  (:require [digitos.fda :as fda  ]:reload)
  )


(def chartoi   (fn [num]
                 (let [letoint (fn [l] 
                                 ({\1 1
                                    \2 2
                                   \3 3
                                   \4 4
                                   \5 5
                                   \6 6
                                   \7 7
                                   \8 8
                                   \9 9}
                                  
                                   l)
                                 )
                         convertir (fn [n] ( if (nil? (letoint n))  
                                    n
                                     (letoint n)) )
                       ]
                   (convertir num)
                   )
                 )
  )


(def de-digitos-irrepetibles? (fn [digito]
                                (let [ xs (fn [num] (fda/crear-conjunto (count num))   )  
                                      ys (fn [string] (fda/stoc  string))
                                      zs (fn [conjunto]   (fda/cmap chartoi conjunto  ))
                                      ]
                                  (= (xs digito) (zs (ys digito)) )
                                  
                                  )
                                                              
                               )
  ) 


;;;;; Alplicaciones
(de-digitos-irrepetibles? "2143")
(de-digitos-irrepetibles? "43251")
(de-digitos-irrepetibles? "0")
(de-digitos-irrepetibles? "98")
(de-digitos-irrepetibles? "678")
(de-digitos-irrepetibles? "1234567890")