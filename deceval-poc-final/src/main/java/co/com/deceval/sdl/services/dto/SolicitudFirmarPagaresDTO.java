package co.com.deceval.sdl.services.dto;

import co.com.deceval.sdl.services.InformacionFirmaPagareDTO;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for SolicitudFirmarPagaresDTO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 *
 * <pre>
 * &lt;complexType name="SolicitudFirmarPagaresDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Header" type="{java:com.deceval.sdl.services.dto.common}HeaderDTO"/>
 *         &lt;element name="InformacionFirmaPagareDTO" type="{java:com.deceval.sdl.services.dto}InformacionFirmaPagareDTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SolicitudFirmarPagaresDTO", namespace = "java:com.deceval.sdl.services.dto.request", propOrder = {
    "header",
    "informacionFirmaPagareDTO"
})
public class SolicitudFirmarPagaresDTO {

    @XmlElement(name = "Header", required = true, nillable = true)
    protected HeaderDTO header;
    @XmlElement(name = "InformacionFirmaPagareDTO", required = true, nillable = true)
    protected InformacionFirmaPagareDTO informacionFirmaPagareDTO;

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
     * Gets the value of the informacionFirmaPagareDTO property.
     *
     * @return possible object is {@link InformacionFirmaPagareDTO }
     *
     */
    public InformacionFirmaPagareDTO getInformacionFirmaPagareDTO() {
        return informacionFirmaPagareDTO;
    }

    /**
     * Sets the value of the informacionFirmaPagareDTO property.
     *
     * @param value allowed object is {@link InformacionFirmaPagareDTO }
     *
     */
    public void setInformacionFirmaPagareDTO(InformacionFirmaPagareDTO value) {
        this.informacionFirmaPagareDTO = value;
    }
}
