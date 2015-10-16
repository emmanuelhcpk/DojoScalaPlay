name := """dojo_play_scala"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  specs2 % Test,
  "org.sorm-framework" % "sorm" % "0.3.18"
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"


// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator


fork in run := true
