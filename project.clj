(defproject attercop "0.1.0-SNAPSHOT"
  :description "A web scraping library inspired by Scrapy using core.async"
  :url "https://github.com/naiquevin/attercop"
  :scm {:name "git"
        :url "https://github.com/naiquevin/attercop"}
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :signing {:gpg-key "naikvin@gmail.com"}
  :deploy-repositories [["clojars" {:creds :gpg}]]
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]
                 [http-kit "2.1.18"]
                 [enlive "1.1.5"]
                 [clojurewerkz/urly "1.0.0"]
                 [com.taoensso/timbre "3.4.0"]
                 [slugger "1.0.1"]]
  :profiles {:dev {:dependencies [[pjstadig/humane-test-output "0.7.0"]]
                   :injections [(require 'pjstadig.humane-test-output)
                                (pjstadig.humane-test-output/activate!)]}}
  :aot [attercop.examples.dmoz-lisp])
