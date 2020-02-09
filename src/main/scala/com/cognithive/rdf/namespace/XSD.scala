package com.cognithive.rdf.namespace

object XSD extends Namespace("http://www.w3.org/2001/XMLSchema#", "xsd") {
    // Datatypes
    //// Core types
    lazy val boolean = baseUri.concat("boolean")
    lazy val decimal = baseUri.concat("decimal")
    lazy val integer = baseUri.concat("integer")
    lazy val string = baseUri.concat("string")
    //// IEEE floating-point numbers
    lazy val double = baseUri.concat("double")
    lazy val float = baseUri.concat("float")
    //// Time and date
    lazy val date = baseUri.concat("date")
    lazy val dateTime = baseUri.concat("dateTime")
    lazy val dateTimeStamp = baseUri.concat("dateTimeStamp")
    lazy val time = baseUri.concat("time")
    //// Recurring and partial dates
    lazy val dayTimeDuration = baseUri.concat("dayTimeDuration")
    lazy val duration = baseUri.concat("duration")
    lazy val gDay = baseUri.concat("gDay")
    lazy val gMonth = baseUri.concat("gMonth")
    lazy val gMonthDay = baseUri.concat("gMonthDay")
    lazy val gYear = baseUri.concat("gYear")
    lazy val gYearMonth = baseUri.concat("gYearMonth")
    lazy val yearMonthDuration = baseUri.concat("yearMonthDuration")
    //// Limited-range integer numbers
    lazy val byte = baseUri.concat("byte")
    lazy val int = baseUri.concat("int")
    lazy val long = baseUri.concat("long")
    lazy val negativeInteger = baseUri.concat("negativeInteger")
    lazy val nonNegativeInteger = baseUri.concat("nonNegativeInteger")
    lazy val nonPositiveInteger = baseUri.concat("nonPositiveInteger")
    lazy val positiveInteger = baseUri.concat("positiveInteger")
    lazy val short = baseUri.concat("short")
    lazy val unsignedByte = baseUri.concat("unsignedByte")
    lazy val unsignedInt = baseUri.concat("unsignedInt")
    lazy val unsignedLong = baseUri.concat("unsignedLong")
    lazy val unsignedShort = baseUri.concat("unsignedShort")
    //// Encoded binary data
    lazy val base64Binary = baseUri.concat("base64Binary")
    lazy val hexBinary = baseUri.concat("hexBinary")
    //// Miscellaneous XSD types
    lazy val anyURI = baseUri.concat("anyURI")
    lazy val language = baseUri.concat("language")
    lazy val name = baseUri.concat("Name")
    lazy val ncName = baseUri.concat("NCName")
    lazy val nmtoken = baseUri.concat("NMTOKEN")
    lazy val normalizedString = baseUri.concat("normalizedString")
    lazy val token = baseUri.concat("token")
}
