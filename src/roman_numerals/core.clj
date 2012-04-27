(ns roman_numerals.core)

(defn find-first [pred coll]
  (first (filter pred coll)))

(defn to-roman [n]
  (def num-table
    [["M" 1000]
     ["CM" 900]
     ["D" 500]
     ["CD" 400]
     ["C" 100]
     ["XC" 90]
     ["L" 50]
     ["XL" 40]
     ["X" 10]
     ["IX" 9]
     ["V" 5]
     ["IV" 4]
     ["I" 1]])

  (if (zero? n)
    ""
    (let [[roman arabic] (find-first #(<= (% 1) n) num-table)]
      (apply str (conj [roman] (to-roman (- n arabic)))))))

