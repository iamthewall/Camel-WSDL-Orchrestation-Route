package co.com.deceval.sdl.services.dto;

import co.com.deceval.sdl.services.PagaresFirmadosDTO;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for SolicitudPagaresFirmadosDTO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 *
 * <pre>
 * &lt;complexType name="SolicitudPagaresFirmadosDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Header" type="{java:com.deceval.sdl.services.dto.common}HeaderDTO"/>
 *         &lt;element name="PagaresFirmadosDTO" type="{java:com.deceval.sdl.services.dto}PagaresFirmadosDTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SolicitudPagaresFirmadosDTO", namespace = "java:com.deceval.sdl.services.dto.request", propOrder = {
    "header",
    "pagaresFirmadosDTO"
})
public class SolicitudPagaresFirmadosDTO {

    @XmlElement(name = "Header", required = true, nillable = true)
    protected HeaderDTO header;
    @XmlElement(name = "PagaresFirmadosDTO", required = true, nillable = true)
    protected PagaresFirmadosDTO pagaresFirmadosDTO;

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
     * Gets the value of the pagaresFirmadosDTO property.
     *
     * @return possible object is {@link PagaresFirmadosDTO }
     *
     */
    public PagaresFirmadosDTO getPagaresFirmadosDTO() {
        return pagaresFirmadosDTO;
    }

    /**
     * Sets the value of the pagaresFirmadosDTO property.
     *
     * @param value allowed object is {@link PagaresFirmadosDTO }
     *
     */
    public void setPagaresFirmadosDTO(PagaresFirmadosDTO value) {
        this.pagaresFirmadosDTO = value;
    }
}
