(ns joss.model.wallet
  (:require
   [schema.core :as s]))

(s/defschema Status
  (s/enum :wallet.status/opened
          :wallet.status/blocked
          :wallet.status/paused))

(s/defschema Type
  (s/enum :wallet.type/hold
          :wallet.type/free))

(s/defschema Wallet
  {:wallet/id s/Uuid
   :wallet/mount Double
   :wallet/status Status
   :wallet/type Type
   :wallet/holded-to Date})

