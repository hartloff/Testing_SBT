
//name := "SBT_Test"
//
//version := "0.1"
//
//
//scalaVersion := "2.13.0"
//
//lazy val root = (project in file("."))
//  .settings(
//    name := "Project",
//    // https://mvnrepository.com/artifact/org.scalatest/scalatest
//    libraryDependencies += "org.scalatest" %% "scalatest" % "3.3.0-SNAP3" % Test
//  )
//
//


ThisBuild / scalaVersion     := "2.12.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "Test",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5"
  )