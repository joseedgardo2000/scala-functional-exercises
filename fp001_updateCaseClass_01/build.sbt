ThisBuild / version          := "0.0.1"
ThisBuild / scalaVersion     := "2.13.8"
ThisBuild / organization     := "com.jemb"  
ThisBuild / organizationName := "jemb"

enablePlugins(JavaAppPackaging)

lazy val root = (project in file("."))
  .settings(
    name := "FP001_Update"
  )
  
// general package information (can be scoped to Windows)
maintainer := "JEMB"
packageSummary := "Prueba"
packageDescription := """PRUEBA MSI."""

// wix build information
wixProductId := "*"
//wixProductUpgradeId := "4552fb0e-e257-4dbd-9ecb-dba9dbacf425"  