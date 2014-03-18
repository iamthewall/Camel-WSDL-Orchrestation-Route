package co.com.deceval.sdl.services.dto;

import co.com.deceval.sdl.services.DesembolsoAnotarCuentaDTO;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for SolicitudDesembolsoAnotarCuentaDTO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 *
 * <pre>
 * &lt;complexType name="SolicitudDesembolsoAnotarCuentaDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Header" type="{java:com.deceval.sdl.services.dto.common}HeaderDTO"/>
 *         &lt;element name="DesembolsoAnotarCuentaDTO" type="{java:com.deceval.sdl.services.dto}DesembolsoAnotarCuentaDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SolicitudDesembolsoAnotarCuentaDTO", namespace = "java:com.deceval.sdl.services.dto.request", propOrder = {
    "header",
    "desembolsoAnotarCuentaDTO"
})
public class SolicitudDesembolsoAnotarCuentaDTO {

    @XmlElement(name = "Header", required = true, nillable = true)
    protected HeaderDTO header;
    @XmlElement(name = "DesembolsoAnotarCuentaDTO", nillable = true)
    protected List<DesembolsoAnotarCuentaDTO> desembolsoAnotarCuentaDTO;

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
     * Gets the value of the desembolsoAnotarCuentaDTO property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the desembolsoAnotarCuentaDTO property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesembolsoAnotarCuentaDTO().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DesembolsoAnotarCuentaDTO }
     *
     *
     */
    public List<DesembolsoAnotarCuentaDTO> getDesembolsoAnotarCuentaDTO() {
        if (desembolsoAnotarCuentaDTO == null) {
            desembolsoAnotarCuentaDTO = new ArrayList<DesembolsoAnotarCuentaDTO>();
        }
        return this.desembolsoAnotarCuentaDTO;
    }
}
