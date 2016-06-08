(ns digitos.fda)

(def cmap (fn [f xs]
            (letfn [(g [ys ac h]
                      (if (= (first ys) nil)   
                          ac
                          
                          (g (rest ys) 
                             (conj ac (h (first ys)))
                              h 
                           )
                        )
                                           
                      )
                    
                    ]
              (g xs #{} f)
              )
           )
  )





(def crear-conjunto  (fn [ n]
     (letfn [(g [ ini fi  ac ] 
               (if (> ini fi)
                 ac
                 (g  (inc ini) fi  (conj ac ini))
                 )
               )]
       (g  1 n  #{} )
       )) 
  )


(def stoc (fn [ xs]
     (letfn [(g [ ac ys] 
               (if (= (first ys) nil)
                 ac
                 (g  (conj ac (first ys))  (rest ys)  )
                 )
               )]
       (g  #{} xs)
       )) 
  )






