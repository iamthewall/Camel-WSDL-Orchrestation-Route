package co.com.deceval.sdl.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>Java class for DocumentoPagareServiceDTO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 *
 * <pre>
 * &lt;complexType name="DocumentoPagareServiceDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NitEmisor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IdClaseDefinicionDocumento" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="FechaGrabacionPagare" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TipoPagare" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumPagareEntidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumCredito" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumReferencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FechaDesembolso" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OtorganteTipoId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OtorganteNumId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OtorganteCuenta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ApoderadoTipoId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ApoderadoNumId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ApoderadoCuenta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ListaCodeudoresAvalistasPagare" type="{java:com.deceval.sdl.services.dto}ConsultaGiradorServiceDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CreditoReembolsableEn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumUnidadesUVR" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ValorPesosDesembolso" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ValorPesosDiligenciamiento" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TasaInteresRenumEA" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="BaseLiquidacionTasa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TasaInteres" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Modalidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DtfDessembolso" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Spreed" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TasaRedescuento" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DtfEA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BaseLiquidacionPlazo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PlazoCreditoDe" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PlazoCreditoHasta" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PeriodoGracia" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PeriodoGraciaDe" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PeriodoGraciaHasta" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PeriodoMuerto" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PeriodoMuertoDe" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PeriodoMuertoHasta" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ModalidadPagosInteres" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FechaPagoPrimerCuota" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ModalidadPagoCapital" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FechaPagoPrimerCuotaCapital" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OtraModalidadPago" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumCuotas" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FechaPagoPrimerCuotaInteres" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ValorCuotaPesos" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ValorCuotaUVR" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="PorcentAmortizacionMensual" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="FechaPagoPrimerCuotaMensual" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PorcentAmortizacionSemestral" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="FechaPagoPrimerCuotaSemestral" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CiudadDesembolso" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Departamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Pais" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CodOficina" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Regional" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AutorizaDebitoAutomatico" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Cuenta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AdquisicionVivienda" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ConstruccionViviendaIndividual" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="MejoramientoViviendaInterSoci" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="OtroDestino" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DestinoOperacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Vis" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="NoVis" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ListaAmortizaciones" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CiConCuotasExtras" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CiValorCuotaExtra" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="CiNumCuotasExtras" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CiCEPagaderaCada" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CiCEApartirDelMes" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="IdDocumentoPagare" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="MensajeRespuesta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ListaApoderadoRepresentantePagare" type="{java:com.deceval.sdl.services.dto}ConsultaGiradorServiceDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EmpresaOtorgante" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CiudadCreacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DeptoCreacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaisCreacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ValorPesosDesembolsoLetras" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ValorPesosActual" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ValorCapitalNumero" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ValorCapitalLetras" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MargenRedescuento" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="PuntosPorcentualesRedescuento" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ValorDesembolsoUVRLetras" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TasaInteresRenumEALetras" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TasaInteresMora" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="FechaVencimientoFinanciero" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="PlazoNumero" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="PlazoLetras" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PeriodicidadPlazo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PeriodoGraciaNumero" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="PeriodoGraciaLetras" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PeriodicidadGracia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PeriodoMuertoNumero" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="PeriodoMuertoLetras" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PeriodicidadMuerto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumCuotasLetras" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ValorCuotaPesosLetras" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ValorCuotaUVRLetras" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ValorInteresesNumero" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ValorInteresesLetras" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PorcentajeComision" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="PorcentajeCobertura" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="GarantiaAdicional" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DiaPago" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CiConPeriodoGracia" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="TasaNominal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TasaNominalLetras" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TasaInteresMoraLetras" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TextoAdicional" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ArchivosAdjuntos" type="{java:com.deceval.sdl.services.dto}ArchivoAdjuntoDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SeguroVida" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Aval" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentoPagareServiceDTO", propOrder = {
    "nitEmisor",
    "idClaseDefinicionDocumento",
    "fechaGrabacionPagare",
    "tipoPagare",
    "numPagareEntidad",
    "numCredito",
    "numReferencia",
    "fechaDesembolso",
    "otorganteTipoId",
    "otorganteNumId",
    "otorganteCuenta",
    "apoderadoTipoId",
    "apoderadoNumId",
    "apoderadoCuenta",
    "listaCodeudoresAvalistasPagare",
    "creditoReembolsableEn",
    "numUnidadesUVR",
    "valorPesosDesembolso",
    "valorPesosDiligenciamiento",
    "tasaInteresRenumEA",
    "baseLiquidacionTasa",
    "tasaInteres",
    "modalidad",
    "dtfDessembolso",
    "spreed",
    "tasaRedescuento",
    "dtfEA",
    "baseLiquidacionPlazo",
    "plazoCreditoDe",
    "plazoCreditoHasta",
    "periodoGracia",
    "periodoGraciaDe",
    "periodoGraciaHasta",
    "periodoMuerto",
    "periodoMuertoDe",
    "periodoMuertoHasta",
    "modalidadPagosInteres",
    "fechaPagoPrimerCuota",
    "modalidadPagoCapital",
    "fechaPagoPrimerCuotaCapital",
    "otraModalidadPago",
    "numCuotas",
    "fechaPagoPrimerCuotaInteres",
    "valorCuotaPesos",
    "valorCuotaUVR",
    "porcentAmortizacionMensual",
    "fechaPagoPrimerCuotaMensual",
    "porcentAmortizacionSemestral",
    "fechaPagoPrimerCuotaSemestral",
    "ciudadDesembolso",
    "departamento",
    "pais",
    "codOficina",
    "regional",
    "autorizaDebitoAutomatico",
    "cuenta",
    "adquisicionVivienda",
    "construccionViviendaIndividual",
    "mejoramientoViviendaInterSoci",
    "otroDestino",
    "destinoOperacion",
    "vis",
    "noVis",
    "listaAmortizaciones",
    "ciConCuotasExtras",
    "ciValorCuotaExtra",
    "ciNumCuotasExtras",
    "ciCEPagaderaCada",
    "ciCEApartirDelMes",
    "idDocumentoPagare",
    "mensajeRespuesta",
    "listaApoderadoRepresentantePagare",
    "empresaOtorgante",
    "ciudadCreacion",
    "deptoCreacion",
    "paisCreacion",
    "valorPesosDesembolsoLetras",
    "valorPesosActual",
    "valorCapitalNumero",
    "valorCapitalLetras",
    "margenRedescuento",
    "puntosPorcentualesRedescuento",
    "valorDesembolsoUVRLetras",
    "tasaInteresRenumEALetras",
    "tasaInteresMora",
    "fechaVencimientoFinanciero",
    "plazoNumero",
    "plazoLetras",
    "periodicidadPlazo",
    "periodoGraciaNumero",
    "periodoGraciaLetras",
    "periodicidadGracia",
    "periodoMuertoNumero",
    "periodoMuertoLetras",
    "periodicidadMuerto",
    "numCuotasLetras",
    "valorCuotaPesosLetras",
    "valorCuotaUVRLetras",
    "valorInteresesNumero",
    "valorInteresesLetras",
    "porcentajeComision",
    "porcentajeCobertura",
    "garantiaAdicional",
    "diaPago",
    "ciConPeriodoGracia",
    "tasaNominal",
    "tasaNominalLetras",
    "tasaInteresMoraLetras",
    "textoAdicional",
    "archivosAdjuntos",
    "seguroVida",
    "aval"
})
public class DocumentoPagareServiceDTO {

