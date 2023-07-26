(ns pear-org.prod
  (:require [pear-org.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
