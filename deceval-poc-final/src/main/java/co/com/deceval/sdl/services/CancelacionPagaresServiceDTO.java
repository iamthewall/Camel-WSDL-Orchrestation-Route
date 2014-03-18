package co.com.deceval.sdl.services;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for CancelacionPagaresServiceDTO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 *
 * <pre>
 * &lt;complexType name="CancelacionPagaresServiceDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumPagareEntidad_DocPag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IdDocumentoPagare_DocPag" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CodigoISIN_DocPag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CuentaBeneficiario_DocPag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ValorPagado_DetOpe" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ValorAmortizacionCapital_DetOpe" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ValorInteresesCtes_DetOpe" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ValorInteresesMora_DetOpe" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ValorSeguro_DetOpe" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OtrosValores_DetOpe" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="IdUsuarioSession" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="NombreUsuarioSession" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Exitoso" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="MensajeRespuesta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CodigoEmisor_AntCta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CodigoAdministrador_AntCta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelacionPagaresServiceDTO", propOrder = {
    "numPagareEntidadDocPag",
    "idDocumentoPagareDocPag",
    "codigoISINDocPag",
    "cuentaBeneficiarioDocPag",
    "valorPagadoDetOpe",
    "valorAmortizacionCapitalDetOpe",
    "valorInteresesCtesDetOpe",
    "valorInteresesMoraDetOpe",
    "valorSeguroDetOpe",
    "otrosValoresDetOpe",
    "idUsuarioSession",
    "nombreUsuarioSession",
    "exitoso",
    "mensajeRespuesta",
    "codigoEmisorAntCta",
    "codigoAdministradorAntCta"
})
public class CancelacionPagaresServiceDTO {

    @XmlElement(name = "NumPagareEntidad_DocPag", required = true, nillable = true)
    protected String numPagareEntidadDocPag;
    @XmlElement(name = "IdDocumentoPagare_DocPag", required = true, type = Long.class, nillable = true)
    protected Long idDocumentoPagareDocPag;
    @XmlElement(name = "CodigoISIN_DocPag", required = true, nillable = true)
    protected String codigoISINDocPag;
    @XmlElement(name = "CuentaBeneficiario_DocPag", required = true, nillable = true)
    protected String cuentaBeneficiarioDocPag;
    @XmlElement(name = "ValorPagado_DetOpe", required = true, nillable = true)
    protected BigDecimal valorPagadoDetOpe;
    @XmlElement(name = "ValorAmortizacionCapital_DetOpe", required = true, nillable = true)
    protected BigDecimal valorAmortizacionCapitalDetOpe;
    @XmlElement(name = "ValorInteresesCtes_DetOpe", required = true, nillable = true)
    protected BigDecimal valorInteresesCtesDetOpe;
    @XmlElement(name = "ValorInteresesMora_DetOpe", required = true, nillable = true)
    protected BigDecimal valorInteresesMoraDetOpe;
    @XmlElement(name = "ValorSeguro_DetOpe", required = true, nillable = true)
    protected BigDecimal valorSeguroDetOpe;
    @XmlElement(name = "OtrosValores_DetOpe", required = true, nillable = true)
    protected BigDecimal otrosValoresDetOpe;
    @XmlElement(name = "IdUsuarioSession", required = true, type = Long.class, nillable = true)
    protected Long idUsuarioSession;
    @XmlElement(name = "NombreUsuarioSession", required = true, nillable = true)
    protected String nombreUsuarioSession;
    @XmlElement(name = "Exitoso", required = true, type = Boolean.class, nillable = true)
    protected Boolean exitoso;
    @XmlElement(name = "MensajeRespuesta", required = true, nillable = true)
    protected String mensajeRespuesta;
    @XmlElement(name = "CodigoEmisor_AntCta", required = true, nillable = true)
    protected String codigoEmisorAntCta;
    @XmlElement(name = "CodigoAdministrador_AntCta", required = true, nillable = true)
    protected String codigoAdministradorAntCta;

    /**
     * Gets the value of the numPagareEntidadDocPag property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getNumPagareEntidadDocPag() {
        return numPagareEntidadDocPag;
    }

    /**
     * Sets the value of the numPagareEntidadDocPag property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setNumPagareEntidadDocPag(String value) {
        this.numPagareEntidadDocPag = value;
    }

    /**
     * Gets the value of the idDocumentoPagareDocPag property.
     *
     * @return possible object is {@link Long }
     *
     */
    public Long getIdDocumentoPagareDocPag() {
        return idDocumentoPagareDocPag;
    }

    /**
     * Sets the value of the idDocumentoPagareDocPag property.
     *
     * @param value allowed object is {@link Long }
     *
     */
    public void setIdDocumentoPagareDocPag(Long value) {
        this.idDocumentoPagareDocPag = value;
    }

