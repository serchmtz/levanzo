(ns levanzo.xsd
  (:require [levanzo.namespaces :refer [xsd]])
  (:refer-clojure :exclude [float double time]))

(def integer (xsd "integer"))
(def float (xsd "float"))
(def double (xsd "double"))
(def string (xsd "string"))
(def time (xsd "time"))
(def date (xsd "date"))
(def date-time (xsd "date-time"))
