package co.com.deceval.sdl.services.dto;

import co.com.deceval.sdl.services.ConsultaPagareServiceDTO;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for SolicitudConsultarPagareDTO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 *
 * <pre>
 * &lt;complexType name="SolicitudConsultarPagareDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Header" type="{java:com.deceval.sdl.services.dto.common}HeaderDTO"/>
 *         &lt;element name="ConsultaPagareServiceDTO" type="{java:com.deceval.sdl.services.dto}ConsultaPagareServiceDTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SolicitudConsultarPagareDTO", namespace = "java:com.deceval.sdl.services.dto.request", propOrder = {
    "header",
    "consultaPagareServiceDTO"
})
public class SolicitudConsultarPagareDTO {

    @XmlElement(name = "Header", required = true, nillable = true)
    protected HeaderDTO header;
    @XmlElement(name = "ConsultaPagareServiceDTO", required = true, nillable = true)
    protected ConsultaPagareServiceDTO consultaPagareServiceDTO;

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
     * Gets the value of the consultaPagareServiceDTO property.
     *
     * @return possible object is {@link ConsultaPagareServiceDTO }
     *
     */
    public ConsultaPagareServiceDTO getConsultaPagareServiceDTO() {
        return consultaPagareServiceDTO;
    }

    /**
     * Sets the value of the consultaPagareServiceDTO property.
     *
     * @param value allowed object is {@link ConsultaPagareServiceDTO }
     *
     */
    public void setConsultaPagareServiceDTO(ConsultaPagareServiceDTO value) {
        this.consultaPagareServiceDTO = value;
    }
}
