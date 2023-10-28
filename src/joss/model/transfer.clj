(ns joss.model.transfer
  (:require
   [schema.core :as s]))

(s/defschema Status
  (s/enum :transfer.status/transfered
          :transfer.status/reverted
          :transfer.status/failed))

(s/defschema Transfer
  {:transfer/id s/Uuid
   :transfer/sender s/Uuid
   :transfer/receiver s/Uuid
   :transfer/status Status
   :transfer/transfered-at Date
   :transfer/reverted-at Date})

