package co.com.deceval.sdl.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * DTO que representa los datos de los pagares consultados por el usuario
 * mediante Web Service
 *
 * <p>Java class for InformacionPagareServiceDTO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 *
 * <pre>
 * &lt;complexType name="InformacionPagareServiceDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdPagareDeceval" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumPagareEntidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FechaGrabacionPagare" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FechaFirmaPagare" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EstadoPagare" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NombreOtorgante" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TipoDocumentoOtorgante" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumeroDocumentoOtorgante" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PdfPagare" type="{java:com.deceval.sdl.services.dto}ArchivoAdjuntoDTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformacionPagareServiceDTO", propOrder = {
    "idPagareDeceval",
    "numPagareEntidad",
    "fechaGrabacionPagare",
    "fechaFirmaPagare",
    "estadoPagare",
    "nombreOtorgante",
    "tipoDocumentoOtorgante",
    "numeroDocumentoOtorgante",
    "pdfPagare"
})
public class InformacionPagareServiceDTO {

    @XmlElement(name = "IdPagareDeceval", required = true, type = Integer.class, nillable = true)
    protected Integer idPagareDeceval;
    @XmlElement(name = "NumPagareEntidad", required = true, nillable = true)
    protected String numPagareEntidad;
    @XmlElement(name = "FechaGrabacionPagare", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaGrabacionPagare;
    @XmlElement(name = "FechaFirmaPagare", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaFirmaPagare;
    @XmlElement(name = "EstadoPagare", required = true, nillable = true)
    protected String estadoPagare;
    @XmlElement(name = "NombreOtorgante", required = true, nillable = true)
    protected String nombreOtorgante;
    @XmlElement(name = "TipoDocumentoOtorgante", required = true, nillable = true)
    protected String tipoDocumentoOtorgante;
    @XmlElement(name = "NumeroDocumentoOtorgante", required = true, nillable = true)
    protected String numeroDocumentoOtorgante;
    @XmlElement(name = "PdfPagare", required = true, nillable = true)
    protected ArchivoAdjuntoDTO pdfPagare;

    /**
     * Gets the value of the idPagareDeceval property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getIdPagareDeceval() {
        return idPagareDeceval;
    }

    /**
     * Sets the value of the idPagareDeceval property.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setIdPagareDeceval(Integer value) {
        this.idPagareDeceval = value;
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
     * Gets the value of the fechaGrabacionPagare property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFechaGrabacionPagare() {
        return fechaGrabacionPagare;
    }

    /**
     * Sets the value of the fechaGrabacionPagare property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setFechaGrabacionPagare(XMLGregorianCalendar value) {
        this.fechaGrabacionPagare = value;
    }

    /**
     * Gets the value of the fechaFirmaPagare property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFechaFirmaPagare() {
        return fechaFirmaPagare;
    }

    /**
     * Sets the value of the fechaFirmaPagare property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setFechaFirmaPagare(XMLGregorianCalendar value) {
        this.fechaFirmaPagare = value;
    }

    /**
     * Gets the value of the estadoPagare property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getEstadoPagare() {
        return estadoPagare;
    }

    /**
     * Sets the value of the estadoPagare property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setEstadoPagare(String value) {
        this.estadoPagare = value;
    }

    /**
     * Gets the value of the nombreOtorgante property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getNombreOtorgante() {
        return nombreOtorgante;
    }

    /**
     * Sets the value of the nombreOtorgante property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setNombreOtorgante(String value) {
        this.nombreOtorgante = value;
    }

    /**
     * Gets the value of the tipoDocumentoOtorgante property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTipoDocumentoOtorgante() {
        return tipoDocumentoOtorgante;
    }

    /**
     * Sets the value of the tipoDocumentoOtorgante property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setTipoDocumentoOtorgante(String value) {
        this.tipoDocumentoOtorgante = value;
    }

    /**
     * Gets the value of the numeroDocumentoOtorgante property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getNumeroDocumentoOtorgante() {
        return numeroDocumentoOtorgante;
    }

    /**
     * Sets the value of the numeroDocumentoOtorgante property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setNumeroDocumentoOtorgante(String value) {
        this.numeroDocumentoOtorgante = value;
    }

    /**
     * Gets the value of the pdfPagare property.
     *
     * @return possible object is {@link ArchivoAdjuntoDTO }
     *
     */
    public ArchivoAdjuntoDTO getPdfPagare() {
        return pdfPagare;
    }

    /**
     * Sets the value of the pdfPagare property.
     *
     * @param value allowed object is {@link ArchivoAdjuntoDTO }
     *
     */
    public void setPdfPagare(ArchivoAdjuntoDTO value) {
        this.pdfPagare = value;
    }
}
