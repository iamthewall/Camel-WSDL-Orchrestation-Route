package com.deceval.comunes.modelos.xsd.encabezados;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>Java class for EncabezadoSalidaType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 *
 * <pre>
 * &lt;complexType name="EncabezadoSalidaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *           &lt;element name="Hora" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="Canal" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *           &lt;element name="IdentificadorPeticion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncabezadoSalidaType", propOrder = {
    "fecha",
    "hora",
    "canal",
    "identificadorPeticion"
})
public class EncabezadoSalidaType {

    @XmlElement(name = "Fecha", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    @XmlElement(name = "Hora", required = true, nillable = true)
    protected String hora;
    @XmlElement(name = "Canal", required = true, type = Short.class, nillable = true)
    protected Short canal;
    @XmlElement(name = "IdentificadorPeticion", required = true, nillable = true)
    protected String identificadorPeticion;

    /**
     * Gets the value of the fecha property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Sets the value of the fecha property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }

    /**
     * Gets the value of the hora property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getHora() {
        return hora;
    }

    /**
     * Sets the value of the hora property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setHora(String value) {
        this.hora = value;
    }

    /**
     * Gets the value of the canal property.
     *
     * @return possible object is {@link Short }
     *
     */
    public Short getCanal() {
        return canal;
    }

    /**
     * Sets the value of the canal property.
     *
     * @param value allowed object is {@link Short }
     *
     */
    public void setCanal(Short value) {
        this.canal = value;
    }

    /**
     * Gets the value of the identificadorPeticion property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getIdentificadorPeticion() {
        return identificadorPeticion;
    }

    /**
     * Sets the value of the identificadorPeticion property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setIdentificadorPeticion(String value) {
        this.identificadorPeticion = value;
    }
}
