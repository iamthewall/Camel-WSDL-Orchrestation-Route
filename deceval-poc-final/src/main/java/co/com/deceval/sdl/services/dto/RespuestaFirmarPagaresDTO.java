package co.com.deceval.sdl.services.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for RespuestaFirmarPagaresDTO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 *
 * <pre>
 * &lt;complexType name="RespuestaFirmarPagaresDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespuestaFirmarPagaresDTO", propOrder = {
    "descripcion"
})
public class RespuestaFirmarPagaresDTO {

    @XmlElement(name = "Descripcion", required = true, nillable = true)
    protected String descripcion;

    /**
     * Gets the value of the descripcion property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Sets the value of the descripcion property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }
}
