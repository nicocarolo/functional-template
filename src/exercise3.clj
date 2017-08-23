(ns exercise3)

(defn fibonacci
  "F(x) = F(x-1) + F(x-2)."
  [x]
  (if (= x 0) 0 (if (= x 1) 1 (+ (fibonacci (- x 1))  (fibonacci (- x 2))))))