name := "scala-demo-beginner"
version := "0.1"
scalaVersion := "2.12.11"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.1.1" % Test,
  "org.scalatestplus" %% "mockito-3-2" % "3.1.1.0" % Test
)
