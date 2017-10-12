organization := "com.typesafe.akka.chaossbt"
name := "akka-chaos"

lazy val app = project in file(".") enablePlugins (Cinnamon)
cinnamon in run := true
cinnamon in test := true
cinnamonLogLevel := "INFO"

scalaVersion := "2.12.2"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-remote" % "2.5.4",
  Cinnamon.library.cinnamonAkka,
  Cinnamon.library.cinnamonCHMetrics,
  Cinnamon.library.cinnamonOpenTracingZipkin
)
