(defproject levanzo "0.2.4"
  :description "Levanzo is a Clojure library to build hypermedia driven RESTful APIs using W3C standards"
  :url "https://github.com/antoniogarrote/levanzo"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :monkeypatch-clojure-test false
  :source-paths ["src" "examples"]
  :signing {:gpg-key "antoniogarrote@gmail.com"}
  :deploy-repositories [["releases" :clojars]
                        ["snapshots" :clojars]]
  :dependencies [[org.clojure/clojure "1.10.3"]
                 ;; [bidi "2.0.16"]
                 [bidi "2.1.6"] 
                 ;; [commons-validator "1.5.1"]
                 [commons-validator "1.7"]
                 ;; [cheshire "5.7.0"]
                 [cheshire "5.10.1"]
                 [com.cemerick/url "0.1.1"]
                 ;; [com.taoensso/timbre "4.8.0"]
                 [com.taoensso/timbre "5.1.2"]
                 [com.github.jsonld-java/jsonld-java "0.9.0"]
                 ;; [com.github.jsonld-java/jsonld-java "0.12.5"]
                 [org.clojure/test.check "1.1.0"]]
  :profiles {:dev {:dependencies [[com.novemberain/monger "3.5.0"]
                                  ;; [com.novemberain/monger "3.1.0"]
                                  ;; [http-kit "2.2.0"]
                                  [http-kit "2.5.3"]]}}
  :plugins [[lein-codox "0.10.6"]])
