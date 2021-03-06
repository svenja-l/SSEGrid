//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.03 at 04:52:12 PM CEST 
//


package com.terradue.ogf.schema.jsdl.impl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreationFlagEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreationFlagEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="overwrite"/>
 *     &lt;enumeration value="append"/>
 *     &lt;enumeration value="dontOverwrite"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreationFlagEnumeration")
@XmlEnum
public enum CreationFlagEnumeration {

    @XmlEnumValue("overwrite")
    OVERWRITE("overwrite"),
    @XmlEnumValue("append")
    APPEND("append"),
    @XmlEnumValue("dontOverwrite")
    DONT_OVERWRITE("dontOverwrite");
    private final String value;

    CreationFlagEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CreationFlagEnumeration fromValue(String v) {
        for (CreationFlagEnumeration c: CreationFlagEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
