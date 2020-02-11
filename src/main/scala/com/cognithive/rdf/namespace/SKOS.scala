package com.cognithive.rdf.namespace

object SKOS extends Namespace(baseURI = "http://www.w3.org/2004/02/skos/core#", prefixLabel = "skos") {
    // Classes
    lazy val Collection: String = baseURI.concat("Collection")
    lazy val Concept: String = baseURI.concat("Concept")
    lazy val ConceptScheme: String = baseURI.concat("ConceptScheme")
    lazy val OrderedCollection: String = baseURI.concat("OrderedCollection")
    // Properties
    //// Concept schemes
    lazy val hasTopConcept: String = baseURI.concat("hasTopConcept")
    lazy val inScheme: String = baseURI.concat("inScheme")
    lazy val topConceptOf: String = baseURI.concat("topConceptOf")
    //// Lexical labels
    lazy val altLabel: String = baseURI.concat("altLabel")
    lazy val hiddenLabel: String = baseURI.concat("hiddenLabel")
    lazy val prefLabel: String = baseURI.concat("prefLabel")
    //// Notations
    lazy val notation: String = baseURI.concat("notation")
    //// Documentation properties
    lazy val changeNote: String = baseURI.concat("changeNote")
    lazy val definition: String = baseURI.concat("definition")
    lazy val editorialNote: String = baseURI.concat("editorialNote")
    lazy val example: String = baseURI.concat("example")
    lazy val historyNote: String = baseURI.concat("historyNote")
    lazy val note: String = baseURI.concat("note")
    lazy val scopeNote: String = baseURI.concat("scopeNote")
    //// Semantic relations
    lazy val broader: String = baseURI.concat("broader")
    lazy val broaderTransitive: String = baseURI.concat("broaderTransitive")
    lazy val narrower: String = baseURI.concat("narrower")
    lazy val narrowerTransitive: String = baseURI.concat("narrowerTransitive")
    lazy val related: String = baseURI.concat("related")
    lazy val semanticRelation: String = baseURI.concat("semanticRelation")
    //// Concept collections
    lazy val member: String = baseURI.concat("member")
    lazy val memberList: String = baseURI.concat("memberList")
    //// Mapping properties
    lazy val broadMatch: String = baseURI.concat("broadMatch")
    lazy val closeMatch: String = baseURI.concat("closeMatch")
    lazy val exactMatch: String = baseURI.concat("exactMatch")
    lazy val mappingRelation: String = baseURI.concat("mappingRelation")
    lazy val narrowMatch: String = baseURI.concat("narrowMatch")
    lazy val relatedMatch: String = baseURI.concat("relatedMatch")
}