    @XmlElement(name = "NitEmisor", required = true, nillable = true)
    protected String nitEmisor;
    @XmlElement(name = "IdClaseDefinicionDocumento", required = true, type = Long.class, nillable = true)
    protected Long idClaseDefinicionDocumento;
    @XmlElement(name = "FechaGrabacionPagare", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaGrabacionPagare;
    @XmlElement(name = "TipoPagare", required = true, type = Integer.class, nillable = true)
    protected Integer tipoPagare;
    @XmlElement(name = "NumPagareEntidad", required = true, nillable = true)
    protected String numPagareEntidad;
    @XmlElement(name = "NumCredito", required = true, nillable = true)
    protected String numCredito;
    @XmlElement(name = "NumReferencia", required = true, nillable = true)
    protected String numReferencia;
    @XmlElement(name = "FechaDesembolso", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaDesembolso;
    @XmlElement(name = "OtorganteTipoId", required = true, type = Integer.class, nillable = true)
    protected Integer otorganteTipoId;
    @XmlElement(name = "OtorganteNumId", required = true, nillable = true)
    protected String otorganteNumId;
    @XmlElement(name = "OtorganteCuenta", required = true, type = Integer.class, nillable = true)
    protected Integer otorganteCuenta;
    @XmlElement(name = "ApoderadoTipoId", required = true, type = Integer.class, nillable = true)
    protected Integer apoderadoTipoId;
    @XmlElement(name = "ApoderadoNumId", required = true, nillable = true)
    protected String apoderadoNumId;
    @XmlElement(name = "ApoderadoCuenta", required = true, type = Integer.class, nillable = true)
    protected Integer apoderadoCuenta;
    @XmlElement(name = "ListaCodeudoresAvalistasPagare", nillable = true)
    protected List<ConsultaGiradorServiceDTO> listaCodeudoresAvalistasPagare;
    @XmlElement(name = "CreditoReembolsableEn", required = true, nillable = true)
    protected String creditoReembolsableEn;
    @XmlElement(name = "NumUnidadesUVR", required = true, nillable = true)
    protected BigDecimal numUnidadesUVR;
    @XmlElement(name = "ValorPesosDesembolso", required = true, nillable = true)
    protected BigDecimal valorPesosDesembolso;
    @XmlElement(name = "ValorPesosDiligenciamiento", required = true, nillable = true)
    protected BigDecimal valorPesosDiligenciamiento;
    @XmlElement(name = "TasaInteresRenumEA", required = true, nillable = true)
    protected BigDecimal tasaInteresRenumEA;
    @XmlElement(name = "BaseLiquidacionTasa", required = true, nillable = true)
    protected String baseLiquidacionTasa;
    @XmlElement(name = "TasaInteres", required = true, nillable = true)
    protected String tasaInteres;
    @XmlElement(name = "Modalidad", required = true, nillable = true)
    protected String modalidad;
    @XmlElement(name = "DtfDessembolso", required = true, nillable = true)
    protected BigDecimal dtfDessembolso;
    @XmlElement(name = "Spreed", required = true, nillable = true)
    protected BigDecimal spreed;
    @XmlElement(name = "TasaRedescuento", required = true, nillable = true)
    protected BigDecimal tasaRedescuento;
    @XmlElement(name = "DtfEA", required = true, nillable = true)
    protected String dtfEA;
    @XmlElement(name = "BaseLiquidacionPlazo", required = true, nillable = true)
    protected String baseLiquidacionPlazo;
    @XmlElement(name = "PlazoCreditoDe", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar plazoCreditoDe;
    @XmlElement(name = "PlazoCreditoHasta", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar plazoCreditoHasta;
    @XmlElement(name = "PeriodoGracia", required = true, type = Boolean.class, nillable = true)
    protected Boolean periodoGracia;
    @XmlElement(name = "PeriodoGraciaDe", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar periodoGraciaDe;
    @XmlElement(name = "PeriodoGraciaHasta", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar periodoGraciaHasta;
    @XmlElement(name = "PeriodoMuerto", required = true, type = Boolean.class, nillable = true)
    protected Boolean periodoMuerto;
    @XmlElement(name = "PeriodoMuertoDe", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar periodoMuertoDe;
    @XmlElement(name = "PeriodoMuertoHasta", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar periodoMuertoHasta;
    @XmlElement(name = "ModalidadPagosInteres", required = true, nillable = true)
    protected String modalidadPagosInteres;
    @XmlElement(name = "FechaPagoPrimerCuota", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaPagoPrimerCuota;
    @XmlElement(name = "ModalidadPagoCapital", required = true, nillable = true)
    protected String modalidadPagoCapital;
    @XmlElement(name = "FechaPagoPrimerCuotaCapital", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaPagoPrimerCuotaCapital;
    @XmlElement(name = "OtraModalidadPago", required = true, nillable = true)
    protected String otraModalidadPago;
    @XmlElement(name = "NumCuotas", required = true, type = Integer.class, nillable = true)
    protected Integer numCuotas;
    @XmlElement(name = "FechaPagoPrimerCuotaInteres", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaPagoPrimerCuotaInteres;
    @XmlElement(name = "ValorCuotaPesos", required = true, nillable = true)
    protected BigDecimal valorCuotaPesos;
    @XmlElement(name = "ValorCuotaUVR", required = true, nillable = true)
    protected BigDecimal valorCuotaUVR;
    @XmlElement(name = "PorcentAmortizacionMensual", required = true, nillable = true)
    protected BigDecimal porcentAmortizacionMensual;
    @XmlElement(name = "FechaPagoPrimerCuotaMensual", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaPagoPrimerCuotaMensual;
    @XmlElement(name = "PorcentAmortizacionSemestral", required = true, nillable = true)
    protected BigDecimal porcentAmortizacionSemestral;
    @XmlElement(name = "FechaPagoPrimerCuotaSemestral", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaPagoPrimerCuotaSemestral;
    @XmlElement(name = "CiudadDesembolso", required = true, nillable = true)
    protected String ciudadDesembolso;
    @XmlElement(name = "Departamento", required = true, nillable = true)
    protected String departamento;
    @XmlElement(name = "Pais", required = true, nillable = true)
    protected String pais;
    @XmlElement(name = "CodOficina", required = true, nillable = true)
    protected String codOficina;
    @XmlElement(name = "Regional", required = true, nillable = true)
    protected String regional;
    @XmlElement(name = "AutorizaDebitoAutomatico", required = true, type = Boolean.class, nillable = true)
    protected Boolean autorizaDebitoAutomatico;
    @XmlElement(name = "Cuenta", required = true, nillable = true)
    protected String cuenta;
    @XmlElement(name = "AdquisicionVivienda", required = true, type = Boolean.class, nillable = true)
    protected Boolean adquisicionVivienda;
    @XmlElement(name = "ConstruccionViviendaIndividual", required = true, type = Boolean.class, nillable = true)
    protected Boolean construccionViviendaIndividual;
    @XmlElement(name = "MejoramientoViviendaInterSoci", required = true, type = Boolean.class, nillable = true)
    protected Boolean mejoramientoViviendaInterSoci;
    @XmlElement(name = "OtroDestino", required = true, type = Boolean.class, nillable = true)
    protected Boolean otroDestino;
    @XmlElement(name = "DestinoOperacion", required = true, nillable = true)
    protected String destinoOperacion;
    @XmlElement(name = "Vis", required = true, type = Boolean.class, nillable = true)
    protected Boolean vis;
    @XmlElement(name = "NoVis", required = true, type = Boolean.class, nillable = true)
    protected Boolean noVis;
    @XmlElement(name = "ListaAmortizaciones", required = true, nillable = true)
    protected String listaAmortizaciones;
    @XmlElement(name = "CiConCuotasExtras", required = true, type = Boolean.class, nillable = true)
    protected Boolean ciConCuotasExtras;
    @XmlElement(name = "CiValorCuotaExtra", required = true, nillable = true)
    protected BigDecimal ciValorCuotaExtra;
    @XmlElement(name = "CiNumCuotasExtras", required = true, type = Integer.class, nillable = true)
    protected Integer ciNumCuotasExtras;
    @XmlElement(name = "CiCEPagaderaCada", required = true, type = Integer.class, nillable = true)
    protected Integer ciCEPagaderaCada;
    @XmlElement(name = "CiCEApartirDelMes", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ciCEApartirDelMes;
    @XmlElement(name = "IdDocumentoPagare", required = true, type = Long.class, nillable = true)
    protected Long idDocumentoPagare;
    @XmlElement(name = "MensajeRespuesta", required = true, nillable = true)
    protected String mensajeRespuesta;
    @XmlElement(name = "ListaApoderadoRepresentantePagare", nillable = true)
    protected List<ConsultaGiradorServiceDTO> listaApoderadoRepresentantePagare;
    @XmlElement(name = "EmpresaOtorgante", required = true, nillable = true)
    protected String empresaOtorgante;
    @XmlElement(name = "CiudadCreacion", required = true, nillable = true)
    protected String ciudadCreacion;
    @XmlElement(name = "DeptoCreacion", required = true, nillable = true)
    protected String deptoCreacion;
    @XmlElement(name = "PaisCreacion", required = true, nillable = true)
    protected String paisCreacion;
    @XmlElement(name = "ValorPesosDesembolsoLetras", required = true, nillable = true)
    protected String valorPesosDesembolsoLetras;
    @XmlElement(name = "ValorPesosActual", required = true, nillable = true)
    protected BigDecimal valorPesosActual;
    @XmlElement(name = "ValorCapitalNumero", required = true, nillable = true)
    protected BigDecimal valorCapitalNumero;
    @XmlElement(name = "ValorCapitalLetras", required = true, nillable = true)
    protected String valorCapitalLetras;
    @XmlElement(name = "MargenRedescuento", required = true, nillable = true)
    protected BigDecimal margenRedescuento;
    @XmlElement(name = "PuntosPorcentualesRedescuento", required = true, nillable = true)
    protected BigDecimal puntosPorcentualesRedescuento;
    @XmlElement(name = "ValorDesembolsoUVRLetras", required = true, nillable = true)
    protected String valorDesembolsoUVRLetras;
    @XmlElement(name = "TasaInteresRenumEALetras", required = true, nillable = true)
    protected String tasaInteresRenumEALetras;
    @XmlElement(name = "TasaInteresMora", required = true, nillable = true)
    protected BigDecimal tasaInteresMora;
    @XmlElement(name = "FechaVencimientoFinanciero", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaVencimientoFinanciero;
    @XmlElement(name = "PlazoNumero", required = true, nillable = true)
    protected BigDecimal plazoNumero;
    @XmlElement(name = "PlazoLetras", required = true, nillable = true)
    protected String plazoLetras;
    @XmlElement(name = "PeriodicidadPlazo", required = true, nillable = true)
    protected String periodicidadPlazo;
    @XmlElement(name = "PeriodoGraciaNumero", required = true, nillable = true)
    protected BigDecimal periodoGraciaNumero;
    @XmlElement(name = "PeriodoGraciaLetras", required = true, nillable = true)
    protected String periodoGraciaLetras;
    @XmlElement(name = "PeriodicidadGracia", required = true, nillable = true)
    protected String periodicidadGracia;
    @XmlElement(name = "PeriodoMuertoNumero", required = true, nillable = true)
    protected BigDecimal periodoMuertoNumero;
    @XmlElement(name = "PeriodoMuertoLetras", required = true, nillable = true)
    protected String periodoMuertoLetras;
    @XmlElement(name = "PeriodicidadMuerto", required = true, nillable = true)
    protected String periodicidadMuerto;
    @XmlElement(name = "NumCuotasLetras", required = true, nillable = true)
    protected String numCuotasLetras;
    @XmlElement(name = "ValorCuotaPesosLetras", required = true, nillable = true)
    protected String valorCuotaPesosLetras;
    @XmlElement(name = "ValorCuotaUVRLetras", required = true, nillable = true)
    protected String valorCuotaUVRLetras;
    @XmlElement(name = "ValorInteresesNumero", required = true, nillable = true)
    protected BigDecimal valorInteresesNumero;
    @XmlElement(name = "ValorInteresesLetras", required = true, nillable = true)
    protected String valorInteresesLetras;
    @XmlElement(name = "PorcentajeComision", required = true, nillable = true)
    protected BigDecimal porcentajeComision;
    @XmlElement(name = "PorcentajeCobertura", required = true, nillable = true)
    protected BigDecimal porcentajeCobertura;
    @XmlElement(name = "GarantiaAdicional", required = true, nillable = true)
    protected String garantiaAdicional;
    @XmlElement(name = "DiaPago", required = true, type = Integer.class, nillable = true)
    protected Integer diaPago;
    @XmlElement(name = "CiConPeriodoGracia", required = true, type = Boolean.class, nillable = true)
    protected Boolean ciConPeriodoGracia;
    @XmlElement(name = "TasaNominal", required = true, nillable = true)
    protected BigDecimal tasaNominal;
    @XmlElement(name = "TasaNominalLetras", required = true, nillable = true)
    protected String tasaNominalLetras;
    @XmlElement(name = "TasaInteresMoraLetras", required = true, nillable = true)
    protected String tasaInteresMoraLetras;
    @XmlElement(name = "TextoAdicional", required = true, nillable = true)
    protected String textoAdicional;
    @XmlElement(name = "ArchivosAdjuntos", nillable = true)
    protected List<ArchivoAdjuntoDTO> archivosAdjuntos;
    @XmlElement(name = "SeguroVida", required = true, nillable = true)
    protected BigDecimal seguroVida;
    @XmlElement(name = "Aval", required = true, nillable = true)
    protected BigDecimal aval;

    /**
     * Gets the value of the nitEmisor property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getNitEmisor() {
        return nitEmisor;
    }

    /**
     * Sets the value of the nitEmisor property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setNitEmisor(String value) {
        this.nitEmisor = value;
    }

    /**
     * Gets the value of the idClaseDefinicionDocumento property.
     *
     * @return possible object is {@link Long }
     *
     */
    public Long getIdClaseDefinicionDocumento() {
        return idClaseDefinicionDocumento;
    }

    /**
     * Sets the value of the idClaseDefinicionDocumento property.
     *
     * @param value allowed object is {@link Long }
     *
     */
    public void setIdClaseDefinicionDocumento(Long value) {
        this.idClaseDefinicionDocumento = value;
    }

    /**
     * Gets the value of the fechaGrabacionPagare property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFechaGrabacionPagare() {
        return fechaGrabacionPagare;
    }

    /**
     * Sets the value of the fechaGrabacionPagare property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setFechaGrabacionPagare(XMLGregorianCalendar value) {
        this.fechaGrabacionPagare = value;
    }

    /**
     * Gets the value of the tipoPagare property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getTipoPagare() {
        return tipoPagare;
    }

    /**
     * Sets the value of the tipoPagare property.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setTipoPagare(Integer value) {
        this.tipoPagare = value;
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
     * Gets the value of the numCredito property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getNumCredito() {
        return numCredito;
    }

    /**
     * Sets the value of the numCredito property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setNumCredito(String value) {
        this.numCredito = value;
    }

    /**
     * Gets the value of the numReferencia property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getNumReferencia() {
        return numReferencia;
    }

    /**
     * Sets the value of the numReferencia property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setNumReferencia(String value) {
        this.numReferencia = value;
    }

    /**
     * Gets the value of the fechaDesembolso property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFechaDesembolso() {
        return fechaDesembolso;
    }

    /**
     * Sets the value of the fechaDesembolso property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setFechaDesembolso(XMLGregorianCalendar value) {
        this.fechaDesembolso = value;
    }

    /**
     * Gets the value of the otorganteTipoId property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getOtorganteTipoId() {
        return otorganteTipoId;
    }

    /**
     * Sets the value of the otorganteTipoId property.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setOtorganteTipoId(Integer value) {
        this.otorganteTipoId = value;
    }

    /**
     * Gets the value of the otorganteNumId property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getOtorganteNumId() {
        return otorganteNumId;
    }

    /**
     * Sets the value of the otorganteNumId property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setOtorganteNumId(String value) {
        this.otorganteNumId = value;
    }

    /**
     * Gets the value of the otorganteCuenta property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getOtorganteCuenta() {
        return otorganteCuenta;
    }

    /**
     * Sets the value of the otorganteCuenta property.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setOtorganteCuenta(Integer value) {
        this.otorganteCuenta = value;
    }

    /**
     * Gets the value of the apoderadoTipoId property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getApoderadoTipoId() {
        return apoderadoTipoId;
    }

    /**
     * Sets the value of the apoderadoTipoId property.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setApoderadoTipoId(Integer value) {
        this.apoderadoTipoId = value;
    }

    /**
     * Gets the value of the apoderadoNumId property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getApoderadoNumId() {
        return apoderadoNumId;
    }

    /**
     * Sets the value of the apoderadoNumId property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setApoderadoNumId(String value) {
        this.apoderadoNumId = value;
    }

    /**
     * Gets the value of the apoderadoCuenta property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getApoderadoCuenta() {
        return apoderadoCuenta;
    }

    /**
     * Sets the value of the apoderadoCuenta property.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setApoderadoCuenta(Integer value) {
        this.apoderadoCuenta = value;
    }

    /**
     * Gets the value of the listaCodeudoresAvalistasPagare property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the listaCodeudoresAvalistasPagare property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaCodeudoresAvalistasPagare().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsultaGiradorServiceDTO }
     *
     *
     */
    public List<ConsultaGiradorServiceDTO> getListaCodeudoresAvalistasPagare() {
        if (listaCodeudoresAvalistasPagare == null) {
            listaCodeudoresAvalistasPagare = new ArrayList<ConsultaGiradorServiceDTO>();
        }
        return this.listaCodeudoresAvalistasPagare;
    }

    /**
     * Gets the value of the creditoReembolsableEn property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCreditoReembolsableEn() {
        return creditoReembolsableEn;
    }

    /**
     * Sets the value of the creditoReembolsableEn property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCreditoReembolsableEn(String value) {
        this.creditoReembolsableEn = value;
    }

    /**
     * Gets the value of the numUnidadesUVR property.
     *
     * @return possible object is {@link BigDecimal }
     *
     */
    public BigDecimal getNumUnidadesUVR() {
        return numUnidadesUVR;
    }

    /**
     * Sets the value of the numUnidadesUVR property.
     *
     * @param value allowed object is {@link BigDecimal }
     *
     */
    public void setNumUnidadesUVR(BigDecimal value) {
        this.numUnidadesUVR = value;
    }

    /**
     * Gets the value of the valorPesosDesembolso property.
     *
     * @return possible object is {@link BigDecimal }
     *
     */
    public BigDecimal getValorPesosDesembolso() {
        return valorPesosDesembolso;
    }

    /**
     * Sets the value of the valorPesosDesembolso property.
     *
     * @param value allowed object is {@link BigDecimal }
     *
     */
    public void setValorPesosDesembolso(BigDecimal value) {
        this.valorPesosDesembolso = value;
    }

    /**
     * Gets the value of the valorPesosDiligenciamiento property.
     *
     * @return possible object is {@link BigDecimal }
     *
     */
    public BigDecimal getValorPesosDiligenciamiento() {
        return valorPesosDiligenciamiento;
    }

    /**
     * Sets the value of the valorPesosDiligenciamiento property.
     *
     * @param value allowed object is {@link BigDecimal }
     *
     */
    public void setValorPesosDiligenciamiento(BigDecimal value) {
        this.valorPesosDiligenciamiento = value;
    }

    /**
     * Gets the value of the tasaInteresRenumEA property.
     *
     * @return possible object is {@link BigDecimal }
     *
     */
    public BigDecimal getTasaInteresRenumEA() {
        return tasaInteresRenumEA;
    }

    /**
     * Sets the value of the tasaInteresRenumEA property.
     *
     * @param value allowed object is {@link BigDecimal }
     *
     */
    public void setTasaInteresRenumEA(BigDecimal value) {
        this.tasaInteresRenumEA = value;
    }

    /**
     * Gets the value of the baseLiquidacionTasa property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getBaseLiquidacionTasa() {
        return baseLiquidacionTasa;
    }

    /**
     * Sets the value of the baseLiquidacionTasa property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setBaseLiquidacionTasa(String value) {
        this.baseLiquidacionTasa = value;
    }

    /**
     * Gets the value of the tasaInteres property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTasaInteres() {
        return tasaInteres;
    }

    /**
     * Sets the value of the tasaInteres property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setTasaInteres(String value) {
        this.tasaInteres = value;
    }

    /**
     * Gets the value of the modalidad property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getModalidad() {
        return modalidad;
    }

    /**
     * Sets the value of the modalidad property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setModalidad(String value) {
        this.modalidad = value;
    }

    /**
     * Gets the value of the dtfDessembolso property.
     *
     * @return possible object is {@link BigDecimal }
     *
     */
    public BigDecimal getDtfDessembolso() {
        return dtfDessembolso;
    }

    /**
     * Sets the value of the dtfDessembolso property.
     *
     * @param value allowed object is {@link BigDecimal }
     *
     */
    public void setDtfDessembolso(BigDecimal value) {
        this.dtfDessembolso = value;
    }

    /**
     * Gets the value of the spreed property.
     *
     * @return possible object is {@link BigDecimal }
     *
     */
    public BigDecimal getSpreed() {
        return spreed;
    }

    /**
     * Sets the value of the spreed property.
     *
     * @param value allowed object is {@link BigDecimal }
     *
     */
    public void setSpreed(BigDecimal value) {
        this.spreed = value;
    }

    /**
     * Gets the value of the tasaRedescuento property.
     *
     * @return possible object is {@link BigDecimal }
     *
     */
    public BigDecimal getTasaRedescuento() {
        return tasaRedescuento;
    }

    /**
     * Sets the value of the tasaRedescuento property.
     *
     * @param value allowed object is {@link BigDecimal }
     *
     */
    public void setTasaRedescuento(BigDecimal value) {
        this.tasaRedescuento = value;
    }

    /**
     * Gets the value of the dtfEA property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDtfEA() {
        return dtfEA;
    }

    /**
     * Sets the value of the dtfEA property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setDtfEA(String value) {
        this.dtfEA = value;
    }

    /**
     * Gets the value of the baseLiquidacionPlazo property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getBaseLiquidacionPlazo() {
        return baseLiquidacionPlazo;
    }

    /**
     * Sets the value of the baseLiquidacionPlazo property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setBaseLiquidacionPlazo(String value) {
        this.baseLiquidacionPlazo = value;
    }

    /**
     * Gets the value of the plazoCreditoDe property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getPlazoCreditoDe() {
        return plazoCreditoDe;
    }

    /**
     * Sets the value of the plazoCreditoDe property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setPlazoCreditoDe(XMLGregorianCalendar value) {
        this.plazoCreditoDe = value;
    }

    /**
     * Gets the value of the plazoCreditoHasta property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getPlazoCreditoHasta() {
        return plazoCreditoHasta;
    }

    /**
     * Sets the value of the plazoCreditoHasta property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setPlazoCreditoHasta(XMLGregorianCalendar value) {
        this.plazoCreditoHasta = value;
    }

    /**
     * Gets the value of the periodoGracia property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isPeriodoGracia() {
        return periodoGracia;
    }

    /**
     * Sets the value of the periodoGracia property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setPeriodoGracia(Boolean value) {
        this.periodoGracia = value;
    }

    /**
     * Gets the value of the periodoGraciaDe property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getPeriodoGraciaDe() {
        return periodoGraciaDe;
    }

    /**
     * Sets the value of the periodoGraciaDe property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setPeriodoGraciaDe(XMLGregorianCalendar value) {
        this.periodoGraciaDe = value;
    }

    /**
     * Gets the value of the periodoGraciaHasta property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getPeriodoGraciaHasta() {
        return periodoGraciaHasta;
    }

    /**
     * Sets the value of the periodoGraciaHasta property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setPeriodoGraciaHasta(XMLGregorianCalendar value) {
        this.periodoGraciaHasta = value;
    }

    /**
     * Gets the value of the periodoMuerto property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isPeriodoMuerto() {
        return periodoMuerto;
    }

    /**
     * Sets the value of the periodoMuerto property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setPeriodoMuerto(Boolean value) {
        this.periodoMuerto = value;
    }

    /**
     * Gets the value of the periodoMuertoDe property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getPeriodoMuertoDe() {
        return periodoMuertoDe;
    }

    /**
     * Sets the value of the periodoMuertoDe property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setPeriodoMuertoDe(XMLGregorianCalendar value) {
        this.periodoMuertoDe = value;
    }

    /**
     * Gets the value of the periodoMuertoHasta property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getPeriodoMuertoHasta() {
        return periodoMuertoHasta;
    }

    /**
     * Sets the value of the periodoMuertoHasta property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setPeriodoMuertoHasta(XMLGregorianCalendar value) {
        this.periodoMuertoHasta = value;
    }

    /**
     * Gets the value of the modalidadPagosInteres property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getModalidadPagosInteres() {
        return modalidadPagosInteres;
    }

    /**
     * Sets the value of the modalidadPagosInteres property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setModalidadPagosInteres(String value) {
        this.modalidadPagosInteres = value;
    }

    /**
     * Gets the value of the fechaPagoPrimerCuota property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFechaPagoPrimerCuota() {
        return fechaPagoPrimerCuota;
    }

    /**
     * Sets the value of the fechaPagoPrimerCuota property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setFechaPagoPrimerCuota(XMLGregorianCalendar value) {
        this.fechaPagoPrimerCuota = value;
    }

    /**
     * Gets the value of the modalidadPagoCapital property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getModalidadPagoCapital() {
        return modalidadPagoCapital;
    }

    /**
     * Sets the value of the modalidadPagoCapital property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setModalidadPagoCapital(String value) {
        this.modalidadPagoCapital = value;
    }

    /**
     * Gets the value of the fechaPagoPrimerCuotaCapital property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFechaPagoPrimerCuotaCapital() {
        return fechaPagoPrimerCuotaCapital;
    }

    /**
     * Sets the value of the fechaPagoPrimerCuotaCapital property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setFechaPagoPrimerCuotaCapital(XMLGregorianCalendar value) {
        this.fechaPagoPrimerCuotaCapital = value;
    }

    /**
     * Gets the value of the otraModalidadPago property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getOtraModalidadPago() {
        return otraModalidadPago;
    }

    /**
     * Sets the value of the otraModalidadPago property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setOtraModalidadPago(String value) {
        this.otraModalidadPago = value;
    }

    /**
     * Gets the value of the numCuotas property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getNumCuotas() {
        return numCuotas;
    }

    /**
     * Sets the value of the numCuotas property.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setNumCuotas(Integer value) {
        this.numCuotas = value;
    }

    /**
     * Gets the value of the fechaPagoPrimerCuotaInteres property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFechaPagoPrimerCuotaInteres() {
        return fechaPagoPrimerCuotaInteres;
    }

    /**
     * Sets the value of the fechaPagoPrimerCuotaInteres property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setFechaPagoPrimerCuotaInteres(XMLGregorianCalendar value) {
        this.fechaPagoPrimerCuotaInteres = value;
    }

    /**
     * Gets the value of the valorCuotaPesos property.
     *
     * @return possible object is {@link BigDecimal }
     *
     */
    public BigDecimal getValorCuotaPesos() {
        return valorCuotaPesos;
    }

    /**
     * Sets the value of the valorCuotaPesos property.
     *
     * @param value allowed object is {@link BigDecimal }
     *
     */
    public void setValorCuotaPesos(BigDecimal value) {
        this.valorCuotaPesos = value;
    }

    /**
     * Gets the value of the valorCuotaUVR property.
     *
     * @return possible object is {@link BigDecimal }
     *
     */
    public BigDecimal getValorCuotaUVR() {
        return valorCuotaUVR;
    }

    /**
     * Sets the value of the valorCuotaUVR property.
     *
     * @param value allowed object is {@link BigDecimal }
     *
     */
    public void setValorCuotaUVR(BigDecimal value) {
        this.valorCuotaUVR = value;
    }

    /**
     * Gets the value of the porcentAmortizacionMensual property.
     *
     * @return possible object is {@link BigDecimal }
     *
     */
    public BigDecimal getPorcentAmortizacionMensual() {
        return porcentAmortizacionMensual;
    }

    /**
     * Sets the value of the porcentAmortizacionMensual property.
     *
     * @param value allowed object is {@link BigDecimal }
     *
     */
    public void setPorcentAmortizacionMensual(BigDecimal value) {
        this.porcentAmortizacionMensual = value;
    }

    /**
     * Gets the value of the fechaPagoPrimerCuotaMensual property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFechaPagoPrimerCuotaMensual() {
        return fechaPagoPrimerCuotaMensual;
    }

    /**
     * Sets the value of the fechaPagoPrimerCuotaMensual property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setFechaPagoPrimerCuotaMensual(XMLGregorianCalendar value) {
        this.fechaPagoPrimerCuotaMensual = value;
    }

    /**
     * Gets the value of the porcentAmortizacionSemestral property.
     *
     * @return possible object is {@link BigDecimal }
     *
     */
    public BigDecimal getPorcentAmortizacionSemestral() {
        return porcentAmortizacionSemestral;
    }

    /**
     * Sets the value of the porcentAmortizacionSemestral property.
     *
     * @param value allowed object is {@link BigDecimal }
     *
     */
    public void setPorcentAmortizacionSemestral(BigDecimal value) {
        this.porcentAmortizacionSemestral = value;
    }

    /**
     * Gets the value of the fechaPagoPrimerCuotaSemestral property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFechaPagoPrimerCuotaSemestral() {
        return fechaPagoPrimerCuotaSemestral;
    }

    /**
     * Sets the value of the fechaPagoPrimerCuotaSemestral property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setFechaPagoPrimerCuotaSemestral(XMLGregorianCalendar value) {
        this.fechaPagoPrimerCuotaSemestral = value;
    }

    /**
     * Gets the value of the ciudadDesembolso property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCiudadDesembolso() {
        return ciudadDesembolso;
    }

    /**
     * Sets the value of the ciudadDesembolso property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCiudadDesembolso(String value) {
        this.ciudadDesembolso = value;
    }

    /**
     * Gets the value of the departamento property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * Sets the value of the departamento property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setDepartamento(String value) {
        this.departamento = value;
    }

    /**
     * Gets the value of the pais property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getPais() {
        return pais;
    }

    /**
     * Sets the value of the pais property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setPais(String value) {
        this.pais = value;
    }

    /**
     * Gets the value of the codOficina property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCodOficina() {
        return codOficina;
    }

    /**
     * Sets the value of the codOficina property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCodOficina(String value) {
        this.codOficina = value;
    }

    /**
     * Gets the value of the regional property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getRegional() {
        return regional;
    }

    /**
     * Sets the value of the regional property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setRegional(String value) {
        this.regional = value;
    }

    /**
     * Gets the value of the autorizaDebitoAutomatico property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isAutorizaDebitoAutomatico() {
        return autorizaDebitoAutomatico;
    }

    /**
     * Sets the value of the autorizaDebitoAutomatico property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setAutorizaDebitoAutomatico(Boolean value) {
        this.autorizaDebitoAutomatico = value;
    }

    /**
     * Gets the value of the cuenta property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Sets the value of the cuenta property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCuenta(String value) {
        this.cuenta = value;
    }

    /**
     * Gets the value of the adquisicionVivienda property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isAdquisicionVivienda() {
        return adquisicionVivienda;
    }

    /**
     * Sets the value of the adquisicionVivienda property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setAdquisicionVivienda(Boolean value) {
        this.adquisicionVivienda = value;
    }

    /**
     * Gets the value of the construccionViviendaIndividual property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isConstruccionViviendaIndividual() {
        return construccionViviendaIndividual;
    }

    /**
     * Sets the value of the construccionViviendaIndividual property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setConstruccionViviendaIndividual(Boolean value) {
        this.construccionViviendaIndividual = value;
    }

    /**
     * Gets the value of the mejoramientoViviendaInterSoci property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isMejoramientoViviendaInterSoci() {
        return mejoramientoViviendaInterSoci;
    }

    /**
     * Sets the value of the mejoramientoViviendaInterSoci property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setMejoramientoViviendaInterSoci(Boolean value) {
        this.mejoramientoViviendaInterSoci = value;
    }

    /**
     * Gets the value of the otroDestino property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isOtroDestino() {
        return otroDestino;
    }

    /**
     * Sets the value of the otroDestino property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setOtroDestino(Boolean value) {
        this.otroDestino = value;
    }

    /**
     * Gets the value of the destinoOperacion property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDestinoOperacion() {
        return destinoOperacion;
    }

    /**
     * Sets the value of the destinoOperacion property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setDestinoOperacion(String value) {
        this.destinoOperacion = value;
    }

    /**
     * Gets the value of the vis property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isVis() {
        return vis;
    }

    /**
     * Sets the value of the vis property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setVis(Boolean value) {
        this.vis = value;
    }

    /**
     * Gets the value of the noVis property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isNoVis() {
        return noVis;
    }

    /**
     * Sets the value of the noVis property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setNoVis(Boolean value) {
        this.noVis = value;
    }

    /**
     * Gets the value of the listaAmortizaciones property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getListaAmortizaciones() {
        return listaAmortizaciones;
    }

    /**
     * Sets the value of the listaAmortizaciones property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setListaAmortizaciones(String value) {
        this.listaAmortizaciones = value;
    }

    /**
     * Gets the value of the ciConCuotasExtras property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isCiConCuotasExtras() {
        return ciConCuotasExtras;
    }

    /**
     * Sets the value of the ciConCuotasExtras property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setCiConCuotasExtras(Boolean value) {
        this.ciConCuotasExtras = value;
    }

    /**
     * Gets the value of the ciValorCuotaExtra property.
     *
     * @return possible object is {@link BigDecimal }
     *
     */
    public BigDecimal getCiValorCuotaExtra() {
        return ciValorCuotaExtra;
    }

    /**
     * Sets the value of the ciValorCuotaExtra property.
     *
     * @param value allowed object is {@link BigDecimal }
     *
     */
    public void setCiValorCuotaExtra(BigDecimal value) {
        this.ciValorCuotaExtra = value;
    }

    /**
     * Gets the value of the ciNumCuotasExtras property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getCiNumCuotasExtras() {
        return ciNumCuotasExtras;
    }

    /**
     * Sets the value of the ciNumCuotasExtras property.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setCiNumCuotasExtras(Integer value) {
        this.ciNumCuotasExtras = value;
    }

    /**
     * Gets the value of the ciCEPagaderaCada property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getCiCEPagaderaCada() {
        return ciCEPagaderaCada;
    }

    /**
     * Sets the value of the ciCEPagaderaCada property.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setCiCEPagaderaCada(Integer value) {
        this.ciCEPagaderaCada = value;
    }

    /**
     * Gets the value of the ciCEApartirDelMes property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getCiCEApartirDelMes() {
        return ciCEApartirDelMes;
    }

    /**
     * Sets the value of the ciCEApartirDelMes property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setCiCEApartirDelMes(XMLGregorianCalendar value) {
        this.ciCEApartirDelMes = value;
    }

    /**
     * Gets the value of the idDocumentoPagare property.
     *
     * @return possible object is {@link Long }
     *
     */
    public Long getIdDocumentoPagare() {
        return idDocumentoPagare;
    }

    /**
     * Sets the value of the idDocumentoPagare property.
     *
     * @param value allowed object is {@link Long }
     *
     */
    public void setIdDocumentoPagare(Long value) {
        this.idDocumentoPagare = value;
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
     * Gets the value of the listaApoderadoRepresentantePagare property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the listaApoderadoRepresentantePagare
     * property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaApoderadoRepresentantePagare().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsultaGiradorServiceDTO }
     *
     *
     */
    public List<ConsultaGiradorServiceDTO> getListaApoderadoRepresentantePagare() {
        if (listaApoderadoRepresentantePagare == null) {
            listaApoderadoRepresentantePagare = new ArrayList<ConsultaGiradorServiceDTO>();
        }
        return this.listaApoderadoRepresentantePagare;
    }

    /**
     * Gets the value of the empresaOtorgante property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getEmpresaOtorgante() {
        return empresaOtorgante;
    }

    /**
     * Sets the value of the empresaOtorgante property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setEmpresaOtorgante(String value) {
        this.empresaOtorgante = value;
    }

    /**
     * Gets the value of the ciudadCreacion property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getCiudadCreacion() {
        return ciudadCreacion;
    }

    /**
     * Sets the value of the ciudadCreacion property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setCiudadCreacion(String value) {
        this.ciudadCreacion = value;
    }

    /**
     * Gets the value of the deptoCreacion property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getDeptoCreacion() {
        return deptoCreacion;
    }

    /**
     * Sets the value of the deptoCreacion property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setDeptoCreacion(String value) {
        this.deptoCreacion = value;
    }

    /**
     * Gets the value of the paisCreacion property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getPaisCreacion() {
        return paisCreacion;
    }

    /**
     * Sets the value of the paisCreacion property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setPaisCreacion(String value) {
        this.paisCreacion = value;
    }

    /**
     * Gets the value of the valorPesosDesembolsoLetras property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getValorPesosDesembolsoLetras() {
        return valorPesosDesembolsoLetras;
    }

    /**
     * Sets the value of the valorPesosDesembolsoLetras property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setValorPesosDesembolsoLetras(String value) {
        this.valorPesosDesembolsoLetras = value;
    }

    /**
     * Gets the value of the valorPesosActual property.
     *
     * @return possible object is {@link BigDecimal }
     *
     */
    public BigDecimal getValorPesosActual() {
        return valorPesosActual;
    }

    /**
     * Sets the value of the valorPesosActual property.
     *
     * @param value allowed object is {@link BigDecimal }
     *
     */
    public void setValorPesosActual(BigDecimal value) {
        this.valorPesosActual = value;
    }

    /**
     * Gets the value of the valorCapitalNumero property.
     *
     * @return possible object is {@link BigDecimal }
     *
     */
    public BigDecimal getValorCapitalNumero() {
        return valorCapitalNumero;
    }

    /**
     * Sets the value of the valorCapitalNumero property.
     *
     * @param value allowed object is {@link BigDecimal }
     *
     */
    public void setValorCapitalNumero(BigDecimal value) {
        this.valorCapitalNumero = value;
    }

    /**
     * Gets the value of the valorCapitalLetras property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getValorCapitalLetras() {
        return valorCapitalLetras;
    }

    /**
     * Sets the value of the valorCapitalLetras property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setValorCapitalLetras(String value) {
        this.valorCapitalLetras = value;
    }

    /**
     * Gets the value of the margenRedescuento property.
     *
     * @return possible object is {@link BigDecimal }
     *
     */
    public BigDecimal getMargenRedescuento() {
        return margenRedescuento;
    }

    /**
     * Sets the value of the margenRedescuento property.
     *
     * @param value allowed object is {@link BigDecimal }
     *
     */
    public void setMargenRedescuento(BigDecimal value) {
        this.margenRedescuento = value;
    }

    /**
     * Gets the value of the puntosPorcentualesRedescuento property.
     *
     * @return possible object is {@link BigDecimal }
     *
     */
    public BigDecimal getPuntosPorcentualesRedescuento() {
        return puntosPorcentualesRedescuento;
    }

    /**
     * Sets the value of the puntosPorcentualesRedescuento property.
     *
     * @param value allowed object is {@link BigDecimal }
     *
     */
    public void setPuntosPorcentualesRedescuento(BigDecimal value) {
        this.puntosPorcentualesRedescuento = value;
    }

    /**
     * Gets the value of the valorDesembolsoUVRLetras property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getValorDesembolsoUVRLetras() {
        return valorDesembolsoUVRLetras;
    }

    /**
     * Sets the value of the valorDesembolsoUVRLetras property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setValorDesembolsoUVRLetras(String value) {
        this.valorDesembolsoUVRLetras = value;
    }

    /**
     * Gets the value of the tasaInteresRenumEALetras property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTasaInteresRenumEALetras() {
        return tasaInteresRenumEALetras;
    }

    /**
     * Sets the value of the tasaInteresRenumEALetras property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setTasaInteresRenumEALetras(String value) {
        this.tasaInteresRenumEALetras = value;
    }

    /**
     * Gets the value of the tasaInteresMora property.
     *
     * @return possible object is {@link BigDecimal }
     *
     */
    public BigDecimal getTasaInteresMora() {
        return tasaInteresMora;
    }

    /**
     * Sets the value of the tasaInteresMora property.
     *
     * @param value allowed object is {@link BigDecimal }
     *
     */
    public void setTasaInteresMora(BigDecimal value) {
        this.tasaInteresMora = value;
    }

    /**
     * Gets the value of the fechaVencimientoFinanciero property.
     *
     * @return possible object is {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getFechaVencimientoFinanciero() {
        return fechaVencimientoFinanciero;
    }

    /**
     * Sets the value of the fechaVencimientoFinanciero property.
     *
     * @param value allowed object is {@link XMLGregorianCalendar }
     *
     */
    public void setFechaVencimientoFinanciero(XMLGregorianCalendar value) {
        this.fechaVencimientoFinanciero = value;
    }

    /**
     * Gets the value of the plazoNumero property.
     *
     * @return possible object is {@link BigDecimal }
     *
     */
    public BigDecimal getPlazoNumero() {
        return plazoNumero;
    }

    /**
     * Sets the value of the plazoNumero property.
     *
     * @param value allowed object is {@link BigDecimal }
     *
     */
    public void setPlazoNumero(BigDecimal value) {
        this.plazoNumero = value;
    }

    /**
     * Gets the value of the plazoLetras property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getPlazoLetras() {
        return plazoLetras;
    }

    /**
     * Sets the value of the plazoLetras property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setPlazoLetras(String value) {
        this.plazoLetras = value;
    }

    /**
     * Gets the value of the periodicidadPlazo property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getPeriodicidadPlazo() {
        return periodicidadPlazo;
    }

    /**
     * Sets the value of the periodicidadPlazo property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setPeriodicidadPlazo(String value) {
        this.periodicidadPlazo = value;
    }

    /**
     * Gets the value of the periodoGraciaNumero property.
     *
     * @return possible object is {@link BigDecimal }
     *
     */
    public BigDecimal getPeriodoGraciaNumero() {
        return periodoGraciaNumero;
    }

    /**
     * Sets the value of the periodoGraciaNumero property.
     *
     * @param value allowed object is {@link BigDecimal }
     *
     */
    public void setPeriodoGraciaNumero(BigDecimal value) {
        this.periodoGraciaNumero = value;
    }

    /**
     * Gets the value of the periodoGraciaLetras property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getPeriodoGraciaLetras() {
        return periodoGraciaLetras;
    }

    /**
     * Sets the value of the periodoGraciaLetras property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setPeriodoGraciaLetras(String value) {
        this.periodoGraciaLetras = value;
    }

    /**
     * Gets the value of the periodicidadGracia property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getPeriodicidadGracia() {
        return periodicidadGracia;
    }

    /**
     * Sets the value of the periodicidadGracia property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setPeriodicidadGracia(String value) {
        this.periodicidadGracia = value;
    }

    /**
     * Gets the value of the periodoMuertoNumero property.
     *
     * @return possible object is {@link BigDecimal }
     *
     */
    public BigDecimal getPeriodoMuertoNumero() {
        return periodoMuertoNumero;
    }

    /**
     * Sets the value of the periodoMuertoNumero property.
     *
     * @param value allowed object is {@link BigDecimal }
     *
     */
    public void setPeriodoMuertoNumero(BigDecimal value) {
        this.periodoMuertoNumero = value;
    }

    /**
     * Gets the value of the periodoMuertoLetras property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getPeriodoMuertoLetras() {
        return periodoMuertoLetras;
    }

    /**
     * Sets the value of the periodoMuertoLetras property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setPeriodoMuertoLetras(String value) {
        this.periodoMuertoLetras = value;
    }

    /**
     * Gets the value of the periodicidadMuerto property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getPeriodicidadMuerto() {
        return periodicidadMuerto;
    }

    /**
     * Sets the value of the periodicidadMuerto property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setPeriodicidadMuerto(String value) {
        this.periodicidadMuerto = value;
    }

    /**
     * Gets the value of the numCuotasLetras property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getNumCuotasLetras() {
        return numCuotasLetras;
    }

    /**
     * Sets the value of the numCuotasLetras property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setNumCuotasLetras(String value) {
        this.numCuotasLetras = value;
    }

    /**
     * Gets the value of the valorCuotaPesosLetras property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getValorCuotaPesosLetras() {
        return valorCuotaPesosLetras;
    }

    /**
     * Sets the value of the valorCuotaPesosLetras property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setValorCuotaPesosLetras(String value) {
        this.valorCuotaPesosLetras = value;
    }

    /**
     * Gets the value of the valorCuotaUVRLetras property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getValorCuotaUVRLetras() {
        return valorCuotaUVRLetras;
    }

    /**
     * Sets the value of the valorCuotaUVRLetras property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setValorCuotaUVRLetras(String value) {
        this.valorCuotaUVRLetras = value;
    }

    /**
     * Gets the value of the valorInteresesNumero property.
     *
     * @return possible object is {@link BigDecimal }
     *
     */
    public BigDecimal getValorInteresesNumero() {
        return valorInteresesNumero;
    }

    /**
     * Sets the value of the valorInteresesNumero property.
     *
     * @param value allowed object is {@link BigDecimal }
     *
     */
    public void setValorInteresesNumero(BigDecimal value) {
        this.valorInteresesNumero = value;
    }

    /**
     * Gets the value of the valorInteresesLetras property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getValorInteresesLetras() {
        return valorInteresesLetras;
    }

    /**
     * Sets the value of the valorInteresesLetras property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setValorInteresesLetras(String value) {
        this.valorInteresesLetras = value;
    }

    /**
     * Gets the value of the porcentajeComision property.
     *
     * @return possible object is {@link BigDecimal }
     *
     */
    public BigDecimal getPorcentajeComision() {
        return porcentajeComision;
    }

    /**
     * Sets the value of the porcentajeComision property.
     *
     * @param value allowed object is {@link BigDecimal }
     *
     */
    public void setPorcentajeComision(BigDecimal value) {
        this.porcentajeComision = value;
    }

    /**
     * Gets the value of the porcentajeCobertura property.
     *
     * @return possible object is {@link BigDecimal }
     *
     */
    public BigDecimal getPorcentajeCobertura() {
        return porcentajeCobertura;
    }

    /**
     * Sets the value of the porcentajeCobertura property.
     *
     * @param value allowed object is {@link BigDecimal }
     *
     */
    public void setPorcentajeCobertura(BigDecimal value) {
        this.porcentajeCobertura = value;
    }

    /**
     * Gets the value of the garantiaAdicional property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getGarantiaAdicional() {
        return garantiaAdicional;
    }

    /**
     * Sets the value of the garantiaAdicional property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setGarantiaAdicional(String value) {
        this.garantiaAdicional = value;
    }

    /**
     * Gets the value of the diaPago property.
     *
     * @return possible object is {@link Integer }
     *
     */
    public Integer getDiaPago() {
        return diaPago;
    }

    /**
     * Sets the value of the diaPago property.
     *
     * @param value allowed object is {@link Integer }
     *
     */
    public void setDiaPago(Integer value) {
        this.diaPago = value;
    }

    /**
     * Gets the value of the ciConPeriodoGracia property.
     *
     * @return possible object is {@link Boolean }
     *
     */
    public Boolean isCiConPeriodoGracia() {
        return ciConPeriodoGracia;
    }

    /**
     * Sets the value of the ciConPeriodoGracia property.
     *
     * @param value allowed object is {@link Boolean }
     *
     */
    public void setCiConPeriodoGracia(Boolean value) {
        this.ciConPeriodoGracia = value;
    }

    /**
     * Gets the value of the tasaNominal property.
     *
     * @return possible object is {@link BigDecimal }
     *
     */
    public BigDecimal getTasaNominal() {
        return tasaNominal;
    }

    /**
     * Sets the value of the tasaNominal property.
     *
     * @param value allowed object is {@link BigDecimal }
     *
     */
    public void setTasaNominal(BigDecimal value) {
        this.tasaNominal = value;
    }

    /**
     * Gets the value of the tasaNominalLetras property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTasaNominalLetras() {
        return tasaNominalLetras;
    }

    /**
     * Sets the value of the tasaNominalLetras property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setTasaNominalLetras(String value) {
        this.tasaNominalLetras = value;
    }

    /**
     * Gets the value of the tasaInteresMoraLetras property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTasaInteresMoraLetras() {
        return tasaInteresMoraLetras;
    }

    /**
     * Sets the value of the tasaInteresMoraLetras property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setTasaInteresMoraLetras(String value) {
        this.tasaInteresMoraLetras = value;
    }

    /**
     * Gets the value of the textoAdicional property.
     *
     * @return possible object is {@link String }
     *
     */
    public String getTextoAdicional() {
        return textoAdicional;
    }

    /**
     * Sets the value of the textoAdicional property.
     *
     * @param value allowed object is {@link String }
     *
     */
    public void setTextoAdicional(String value) {
        this.textoAdicional = value;
    }

    /**
     * Gets the value of the archivosAdjuntos property.
     *
     * <p>
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the archivosAdjuntos property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArchivosAdjuntos().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArchivoAdjuntoDTO }
     *
     *
     */
    public List<ArchivoAdjuntoDTO> getArchivosAdjuntos() {
        if (archivosAdjuntos == null) {
            archivosAdjuntos = new ArrayList<ArchivoAdjuntoDTO>();
        }
        return this.archivosAdjuntos;
    }

    /**
     * Gets the value of the seguroVida property.
     *
     * @return possible object is {@link BigDecimal }
     *
     */
    public BigDecimal getSeguroVida() {
        return seguroVida;
    }

    /**
     * Sets the value of the seguroVida property.
     *
     * @param value allowed object is {@link BigDecimal }
     *
     */
    public void setSeguroVida(BigDecimal value) {
        this.seguroVida = value;
    }

    /**
     * Gets the value of the aval property.
     *
     * @return possible object is {@link BigDecimal }
     *
     */
    public BigDecimal getAval() {
        return aval;
    }

    /**
     * Sets the value of the aval property.
     *
     * @param value allowed object is {@link BigDecimal }
     *
     */
    public void setAval(BigDecimal value) {
        this.aval = value;
    }
}
