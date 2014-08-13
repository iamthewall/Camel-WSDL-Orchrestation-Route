package co.com.deceval.sdl.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>Java class for CrearGiradorDaneServiceDTO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 *
 * <pre>
 * &lt;complexType name="CrearGiradorDaneServiceDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdentificacionEmisor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FkIdClasePersona" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FkIdTipoDocumento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CorreoElectronico" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Direccion1PersonaGrupo_PGP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Telefono1PersonaGrupo_PGP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Fax1PersonaGrupo_PGP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Direccion2PersonaGrupo_PGP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Telefono2PersonaGrupo_PGP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Fax2PersonaGrupo_PGP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Direccion3PersonaGrupo_PGP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Telefono3PersonaGrupo_PGP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Fax3PersonaGrupo_PGP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FkIdPaisExpedicion_Nat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FkIdDepartamentoExpedicion_Nat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FkIdCiudadExpedicion_Nat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FkIdPaisDomicilio_Nat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FkIdDepartamentoDomicilio_Nat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FkIdCiudadDomicilio_Nat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FechaExpedicion_Nat" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FechaNacimiento_Nat" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PrimerApellido_Nat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SegundoApellido_Nat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NombresNat_Nat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FkIdPaisNacionalidad_Nat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FkIdPais_Jur" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FkIdDepartamento_Jur" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FkIdCiudad_Jur" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FkIdPaisCamara_Jur" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FkIdDepartamentoCamara_Jur" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FkIdCiudadCamara_Jur" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FechaConstitucion_Jur" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FechaEscritura_Jur" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FechaCamara_Jur" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RazonSocial_Jur" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AgenteAutoretenedor_Jur" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Declarante_Jur" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Residente_Jur" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EscrituraNo_Jur" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NotariaNo_Jur" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CirculoNo_Jur" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CamaraComercioNo_Jur" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LibroNo_Jur" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RegitroSuper_Jur" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ListaRepresentantesLegales" type="{java:com.deceval.sdl.services.dto}RepresentanteLegalServiceDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MensajeRespuesta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CuentaGirador" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Salario" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TiempoServicio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EstadoCivil" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Pensionado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="NumeroCelular" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrearGiradorDaneServiceDTO", propOrder = {
    "identificacionEmisor",
    "fkIdClasePersona",
    "fkIdTipoDocumento",
    "numeroDocumento",
    "correoElectronico",
    "direccion1PersonaGrupoPGP",
    "telefono1PersonaGrupoPGP",
    "fax1PersonaGrupoPGP",
    "direccion2PersonaGrupoPGP",
    "telefono2PersonaGrupoPGP",
    "fax2PersonaGrupoPGP",
    "direccion3PersonaGrupoPGP",
    "telefono3PersonaGrupoPGP",
    "fax3PersonaGrupoPGP",
    "fkIdPaisExpedicionNat",
    "fkIdDepartamentoExpedicionNat",
    "fkIdCiudadExpedicionNat",
    "fkIdPaisDomicilioNat",
    "fkIdDepartamentoDomicilioNat",
    "fkIdCiudadDomicilioNat",
    "fechaExpedicionNat",
    "fechaNacimientoNat",
    "primerApellidoNat",
    "segundoApellidoNat",
    "nombresNatNat",
    "fkIdPaisNacionalidadNat",
    "fkIdPaisJur",
    "fkIdDepartamentoJur",
    "fkIdCiudadJur",
    "fkIdPaisCamaraJur",
    "fkIdDepartamentoCamaraJur",
    "fkIdCiudadCamaraJur",
    "fechaConstitucionJur",
    "fechaEscrituraJur",
    "fechaCamaraJur",
    "razonSocialJur",
    "agenteAutoretenedorJur",
    "declaranteJur",
    "residenteJur",
    "escrituraNoJur",
    "notariaNoJur",
    "circuloNoJur",
    "camaraComercioNoJur",
    "libroNoJur",
    "regitroSuperJur",
    "listaRepresentantesLegales",
    "mensajeRespuesta",
    "cuentaGirador",
    "salario",
    "tiempoServicio",
    "estadoCivil",
    "pensionado",
    "numeroCelular"
})
public class CrearGiradorDaneServiceDTO {

