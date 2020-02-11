package com.cognithive.rdf.namespace

object XSD extends Namespace(baseURI = "http://www.w3.org/2001/XMLSchema#", prefixLabel = "xsd") {
    // Datatypes
    //// Core types
    lazy val boolean: String = baseURI.concat("boolean")
    lazy val decimal: String = baseURI.concat("decimal")
    lazy val integer: String = baseURI.concat("integer")
    lazy val string: String = baseURI.concat("string")
    //// IEEE floating-point numbers
    lazy val double: String = baseURI.concat("double")
    lazy val float: String = baseURI.concat("float")
    //// Time and date
    lazy val date: String = baseURI.concat("date")
    lazy val dateTime: String = baseURI.concat("dateTime")
    lazy val dateTimeStamp: String = baseURI.concat("dateTimeStamp")
    lazy val time: String = baseURI.concat("time")
    //// Recurring and partial dates
    lazy val dayTimeDuration: String = baseURI.concat("dayTimeDuration")
    lazy val duration: String = baseURI.concat("duration")
    lazy val gDay: String = baseURI.concat("gDay")
    lazy val gMonth: String = baseURI.concat("gMonth")
    lazy val gMonthDay: String = baseURI.concat("gMonthDay")
    lazy val gYear: String = baseURI.concat("gYear")
    lazy val gYearMonth: String = baseURI.concat("gYearMonth")
    lazy val yearMonthDuration: String = baseURI.concat("yearMonthDuration")
    //// Limited-range integer numbers
    lazy val byte: String = baseURI.concat("byte")
    lazy val int: String = baseURI.concat("int")
    lazy val long: String = baseURI.concat("long")
    lazy val negativeInteger: String = baseURI.concat("negativeInteger")
    lazy val nonNegativeInteger: String = baseURI.concat("nonNegativeInteger")
    lazy val nonPositiveInteger: String = baseURI.concat("nonPositiveInteger")
    lazy val positiveInteger: String = baseURI.concat("positiveInteger")
    lazy val short: String = baseURI.concat("short")
    lazy val unsignedByte: String = baseURI.concat("unsignedByte")
    lazy val unsignedInt: String = baseURI.concat("unsignedInt")
    lazy val unsignedLong: String = baseURI.concat("unsignedLong")
    lazy val unsignedShort: String = baseURI.concat("unsignedShort")
    //// Encoded binary data
    lazy val base64Binary: String = baseURI.concat("base64Binary")
    lazy val hexBinary: String = baseURI.concat("hexBinary")
    //// Miscellaneous XSD types
    lazy val anyURI: String = baseURI.concat("anyURI")
    lazy val language: String = baseURI.concat("language")
    lazy val Name: String = baseURI.concat("Name")
    lazy val NCName: String = baseURI.concat("NCName")
    lazy val NMtoken: String = baseURI.concat("NMTOKEN")
    lazy val normalizedString: String = baseURI.concat("normalizedString")
    lazy val token: String = baseURI.concat("token")
}
