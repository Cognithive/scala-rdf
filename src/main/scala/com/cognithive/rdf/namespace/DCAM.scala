package com.cognithive.rdf.namespace

object DCAM extends Namespace("http://purl.org/dc/dcam/", "dcam") {
    // Classes
    lazy val vocabularyEncodingScheme = baseUri.concat("VocabularyEncodingScheme")
    // Properties
    lazy val domainIncludes = baseUri.concat("domainIncludes")
    lazy val memberOf = baseUri.concat("memberOf")
    lazy val rangeIncludes = baseUri.concat("rangeIncludes")
}
