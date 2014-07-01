name := "algorithmic-exercises"

version := "0.1"

scalaVersion := "2.11.0"

sbtVersion := "0.13.1"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "2.3.12" % "test",
  "org.scalaz" %% "scalaz-core" % "7.0.6" )



scalacOptions in Test ++= Seq("-Yrangepos")

resolvers ++= Seq("snapshots", "releases").map(Resolver.sonatypeRepo)