;;     Author: Vitaly Kornilov
;;     Github: github.com/wizzytod
;; HackerRank: hackerrank.com/wizzytod


(defn padding-left [width i]
  (apply str
    (take width
      (concat (repeat (- width i) " ") (repeat i "#")))))


; Complete the staircase function below.
(defn staircase [n]
  (map #(padding-left n %) (range 1 (inc n))))


(def fptr (get (System/getenv) "OUTPUT_PATH"))

(def n (Integer/parseInt (clojure.string/trim (read-line))))

(def result (staircase n))

(spit fptr (clojure.string/join "\n" result) :append true)
(spit fptr "\n" :append true)
