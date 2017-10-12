organization := "com.typesafe.akka.chaossbt"
name := "akka-chaos"

scalaVersion := "2.12.2"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-remote" % "2.5.4"
)

ensimeIgnoreScalaMismatch in ThisBuild := true