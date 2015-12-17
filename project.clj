(defproject fp-talk "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://github.com/chrishowejones/fp-talk"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.170"]
                 [org.clojure/core.async "0.2.374"]
                 [petrol "0.1.0"]
                 [reagent "0.5.1"]
                 [cljs-http "0.1.38"]]
  :plugins [[lein-cljsbuild "1.1.1"]
            [lein-figwheel "0.5.0-1"]]
  :source-paths ["src"]
  :profiles  {:dev {:dependencies [[figwheel-sidecar "0.5.0-1"]
                                   [com.cemerick/piggieback "0.2.1"]]
                    :source-paths ["src"]}
              :repl {:plugins [[cider/cider-nrepl "0.10.0"]]}}
  :cljsbuild {:builds
              [{:id "dev"
                :source-paths ["src"]
                :figwheel {:on-jsload "fp-talk.core/reload-hook"}
                :compiler {:main fp-talk.core
                           :asset-path "js/compiled/out"
                           :output-to "resources/public/js/compiled/fp_talk.js"
                           :output-dir "resources/public/js/compiled/out"
                           :source-map-timestamp true}}]}
  :nrepl-options {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]})
