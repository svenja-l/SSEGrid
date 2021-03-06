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
 * <p>Java class for CPUMultiplicity_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CPUMultiplicity_t">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="singlecpu-singlecore"/>
 *     &lt;enumeration value="singlecpu-multicore"/>
 *     &lt;enumeration value="multicpu-singlecore"/>
 *     &lt;enumeration value="multicpu-multicore"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum CPUMultiplicityT {

    @XmlEnumValue("multicpu-multicore")
    MULTICPU_MULTICORE("multicpu-multicore"),
    @XmlEnumValue("multicpu-singlecore")
    MULTICPU_SINGLECORE("multicpu-singlecore"),
    @XmlEnumValue("singlecpu-multicore")
    SINGLECPU_MULTICORE("singlecpu-multicore"),
    @XmlEnumValue("singlecpu-singlecore")
    SINGLECPU_SINGLECORE("singlecpu-singlecore");
    private final String value;

    CPUMultiplicityT(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CPUMultiplicityT fromValue(String v) {
        for (CPUMultiplicityT c: CPUMultiplicityT.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
