(ns joss.model.user
  (:require
   [joss.model.document :as model.document]
   [schema.core :as s])
  (:import
   Date))

(s/defschema Type
  (s/enum :user.type/customer
          :user.type/fraudster))

(s/defschema User
  {:user/id         s/Uuid
   :user/name       s/Str
   :user/email      s/Str
   :user/document   s/Str
   :user/created-at Date
   :user/type       Type
   :user/documents  #{model.document/Document}})

