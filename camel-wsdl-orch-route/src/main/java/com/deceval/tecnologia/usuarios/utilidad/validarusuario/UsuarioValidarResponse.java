
package com.deceval.tecnologia.usuarios.utilidad.validarusuario;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UsuarioValidarResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UsuarioValidarResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EsValido" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsuarioValidarResponse", propOrder = {
    "esValido"
})
public class UsuarioValidarResponse {

    @XmlElement(name = "EsValido")
    protected boolean esValido;

    /**
     * Gets the value of the esValido property.
     * 
     */
    public boolean isEsValido() {
        return esValido;
    }

    /**
     * Sets the value of the esValido property.
     * 
     */
    public void setEsValido(boolean value) {
        this.esValido = value;
    }

}
