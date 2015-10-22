package co.com.deceval.sdl.services.dto;

import co.com.deceval.sdl.services.InformacionPagareServiceDTO;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for RespuestaConsultarPagaresDTO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 *
 * <pre>
 * &lt;complexType name="RespuestaConsultarPagaresDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Exitoso" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ListaRespuesta" type="{java:com.deceval.sdl.services.dto}InformacionPagareServiceDTO" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "RespuestaConsultarPagaresDTO", propOrder = {
    "exitoso",
    "descripcion",
    "listaRespuesta",
    "codigoError"
})
public class RespuestaConsultarPagaresDTO {

    @XmlElement(name = "Exitoso", required = true, type = Boolean.class, nillable = true)
    protected Boolean exitoso;
    @XmlElement(name = "Descripcion", required = true, nillable = true)
    protected String descripcion;
    @XmlElement(name = "ListaRespuesta", nillable = true)
    protected List<InformacionPagareServiceDTO> listaRespuesta;
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
     * Gets the value of the listaRespuesta property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the listaRespuesta property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaRespuesta().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InformacionPagareServiceDTO }
     *
     *
     */
    public List<InformacionPagareServiceDTO> getListaRespuesta() {
        if (listaRespuesta == null) {
            listaRespuesta = new ArrayList<InformacionPagareServiceDTO>();
        }
        return this.listaRespuesta;
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
