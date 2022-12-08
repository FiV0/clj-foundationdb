(ns scratch
  (:import (com.apple.foundationdb Database FDB)
           (com.apple.foundationdb.tuple Tuple)))

(def api-version 620)
(def fdb (FDB/selectAPIVersion api-version))

(def db (.open fdb))
