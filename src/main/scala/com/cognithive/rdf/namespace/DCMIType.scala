package com.cognithive.rdf.namespace

object DCMIType extends Namespace(baseURI = "http://purl.org/dc/dcmitype/", prefixLabel = "dcmitype") {
    // Classes
    lazy val Collection: String = baseURI.concat("Collection")
    lazy val Dataset: String = baseURI.concat("Dataset")
    lazy val Event: String = baseURI.concat("Event")
    lazy val Image: String = baseURI.concat("Image")
    lazy val InteractiveResource: String = baseURI.concat("InteractiveResource")
    lazy val MovingImage: String = baseURI.concat("MovingImage")
    lazy val PhysicalObject: String = baseURI.concat("PhysicalObject")
    lazy val Service: String = baseURI.concat("Service")
    lazy val Software: String = baseURI.concat("Software")
    lazy val Sound: String = baseURI.concat("Sound")
    lazy val StillImage: String = baseURI.concat("StillImage")
    lazy val Text: String = baseURI.concat("Text")
}
