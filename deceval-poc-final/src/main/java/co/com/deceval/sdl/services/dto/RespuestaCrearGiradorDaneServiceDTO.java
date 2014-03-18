package co.com.deceval.sdl.services.dto;

import co.com.deceval.sdl.services.CrearGiradorDaneServiceDTO;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for RespuestaCrearGiradorDaneServiceDTO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 *
 * <pre>
 * &lt;complexType name="RespuestaCrearGiradorDaneServiceDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Exitoso" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Respuesta" type="{java:com.deceval.sdl.services.dto}CrearGiradorDaneServiceDTO"/>
 *         &lt;element name="CodigoError" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespuestaCrearGiradorDaneServiceDTO", propOrder = {
    "exitoso",
    "descripcion",
    "respuesta",
    "codigoError"
})
public class RespuestaCrearGiradorDaneServiceDTO {

    @XmlElement(name = "Exitoso", required = true, type = Boolean.class, nillable = true)
    protected Boolean exitoso;
    @XmlElement(name = "Descripcion", required = true, nillable = true)
    protected String descripcion;
    @XmlElement(name = "Respuesta", required = true, nillable = true)
    protected CrearGiradorDaneServiceDTO respuesta;
    @XmlElement(name = "CodigoError", required = true, nillable = true)
    protected String codigoError;

    /**
     * Gets the value of the exitoso property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isExitoso() {
        return exitoso;
    }

    /**
     * Sets the value of the exitoso property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setExitoso(Boolean value) {
        this.exitoso = value;
    }

    /**
     * Gets the value of the descripcion property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Sets the value of the descripcion property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Gets the value of the respuesta property.
     *
     * @return possible object is {@link CrearGiradorDaneServiceDTO }
     *
     */
    public CrearGiradorDaneServiceDTO getRespuesta() {
        return respuesta;
    }

    /**
     * Sets the value of the respuesta property.
     *
     * @param value allowed object is {@link CrearGiradorDaneServiceDTO }
     *
     */
    public void setRespuesta(CrearGiradorDaneServiceDTO value) {
        this.respuesta = value;
    }

    /**
     * Gets the value of the codigoError property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCodigoError() {
        return codigoError;
    }

    /**
     * Sets the value of the codigoError property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCodigoError(String value) {
        this.codigoError = value;
    }
}
