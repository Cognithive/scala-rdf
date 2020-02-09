package com.cognithive.rdf.namespace

object RDFS extends Namespace("http://www.w3.org/2000/01/rdf-schema#", "rdfs") {
    // Classes
    lazy val `class`= baseUri.concat("Class")
    lazy val container = baseUri.concat("Container")
    lazy val containerMembershipProperty = baseUri.concat("ContainerMembershipProperty")
    lazy val datatype = baseUri.concat("Datatype")
    lazy val literal = baseUri.concat("Literal")
    lazy val resource = baseUri.concat("Resource")
    // Properties
    lazy val comment = baseUri.concat("comment")
    lazy val domain = baseUri.concat("domain")
    lazy val isDefinedBy = baseUri.concat("isDefinedBy")
    lazy val label = baseUri.concat("label")
    lazy val member = baseUri.concat("member")
    lazy val range = baseUri.concat("range")
    lazy val seeAlso = baseUri.concat("seeAlso")
    lazy val subClassOf = baseUri.concat("subClassOf")
    lazy val subPropertyOf = baseUri.concat("subPropertyOf")
}
