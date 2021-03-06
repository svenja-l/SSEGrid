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
 * <p>Java class for License_t.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="License_t">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="opensource"/>
 *     &lt;enumeration value="commercial"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum LicenseT {

    @XmlEnumValue("commercial")
    COMMERCIAL("commercial"),
    @XmlEnumValue("opensource")
    OPENSOURCE("opensource"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    LicenseT(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LicenseT fromValue(String v) {
        for (LicenseT c: LicenseT.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
