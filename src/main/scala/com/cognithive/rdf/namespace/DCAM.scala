package com.cognithive.rdf.namespace

object DCAM extends Namespace(baseURI = "http://purl.org/dc/dcam/", prefixLabel = "dcam") {
    // Classes
    lazy val VocabularyEncodingScheme: String = baseURI.concat("VocabularyEncodingScheme")
    // Properties
    lazy val domainIncludes: String = baseURI.concat("domainIncludes")
    lazy val memberOf: String = baseURI.concat("memberOf")
    lazy val rangeIncludes: String = baseURI.concat("rangeIncludes")
}
