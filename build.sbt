ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.11"

lazy val root = (project in file("."))
  .settings(
    name := "scala-recommend",
    idePackagePrefix := Some("com.tyfff.recommend")
  )
