package com.cognithive.rdf.namespace

object SKOS extends Namespace("http://www.w3.org/2004/02/skos/core#", "skos") {
    // Classes
    lazy val collection = baseUri.concat("Collection")
    lazy val concept = baseUri.concat("Concept")
    lazy val conceptScheme = baseUri.concat("ConceptScheme")
    lazy val orderedCollection = baseUri.concat("OrderedCollection")
    // Properties
    //// Concept schemes
    lazy val hasTopConcept = baseUri.concat("hasTopConcept")
    lazy val inScheme = baseUri.concat("inScheme")
    lazy val topConceptOf = baseUri.concat("topConceptOf")
    //// Lexical labels
    lazy val altLabel = baseUri.concat("altLabel")
    lazy val hiddenLabel = baseUri.concat("hiddenLabel")
    lazy val prefLabel = baseUri.concat("prefLabel")
    //// Notations
    lazy val notation = baseUri.concat("notation")
    //// Documentation properties
    lazy val changeNote = baseUri.concat("changeNote")
    lazy val definition = baseUri.concat("definition")
    lazy val editorialNote = baseUri.concat("editorialNote")
    lazy val example = baseUri.concat("example")
    lazy val historyNote = baseUri.concat("historyNote")
    lazy val note = baseUri.concat("note")
    lazy val scopeNote = baseUri.concat("scopeNote")
    //// Semantic relations
    lazy val broader = baseUri.concat("broader")
    lazy val broaderTransitive = baseUri.concat("broaderTransitive")
    lazy val narrower = baseUri.concat("narrower")
    lazy val narrowerTransitive = baseUri.concat("narrowerTransitive")
    lazy val related = baseUri.concat("related")
    lazy val semanticRelation = baseUri.concat("semanticRelation")
    //// Concept collections
    lazy val member = baseUri.concat("member")
    lazy val memberList = baseUri.concat("memberList")
    //// Mapping properties
    lazy val broadMatch = baseUri.concat("broadMatch")
    lazy val closeMatch = baseUri.concat("closeMatch")
    lazy val exactMatch = baseUri.concat("exactMatch")
    lazy val mappingRelation = baseUri.concat("mappingRelation")
    lazy val narrowMatch = baseUri.concat("narrowMatch")
    lazy val relatedMatch = baseUri.concat("relatedMatch")
}
