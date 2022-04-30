ThisBuild / version          := "0.0.1"
ThisBuild / scalaVersion     := "2.13.8"
ThisBuild / organization     := "com.jemb"  
ThisBuild / organizationName := "jemb"

lazy val root = (project in file("."))
  .settings(
    name := "fp016_option_con_for"
  )