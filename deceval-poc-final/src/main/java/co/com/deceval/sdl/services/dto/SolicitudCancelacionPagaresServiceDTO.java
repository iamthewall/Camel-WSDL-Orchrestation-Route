package co.com.deceval.sdl.services.dto;

import co.com.deceval.sdl.services.CancelacionPagaresServiceDTO;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for SolicitudCancelacionPagaresServiceDTO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 *
 * <pre>
 * &lt;complexType name="SolicitudCancelacionPagaresServiceDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Header" type="{java:com.deceval.sdl.services.dto.common}HeaderDTO"/>
 *         &lt;element name="CancelacionPagaresDTO" type="{java:com.deceval.sdl.services.dto}CancelacionPagaresServiceDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SolicitudCancelacionPagaresServiceDTO", namespace = "java:com.deceval.sdl.services.dto.request", propOrder = {
    "header",
    "cancelacionPagaresDTO"
})
public class SolicitudCancelacionPagaresServiceDTO {

    @XmlElement(name = "Header", required = true, nillable = true)
    protected HeaderDTO header;
    @XmlElement(name = "CancelacionPagaresDTO", nillable = true)
    protected List<CancelacionPagaresServiceDTO> cancelacionPagaresDTO;

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
     * Gets the value of the cancelacionPagaresDTO property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the cancelacionPagaresDTO property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCancelacionPagaresDTO().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CancelacionPagaresServiceDTO }
     *
     *
     */
    public List<CancelacionPagaresServiceDTO> getCancelacionPagaresDTO() {
        if (cancelacionPagaresDTO == null) {
            cancelacionPagaresDTO = new ArrayList<CancelacionPagaresServiceDTO>();
        }
        return this.cancelacionPagaresDTO;
    }
}
