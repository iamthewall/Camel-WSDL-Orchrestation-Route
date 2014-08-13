package co.com.deceval.sdl.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for ConsultaGiradorServiceDTO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultaGiradorServiceDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GiradorTipoId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="GiradorNumId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="GiradorCuenta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IdRol" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IdPersonaRepresentada" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaGiradorServiceDTO", propOrder = {
    "giradorTipoId",
    "giradorNumId",
    "giradorCuenta",
    "idRol",
    "idPersonaRepresentada"
})
public class ConsultaGiradorServiceDTO {

    @XmlElement(name = "GiradorTipoId", required = true, type = Integer.class, nillable = true)
    protected Integer giradorTipoId;
    @XmlElement(name = "GiradorNumId", required = true, nillable = true)
    protected String giradorNumId;
    @XmlElement(name = "GiradorCuenta", required = true, type = Integer.class, nillable = true)
    protected Integer giradorCuenta;
    @XmlElement(name = "IdRol", required = true, type = Integer.class, nillable = true)
    protected Integer idRol;
    @XmlElement(name = "IdPersonaRepresentada", required = true, type = Long.class, nillable = true)
    protected Long idPersonaRepresentada;

    /**
     * Gets the value of the giradorTipoId property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getGiradorTipoId() {
        return giradorTipoId;
    }

    /**
     * Sets the value of the giradorTipoId property.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setGiradorTipoId(Integer value) {
        this.giradorTipoId = value;
    }

    /**
     * Gets the value of the giradorNumId property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getGiradorNumId() {
        return giradorNumId;
    }

    /**
     * Sets the value of the giradorNumId property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setGiradorNumId(String value) {
        this.giradorNumId = value;
    }

    /**
     * Gets the value of the giradorCuenta property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getGiradorCuenta() {
        return giradorCuenta;
    }

    /**
     * Sets the value of the giradorCuenta property.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setGiradorCuenta(Integer value) {
        this.giradorCuenta = value;
    }

    /**
     * Gets the value of the idRol property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getIdRol() {
        return idRol;
    }

    /**
     * Sets the value of the idRol property.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setIdRol(Integer value) {
        this.idRol = value;
    }

    /**
     * Gets the value of the idPersonaRepresentada property.
     *
     * @return possible object is {@link Long }
     *
     */
    public Long getIdPersonaRepresentada() {
        return idPersonaRepresentada;
    }

    /**
     * Sets the value of the idPersonaRepresentada property.
     *
     * @param value allowed object is {@link Long }
     *
     */
    public void setIdPersonaRepresentada(Long value) {
        this.idPersonaRepresentada = value;
    }
}
