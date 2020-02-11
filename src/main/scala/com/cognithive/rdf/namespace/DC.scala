package com.cognithive.rdf.namespace

object DC extends Namespace(baseURI = "http://purl.org/dc/elements/1.1/", prefixLabel = "dc") {
    // Properties
    lazy val contributor: String = baseURI.concat("contributor")
    lazy val coverage: String = baseURI.concat("coverage")
    lazy val creator: String = baseURI.concat("creator")
    lazy val date: String = baseURI.concat("date")
    lazy val description: String = baseURI.concat("description")
    lazy val format: String = baseURI.concat("format")
    lazy val identifier: String = baseURI.concat("identifier")
    lazy val language: String = baseURI.concat("language")
    lazy val publisher: String = baseURI.concat("publisher")
    lazy val relation: String = baseURI.concat("relation")
    lazy val rights: String = baseURI.concat("rights")
    lazy val source: String = baseURI.concat("source")
    lazy val subject: String = baseURI.concat("subject")
    lazy val title: String = baseURI.concat("title")
    lazy val `type`: String = baseURI.concat("type")
}
