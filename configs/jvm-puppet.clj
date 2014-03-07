(defproject puppetlabs/jvm-puppet-release "0.0.1"
  :description "Release artifacts for jvm-puppet"
  :pedantic? :abort
  :dependencies [[puppetlabs/jvm-puppet "0.0.1" :exclusions [cheshire]]]

  :uberjar-name "jvm-puppet-release.jar"

  :repositories [["releases" "http://nexus.delivery.puppetlabs.net/content/repositories/releases/"]
                 ["snapshots" "http://nexus.delivery.puppetlabs.net/content/repositories/snapshots/"]]
  )