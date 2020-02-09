package com.cognithive.rdf.namespace

object DCMIType extends Namespace("http://purl.org/dc/dcmitype/", "dcmitype") {
    // Classes
    lazy val collection = baseUri.concat("Collection")
    lazy val dataset = baseUri.concat("Dataset")
    lazy val event = baseUri.concat("Event")
    lazy val image = baseUri.concat("Image")
    lazy val interactiveResource = baseUri.concat("InteractiveResource")
    lazy val movingImage = baseUri.concat("MovingImage")
    lazy val physicalObject = baseUri.concat("PhysicalObject")
    lazy val service = baseUri.concat("Service")
    lazy val software = baseUri.concat("Software")
    lazy val sound = baseUri.concat("Sound")
    lazy val stillImage = baseUri.concat("StillImage")
    lazy val text = baseUri.concat("Text")
}
