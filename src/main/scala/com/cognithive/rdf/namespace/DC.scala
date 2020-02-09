package com.cognithive.rdf.namespace

object DC extends Namespace("http://purl.org/dc/elements/1.1/", "dc") {
    // Properties
    lazy val contributor = baseUri.concat("contributor")
    lazy val coverage = baseUri.concat("coverage")
    lazy val creator = baseUri.concat("creator")
    lazy val date = baseUri.concat("date")
    lazy val description = baseUri.concat("description")
    lazy val format = baseUri.concat("format")
    lazy val identifier = baseUri.concat("identifier")
    lazy val language = baseUri.concat("language")
    lazy val publisher = baseUri.concat("publisher")
    lazy val relation = baseUri.concat("relation")
    lazy val rights = baseUri.concat("rights")
    lazy val source = baseUri.concat("source")
    lazy val subject = baseUri.concat("subject")
    lazy val title = baseUri.concat("title")
    lazy val `type` = baseUri.concat("type")
}
