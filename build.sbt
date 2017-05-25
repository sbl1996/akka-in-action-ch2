name := "up-and-running"

scalaVersion := "2.12.2"

scalacOptions ++= Seq(
  "-deprecation",
  "-Xfatal-warnings",
  "-feature"
)

//libraryDependencies += "junit" % "junit" % "4.12"

enablePlugins(JavaServerAppPackaging)


libraryDependencies ++= akkaDeps
libraryDependencies ++= akkaHttpDeps
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"

//libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.13.4" % "test"

//libraryDependencies +=  "org.scalaj" %% "scalaj-http" % "2.3.0"

//libraryDependencies += "com.github.pathikrit" %% "better-files" % "3.0.0"

val akkaDeps = {
  val akkaVersion = "2.4.18"
  Seq(
    "com.typesafe.akka" %% "akka-actor" % akkaVersion,
    "com.typesafe.akka" %% "akka-slf4j" % akkaVersion,
    "ch.qos.logback"    %  "logback-classic" % "1.2.3",
    "com.typesafe.akka" %% "akka-testkit" % akkaVersion % "test"
  ) 
}

val akkaHttpDeps = {
  val akkaHttpVersion = "10.0.6"
  Seq(
    "com.typesafe.akka" %% "akka-http-core" % akkaHttpVersion,
    "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
    "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion
  )
}