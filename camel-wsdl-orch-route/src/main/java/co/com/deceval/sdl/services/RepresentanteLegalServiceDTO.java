package co.com.deceval.sdl.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Representa la informacion basica de un girador.
 *
 * <p>Java class for RepresentanteLegalServiceDTO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 *
 * <pre>
 * &lt;complexType name="RepresentanteLegalServiceDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoIdentificacion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Cuenta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IdTipoRepresentante" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepresentanteLegalServiceDTO", propOrder = {
    "tipoIdentificacion",
    "numIdentificacion",
    "cuenta",
    "idTipoRepresentante"
})
public class RepresentanteLegalServiceDTO {

    @XmlElement(name = "TipoIdentificacion", required = true, type = Integer.class, nillable = true)
    protected Integer tipoIdentificacion;
    @XmlElement(name = "NumIdentificacion", required = true, nillable = true)
    protected String numIdentificacion;
    @XmlElement(name = "Cuenta", required = true, type = Integer.class, nillable = true)
    protected Integer cuenta;
    @XmlElement(name = "IdTipoRepresentante", required = true, type = Integer.class, nillable = true)
    protected Integer idTipoRepresentante;

    /**
     * Gets the value of the tipoIdentificacion property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    /**
     * Sets the value of the tipoIdentificacion property.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setTipoIdentificacion(Integer value) {
        this.tipoIdentificacion = value;
    }

    /**
     * Gets the value of the numIdentificacion property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getNumIdentificacion() {
        return numIdentificacion;
    }

    /**
     * Sets the value of the numIdentificacion property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setNumIdentificacion(String value) {
        this.numIdentificacion = value;
    }

    /**
     * Gets the value of the cuenta property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getCuenta() {
        return cuenta;
    }

    /**
     * Sets the value of the cuenta property.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setCuenta(Integer value) {
        this.cuenta = value;
    }

    /**
     * Gets the value of the idTipoRepresentante property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getIdTipoRepresentante() {
        return idTipoRepresentante;
    }

    /**
     * Sets the value of the idTipoRepresentante property.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setIdTipoRepresentante(Integer value) {
        this.idTipoRepresentante = value;
    }
}
