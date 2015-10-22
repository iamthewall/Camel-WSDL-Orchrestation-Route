package co.com.deceval.sdl.services.dto;

import co.com.deceval.sdl.services.CrearGiradorDaneServiceDTO;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for SolicitudCrearGiradorDaneServiceDTO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 *
 * <pre>
 * &lt;complexType name="SolicitudCrearGiradorDaneServiceDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Header" type="{java:com.deceval.sdl.services.dto.common}HeaderDTO"/>
 *         &lt;element name="CrearGiradorDTO" type="{java:com.deceval.sdl.services.dto}CrearGiradorDaneServiceDTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SolicitudCrearGiradorDaneServiceDTO", namespace = "java:com.deceval.sdl.services.dto.request", propOrder = {
    "header",
    "crearGiradorDTO"
})
public class SolicitudCrearGiradorDaneServiceDTO {

    @XmlElement(name = "Header", required = true, nillable = true)
    protected HeaderDTO header;
    @XmlElement(name = "CrearGiradorDTO", required = true, nillable = true)
    protected CrearGiradorDaneServiceDTO crearGiradorDTO;

    /**
     * Gets the value of the header property.
     *
     * @return possible object is {@link HeaderDTO }
     *
     */
    public HeaderDTO getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     *
     * @param value allowed object is {@link HeaderDTO }
     *
     */
    public void setHeader(HeaderDTO value) {
        this.header = value;
    }

    /**
     * Gets the value of the crearGiradorDTO property.
     *
     * @return possible object is {@link CrearGiradorDaneServiceDTO }
     *
     */
    public CrearGiradorDaneServiceDTO getCrearGiradorDTO() {
        return crearGiradorDTO;
    }

    /**
     * Sets the value of the crearGiradorDTO property.
     *
     * @param value allowed object is {@link CrearGiradorDaneServiceDTO }
     *
     */
    public void setCrearGiradorDTO(CrearGiradorDaneServiceDTO value) {
        this.crearGiradorDTO = value;
    }
}
