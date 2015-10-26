name := """scala-akka-seed"""

version := "1.0"

scalaVersion := "2.11.7"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

  libraryDependencies ++= {
  val akkaVersion       = "2.4.0"
  val akkaStreamVersion = "1.0"
  val scalaTestVersion  = "2.2.4"

  Seq(
    "com.typesafe.akka" %% "akka-actor"                           % akkaVersion,
    "com.typesafe.akka" %% "akka-stream-experimental"             % akkaStreamVersion,
    "com.typesafe.akka" %% "akka-http-core-experimental"          % akkaStreamVersion,
    "com.typesafe.akka" %% "akka-http-spray-json-experimental"    % akkaStreamVersion,
    "org.scalatest"     %% "scalatest"                            % scalaTestVersion % "test",
    "com.typesafe.akka" %% "akka-testkit"                         % akkaVersion % "test"
    
  )
}

testOptions += Tests.Argument(TestFrameworks.JUnit, "-v")

fork in run := true

