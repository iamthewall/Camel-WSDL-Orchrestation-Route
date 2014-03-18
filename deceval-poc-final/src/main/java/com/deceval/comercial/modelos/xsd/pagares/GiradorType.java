
package com.deceval.comercial.modelos.xsd.pagares;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GiradorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GiradorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Identificacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Cuenta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Rol" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PersonaRepresentada" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GiradorType", propOrder = {
    "tipo",
    "identificacion",
    "cuenta",
    "rol",
    "personaRepresentada"
})
public class GiradorType {

    @XmlElement(name = "Tipo", required = true, type = Integer.class, nillable = true)
    protected Integer tipo;
    @XmlElement(name = "Identificacion", required = true, nillable = true)
    protected String identificacion;
    @XmlElement(name = "Cuenta", required = true, type = Integer.class, nillable = true)
    protected Integer cuenta;
    @XmlElement(name = "Rol", required = true, type = Integer.class, nillable = true)
    protected Integer rol;
    @XmlElement(name = "PersonaRepresentada", required = true, type = Long.class, nillable = true)
    protected Long personaRepresentada;

    /**
     * Gets the value of the tipo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTipo() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTipo(Integer value) {
        this.tipo = value;
    }

    /**
     * Gets the value of the identificacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * Sets the value of the identificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacion(String value) {
        this.identificacion = value;
    }

    /**
     * Gets the value of the cuenta property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCuenta() {
        return cuenta;
    }

    /**
     * Sets the value of the cuenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCuenta(Integer value) {
        this.cuenta = value;
    }

    /**
     * Gets the value of the rol property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRol() {
        return rol;
    }

    /**
     * Sets the value of the rol property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRol(Integer value) {
        this.rol = value;
    }

    /**
     * Gets the value of the personaRepresentada property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPersonaRepresentada() {
        return personaRepresentada;
    }

    /**
     * Sets the value of the personaRepresentada property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPersonaRepresentada(Long value) {
        this.personaRepresentada = value;
    }

}
