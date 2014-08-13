package com.deceval.comunes.modelos.xsd.errores;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for TipoValidacionType.
 *
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoValidacionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Estructura"/>
 *     &lt;enumeration value="Negocio"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "TipoValidacionType")
@XmlEnum
public enum TipoValidacionType {

    @XmlEnumValue("Estructura")
    ESTRUCTURA("Estructura"),
    @XmlEnumValue("Negocio")
    NEGOCIO("Negocio");
    private final String value;

    TipoValidacionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TipoValidacionType fromValue(String v) {
        for (TipoValidacionType c : TipoValidacionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
}
