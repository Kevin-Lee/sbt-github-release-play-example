name := """sbt-github-release-play-example"""

val projectVersion = "0.0.1"
version := projectVersion

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  specs2 % Test
)
