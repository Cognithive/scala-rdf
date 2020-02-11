package com.cognithive.rdf.namespace

object RDF extends Namespace(baseURI = "http://www.w3.org/1999/02/22-rdf-syntax-ns#", prefixLabel = "rdf") {
    // Classes
    lazy val Alt: String = baseURI.concat("Alt")
    lazy val Bag: String = baseURI.concat("Bag")
    lazy val Html: String = baseURI.concat("HTML")
    lazy val List: String = baseURI.concat("List")
    lazy val PlainLiteral: String = baseURI.concat("PlainLiteral")
    lazy val Property: String = baseURI.concat("Property")
    lazy val Seq: String = baseURI.concat("Seq")
    lazy val Statement: String = baseURI.concat("Statement")
    lazy val XMLLiteral: String = baseURI.concat("XMLLiteral")
    // Properties
    lazy val first: String = baseURI.concat("first")
    lazy val langString: String = baseURI.concat("langString")
    lazy val nil: String = baseURI.concat("nil")
    lazy val `object`: String = baseURI.concat("object")
    lazy val predicate: String = baseURI.concat("predicate")
    lazy val rest: String = baseURI.concat("rest")
    lazy val subject: String = baseURI.concat("subject")
    lazy val `type`: String = baseURI.concat("type")
    lazy val value: String = baseURI.concat("value")
    // Shortcut
    lazy val a: String = baseURI.concat("type")
}
