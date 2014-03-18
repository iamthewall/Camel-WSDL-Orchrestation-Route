package com.deceval.comunes.modelos.xsd.encabezados;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>Java class for EncabezadoEntradaType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 *
 * <pre>
 * &lt;complexType name="EncabezadoEntradaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *           &lt;element name="Hora" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="Usuario" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="CodigoUsuario" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *           &lt;element name="Canal" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *           &lt;element name="OrigenCliente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="IdentificadorSesion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="IdentificadorPeticion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncabezadoEntradaType", propOrder = {
    "fecha",
    "hora",
    "usuario",
    "codigoUsuario",
    "canal",
    "origenCliente",
    "identificadorSesion",
    "identificadorPeticion"
})
public class EncabezadoEntradaType {

    @XmlElement(name = "Fecha", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    @XmlElement(name = "Hora", required = true, nillable = true)
    protected String hora;
    @XmlElement(name = "Usuario", required = true, nillable = true)
    protected String usuario;
    @XmlElement(name = "CodigoUsuario", required = true, type = Integer.class, nillable = true)
    protected Integer codigoUsuario;
    @XmlElement(name = "Canal", required = true, type = Short.class, nillable = true)
    protected Short canal;
    @XmlElement(name = "OrigenCliente", required = true, nillable = true)
    protected String origenCliente;
    @XmlElement(name = "IdentificadorSesion", required = true, nillable = true)
    protected String identificadorSesion;
    @XmlElement(name = "IdentificadorPeticion", required = true, nillable = true)
    protected String identificadorPeticion;

    /**
     * Gets the value of the fecha property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Sets the value of the fecha property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }

    /**
     * Gets the value of the hora property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getHora() {
        return hora;
    }

    /**
     * Sets the value of the hora property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setHora(String value) {
        this.hora = value;
    }

    /**
     * Gets the value of the usuario property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Sets the value of the usuario property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Gets the value of the codigoUsuario property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getCodigoUsuario() {
        return codigoUsuario;
    }

    /**
     * Sets the value of the codigoUsuario property.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setCodigoUsuario(Integer value) {
        this.codigoUsuario = value;
    }

    /**
     * Gets the value of the canal property.
     *
     * @return possible object is {@link Short }
     *
     */
    public Short getCanal() {
        return canal;
    }

    /**
     * Sets the value of the canal property.
     *
     * @param value allowed object is {@link Short }
     *
     */
    public void setCanal(Short value) {
        this.canal = value;
    }

    /**
     * Gets the value of the origenCliente property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getOrigenCliente() {
        return origenCliente;
    }

    /**
     * Sets the value of the origenCliente property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setOrigenCliente(String value) {
        this.origenCliente = value;
    }

    /**
     * Gets the value of the identificadorSesion property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getIdentificadorSesion() {
        return identificadorSesion;
    }

    /**
     * Sets the value of the identificadorSesion property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setIdentificadorSesion(String value) {
        this.identificadorSesion = value;
    }

    /**
     * Gets the value of the identificadorPeticion property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getIdentificadorPeticion() {
        return identificadorPeticion;
    }

    /**
     * Sets the value of the identificadorPeticion property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setIdentificadorPeticion(String value) {
        this.identificadorPeticion = value;
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
