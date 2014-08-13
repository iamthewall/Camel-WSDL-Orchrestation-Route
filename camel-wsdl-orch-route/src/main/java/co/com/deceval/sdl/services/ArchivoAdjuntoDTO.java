package co.com.deceval.sdl.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for ArchivoAdjuntoDTO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 *
 * <pre>
 * &lt;complexType name="ArchivoAdjuntoDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NombreArchivo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Contenido" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArchivoAdjuntoDTO", propOrder = {
    "nombreArchivo",
    "contenido"
})
public class ArchivoAdjuntoDTO {

    @XmlElement(name = "NombreArchivo", required = true, nillable = true)
    protected String nombreArchivo;
    @XmlElement(name = "Contenido", required = true, nillable = true)
    protected String contenido;

    /**
     * Gets the value of the nombreArchivo property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getNombreArchivo() {
        return nombreArchivo;
    }

    /**
     * Sets the value of the nombreArchivo property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setNombreArchivo(String value) {
        this.nombreArchivo = value;
    }

    /**
     * Gets the value of the contenido property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getContenido() {
        return contenido;
    }

    /**
     * Sets the value of the contenido property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setContenido(String value) {
        this.contenido = value;
    }
}
