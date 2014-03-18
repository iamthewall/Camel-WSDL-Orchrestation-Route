package com.deceval.comunes.modelos.xsd.errores;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for ErrorGenericoType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 *
 * <pre>
 * &lt;complexType name="ErrorGenericoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoValidacion" type="{http://www.deceval.com/comunes/modelos/xsd/Errores}TipoValidacionType"/>
 *         &lt;element name="Codigo" type="{http://www.deceval.com/comunes/modelos/xsd/Errores}CodigoType"/>
 *         &lt;element name="Mensaje" type="{http://www.deceval.com/comunes/modelos/xsd/Errores}MensajeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorGenericoType", propOrder = {
    "tipoValidacion",
    "codigo",
    "mensaje"
})
public class ErrorGenericoType {

    @XmlElement(name = "TipoValidacion", required = true)
    protected TipoValidacionType tipoValidacion;
    @XmlElement(name = "Codigo", required = true)
    protected String codigo;
    @XmlElement(name = "Mensaje", required = true)
    protected String mensaje;

    /**
     * Gets the value of the tipoValidacion property.
     *
     * @return possible object is {@link TipoValidacionType }
     *
     */
    public TipoValidacionType getTipoValidacion() {
        return tipoValidacion;
    }

    /**
     * Sets the value of the tipoValidacion property.
     *
     * @param value allowed object is {@link TipoValidacionType }
     *
     */
    public void setTipoValidacion(TipoValidacionType value) {
        this.tipoValidacion = value;
    }

    /**
     * Gets the value of the codigo property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Gets the value of the mensaje property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Sets the value of the mensaje property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setMensaje(String value) {
        this.mensaje = value;
    }
}
