;;     Author: Vitaly Kornilov
;;     Github: github.com/wizzytod
;; HackerRank: hackerrank.com/wizzytod


(defn solve [a b]
  (let [zip (map vector a b)
        res (map (fn [[a b]] (- a b)) zip)]
       [(count (filter pos? res ))
        (count (filter neg? res ))]))


(def fptr (get (System/getenv) "OUTPUT_PATH"))

(def a (vec (map #(Integer/parseInt %) (clojure.string/split (read-line) #" "))))

(def b (vec (map #(Integer/parseInt %) (clojure.string/split (read-line) #" "))))

(def result (solve a b))

(spit fptr (clojure.string/join " " result) :append true)
(spit fptr "\n" :append true)