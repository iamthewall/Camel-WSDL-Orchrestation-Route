package co.com.deceval.sdl.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Objeto del request para el servicio de consultar pagares con los datos para
 * el filtro en la busqueda de pagares.
 *
 * <p>Java class for ConsultaPagareServiceDTO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultaPagareServiceDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdEstadoPagare" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CodigoDeceval" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="NumPagareEntidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IdTipoIdentificacionFirmante" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumIdentificacionFirmante" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaPagareServiceDTO", propOrder = {
    "idEstadoPagare",
    "codigoDeceval",
    "numPagareEntidad",
    "idTipoIdentificacionFirmante",
    "numIdentificacionFirmante"
})
public class ConsultaPagareServiceDTO {

    @XmlElement(name = "IdEstadoPagare", required = true, type = Integer.class, nillable = true)
    protected Integer idEstadoPagare;
    @XmlElement(name = "CodigoDeceval", required = true, type = Long.class, nillable = true)
    protected Long codigoDeceval;
    @XmlElement(name = "NumPagareEntidad", required = true, nillable = true)
    protected String numPagareEntidad;
    @XmlElement(name = "IdTipoIdentificacionFirmante", required = true, type = Integer.class, nillable = true)
    protected Integer idTipoIdentificacionFirmante;
    @XmlElement(name = "NumIdentificacionFirmante", required = true, nillable = true)
    protected String numIdentificacionFirmante;

    /**
     * Gets the value of the idEstadoPagare property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getIdEstadoPagare() {
        return idEstadoPagare;
    }

    /**
     * Sets the value of the idEstadoPagare property.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setIdEstadoPagare(Integer value) {
        this.idEstadoPagare = value;
    }

    /**
     * Gets the value of the codigoDeceval property.
     *
     * @return possible object is {@link Long }
     *
     */
    public Long getCodigoDeceval() {
        return codigoDeceval;
    }

    /**
     * Sets the value of the codigoDeceval property.
     *
     * @param value allowed object is {@link Long }
     *
     */
    public void setCodigoDeceval(Long value) {
        this.codigoDeceval = value;
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
     * Gets the value of the idTipoIdentificacionFirmante property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getIdTipoIdentificacionFirmante() {
        return idTipoIdentificacionFirmante;
    }

    /**
     * Sets the value of the idTipoIdentificacionFirmante property.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setIdTipoIdentificacionFirmante(Integer value) {
        this.idTipoIdentificacionFirmante = value;
    }

    /**
     * Gets the value of the numIdentificacionFirmante property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getNumIdentificacionFirmante() {
        return numIdentificacionFirmante;
    }

    /**
     * Sets the value of the numIdentificacionFirmante property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setNumIdentificacionFirmante(String value) {
        this.numIdentificacionFirmante = value;
    }
}
