//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0-b52-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 05:26:33 PM CEST 
//


package com.terradue.ogf.schema.glue.impl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for ComputingActivityType_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ComputingActivityType_t">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="single"/>
 *     &lt;enumeration value="collectionelement"/>
 *     &lt;enumeration value="parallelelement"/>
 *     &lt;enumeration value="workflownode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum ComputingActivityTypeT {

    @XmlEnumValue("collectionelement")
    COLLECTIONELEMENT("collectionelement"),
    @XmlEnumValue("parallelelement")
    PARALLELELEMENT("parallelelement"),
    @XmlEnumValue("single")
    SINGLE("single"),
    @XmlEnumValue("workflownode")
    WORKFLOWNODE("workflownode");
    private final String value;

    ComputingActivityTypeT(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ComputingActivityTypeT fromValue(String v) {
        for (ComputingActivityTypeT c: ComputingActivityTypeT.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
