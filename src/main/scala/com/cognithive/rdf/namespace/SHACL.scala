package com.cognithive.rdf.namespace

object SHACL extends Namespace(baseURI = "http://www.w3.org/ns/shacl#", prefixLabel = "shacl") {
    // Shapes vocabulary
    //// Classes
    lazy val NodeShape: String = baseURI.concat("NodeShape")
    lazy val PropertyShape: String = baseURI.concat("PropertyShape")
    lazy val Shape: String = baseURI.concat("Shape")
    //// Properties
    lazy val deactivated: String = baseURI.concat("deactivated")
    lazy val message: String = baseURI.concat("message")
    lazy val severity: String = baseURI.concat("severity")
    lazy val targetClass: String = baseURI.concat("targetClass")
    lazy val targetNode: String = baseURI.concat("targetNode")
    lazy val targetObjectsOf: String = baseURI.concat("targetObjectsOf")
    lazy val targetSubjectsOf: String = baseURI.concat("targetSubjectsOf")
    // Node kind vocabulary
    //// Classes
    lazy val BlankNode: String = baseURI.concat("BlankNode")
    lazy val BlankNodeOrIRI: String = baseURI.concat("BlankNodeOrIRI")
    lazy val BlankNodeOrLiteral: String = baseURI.concat("BlankNodeOrLiteral")
    lazy val IRI: String = baseURI.concat("IRI")
    lazy val IRIOrLiteral: String = baseURI.concat("IRIOrLiteral")
    lazy val Literal: String = baseURI.concat("Literal")
    lazy val NodeKind: String = baseURI.concat("NodeKind")
    // Results vocabulary
    //// Classes
    lazy val AbstractResult: String = baseURI.concat("AbstractResult")
    lazy val Info: String = baseURI.concat("Info")
    lazy val Severity: String = baseURI.concat("Severity")
    lazy val ValidationReport: String = baseURI.concat("ValidationReport")
    lazy val ValidationResult: String = baseURI.concat("ValidationResult")
    lazy val Violation: String = baseURI.concat("Violation")
    lazy val Warning: String = baseURI.concat("Warning")
    //// Properties
    lazy val conforms: String = baseURI.concat("conforms")
    lazy val detail: String = baseURI.concat("detail")
    lazy val focusNode: String = baseURI.concat("focusNode")
    lazy val result: String = baseURI.concat("result")
    lazy val resultMessage: String = baseURI.concat("resultMessage")
    lazy val resultPath: String = baseURI.concat("resultPath")
    lazy val resultSeverity: String = baseURI.concat("resultSeverity")
    lazy val shapesGraphWellFormed: String = baseURI.concat("shapesGraphWellFormed")
    lazy val sourceConstraint: String = baseURI.concat("sourceConstraint")
    lazy val sourceConstraintComponent: String = baseURI.concat("sourceConstraintComponent")
    lazy val sourceShape: String = baseURI.concat("sourceShape")
    lazy val value: String = baseURI.concat("value")
    // Graph properties
    //// Properties
    lazy val shapesGraph: String = baseURI.concat("shapesGraph")
    lazy val suggestedShapesGraph: String = baseURI.concat("suggestedShapesGraph")
    lazy val entailment: String = baseURI.concat("entailment")
    // Path vocabulary
    //// Properties
    lazy val alternativePath: String = baseURI.concat("alternativePath")
    lazy val inversePath: String = baseURI.concat("inversePath")
    lazy val oneOrMorePath: String = baseURI.concat("oneOrMorePath")
    lazy val path: String = baseURI.concat("path")
    lazy val zeroOrMorePath: String = baseURI.concat("zeroOrMorePath")
    lazy val zeroOrOnePath: String = baseURI.concat("zeroOrOnePath")
    // Parameters metamodel
    //// Classes
    lazy val Parameter: String = baseURI.concat("Parameter")
    lazy val Parameterizable: String = baseURI.concat("Parameterizable")
    //// Properties
    lazy val parameter: String = baseURI.concat("parameter")
    lazy val labelTemplate: String = baseURI.concat("labelTemplate")
    lazy val optional: String = baseURI.concat("optional")
    // Constraint components metamodel
    //// Classes
    lazy val ConstraintComponent: String = baseURI.concat("ConstraintComponent")
    lazy val SPARQLAskValidator: String = baseURI.concat("SPARQLAskValidator")
    lazy val SPARQLSelectValidator: String = baseURI.concat("SPARQLSelectValidator")
    lazy val Validator: String = baseURI.concat("Validator")
    //// Properties
    lazy val nodeValidator: String = baseURI.concat("nodeValidator")
    lazy val propertyValidator: String = baseURI.concat("propertyValidator")
    lazy val validator: String = baseURI.concat("validator")
    // Library of Core Constraint Components and their properties
    //// Classes
    lazy val AndConstraintComponent: String = baseURI.concat("AndConstraintComponent")
    lazy val AndConstraintComponent_and: String = baseURI.concat("AndConstraintComponent-and")
    lazy val ClassConstraintComponent: String = baseURI.concat("ClassConstraintComponent")
    lazy val ClassConstraintComponent_class: String = baseURI.concat("ClassConstraintComponent-class")
    lazy val ClosedConstraintComponent: String = baseURI.concat("ClosedConstraintComponent")
    lazy val ClosedConstraintComponent_closed: String = baseURI.concat("ClosedConstraintComponent-closed")
    lazy val ClosedConstraintComponent_ignoredProperties: String = baseURI.concat("ClosedConstraintComponent-ignoredProperties")
    lazy val DatatypeConstraintComponent: String = baseURI.concat("DatatypeConstraintComponent")
    lazy val DatatypeConstraintComponent_datatype: String = baseURI.concat("DatatypeConstraintComponent-datatype")
    lazy val DisjointConstraintComponent: String = baseURI.concat("DisjointConstraintComponent")
    lazy val DisjointConstraintComponent_disjoint: String = baseURI.concat("DisjointConstraintComponent-disjoint")
    lazy val EqualsConstraintComponent: String = baseURI.concat("EqualsConstraintComponent")
    lazy val EqualsConstraintComponent_equals: String = baseURI.concat("EqualsConstraintComponent-equals")
    lazy val HasValueConstraintComponent: String = baseURI.concat("HasValueConstraintComponent")
    lazy val HasValueConstraintComponent_hasValue: String = baseURI.concat("HasValueConstraintComponent-hasValue")
    lazy val InConstraintComponent: String = baseURI.concat("InConstraintComponent")
    lazy val InConstraintComponent_in: String = baseURI.concat("InConstraintComponent-in")
    lazy val LanguageInConstraintComponent: String = baseURI.concat("LanguageInConstraintComponent")
    lazy val LanguageInConstraintComponent_languageIn: String = baseURI.concat("LanguageInConstraintComponent-languageIn")
    lazy val LessThanConstraintComponent: String = baseURI.concat("LessThanConstraintComponent")
    lazy val LessThanConstraintComponent_lessThan: String = baseURI.concat("LessThanConstraintComponent-lessThan")
    lazy val LessThanOrEqualsConstraintComponent: String = baseURI.concat("LessThanOrEqualsConstraintComponent")
    lazy val LessThanOrEqualsConstraintComponent_lessThanOrEquals: String = baseURI.concat("LessThanOrEqualsConstraintComponent-lessThanOrEquals")
    lazy val MaxCountConstraintComponent: String = baseURI.concat("MaxCountConstraintComponent")
    lazy val MaxCountConstraintComponent_maxCount: String = baseURI.concat("MaxCountConstraintComponent-maxCount")
    lazy val MaxExclusiveConstraintComponent: String = baseURI.concat("MaxExclusiveConstraintComponent")
    lazy val MaxExclusiveConstraintComponent_maxExclusive: String = baseURI.concat("MaxExclusiveConstraintComponent-maxExclusive")
    lazy val MaxInclusiveConstraintComponent_maxInclusive: String = baseURI.concat("MaxInclusiveConstraintComponent-maxInclusive")
    lazy val MaxLengthConstraintComponent: String = baseURI.concat("MaxLengthConstraintComponent")
    lazy val MaxLengthConstraintComponent_maxLength: String = baseURI.concat("MaxLengthConstraintComponent-maxLength")
    lazy val MinCountConstraintComponent: String = baseURI.concat("MinCountConstraintComponent")
    lazy val MinCountConstraintComponent_minCount: String = baseURI.concat("MinCountConstraintComponent-minCount")
    lazy val MinExclusiveConstraintComponent: String = baseURI.concat("MinExclusiveConstraintComponent")
    lazy val MinExclusiveConstraintComponent_minExclusive: String = baseURI.concat("MinExclusiveConstraintComponent-minExclusive")
    lazy val MinInclusiveConstraintComponent: String = baseURI.concat("MinInclusiveConstraintComponent")
    lazy val MinInclusiveConstraintComponent_minInclusive: String = baseURI.concat("MinInclusiveConstraintComponent-minInclusive")
    lazy val MinLengthConstraintComponent: String = baseURI.concat("MinLengthConstraintComponent")
    lazy val MinLengthConstraintComponent_minLength: String = baseURI.concat("MinLengthConstraintComponent-minLength")
    lazy val NodeConstraintComponent: String = baseURI.concat("NodeConstraintComponent")
    lazy val NodeConstraintComponent_node: String = baseURI.concat("NodeConstraintComponent-node")
    lazy val NodeKindConstraintComponent: String = baseURI.concat("NodeKindConstraintComponent")
    lazy val NodeKindConstraintComponent_nodeKind: String = baseURI.concat("NodeKindConstraintComponent-nodeKind")
    lazy val NotConstraintComponent: String = baseURI.concat("NotConstraintComponent")
    lazy val NotConstraintComponent_not: String = baseURI.concat("NotConstraintComponent-not")
    lazy val OrConstraintComponent: String = baseURI.concat("OrConstraintComponent")
    lazy val OrConstraintComponent_or: String = baseURI.concat("OrConstraintComponent-or")
    lazy val PatternConstraintComponent: String = baseURI.concat("PatternConstraintComponent")
    lazy val PatternConstraintComponent_flags: String = baseURI.concat("PatternConstraintComponent-flags")
    lazy val PatternConstraintComponent_pattern: String = baseURI.concat("PatternConstraintComponent-pattern")
    lazy val PropertyConstraintComponent: String = baseURI.concat("PropertyConstraintComponent")
    lazy val PropertyConstraintComponent_property: String = baseURI.concat("PropertyConstraintComponent-property")
    lazy val QualifiedMaxCountConstraintComponent: String = baseURI.concat("QualifiedMaxCountConstraintComponent")
    lazy val QualifiedMaxCountConstraintComponent_qualifiedMaxCount: String = baseURI.concat("QualifiedMaxCountConstraintComponent-qualifiedMaxCount")
    lazy val QualifiedMaxCountConstraintComponent_qualifiedValueShape: String = baseURI.concat("QualifiedMaxCountConstraintComponent-qualifiedValueShape")
    lazy val QualifiedMaxCountConstraintComponent_qualifiedValueShapesDisjoint: String = baseURI.concat("QualifiedMaxCountConstraintComponent-qualifiedValueShapesDisjoint")
    lazy val QualifiedMinCountConstraintComponent: String = baseURI.concat("QualifiedMinCountConstraintComponent")
    lazy val QualifiedMinCountConstraintComponent_qualifiedMinCount: String = baseURI.concat("QualifiedMinCountConstraintComponent-qualifiedMinCount")
    lazy val QualifiedMinCountConstraintComponent_qualifiedValueShape: String = baseURI.concat("QualifiedMinCountConstraintComponent-qualifiedValueShape")
    lazy val QualifiedMinCountConstraintComponent_qualifiedValueShapesDisjoint: String = baseURI.concat("QualifiedMinCountConstraintComponent-qualifiedValueShapesDisjoint")
    lazy val UniqueLangConstraintComponent: String = baseURI.concat("UniqueLangConstraintComponent")
    lazy val UniqueLangConstraintComponent_uniqueLang: String = baseURI.concat("UniqueLangConstraintComponent-uniqueLang")
    lazy val XoneConstraintComponent: String = baseURI.concat("XoneConstraintComponent")
    lazy val XoneConstraintComponent_xone: String = baseURI.concat("XoneConstraintComponent-xone")
    //// Properties
    lazy val `class`: String = baseURI.concat("class")
    lazy val and: String = baseURI.concat("and")
    lazy val closed: String = baseURI.concat("closed")
    lazy val datatype: String = baseURI.concat("datatype")
    lazy val disjoint: String = baseURI.concat("disjoint")
    lazy val equals: String = baseURI.concat("equals")
    lazy val flags: String = baseURI.concat("flags")
    lazy val hasValue: String = baseURI.concat("hasValue")
    lazy val ignoredProperties: String = baseURI.concat("ignoredProperties")
    lazy val in: String = baseURI.concat("in")
    lazy val languageIn: String = baseURI.concat("languageIn")
    lazy val lessThan: String = baseURI.concat("lessThan")
    lazy val lessThanOrEquals: String = baseURI.concat("lessThanOrEquals")
    lazy val maxCount: String = baseURI.concat("maxCount")
    lazy val maxExclusive: String = baseURI.concat("maxExclusive")
    lazy val maxInclusive: String = baseURI.concat("maxInclusive")
    lazy val maxInclusiveConstraintComponent: String = baseURI.concat("maxInclusiveConstraintComponent")
    lazy val maxLength: String = baseURI.concat("maxLength")
    lazy val minCount: String = baseURI.concat("minCount")
    lazy val minExclusive: String = baseURI.concat("minExclusive")
    lazy val minInclusive: String = baseURI.concat("minInclusive")
    lazy val minLength: String = baseURI.concat("minLength")
    lazy val node: String = baseURI.concat("node")
    lazy val nodeKind: String = baseURI.concat("nodeKind")
    lazy val not: String = baseURI.concat("not")
    lazy val or: String = baseURI.concat("or")
    lazy val pattern: String = baseURI.concat("pattern")
    lazy val property: String = baseURI.concat("property")
    lazy val qualifiedMaxCount: String = baseURI.concat("qualifiedMaxCount")
    lazy val qualifiedMinCount: String = baseURI.concat("qualifiedMinCount")
    lazy val qualifiedValueShape: String = baseURI.concat("qualifiedValueShape")
    lazy val qualifiedValueShapesDisjoint: String = baseURI.concat("qualifiedValueShapesDisjoint")
    lazy val uniqueLang: String = baseURI.concat("uniqueLang")
    lazy val xone: String = baseURI.concat("xone")
    // General SPARQL execution support
    //// Classes
    lazy val PrefixDeclaration: String = baseURI.concat("PrefixDeclaration")
    lazy val SPARQLAskExecutable: String = baseURI.concat("SPARQLAskExecutable")
    lazy val SPARQLConstructExecutable: String = baseURI.concat("SPARQLConstructExecutable")
    lazy val SPARQLExecutable: String = baseURI.concat("SPARQLExecutable")
    lazy val SPARQLSelectExecutable: String = baseURI.concat("SPARQLSelectExecutable")
    lazy val SPARQLUpdateExecutable: String = baseURI.concat("SPARQLUpdateExecutable")
    //// Properties
    lazy val ask: String = baseURI.concat("ask")
    lazy val construct: String = baseURI.concat("construct")
    lazy val declare: String = baseURI.concat("declare")
    lazy val namespace: String = baseURI.concat("namespace")
    lazy val prefix: String = baseURI.concat("prefix")
    lazy val prefixes: String = baseURI.concat("prefixes")
    lazy val select: String = baseURI.concat("select")
    lazy val update: String = baseURI.concat("update")
    // SPARQL-based Constraints support
    //// Classes
    lazy val SPARQLConstraint: String = baseURI.concat("SPARQLConstraint")
    lazy val SPARQLConstraintComponent: String = baseURI.concat("SPARQLConstraintComponent")
    lazy val SPARQLConstraintComponent_sparql: String = baseURI.concat("SPARQLConstraintComponent-sparql")
    //// Properties
    lazy val sparql: String = baseURI.concat("sparql")
    // Non-validating constraint properties
    //// Classes
    lazy val PropertyGroup: String = baseURI.concat("PropertyGroup")
    //// Properties
    lazy val defaultValue: String = baseURI.concat("defaultValue")
    lazy val description: String = baseURI.concat("description")
    lazy val group: String = baseURI.concat("group")
    lazy val name: String = baseURI.concat("name")
    lazy val order: String = baseURI.concat("order")
    // SHACL ADVANCED FEATURES
    // Advanced Target vocabulary
    //// Classes
    lazy val SPARQLTarget: String = baseURI.concat("SPARQLTarget")
    lazy val SPARQLTargetType: String = baseURI.concat("SPARQLTargetType")
    lazy val Target: String = baseURI.concat("Target")
    lazy val TargetType: String = baseURI.concat("TargetType")
    //// Properties
    lazy val target: String = baseURI.concat("target")
    // Functions Vocabulary
    //// Classes
    lazy val Function: String = baseURI.concat("Function")
    lazy val SPARQLFunction: String = baseURI.concat("SPARQLFunction")
    //// Properties
    lazy val returnType: String = baseURI.concat("returnType")
    // Result Annotations
    //// Classes
    lazy val ResultAnnotation: String = baseURI.concat("ResultAnnotation")
    //// Properties
    lazy val annotationProperty: String = baseURI.concat("annotationProperty")
    lazy val annotationValue: String = baseURI.concat("annotationValue")
    lazy val annotationVarName: String = baseURI.concat("annotationVarName")
    lazy val resultAnnotation: String = baseURI.concat("resultAnnotation")
    // Node Expressions
    //// Properties
    lazy val `this`: String = baseURI.concat("this")
    lazy val filterShape: String = baseURI.concat("filterShape")
    lazy val nodes: String = baseURI.concat("nodes")
    lazy val intersection: String = baseURI.concat("intersection")
    lazy val union: String = baseURI.concat("union")
    // Expression Constraints
    //// Classes
    lazy val ExpressionConstraintComponent: String = baseURI.concat("ExpressionConstraintComponent")
    lazy val ExpressionConstraintComponent_expression: String = baseURI.concat("ExpressionConstraintComponent-expression")
    //// Properties
    lazy val expression: String = baseURI.concat("expression")
    // Rules
    //// Classes
    lazy val Rule: String = baseURI.concat("Rule")
    lazy val SPARQLRule: String = baseURI.concat("SPARQLRule")
    lazy val TripleRule: String = baseURI.concat("TripleRule")
    //// Properties
    lazy val condition: String = baseURI.concat("condition")
    lazy val `object`: String = baseURI.concat("object")
    lazy val predicate: String = baseURI.concat("predicate")
    lazy val rule: String = baseURI.concat("rule")
    lazy val subject: String = baseURI.concat("subject")
    // SHACL-JS
    //// Classes
    lazy val JSConstraint: String = baseURI.concat("JSConstraint")
    lazy val JSConstraint_js: String = baseURI.concat("JSConstraint-js")
    lazy val JSConstraintComponent: String = baseURI.concat("JSConstraintComponent")
    lazy val JSExecutable: String = baseURI.concat("JSExecutable")
    lazy val JSFunction: String = baseURI.concat("JSFunction")
    lazy val JSLibrary: String = baseURI.concat("JSLibrary")
    lazy val JSRule: String = baseURI.concat("JSRule")
    lazy val JSTarget: String = baseURI.concat("JSTarget")
    lazy val JSTargetType: String = baseURI.concat("JSTargetType")
    lazy val JSValidator: String = baseURI.concat("JSValidator")
    //// Properties
    lazy val js: String = baseURI.concat("js")
    lazy val jsFunctionName: String = baseURI.concat("jsFunctionName")
    lazy val jsLibrary: String = baseURI.concat("jsLibrary")
    lazy val jsLibraryURL: String = baseURI.concat("jsLibraryURL")
}
