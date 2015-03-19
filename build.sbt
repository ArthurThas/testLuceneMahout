name := "testLuceneMahout"

version := "1.0"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "org.apache.lucene" % "lucene-core" % "4.6.1",
  "org.apache.mahout" % "mahout" % "0.9"
)
    