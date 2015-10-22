package co.com.deceval.sdl.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for InformacionFirmaPagareDTO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 *
 * <pre>
 * &lt;complexType name="InformacionFirmaPagareDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdDocumentoPagare" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Clave" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Motivo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IdRolFirmante" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ArchivosAdjuntos" type="{java:com.deceval.sdl.services.dto}ArchivoAdjuntoDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformacionFirmaPagareDTO", propOrder = {
    "idDocumentoPagare",
    "tipoDocumento",
    "numeroDocumento",
    "clave",
    "motivo",
    "idRolFirmante",
    "archivosAdjuntos"
})
public class InformacionFirmaPagareDTO {

    @XmlElement(name = "IdDocumentoPagare", required = true, type = Long.class, nillable = true)
    protected Long idDocumentoPagare;
    @XmlElement(name = "TipoDocumento", required = true, type = Integer.class, nillable = true)
    protected Integer tipoDocumento;
    @XmlElement(name = "NumeroDocumento", required = true, nillable = true)
    protected String numeroDocumento;
    @XmlElement(name = "Clave", required = true, nillable = true)
    protected String clave;
    @XmlElement(name = "Motivo", required = true, nillable = true)
    protected String motivo;
    @XmlElement(name = "IdRolFirmante", required = true, type = Long.class, nillable = true)
    protected Long idRolFirmante;
    @XmlElement(name = "ArchivosAdjuntos", nillable = true)
    protected List<ArchivoAdjuntoDTO> archivosAdjuntos;

    /**
     * Gets the value of the idDocumentoPagare property.
     *
     * @return possible object is {@link Long }
     *
     */
    public Long getIdDocumentoPagare() {
        return idDocumentoPagare;
    }

    /**
     * Sets the value of the idDocumentoPagare property.
     *
     * @param value allowed object is {@link Long }
     *
     */
    public void setIdDocumentoPagare(Long value) {
        this.idDocumentoPagare = value;
    }

    /**
     * Gets the value of the tipoDocumento property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Sets the value of the tipoDocumento property.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setTipoDocumento(Integer value) {
        this.tipoDocumento = value;
    }

    /**
     * Gets the value of the numeroDocumento property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * Sets the value of the numeroDocumento property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setNumeroDocumento(String value) {
        this.numeroDocumento = value;
    }

    /**
     * Gets the value of the clave property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getClave() {
        return clave;
    }

    /**
     * Sets the value of the clave property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setClave(String value) {
        this.clave = value;
    }

    /**
     * Gets the value of the motivo property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getMotivo() {
        return motivo;
    }

    /**
     * Sets the value of the motivo property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setMotivo(String value) {
        this.motivo = value;
    }

    /**
     * Gets the value of the idRolFirmante property.
     *
     * @return possible object is {@link Long }
     *
     */
    public Long getIdRolFirmante() {
        return idRolFirmante;
    }

    /**
     * Sets the value of the idRolFirmante property.
     *
     * @param value allowed object is {@link Long }
     *
     */
    public void setIdRolFirmante(Long value) {
        this.idRolFirmante = value;
    }

    /**
     * Gets the value of the archivosAdjuntos property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the archivosAdjuntos property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArchivosAdjuntos().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArchivoAdjuntoDTO }
     *
     *
     */
    public List<ArchivoAdjuntoDTO> getArchivosAdjuntos() {
        if (archivosAdjuntos == null) {
            archivosAdjuntos = new ArrayList<ArchivoAdjuntoDTO>();
        }
        return this.archivosAdjuntos;
    }
}
