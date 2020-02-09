package com.cognithive.rdf.namespace

object SHACL extends Namespace("http://www.w3.org/ns/shacl#", "shacl") {
    // Shapes vocabulary
    //// Classes
    lazy val nodeShape = baseUri.concat("NodeShape")
    lazy val propertyShape = baseUri.concat("PropertyShape")
    lazy val shape = baseUri.concat("Shape")
    //// Properties
    lazy val deactivated = baseUri.concat("deactivated")
    lazy val message = baseUri.concat("message")
    lazy val severity = baseUri.concat("severity")
    lazy val targetClass = baseUri.concat("targetClass")
    lazy val targetNode = baseUri.concat("targetNode")
    lazy val targetObjectsOf = baseUri.concat("targetObjectsOf")
    lazy val targetSubjectsOf = baseUri.concat("targetSubjectsOf")
    // Node kind vocabulary
    //// Classes
    lazy val blankNode = baseUri.concat("BlankNode")
    lazy val blankNodeOrIRI = baseUri.concat("BlankNodeOrIRI")
    lazy val blankNodeOrLiteral = baseUri.concat("BlankNodeOrLiteral")
    lazy val iri = baseUri.concat("IRI")
    lazy val iriOrLiteral = baseUri.concat("IRIOrLiteral")
    lazy val literal = baseUri.concat("Literal")
    lazy val nodeKind = baseUri.concat("NodeKind")
    // Results vocabulary
    //// Classes
    lazy val abstractResult = baseUri.concat("AbstractResult")
    lazy val info = baseUri.concat("Info")
    lazy val severity = baseUri.concat("Severity")
    lazy val validationReport = baseUri.concat("ValidationReport")
    lazy val validationResult = baseUri.concat("ValidationResult")
    lazy val violation = baseUri.concat("Violation")
    lazy val warning = baseUri.concat("Warning")
    //// Properties
    lazy val conforms = baseUri.concat("conforms")
    lazy val detail = baseUri.concat("detail")
    lazy val focusNode = baseUri.concat("focusNode")
    lazy val result = baseUri.concat("result")
    lazy val resultMessage = baseUri.concat("resultMessage")
    lazy val resultPath = baseUri.concat("resultPath")
    lazy val resultSeverity = baseUri.concat("resultSeverity")
    lazy val shapesGraphWellFormed = baseUri.concat("shapesGraphWellFormed")
    lazy val sourceConstraint = baseUri.concat("sourceConstraint")
    lazy val sourceConstraintComponent = baseUri.concat("sourceConstraintComponent")
    lazy val sourceShape = baseUri.concat("sourceShape")
    lazy val value = baseUri.concat("value")
    // Graph properties
    //// Properties
    lazy val shapesGraph = baseUri.concat("shapesGraph")
    lazy val suggestedShapesGraph = baseUri.concat("suggestedShapesGraph")
    lazy val entailment = baseUri.concat("entailment")
    // Path vocabulary
    //// Properties
    lazy val alternativePath = baseUri.concat("alternativePath")
    lazy val inversePath = baseUri.concat("inversePath")
    lazy val oneOrMorePath = baseUri.concat("oneOrMorePath")
    lazy val path = baseUri.concat("path")
    lazy val zeroOrMorePath = baseUri.concat("zeroOrMorePath")
    lazy val zeroOrOnePath = baseUri.concat("zeroOrOnePath")
    // Parameters metamodel
    //// Classes
    lazy val parameterClass = baseUri.concat("Parameter")
    lazy val parameterizable = baseUri.concat("Parameterizable")
    //// Properties
    lazy val parameter = baseUri.concat("parameter")
    lazy val labelTemplate = baseUri.concat("labelTemplate")
    lazy val optional = baseUri.concat("optional")
    // Constraint components metamodel
    //// Classes
    lazy val constraintComponent = baseUri.concat("ConstraintComponent")
    lazy val sparqlAskValidator = baseUri.concat("SPARQLAskValidator")
    lazy val sparqlSelectValidator = baseUri.concat("SPARQLSelectValidator")
    lazy val validator = baseUri.concat("Validator")
    //// Properties
    lazy val nodeValidator = baseUri.concat("nodeValidator")
    lazy val propertyValidator = baseUri.concat("propertyValidator")
    lazy val validator = baseUri.concat("validator")
    // Library of Core Constraint Components and their properties
    //// Classes
    lazy val andConstraintComponent = baseUri.concat("AndConstraintComponent")
    lazy val andConstraintComponent_and = baseUri.concat("AndConstraintComponent-and")
    lazy val classConstraintComponent = baseUri.concat("ClassConstraintComponent")
    lazy val classConstraintComponent_class = baseUri.concat("ClassConstraintComponent-class")
    lazy val closedConstraintComponent = baseUri.concat("ClosedConstraintComponent")
    lazy val closedConstraintComponent_closed = baseUri.concat("ClosedConstraintComponent-closed")
    lazy val closedConstraintComponent_ignoredProperties = baseUri.concat("ClosedConstraintComponent-ignoredProperties")
    lazy val datatypeConstraintComponent = baseUri.concat("DatatypeConstraintComponent")
    lazy val datatypeConstraintComponent_datatype = baseUri.concat("DatatypeConstraintComponent-datatype")
    lazy val disjointConstraintComponent = baseUri.concat("DisjointConstraintComponent")
    lazy val disjointConstraintComponent_disjoint = baseUri.concat("DisjointConstraintComponent-disjoint")
    lazy val equalsConstraintComponent = baseUri.concat("EqualsConstraintComponent")
    lazy val equalsConstraintComponent_equals = baseUri.concat("EqualsConstraintComponent-equals")
    lazy val hasValueConstraintComponent = baseUri.concat("HasValueConstraintComponent")
    lazy val hasValueConstraintComponent_hasValue = baseUri.concat("HasValueConstraintComponent-hasValue")
    lazy val inConstraintComponent = baseUri.concat("InConstraintComponent")
    lazy val inConstraintComponent_in = baseUri.concat("InConstraintComponent-in")
    lazy val languageInConstraintComponent = baseUri.concat("LanguageInConstraintComponent")
    lazy val languageInConstraintComponent_languageIn = baseUri.concat("LanguageInConstraintComponent-languageIn")
    lazy val lessThanConstraintComponent = baseUri.concat("LessThanConstraintComponent")
    lazy val lessThanConstraintComponent_lessThan = baseUri.concat("LessThanConstraintComponent-lessThan")
    lazy val lessThanOrEqualsConstraintComponent = baseUri.concat("LessThanOrEqualsConstraintComponent")
    lazy val lessThanOrEqualsConstraintComponent_lessThanOrEquals = baseUri.concat("LessThanOrEqualsConstraintComponent-lessThanOrEquals")
    lazy val maxCountConstraintComponent = baseUri.concat("MaxCountConstraintComponent")
    lazy val maxCountConstraintComponent_maxCount = baseUri.concat("MaxCountConstraintComponent-maxCount")
    lazy val maxExclusiveConstraintComponent = baseUri.concat("MaxExclusiveConstraintComponent")
    lazy val maxExclusiveConstraintComponent_maxExclusive = baseUri.concat("MaxExclusiveConstraintComponent-maxExclusive")
    lazy val maxInclusiveConstraintComponent_maxInclusive = baseUri.concat("MaxInclusiveConstraintComponent-maxInclusive")
    lazy val maxLengthConstraintComponent = baseUri.concat("MaxLengthConstraintComponent")
    lazy val maxLengthConstraintComponent_maxLength = baseUri.concat("MaxLengthConstraintComponent-maxLength")
    lazy val minCountConstraintComponent = baseUri.concat("MinCountConstraintComponent")
    lazy val minCountConstraintComponent_minCount = baseUri.concat("MinCountConstraintComponent-minCount")
    lazy val minExclusiveConstraintComponent = baseUri.concat("MinExclusiveConstraintComponent")
    lazy val minExclusiveConstraintComponent_minExclusive = baseUri.concat("MinExclusiveConstraintComponent-minExclusive")
    lazy val minInclusiveConstraintComponent = baseUri.concat("MinInclusiveConstraintComponent")
    lazy val minInclusiveConstraintComponent_minInclusive = baseUri.concat("MinInclusiveConstraintComponent-minInclusive")
    lazy val minLengthConstraintComponent = baseUri.concat("MinLengthConstraintComponent")
    lazy val minLengthConstraintComponent_minLength = baseUri.concat("MinLengthConstraintComponent-minLength")
    lazy val nodeConstraintComponent = baseUri.concat("NodeConstraintComponent")
    lazy val nodeConstraintComponent_node = baseUri.concat("NodeConstraintComponent-node")
    lazy val nodeKindConstraintComponent = baseUri.concat("NodeKindConstraintComponent")
    lazy val nodeKindConstraintComponent_nodeKind = baseUri.concat("NodeKindConstraintComponent-nodeKind")
    lazy val notConstraintComponent = baseUri.concat("NotConstraintComponent")
    lazy val notConstraintComponent_not = baseUri.concat("NotConstraintComponent-not")
    lazy val orConstraintComponent = baseUri.concat("OrConstraintComponent")
    lazy val orConstraintComponent_or = baseUri.concat("OrConstraintComponent-or")
    lazy val patternConstraintComponent = baseUri.concat("PatternConstraintComponent")
    lazy val patternConstraintComponent_flags = baseUri.concat("PatternConstraintComponent-flags")
    lazy val patternConstraintComponent_pattern = baseUri.concat("PatternConstraintComponent-pattern")
    lazy val propertyConstraintComponent = baseUri.concat("PropertyConstraintComponent")
    lazy val propertyConstraintComponent_property = baseUri.concat("PropertyConstraintComponent-property")
    lazy val qualifiedMaxCountConstraintComponent = baseUri.concat("QualifiedMaxCountConstraintComponent")
    lazy val qualifiedMaxCountConstraintComponent_qualifiedMaxCount = baseUri.concat("QualifiedMaxCountConstraintComponent-qualifiedMaxCount")
    lazy val qualifiedMaxCountConstraintComponent_qualifiedValueShape = baseUri.concat("QualifiedMaxCountConstraintComponent-qualifiedValueShape")
    lazy val qualifiedMaxCountConstraintComponent_qualifiedValueShapesDisjoint = baseUri.concat("QualifiedMaxCountConstraintComponent-qualifiedValueShapesDisjoint")
    lazy val qualifiedMinCountConstraintComponent = baseUri.concat("QualifiedMinCountConstraintComponent")
    lazy val qualifiedMinCountConstraintComponent_qualifiedMinCount = baseUri.concat("QualifiedMinCountConstraintComponent-qualifiedMinCount")
    lazy val qualifiedMinCountConstraintComponent_qualifiedValueShape = baseUri.concat("QualifiedMinCountConstraintComponent-qualifiedValueShape")
    lazy val qualifiedMinCountConstraintComponent_qualifiedValueShapesDisjoint = baseUri.concat("QualifiedMinCountConstraintComponent-qualifiedValueShapesDisjoint")
    lazy val uniqueLangConstraintComponent = baseUri.concat("UniqueLangConstraintComponent")
    lazy val uniqueLangConstraintComponent_uniqueLang = baseUri.concat("UniqueLangConstraintComponent-uniqueLang")
    lazy val xoneConstraintComponent = baseUri.concat("XoneConstraintComponent")
    lazy val xoneConstraintComponent_xone = baseUri.concat("XoneConstraintComponent-xone")
    //// Properties
    lazy val `class` = baseUri.concat("class")
    lazy val and = baseUri.concat("and")
    lazy val closed = baseUri.concat("closed")
    lazy val datatype = baseUri.concat("datatype")
    lazy val disjoint = baseUri.concat("disjoint")
    lazy val equals = baseUri.concat("equals")
    lazy val flags = baseUri.concat("flags")
    lazy val hasValue = baseUri.concat("hasValue")
    lazy val ignoredProperties = baseUri.concat("ignoredProperties")
    lazy val in = baseUri.concat("in")
    lazy val languageIn = baseUri.concat("languageIn")
    lazy val lessThan = baseUri.concat("lessThan")
    lazy val lessThanOrEquals = baseUri.concat("lessThanOrEquals")
    lazy val maxCount = baseUri.concat("maxCount")
    lazy val maxExclusive = baseUri.concat("maxExclusive")
    lazy val maxInclusive = baseUri.concat("maxInclusive")
    lazy val maxInclusiveConstraintComponent = baseUri.concat("maxInclusiveConstraintComponent")
    lazy val maxLength = baseUri.concat("maxLength")
    lazy val minCount = baseUri.concat("minCount")
    lazy val minExclusive = baseUri.concat("minExclusive")
    lazy val minInclusive = baseUri.concat("minInclusive")
    lazy val minLength = baseUri.concat("minLength")
    lazy val node = baseUri.concat("node")
    lazy val nodeKind = baseUri.concat("nodeKind")
    lazy val not = baseUri.concat("not")
    lazy val or = baseUri.concat("or")
    lazy val pattern = baseUri.concat("pattern")
    lazy val property = baseUri.concat("property")
    lazy val qualifiedMaxCount = baseUri.concat("qualifiedMaxCount")
    lazy val qualifiedMinCount = baseUri.concat("qualifiedMinCount")
    lazy val qualifiedValueShape = baseUri.concat("qualifiedValueShape")
    lazy val qualifiedValueShapesDisjoint = baseUri.concat("qualifiedValueShapesDisjoint")
    lazy val uniqueLang = baseUri.concat("uniqueLang")
    lazy val xone = baseUri.concat("xone")
    // General SPARQL execution support
    //// Classes
    lazy val prefixDeclaration = baseUri.concat("PrefixDeclaration")
    lazy val sparqlAskExecutable = baseUri.concat("SPARQLAskExecutable")
    lazy val sparqlConstructExecutable = baseUri.concat("SPARQLConstructExecutable")
    lazy val sparqlExecutable = baseUri.concat("SPARQLExecutable")
    lazy val sparqlSelectExecutable = baseUri.concat("SPARQLSelectExecutable")
    lazy val sparqlUpdateExecutable = baseUri.concat("SPARQLUpdateExecutable")
    //// Properties
    lazy val ask = baseUri.concat("ask")
    lazy val construct = baseUri.concat("construct")
    lazy val declare = baseUri.concat("declare")
    lazy val namespace = baseUri.concat("namespace")
    lazy val prefix = baseUri.concat("prefix")
    lazy val prefixes = baseUri.concat("prefixes")
    lazy val select = baseUri.concat("select")
    lazy val update = baseUri.concat("update")
    // SPARQL-based Constraints support
    //// Classes
    lazy val sparqlConstraint = baseUri.concat("SPARQLConstraint")
    lazy val sparqlConstraintComponent = baseUri.concat("SPARQLConstraintComponent")
    lazy val sparqlConstraintComponent_sparql = baseUri.concat("SPARQLConstraintComponent-sparql")
    //// Properties
    lazy val sparql = baseUri.concat("sparql")
    // Non-validating constraint properties
    //// Classes
    lazy val propertyGroup = baseUri.concat("PropertyGroup")
    //// Properties
    lazy val defaultValue = baseUri.concat("defaultValue")
    lazy val description = baseUri.concat("description")
    lazy val group = baseUri.concat("group")
    lazy val name = baseUri.concat("name")
    lazy val order = baseUri.concat("order")
    // SHACL ADVANCED FEATURES
    // Advanced Target vocabulary
    //// Classes
    lazy val sparqlTarget = baseUri.concat("SPARQLTarget")
    lazy val sparqlTargetType = baseUri.concat("SPARQLTargetType")
    lazy val targetClass = baseUri.concat("Target")
    lazy val targetType = baseUri.concat("TargetType")
    //// Properties
    lazy val target = baseUri.concat("target")
    // Functions Vocabulary
    //// Classes
    lazy val function = baseUri.concat("Function")
    lazy val sparqlFunction = baseUri.concat("SPARQLFunction")
    //// Properties
    lazy val returnType = baseUri.concat("returnType")
    // Result Annotations
    //// Classes
    lazy val resultAnnotation = baseUri.concat("ResultAnnotation")
    //// Properties
    lazy val annotationProperty = baseUri.concat("annotationProperty")
    lazy val annotationValue = baseUri.concat("annotationValue")
    lazy val annotationVarName = baseUri.concat("annotationVarName")
    lazy val resultAnnotation = baseUri.concat("resultAnnotation")
    // Node Expressions
    //// Properties
    lazy val this = baseUri.concat("this")
    lazy val filterShape = baseUri.concat("filterShape")
    lazy val nodes = baseUri.concat("nodes")
    lazy val intersection = baseUri.concat("intersection")
    lazy val union = baseUri.concat("union")
    // Expression Constraints
    //// Classes
    lazy val expressionConstraintComponent = baseUri.concat("ExpressionConstraintComponent")
    lazy val expressionConstraintComponent_expression = baseUri.concat("ExpressionConstraintComponent-expression")
    //// Properties
    lazy val expression = baseUri.concat("expression")
    // Rules
    //// Classes
    lazy val rule = baseUri.concat("Rule")
    lazy val sparqlRule = baseUri.concat("SPARQLRule")
    lazy val tripleRule = baseUri.concat("TripleRule")
    //// Properties
    lazy val condition = baseUri.concat("condition")
    lazy val `object` = baseUri.concat("object")
    lazy val predicate = baseUri.concat("predicate")
    lazy val rule = baseUri.concat("rule")
    lazy val subject = baseUri.concat("subject")
    // SHACL-JS
    //// Classes
    lazy val jsConstraint = baseUri.concat("JSConstraint")
    lazy val jsConstraint_js = baseUri.concat("JSConstraint-js")
    lazy val jsConstraintComponent = baseUri.concat("JSConstraintComponent")
    lazy val jsExecutable = baseUri.concat("JSExecutable")
    lazy val jsFunction = baseUri.concat("JSFunction")
    lazy val jsLibrary = baseUri.concat("JSLibrary")
    lazy val jsRule = baseUri.concat("JSRule")
    lazy val jsTarget = baseUri.concat("JSTarget")
    lazy val jsTargetType = baseUri.concat("JSTargetType")
    lazy val jsValidator = baseUri.concat("JSValidator")
    //// Properties
    lazy val js = baseUri.concat("js")
    lazy val jsFunctionName = baseUri.concat("jsFunctionName")
    lazy val jsLibrary = baseUri.concat("jsLibrary")
    lazy val jsLibraryURL = baseUri.concat("jsLibraryURL")
}
