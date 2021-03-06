;; Copyright (C) 2015, Jozef Wagner. All rights reserved.
;;
;; The use and distribution terms for this software are covered by the
;; Eclipse Public License 1.0
;; (http://opensource.org/licenses/eclipse-1.0.php) which can be
;; found in the file epl-v10.html at the root of this distribution.
;;
;; By using this software in any fashion, you are agreeing to be bound
;; by the terms of this license.
;;
;; You must not remove this notice, or any other, from this software.

(ns wagjo.blog.docgen
  "Facilities for generating documentation."
  (:api dunaj)
  (:require [dunaj.doc :refer [gen-doc]]
            [dunaj.repl]))

(def blog-config
  {:current-version nil
   :target-path "gh-pages"
   :static-path "blog"
   :logo-url "logo.png"
   :proj-name "Jozef Wagner"
   :no-doc-title true
   :disqus "wagjo"
   :xteaser "Hi, I’m a business consultant and a software developer
that specializes in Business Intelligence and Clojure.<br/>
<b><a href=\"http://www.wagjo.com\">Hire me</a> and I'll come up with
a solution for your business problems</b> that generates revenue,
has low total cost of ownership, and is flexible when adopting to
new business strategies and initiatives."
   :proj-url "http://www.wagjo.com/"
   :copy-years "2015,"
   :additional-copyright
   "2008, 2015, Rich Hickey and Clojure contributors"
   :authors ["Jozef Wagner"]
   :header-menu
   [{:url "http://wagjo.com"
     :name "Homepage" :icon :fa-home}
    {:url "http://blog.wagjo.com"
     :name "Blog" :icon :fa-pencil}
    {:url "http://wagjo.com/consulting"
     :name "Consulting Services" :icon :fa-dot-circle-o}
    {:url "http://blog.wagjo.com/feed.xml"
     :name "RSS Feed" :icon :fa-rss}]
   :static-pages
   [{:filename "index" :name "Blog"}
    {:filename "set" :name "Universal and Complement Sets in Dunaj"
     :disqus-id "set"}
    {:filename "markov" :name "Markov Text Generator in Dunaj"
     :disqus-id "markov"}
    {:filename "factory" :name "Idiomatic Factory Pattern in Clojure"
     :disqus-id "factory"}
    {:filename "jwt" :name "Handling JSON Web Tokens in Dunaj"
     :disqus-id "jwt"}]})


;;;; Scratch

(scratch []

  []


  (dunaj.doc/gen-static blog-config)

)