    @XmlElement(name = "IdentificacionEmisor", required = true, nillable = true)
    protected String identificacionEmisor;
    @XmlElement(name = "FkIdClasePersona", required = true, type = Integer.class, nillable = true)
    protected Integer fkIdClasePersona;
    @XmlElement(name = "FkIdTipoDocumento", required = true, type = Integer.class, nillable = true)
    protected Integer fkIdTipoDocumento;
    @XmlElement(name = "NumeroDocumento", required = true, nillable = true)
    protected String numeroDocumento;
    @XmlElement(name = "CorreoElectronico", required = true, nillable = true)
    protected String correoElectronico;
    @XmlElement(name = "Direccion1PersonaGrupo_PGP", required = true, nillable = true)
    protected String direccion1PersonaGrupoPGP;
    @XmlElement(name = "Telefono1PersonaGrupo_PGP", required = true, nillable = true)
    protected String telefono1PersonaGrupoPGP;
    @XmlElement(name = "Fax1PersonaGrupo_PGP", required = true, nillable = true)
    protected String fax1PersonaGrupoPGP;
    @XmlElement(name = "Direccion2PersonaGrupo_PGP", required = true, nillable = true)
    protected String direccion2PersonaGrupoPGP;
    @XmlElement(name = "Telefono2PersonaGrupo_PGP", required = true, nillable = true)
    protected String telefono2PersonaGrupoPGP;
    @XmlElement(name = "Fax2PersonaGrupo_PGP", required = true, nillable = true)
    protected String fax2PersonaGrupoPGP;
    @XmlElement(name = "Direccion3PersonaGrupo_PGP", required = true, nillable = true)
    protected String direccion3PersonaGrupoPGP;
    @XmlElement(name = "Telefono3PersonaGrupo_PGP", required = true, nillable = true)
    protected String telefono3PersonaGrupoPGP;
    @XmlElement(name = "Fax3PersonaGrupo_PGP", required = true, nillable = true)
    protected String fax3PersonaGrupoPGP;
    @XmlElement(name = "FkIdPaisExpedicion_Nat", required = true, nillable = true)
    protected String fkIdPaisExpedicionNat;
    @XmlElement(name = "FkIdDepartamentoExpedicion_Nat", required = true, nillable = true)
    protected String fkIdDepartamentoExpedicionNat;
    @XmlElement(name = "FkIdCiudadExpedicion_Nat", required = true, nillable = true)
    protected String fkIdCiudadExpedicionNat;
    @XmlElement(name = "FkIdPaisDomicilio_Nat", required = true, nillable = true)
    protected String fkIdPaisDomicilioNat;
    @XmlElement(name = "FkIdDepartamentoDomicilio_Nat", required = true, nillable = true)
    protected String fkIdDepartamentoDomicilioNat;
    @XmlElement(name = "FkIdCiudadDomicilio_Nat", required = true, nillable = true)
    protected String fkIdCiudadDomicilioNat;
    @XmlElement(name = "FechaExpedicion_Nat", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaExpedicionNat;
    @XmlElement(name = "FechaNacimiento_Nat", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaNacimientoNat;
    @XmlElement(name = "PrimerApellido_Nat", required = true, nillable = true)
    protected String primerApellidoNat;
    @XmlElement(name = "SegundoApellido_Nat", required = true, nillable = true)
    protected String segundoApellidoNat;
    @XmlElement(name = "NombresNat_Nat", required = true, nillable = true)
    protected String nombresNatNat;
    @XmlElement(name = "FkIdPaisNacionalidad_Nat", required = true, nillable = true)
    protected String fkIdPaisNacionalidadNat;
    @XmlElement(name = "FkIdPais_Jur", required = true, nillable = true)
    protected String fkIdPaisJur;
    @XmlElement(name = "FkIdDepartamento_Jur", required = true, nillable = true)
    protected String fkIdDepartamentoJur;
    @XmlElement(name = "FkIdCiudad_Jur", required = true, nillable = true)
    protected String fkIdCiudadJur;
    @XmlElement(name = "FkIdPaisCamara_Jur", required = true, nillable = true)
    protected String fkIdPaisCamaraJur;
    @XmlElement(name = "FkIdDepartamentoCamara_Jur", required = true, nillable = true)
    protected String fkIdDepartamentoCamaraJur;
    @XmlElement(name = "FkIdCiudadCamara_Jur", required = true, nillable = true)
    protected String fkIdCiudadCamaraJur;
    @XmlElement(name = "FechaConstitucion_Jur", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaConstitucionJur;
    @XmlElement(name = "FechaEscritura_Jur", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaEscrituraJur;
    @XmlElement(name = "FechaCamara_Jur", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaCamaraJur;
    @XmlElement(name = "RazonSocial_Jur", required = true, nillable = true)
    protected String razonSocialJur;
    @XmlElement(name = "AgenteAutoretenedor_Jur", required = true, type = Integer.class, nillable = true)
    protected Integer agenteAutoretenedorJur;
    @XmlElement(name = "Declarante_Jur", required = true, type = Integer.class, nillable = true)
    protected Integer declaranteJur;
    @XmlElement(name = "Residente_Jur", required = true, type = Integer.class, nillable = true)
    protected Integer residenteJur;
    @XmlElement(name = "EscrituraNo_Jur", required = true, nillable = true)
    protected String escrituraNoJur;
    @XmlElement(name = "NotariaNo_Jur", required = true, nillable = true)
    protected String notariaNoJur;
    @XmlElement(name = "CirculoNo_Jur", required = true, nillable = true)
    protected String circuloNoJur;
    @XmlElement(name = "CamaraComercioNo_Jur", required = true, nillable = true)
    protected String camaraComercioNoJur;
    @XmlElement(name = "LibroNo_Jur", required = true, nillable = true)
    protected String libroNoJur;
    @XmlElement(name = "RegitroSuper_Jur", required = true, nillable = true)
    protected String regitroSuperJur;
    @XmlElement(name = "ListaRepresentantesLegales", nillable = true)
    protected List<RepresentanteLegalServiceDTO> listaRepresentantesLegales;
    @XmlElement(name = "MensajeRespuesta", required = true, nillable = true)
    protected String mensajeRespuesta;
    @XmlElement(name = "CuentaGirador")
    protected long cuentaGirador;
    @XmlElement(name = "Salario", required = true, type = Double.class, nillable = true)
    protected Double salario;
    @XmlElement(name = "TiempoServicio", required = true, nillable = true)
    protected String tiempoServicio;
    @XmlElement(name = "EstadoCivil", required = true, nillable = true)
    protected String estadoCivil;
    @XmlElement(name = "Pensionado", required = true, type = Boolean.class, nillable = true)
    protected Boolean pensionado;
    @XmlElement(name = "NumeroCelular", required = true, nillable = true)
    protected String numeroCelular;

    /**
     * Gets the value of the identificacionEmisor property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getIdentificacionEmisor() {
        return identificacionEmisor;
    }

    /**
     * Sets the value of the identificacionEmisor property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setIdentificacionEmisor(String value) {
        this.identificacionEmisor = value;
    }

    /**
     * Gets the value of the fkIdClasePersona property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getFkIdClasePersona() {
        return fkIdClasePersona;
    }

    /**
     * Sets the value of the fkIdClasePersona property.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setFkIdClasePersona(Integer value) {
        this.fkIdClasePersona = value;
    }

    /**
     * Gets the value of the fkIdTipoDocumento property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getFkIdTipoDocumento() {
        return fkIdTipoDocumento;
    }

    /**
     * Sets the value of the fkIdTipoDocumento property.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setFkIdTipoDocumento(Integer value) {
        this.fkIdTipoDocumento = value;
    }

    /**
     * Gets the value of the numeroDocumento property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * Sets the value of the numeroDocumento property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setNumeroDocumento(String value) {
        this.numeroDocumento = value;
    }

    /**
     * Gets the value of the correoElectronico property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    /**
     * Sets the value of the correoElectronico property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCorreoElectronico(String value) {
        this.correoElectronico = value;
    }

    /**
     * Gets the value of the direccion1PersonaGrupoPGP property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDireccion1PersonaGrupoPGP() {
        return direccion1PersonaGrupoPGP;
    }

    /**
     * Sets the value of the direccion1PersonaGrupoPGP property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setDireccion1PersonaGrupoPGP(String value) {
        this.direccion1PersonaGrupoPGP = value;
    }

    /**
     * Gets the value of the telefono1PersonaGrupoPGP property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTelefono1PersonaGrupoPGP() {
        return telefono1PersonaGrupoPGP;
    }

    /**
     * Sets the value of the telefono1PersonaGrupoPGP property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setTelefono1PersonaGrupoPGP(String value) {
        this.telefono1PersonaGrupoPGP = value;
    }

    /**
     * Gets the value of the fax1PersonaGrupoPGP property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getFax1PersonaGrupoPGP() {
        return fax1PersonaGrupoPGP;
    }

    /**
     * Sets the value of the fax1PersonaGrupoPGP property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setFax1PersonaGrupoPGP(String value) {
        this.fax1PersonaGrupoPGP = value;
    }

    /**
     * Gets the value of the direccion2PersonaGrupoPGP property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDireccion2PersonaGrupoPGP() {
        return direccion2PersonaGrupoPGP;
    }

    /**
     * Sets the value of the direccion2PersonaGrupoPGP property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setDireccion2PersonaGrupoPGP(String value) {
        this.direccion2PersonaGrupoPGP = value;
    }

    /**
     * Gets the value of the telefono2PersonaGrupoPGP property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTelefono2PersonaGrupoPGP() {
        return telefono2PersonaGrupoPGP;
    }

    /**
     * Sets the value of the telefono2PersonaGrupoPGP property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setTelefono2PersonaGrupoPGP(String value) {
        this.telefono2PersonaGrupoPGP = value;
    }

    /**
     * Gets the value of the fax2PersonaGrupoPGP property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getFax2PersonaGrupoPGP() {
        return fax2PersonaGrupoPGP;
    }

    /**
     * Sets the value of the fax2PersonaGrupoPGP property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setFax2PersonaGrupoPGP(String value) {
        this.fax2PersonaGrupoPGP = value;
    }

    /**
     * Gets the value of the direccion3PersonaGrupoPGP property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDireccion3PersonaGrupoPGP() {
        return direccion3PersonaGrupoPGP;
    }

    /**
     * Sets the value of the direccion3PersonaGrupoPGP property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setDireccion3PersonaGrupoPGP(String value) {
        this.direccion3PersonaGrupoPGP = value;
    }

    /**
     * Gets the value of the telefono3PersonaGrupoPGP property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTelefono3PersonaGrupoPGP() {
        return telefono3PersonaGrupoPGP;
    }

    /**
     * Sets the value of the telefono3PersonaGrupoPGP property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setTelefono3PersonaGrupoPGP(String value) {
        this.telefono3PersonaGrupoPGP = value;
    }

    /**
     * Gets the value of the fax3PersonaGrupoPGP property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getFax3PersonaGrupoPGP() {
        return fax3PersonaGrupoPGP;
    }

    /**
     * Sets the value of the fax3PersonaGrupoPGP property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setFax3PersonaGrupoPGP(String value) {
        this.fax3PersonaGrupoPGP = value;
    }

    /**
     * Gets the value of the fkIdPaisExpedicionNat property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getFkIdPaisExpedicionNat() {
        return fkIdPaisExpedicionNat;
    }

    /**
     * Sets the value of the fkIdPaisExpedicionNat property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setFkIdPaisExpedicionNat(String value) {
        this.fkIdPaisExpedicionNat = value;
    }

    /**
     * Gets the value of the fkIdDepartamentoExpedicionNat property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getFkIdDepartamentoExpedicionNat() {
        return fkIdDepartamentoExpedicionNat;
    }

    /**
     * Sets the value of the fkIdDepartamentoExpedicionNat property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setFkIdDepartamentoExpedicionNat(String value) {
        this.fkIdDepartamentoExpedicionNat = value;
    }

    /**
     * Gets the value of the fkIdCiudadExpedicionNat property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getFkIdCiudadExpedicionNat() {
        return fkIdCiudadExpedicionNat;
    }

    /**
     * Sets the value of the fkIdCiudadExpedicionNat property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setFkIdCiudadExpedicionNat(String value) {
        this.fkIdCiudadExpedicionNat = value;
    }

    /**
     * Gets the value of the fkIdPaisDomicilioNat property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getFkIdPaisDomicilioNat() {
        return fkIdPaisDomicilioNat;
    }

    /**
     * Sets the value of the fkIdPaisDomicilioNat property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setFkIdPaisDomicilioNat(String value) {
        this.fkIdPaisDomicilioNat = value;
    }

    /**
     * Gets the value of the fkIdDepartamentoDomicilioNat property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getFkIdDepartamentoDomicilioNat() {
        return fkIdDepartamentoDomicilioNat;
    }

    /**
     * Sets the value of the fkIdDepartamentoDomicilioNat property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setFkIdDepartamentoDomicilioNat(String value) {
        this.fkIdDepartamentoDomicilioNat = value;
    }

    /**
     * Gets the value of the fkIdCiudadDomicilioNat property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getFkIdCiudadDomicilioNat() {
        return fkIdCiudadDomicilioNat;
    }

    /**
     * Sets the value of the fkIdCiudadDomicilioNat property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setFkIdCiudadDomicilioNat(String value) {
        this.fkIdCiudadDomicilioNat = value;
    }

    /**
     * Gets the value of the fechaExpedicionNat property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFechaExpedicionNat() {
        return fechaExpedicionNat;
    }

    /**
     * Sets the value of the fechaExpedicionNat property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setFechaExpedicionNat(XMLGregorianCalendar value) {
        this.fechaExpedicionNat = value;
    }

    /**
     * Gets the value of the fechaNacimientoNat property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFechaNacimientoNat() {
        return fechaNacimientoNat;
    }

    /**
     * Sets the value of the fechaNacimientoNat property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setFechaNacimientoNat(XMLGregorianCalendar value) {
        this.fechaNacimientoNat = value;
    }

    /**
     * Gets the value of the primerApellidoNat property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getPrimerApellidoNat() {
        return primerApellidoNat;
    }

    /**
     * Sets the value of the primerApellidoNat property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setPrimerApellidoNat(String value) {
        this.primerApellidoNat = value;
    }

    /**
     * Gets the value of the segundoApellidoNat property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getSegundoApellidoNat() {
        return segundoApellidoNat;
    }

    /**
     * Sets the value of the segundoApellidoNat property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setSegundoApellidoNat(String value) {
        this.segundoApellidoNat = value;
    }

    /**
     * Gets the value of the nombresNatNat property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getNombresNatNat() {
        return nombresNatNat;
    }

    /**
     * Sets the value of the nombresNatNat property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setNombresNatNat(String value) {
        this.nombresNatNat = value;
    }

    /**
     * Gets the value of the fkIdPaisNacionalidadNat property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getFkIdPaisNacionalidadNat() {
        return fkIdPaisNacionalidadNat;
    }

    /**
     * Sets the value of the fkIdPaisNacionalidadNat property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setFkIdPaisNacionalidadNat(String value) {
        this.fkIdPaisNacionalidadNat = value;
    }

    /**
     * Gets the value of the fkIdPaisJur property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getFkIdPaisJur() {
        return fkIdPaisJur;
    }

    /**
     * Sets the value of the fkIdPaisJur property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setFkIdPaisJur(String value) {
        this.fkIdPaisJur = value;
    }

    /**
     * Gets the value of the fkIdDepartamentoJur property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getFkIdDepartamentoJur() {
        return fkIdDepartamentoJur;
    }

    /**
     * Sets the value of the fkIdDepartamentoJur property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setFkIdDepartamentoJur(String value) {
        this.fkIdDepartamentoJur = value;
    }

    /**
     * Gets the value of the fkIdCiudadJur property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getFkIdCiudadJur() {
        return fkIdCiudadJur;
    }

    /**
     * Sets the value of the fkIdCiudadJur property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setFkIdCiudadJur(String value) {
        this.fkIdCiudadJur = value;
    }

    /**
     * Gets the value of the fkIdPaisCamaraJur property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getFkIdPaisCamaraJur() {
        return fkIdPaisCamaraJur;
    }

    /**
     * Sets the value of the fkIdPaisCamaraJur property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setFkIdPaisCamaraJur(String value) {
        this.fkIdPaisCamaraJur = value;
    }

    /**
     * Gets the value of the fkIdDepartamentoCamaraJur property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getFkIdDepartamentoCamaraJur() {
        return fkIdDepartamentoCamaraJur;
    }

    /**
     * Sets the value of the fkIdDepartamentoCamaraJur property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setFkIdDepartamentoCamaraJur(String value) {
        this.fkIdDepartamentoCamaraJur = value;
    }

    /**
     * Gets the value of the fkIdCiudadCamaraJur property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getFkIdCiudadCamaraJur() {
        return fkIdCiudadCamaraJur;
    }

    /**
     * Sets the value of the fkIdCiudadCamaraJur property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setFkIdCiudadCamaraJur(String value) {
        this.fkIdCiudadCamaraJur = value;
    }

    /**
     * Gets the value of the fechaConstitucionJur property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFechaConstitucionJur() {
        return fechaConstitucionJur;
    }

    /**
     * Sets the value of the fechaConstitucionJur property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setFechaConstitucionJur(XMLGregorianCalendar value) {
        this.fechaConstitucionJur = value;
    }

    /**
     * Gets the value of the fechaEscrituraJur property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFechaEscrituraJur() {
        return fechaEscrituraJur;
    }

    /**
     * Sets the value of the fechaEscrituraJur property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setFechaEscrituraJur(XMLGregorianCalendar value) {
        this.fechaEscrituraJur = value;
    }

    /**
     * Gets the value of the fechaCamaraJur property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFechaCamaraJur() {
        return fechaCamaraJur;
    }

    /**
     * Sets the value of the fechaCamaraJur property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setFechaCamaraJur(XMLGregorianCalendar value) {
        this.fechaCamaraJur = value;
    }

    /**
     * Gets the value of the razonSocialJur property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getRazonSocialJur() {
        return razonSocialJur;
    }

    /**
     * Sets the value of the razonSocialJur property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setRazonSocialJur(String value) {
        this.razonSocialJur = value;
    }

    /**
     * Gets the value of the agenteAutoretenedorJur property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getAgenteAutoretenedorJur() {
        return agenteAutoretenedorJur;
    }

    /**
     * Sets the value of the agenteAutoretenedorJur property.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setAgenteAutoretenedorJur(Integer value) {
        this.agenteAutoretenedorJur = value;
    }

    /**
     * Gets the value of the declaranteJur property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getDeclaranteJur() {
        return declaranteJur;
    }

    /**
     * Sets the value of the declaranteJur property.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setDeclaranteJur(Integer value) {
        this.declaranteJur = value;
    }

    /**
     * Gets the value of the residenteJur property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getResidenteJur() {
        return residenteJur;
    }

    /**
     * Sets the value of the residenteJur property.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setResidenteJur(Integer value) {
        this.residenteJur = value;
    }

    /**
     * Gets the value of the escrituraNoJur property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getEscrituraNoJur() {
        return escrituraNoJur;
    }

    /**
     * Sets the value of the escrituraNoJur property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setEscrituraNoJur(String value) {
        this.escrituraNoJur = value;
    }

    /**
     * Gets the value of the notariaNoJur property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getNotariaNoJur() {
        return notariaNoJur;
    }

    /**
     * Sets the value of the notariaNoJur property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setNotariaNoJur(String value) {
        this.notariaNoJur = value;
    }

    /**
     * Gets the value of the circuloNoJur property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCirculoNoJur() {
        return circuloNoJur;
    }

    /**
     * Sets the value of the circuloNoJur property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCirculoNoJur(String value) {
        this.circuloNoJur = value;
    }

    /**
     * Gets the value of the camaraComercioNoJur property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCamaraComercioNoJur() {
        return camaraComercioNoJur;
    }

    /**
     * Sets the value of the camaraComercioNoJur property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCamaraComercioNoJur(String value) {
        this.camaraComercioNoJur = value;
    }

    /**
     * Gets the value of the libroNoJur property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getLibroNoJur() {
        return libroNoJur;
    }

    /**
     * Sets the value of the libroNoJur property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setLibroNoJur(String value) {
        this.libroNoJur = value;
    }

    /**
     * Gets the value of the regitroSuperJur property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getRegitroSuperJur() {
        return regitroSuperJur;
    }

    /**
     * Sets the value of the regitroSuperJur property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setRegitroSuperJur(String value) {
        this.regitroSuperJur = value;
    }

    /**
     * Gets the value of the listaRepresentantesLegales property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the listaRepresentantesLegales property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaRepresentantesLegales().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RepresentanteLegalServiceDTO }
     *
     *
     */
    public List<RepresentanteLegalServiceDTO> getListaRepresentantesLegales() {
        if (listaRepresentantesLegales == null) {
            listaRepresentantesLegales = new ArrayList<RepresentanteLegalServiceDTO>();
        }
        return this.listaRepresentantesLegales;
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
     * Gets the value of the cuentaGirador property.
     *
     */
    public long getCuentaGirador() {
        return cuentaGirador;
    }

    /**
     * Sets the value of the cuentaGirador property.
     *
     */
    public void setCuentaGirador(long value) {
        this.cuentaGirador = value;
    }

    /**
     * Gets the value of the salario property.
     *
     * @return possible object is {@link Double }
     *
     */
    public Double getSalario() {
        return salario;
    }

    /**
     * Sets the value of the salario property.
     *
     * @param value allowed object is {@link Double }
     *
     */
    public void setSalario(Double value) {
        this.salario = value;
    }

    /**
     * Gets the value of the tiempoServicio property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTiempoServicio() {
        return tiempoServicio;
    }

    /**
     * Sets the value of the tiempoServicio property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setTiempoServicio(String value) {
        this.tiempoServicio = value;
    }

    /**
     * Gets the value of the estadoCivil property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * Sets the value of the estadoCivil property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setEstadoCivil(String value) {
        this.estadoCivil = value;
    }

    /**
     * Gets the value of the pensionado property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isPensionado() {
        return pensionado;
    }

    /**
     * Sets the value of the pensionado property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setPensionado(Boolean value) {
        this.pensionado = value;
    }

    /**
     * Gets the value of the numeroCelular property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getNumeroCelular() {
        return numeroCelular;
    }

    /**
     * Sets the value of the numeroCelular property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setNumeroCelular(String value) {
        this.numeroCelular = value;
    }
}
