package co.com.deceval.sdl.services.dto;

import co.com.deceval.sdl.services.DocumentoPagareDaneServiceDTO;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for SolicitudCrearPagareDaneServiceDTO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 *
 * <pre>
 * &lt;complexType name="SolicitudCrearPagareDaneServiceDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Header" type="{java:com.deceval.sdl.services.dto.common}HeaderDTO"/>
 *         &lt;element name="DocumentoPagareServiceDTO" type="{java:com.deceval.sdl.services.dto}DocumentoPagareDaneServiceDTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SolicitudCrearPagareDaneServiceDTO", namespace = "java:com.deceval.sdl.services.dto.request", propOrder = {
    "header",
    "documentoPagareServiceDTO"
})
public class SolicitudCrearPagareDaneServiceDTO {

    @XmlElement(name = "Header", required = true, nillable = true)
    protected HeaderDTO header;
    @XmlElement(name = "DocumentoPagareServiceDTO", required = true, nillable = true)
    protected DocumentoPagareDaneServiceDTO documentoPagareServiceDTO;

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
     * Gets the value of the documentoPagareServiceDTO property.
     *
     * @return possible object is {@link DocumentoPagareDaneServiceDTO }
     *
     */
    public DocumentoPagareDaneServiceDTO getDocumentoPagareServiceDTO() {
        return documentoPagareServiceDTO;
    }

    /**
     * Sets the value of the documentoPagareServiceDTO property.
     *
     * @param value allowed object is {@link DocumentoPagareDaneServiceDTO }
     *
     */
    public void setDocumentoPagareServiceDTO(DocumentoPagareDaneServiceDTO value) {
        this.documentoPagareServiceDTO = value;
    }
}
