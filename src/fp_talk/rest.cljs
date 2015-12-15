(ns fp-talk.rest
  (:require [cljs-http.client :as http]
            [petrol.core :as petrol]
            [fp-talk.messages :as m]))

(defn create-event
  [event]
  (->> (http/post "http://localhost:3000/q"
                  {:with-credentials? false
                   :edn-params {:type :create-event
                                :txn-data event}})
       (petrol/wrap m/map->CreateEventResults)))
