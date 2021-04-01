(ns app.ui.pages.author
  (:require [helix.dom :as d]
            [helix.core :as hx :refer [$]]
            [keechma.next.helix.core :refer [with-keechma use-sub dispatch]]
            [keechma.next.controllers.router :as router]
            [keechma.next.helix.lib :refer [defnc]]
            [keechma.next.helix.classified :refer [defclassified]]
            [app.ui.components.navbar :refer [Navbar]]
            [app.ui.components.header :refer [Header]]
            [app.ui.components.footer :refer [Footer]]
            [keechma.next.toolbox.logging :as l]
            ))

(defclassified AuthorWrapper :div "font-open-sans h-screen w-screen flex flex-col bg-gray-200 dark:bg-gray-900 dark:text-gray-100 overflow-x-hidden overflow-y-scroll")

(defnc AuthorRenderer [props]
  (let [data (use-sub props :author) ]
   ;; (l/pp "data" data)
    ($ AuthorWrapper
      ($ Navbar)
      (d/div {:class "dark:bg-gray-800 bg-gray-100 flex flex-1 flex-col items-start justify-start px-6 md:px-12 w-full md:w-3/5 mx-auto shadow-xl py-12"}
        (d/div {:className "text-2xl w-full text-center py-6 border-b-2 border-teal-500"} "Author placeholder")
        (d/div {:className "mt-6 mx-auto text-center"} "author dada placeholder"))
       ($ Footer)
       )))

(def Author (with-keechma AuthorRenderer))