    /**
     * Gets the value of the codigoISINDocPag property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCodigoISINDocPag() {
        return codigoISINDocPag;
    }

    /**
     * Sets the value of the codigoISINDocPag property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCodigoISINDocPag(String value) {
        this.codigoISINDocPag = value;
    }

    /**
     * Gets the value of the cuentaBeneficiarioDocPag property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCuentaBeneficiarioDocPag() {
        return cuentaBeneficiarioDocPag;
    }

    /**
     * Sets the value of the cuentaBeneficiarioDocPag property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCuentaBeneficiarioDocPag(String value) {
        this.cuentaBeneficiarioDocPag = value;
    }

    /**
     * Gets the value of the valorPagadoDetOpe property.
     *
     * @return possible object is {@link BigDecimal }
     *
     */
    public BigDecimal getValorPagadoDetOpe() {
        return valorPagadoDetOpe;
    }

    /**
     * Sets the value of the valorPagadoDetOpe property.
     *
     * @param value allowed object is {@link BigDecimal }
     *
     */
    public void setValorPagadoDetOpe(BigDecimal value) {
        this.valorPagadoDetOpe = value;
    }

    /**
     * Gets the value of the valorAmortizacionCapitalDetOpe property.
     *
     * @return possible object is {@link BigDecimal }
     *
     */
    public BigDecimal getValorAmortizacionCapitalDetOpe() {
        return valorAmortizacionCapitalDetOpe;
    }

    /**
     * Sets the value of the valorAmortizacionCapitalDetOpe property.
     *
     * @param value allowed object is {@link BigDecimal }
     *
     */
    public void setValorAmortizacionCapitalDetOpe(BigDecimal value) {
        this.valorAmortizacionCapitalDetOpe = value;
    }

    /**
     * Gets the value of the valorInteresesCtesDetOpe property.
     *
     * @return possible object is {@link BigDecimal }
     *
     */
    public BigDecimal getValorInteresesCtesDetOpe() {
        return valorInteresesCtesDetOpe;
    }

    /**
     * Sets the value of the valorInteresesCtesDetOpe property.
     *
     * @param value allowed object is {@link BigDecimal }
     *
     */
    public void setValorInteresesCtesDetOpe(BigDecimal value) {
        this.valorInteresesCtesDetOpe = value;
    }

    /**
     * Gets the value of the valorInteresesMoraDetOpe property.
     *
     * @return possible object is {@link BigDecimal }
     *
     */
    public BigDecimal getValorInteresesMoraDetOpe() {
        return valorInteresesMoraDetOpe;
    }

    /**
     * Sets the value of the valorInteresesMoraDetOpe property.
     *
     * @param value allowed object is {@link BigDecimal }
     *
     */
    public void setValorInteresesMoraDetOpe(BigDecimal value) {
        this.valorInteresesMoraDetOpe = value;
    }

    /**
     * Gets the value of the valorSeguroDetOpe property.
     *
     * @return possible object is {@link BigDecimal }
     *
     */
    public BigDecimal getValorSeguroDetOpe() {
        return valorSeguroDetOpe;
    }

    /**
     * Sets the value of the valorSeguroDetOpe property.
     *
     * @param value allowed object is {@link BigDecimal }
     *
     */
    public void setValorSeguroDetOpe(BigDecimal value) {
        this.valorSeguroDetOpe = value;
    }

    /**
     * Gets the value of the otrosValoresDetOpe property.
     *
     * @return possible object is {@link BigDecimal }
     *
     */
    public BigDecimal getOtrosValoresDetOpe() {
        return otrosValoresDetOpe;
    }

    /**
     * Sets the value of the otrosValoresDetOpe property.
     *
     * @param value allowed object is {@link BigDecimal }
     *
     */
    public void setOtrosValoresDetOpe(BigDecimal value) {
        this.otrosValoresDetOpe = value;
    }

    /**
     * Gets the value of the idUsuarioSession property.
     *
     * @return possible object is {@link Long }
     *
     */
    public Long getIdUsuarioSession() {
        return idUsuarioSession;
    }

    /**
     * Sets the value of the idUsuarioSession property.
     *
     * @param value allowed object is {@link Long }
     *
     */
    public void setIdUsuarioSession(Long value) {
        this.idUsuarioSession = value;
    }

    /**
     * Gets the value of the nombreUsuarioSession property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getNombreUsuarioSession() {
        return nombreUsuarioSession;
    }

    /**
     * Sets the value of the nombreUsuarioSession property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setNombreUsuarioSession(String value) {
        this.nombreUsuarioSession = value;
    }

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

    /**
     * Gets the value of the codigoEmisorAntCta property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCodigoEmisorAntCta() {
        return codigoEmisorAntCta;
    }

    /**
     * Sets the value of the codigoEmisorAntCta property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCodigoEmisorAntCta(String value) {
        this.codigoEmisorAntCta = value;
    }

    /**
     * Gets the value of the codigoAdministradorAntCta property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCodigoAdministradorAntCta() {
        return codigoAdministradorAntCta;
    }

    /**
     * Sets the value of the codigoAdministradorAntCta property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCodigoAdministradorAntCta(String value) {
        this.codigoAdministradorAntCta = value;
    }
}
