ThisBuild / version          := "0.0.1"
ThisBuild / scalaVersion     := "2.13.8"
ThisBuild / organization     := "com.jemb"  
ThisBuild / organizationName := "jemb"

lazy val root = (project in file("."))
  .settings(
    name := "fp029_scalacheck"
  )

libraryDependencies ++= Seq(
  "org.scalacheck" %% "scalacheck" % "1.14.1" % "test",
  "org.scalatest" %% "scalatest" % "3.2.11" % "test"
)

//coverageEnabled := true
//coverageExcludedPackages := "Principal.scala"