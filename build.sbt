scalaVersion := "2.10.2"

organization := "km"

name := "spray-recursive"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")

resolvers += "spray repo" at "http://repo.spray.io"

resolvers += "spray-nightlies" at "http://nightlies.spray.io/"

libraryDependencies ++= Seq(
	"com.typesafe.akka" %% "akka-actor" % "2.2.0",
	"com.typesafe.akka" %% "akka-testkit" % "2.2.0" % "test",
	"io.spray" % "spray-routing" % "1.2-20130801",
	"io.spray" %%  "spray-json" % "1.2.5",
	"io.spray" % "spray-testkit" % "1.2-20130801",
	"org.scalatest" % "scalatest_2.10" % "1.9.1"
)

