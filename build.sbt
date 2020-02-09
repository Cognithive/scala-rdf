
ThisBuild / description           := "Basic RDF in Scala."
ThisBuild / homepage              := Some(url("https://scala-rdf.cognithive.com"))
ThisBuild / licenses              := Seq("MIT" -> url("https://opensource.org/licenses/MIT"))
ThisBuild / organization          := "com.cognithive"
ThisBuild / organizationHomepage  := Some(url("https://cognithive.com"))
ThisBuild / organizationName      := "Cognithive"
ThisBuild / name                  := "Scala RDF"
ThisBuild / scalaVersion          := "2.13.1"
ThisBuild / startYear             := Some(2019)
ThisBuild / version               := "0.1.0"

// Library dependencies
lazy val versions = new {
  val scalatest = "3.1.0"
}

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % versions.scalatest % Test
)
