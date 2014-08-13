package co.com.deceval.sdl.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Descripcion de la Clase
 *
 * <p>Java class for DesembolsoAnotarCuentaDTO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 *
 * <pre>
 * &lt;complexType name="DesembolsoAnotarCuentaDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdDocumentoPagare" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="IdentificacionEmisor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumPagareEntidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MensajeRespuesta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DesembolsoAnotarCuentaDTO", propOrder = {
    "idDocumentoPagare",
    "identificacionEmisor",
    "numPagareEntidad",
    "mensajeRespuesta"
})
public class DesembolsoAnotarCuentaDTO {

    @XmlElement(name = "IdDocumentoPagare", required = true, type = Long.class, nillable = true)
    protected Long idDocumentoPagare;
    @XmlElement(name = "IdentificacionEmisor", required = true, nillable = true)
    protected String identificacionEmisor;
    @XmlElement(name = "NumPagareEntidad", required = true, nillable = true)
    protected String numPagareEntidad;
    @XmlElement(name = "MensajeRespuesta", required = true, nillable = true)
    protected String mensajeRespuesta;

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
     * Gets the value of the identificacionEmisor property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getIdentificacionEmisor() {
        return identificacionEmisor;
    }

    /**
     * Sets the value of the identificacionEmisor property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setIdentificacionEmisor(String value) {
        this.identificacionEmisor = value;
    }

    /**
     * Gets the value of the numPagareEntidad property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getNumPagareEntidad() {
        return numPagareEntidad;
    }

    /**
     * Sets the value of the numPagareEntidad property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setNumPagareEntidad(String value) {
        this.numPagareEntidad = value;
    }

    /**
     * Gets the value of the mensajeRespuesta property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getMensajeRespuesta() {
        return mensajeRespuesta;
    }

    /**
     * Sets the value of the mensajeRespuesta property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setMensajeRespuesta(String value) {
        this.mensajeRespuesta = value;
    }
}
