package co.com.deceval.sdl.services.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * Objeto que representa el encabezado de los servicios web
 *
 * <p>Java class for HeaderDTO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 *
 * <pre>
 * &lt;complexType name="HeaderDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Hora" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Usuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CodigoDepositante" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeaderDTO", namespace = "java:com.deceval.sdl.services.dto.common", propOrder = {
    "fecha",
    "hora",
    "usuario",
    "codigoDepositante"
})
public class HeaderDTO {

    @XmlElement(name = "Fecha", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    @XmlElement(name = "Hora", required = true, nillable = true)
    protected String hora;
    @XmlElement(name = "Usuario", required = true, nillable = true)
    protected String usuario;
    @XmlElement(name = "CodigoDepositante", required = true, type = Integer.class, nillable = true)
    protected Integer codigoDepositante;

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
     * Gets the value of the usuario property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Sets the value of the usuario property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Gets the value of the codigoDepositante property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getCodigoDepositante() {
        return codigoDepositante;
    }

    /**
     * Sets the value of the codigoDepositante property.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setCodigoDepositante(Integer value) {
        this.codigoDepositante = value;
    }
}
