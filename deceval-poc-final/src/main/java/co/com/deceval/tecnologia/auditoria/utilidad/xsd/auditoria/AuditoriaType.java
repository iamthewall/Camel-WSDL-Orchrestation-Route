package co.com.deceval.tecnologia.auditoria.utilidad.xsd.auditoria;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.deceval.comunes.modelos.xsd.encabezados.EncabezadoEntradaType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * <p>Java class for AuditoriaType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 *
 * <pre>
 * &lt;complexType name="AuditoriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.deceval.com/comunes/modelos/xsd/Encabezados}EncabezadoEntrada"/>
 *         &lt;element name="NombreServicio" type="{http://www.deceval.com.co/tecnologia/auditoria/utilidad/xsd/Auditoria}NombreType"/>
 *         &lt;element name="OperacionInvocada" type="{http://www.deceval.com.co/tecnologia/auditoria/utilidad/xsd/Auditoria}NombreType"/>
 *         &lt;element name="FechaInvocacion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OrigenConsumidor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TiempoProcesamiento" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ProcesamientoExitoso" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="MensajePeticion" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "AuditoriaType", propOrder = {
    "encabezadoEntrada",
    "nombreServicio",
    "operacionInvocada",
    "fechaInvocacion",
    "origenConsumidor",
    "tiempoProcesamiento",
    "procesamientoExitoso",
    "mensajePeticion",
    "mensajeRespuesta"
})
public class AuditoriaType {

    @XmlElement(name = "EncabezadoEntrada", namespace = "http://www.deceval.com/comunes/modelos/xsd/Encabezados", required = true)
    protected EncabezadoEntradaType encabezadoEntrada;
    @XmlElement(name = "NombreServicio", required = true)
    protected String nombreServicio;
    @XmlElement(name = "OperacionInvocada", required = true)
    protected String operacionInvocada;
    @XmlElement(name = "FechaInvocacion", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaInvocacion;
    @XmlElement(name = "OrigenConsumidor", required = true)
    protected String origenConsumidor;
    @XmlElement(name = "TiempoProcesamiento")
    protected long tiempoProcesamiento;
    @XmlElement(name = "ProcesamientoExitoso")
    protected boolean procesamientoExitoso;
    @XmlElement(name = "MensajePeticion", required = true)
    protected String mensajePeticion;
    @XmlElement(name = "MensajeRespuesta", required = true)
    protected String mensajeRespuesta;

    /**
     * Gets the value of the encabezadoEntrada property.
     *
     * @return possible object is {@link EncabezadoEntradaType }
     *
     */
    public EncabezadoEntradaType getEncabezadoEntrada() {
        return encabezadoEntrada;
    }

    /**
     * Sets the value of the encabezadoEntrada property.
     *
     * @param value allowed object is {@link EncabezadoEntradaType }
     *
     */
    public void setEncabezadoEntrada(EncabezadoEntradaType value) {
        this.encabezadoEntrada = value;
    }

    /**
     * Gets the value of the nombreServicio property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getNombreServicio() {
        return nombreServicio;
    }

    /**
     * Sets the value of the nombreServicio property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setNombreServicio(String value) {
        this.nombreServicio = value;
    }

    /**
     * Gets the value of the operacionInvocada property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getOperacionInvocada() {
        return operacionInvocada;
    }

    /**
     * Sets the value of the operacionInvocada property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setOperacionInvocada(String value) {
        this.operacionInvocada = value;
    }

    /**
     * Gets the value of the fechaInvocacion property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFechaInvocacion() {
        return fechaInvocacion;
    }

    /**
     * Sets the value of the fechaInvocacion property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setFechaInvocacion(XMLGregorianCalendar value) {
        this.fechaInvocacion = value;
    }

    /**
     * Gets the value of the origenConsumidor property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getOrigenConsumidor() {
        return origenConsumidor;
    }

    /**
     * Sets the value of the origenConsumidor property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setOrigenConsumidor(String value) {
        this.origenConsumidor = value;
    }

    /**
     * Gets the value of the tiempoProcesamiento property.
     *
     */
    public long getTiempoProcesamiento() {
        return tiempoProcesamiento;
    }

    /**
     * Sets the value of the tiempoProcesamiento property.
     *
     */
    public void setTiempoProcesamiento(long value) {
        this.tiempoProcesamiento = value;
    }

    /**
     * Gets the value of the procesamientoExitoso property.
     *
     */
    public boolean isProcesamientoExitoso() {
        return procesamientoExitoso;
    }

    /**
     * Sets the value of the procesamientoExitoso property.
     *
     */
    public void setProcesamientoExitoso(boolean value) {
        this.procesamientoExitoso = value;
    }

    /**
     * Gets the value of the mensajePeticion property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getMensajePeticion() {
        return mensajePeticion;
    }

    /**
     * Sets the value of the mensajePeticion property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setMensajePeticion(String value) {
        this.mensajePeticion = value;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Method[] declaredMethods = getClass().getDeclaredMethods();

        for (Method method : declaredMethods) {
            String methodName = method.getName();
            if (methodName.startsWith("get")) {
                try {
                    sb.append(methodName.substring(3)).append(" = ").append(String.valueOf(method.invoke(this))).append(", ");
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalArgumentException ex) {
                    Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
                } catch (InvocationTargetException ex) {
                    Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        sb.deleteCharAt(sb.lastIndexOf(","));
        return sb.toString();
    }
}
