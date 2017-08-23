(ns exercise2)

(defn only-greater-than-five
  "Filter values in list greater than five."
  [list]
  (filter (fn [x] (> x 5)) list))