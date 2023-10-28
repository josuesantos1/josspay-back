(ns joss.model.document
  (:require
   [schema.core :as s]))

(s/defschema Status
  (s/enum :document.status/expired
          :document.status/available))

(s/defschema Document
  {:document/Status Status
   :document/url    s/Str
   :document/expired-at Date})


