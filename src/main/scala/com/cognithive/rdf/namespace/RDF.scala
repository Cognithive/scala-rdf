package com.cognithive.rdf.namespace

object RDF extends Namespace("http://www.w3.org/1999/02/22-rdf-syntax-ns#", "rdf") {
    // Classes
    lazy val alt = baseUri.concat("Alt")
    lazy val bag = baseUri.concat("Bag")
    lazy val html = baseUri.concat("HTML")
    lazy val list = baseUri.concat("List")
    lazy val plainLiteral = baseUri.concat("PlainLiteral")
    lazy val property = baseUri.concat("Property")
    lazy val seq = baseUri.concat("Seq")
    lazy val statement = baseUri.concat("Statement")
    lazy val xmlLiteral = baseUri.concat("XMLLiteral")
    // Properties
    lazy val first = baseUri.concat("first")
    lazy val langString = baseUri.concat("langString")
    lazy val nil = baseUri.concat("nil")
    lazy val `object` = baseUri.concat("object")
    lazy val predicate = baseUri.concat("predicate")
    lazy val rest = baseUri.concat("rest")
    lazy val subject = baseUri.concat("subject")
    lazy val `type` = baseUri.concat("type")
    lazy val value = baseUri.concat("value")
    // Shortcut
    lazy val a = baseUri.concat("type")
}
