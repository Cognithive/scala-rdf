package com.cognithive.rdf.namespace

object RDFS extends Namespace(baseURI = "http://www.w3.org/2000/01/rdf-schema#", prefixLabel = "rdfs") {
    // Classes
    lazy val Class: String = baseURI.concat("Class")
    lazy val Container: String = baseURI.concat("Container")
    lazy val ContainerMembershipProperty: String = baseURI.concat("ContainerMembershipProperty")
    lazy val Datatype: String = baseURI.concat("Datatype")
    lazy val Literal: String = baseURI.concat("Literal")
    lazy val Resource: String = baseURI.concat("Resource")
    // Properties
    lazy val comment: String = baseURI.concat("comment")
    lazy val domain: String = baseURI.concat("domain")
    lazy val isDefinedBy: String = baseURI.concat("isDefinedBy")
    lazy val label: String = baseURI.concat("label")
    lazy val member: String = baseURI.concat("member")
    lazy val range: String = baseURI.concat("range")
    lazy val seeAlso: String = baseURI.concat("seeAlso")
    lazy val subClassOf: String = baseURI.concat("subClassOf")
    lazy val subPropertyOf: String = baseURI.concat("subPropertyOf")
}
