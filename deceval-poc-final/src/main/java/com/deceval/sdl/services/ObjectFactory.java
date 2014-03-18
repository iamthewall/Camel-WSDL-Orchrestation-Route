package com.deceval.sdl.services;

import co.com.deceval.sdl.services.dto.RespuestaAmortizacionSaldosServiceDTO;
import co.com.deceval.sdl.services.dto.RespuestaCancelacionPagaresServiceDTO;
import co.com.deceval.sdl.services.dto.RespuestaConsultarPagaresDTO;
import co.com.deceval.sdl.services.dto.RespuestaCrearGiradorDaneServiceDTO;
import co.com.deceval.sdl.services.dto.RespuestaCrearGiradorServiceDTO;
import co.com.deceval.sdl.services.dto.RespuestaDesembolsoAnotarCuentaDTO;
import co.com.deceval.sdl.services.dto.RespuestaDocumentoPagareDaneServiceDTO;
import co.com.deceval.sdl.services.dto.RespuestaDocumentoPagareServiceDTO;
import co.com.deceval.sdl.services.dto.RespuestaFirmarPagaresDTO;
import co.com.deceval.sdl.services.dto.RespuestaPagaresFirmadosDTO;
import co.com.deceval.sdl.services.dto.SolicitudAmortizacionSaldosServiceDTO;
import co.com.deceval.sdl.services.dto.SolicitudCancelacionPagaresServiceDTO;
import co.com.deceval.sdl.services.dto.SolicitudConsultarPagareDTO;
import co.com.deceval.sdl.services.dto.SolicitudCrearGiradorDaneServiceDTO;
import co.com.deceval.sdl.services.dto.SolicitudCrearGiradorServiceDTO;
import co.com.deceval.sdl.services.dto.SolicitudCrearPagareDaneServiceDTO;
import co.com.deceval.sdl.services.dto.SolicitudCrearPagareServiceDTO;
import co.com.deceval.sdl.services.dto.SolicitudDesembolsoAnotarCuentaDTO;
import co.com.deceval.sdl.services.dto.SolicitudFirmarPagaresDTO;
import co.com.deceval.sdl.services.dto.SolicitudPagaresFirmadosDTO;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.deceval.sdl.services package.
 * <p>An ObjectFactory allows you to programatically construct new instances of
 * the Java representation for XML content. The Java representation of XML
 * content can consist of schema derived interfaces and classes representing the
 * binding of schema type definitions, element declarations and model groups.
 * Factory methods for each of these are provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CrearPagareDaneServiceDTO_QNAME = new QName("http://deceval.com/sdl/services/", "crearPagareDaneServiceDTO");
    private final static QName _RespuestaPagaresFirmadosDTO_QNAME = new QName("http://deceval.com/sdl/services/", "RespuestaPagaresFirmadosDTO");
    private final static QName _RespuestaCrearGiradorServiceDTO_QNAME = new QName("http://deceval.com/sdl/services/", "RespuestaCrearGiradorServiceDTO");
    private final static QName _RespuestaCancelacionPagaresServiceDTO_QNAME = new QName("http://deceval.com/sdl/services/", "RespuestaCancelacionPagaresServiceDTO");
    private final static QName _RespuestaAmortizacionSaldosServiceDTO_QNAME = new QName("http://deceval.com/sdl/services/", "RespuestaAmortizacionSaldosServiceDTO");
    private final static QName _RespuestaCrearGiradorDaneServiceDTO_QNAME = new QName("http://deceval.com/sdl/services/", "RespuestaCrearGiradorDaneServiceDTO");
    private final static QName _CrearGiradorServiceDto_QNAME = new QName("http://deceval.com/sdl/services/", "crearGiradorServiceDto");
    private final static QName _RespuestaDocumentoPagareServiceDTO_QNAME = new QName("http://deceval.com/sdl/services/", "RespuestaDocumentoPagareServiceDTO");
    private final static QName _SolicitudAmortizacionSaldosServiceDTO_QNAME = new QName("http://deceval.com/sdl/services/", "solicitudAmortizacionSaldosServiceDTO");
    private final static QName _RespuestaFirmarPagaresDTO_QNAME = new QName("http://deceval.com/sdl/services/", "RespuestaFirmarPagaresDTO");
    private final static QName _CrearGiradorDaneServiceDTO_QNAME = new QName("http://deceval.com/sdl/services/", "crearGiradorDaneServiceDTO");
    private final static QName _RespuestaDocumentoPagareDaneServiceDTO_QNAME = new QName("http://deceval.com/sdl/services/", "RespuestaDocumentoPagareDaneServiceDTO");
    private final static QName _Solicitud_QNAME = new QName("http://deceval.com/sdl/services/", "solicitud");
    private final static QName _DesembolsoAnotarCuentaDto_QNAME = new QName("http://deceval.com/sdl/services/", "desembolsoAnotarCuentaDto");
    private final static QName _ListaConsultarPagaresDTO_QNAME = new QName("http://deceval.com/sdl/services/", "listaConsultarPagaresDTO");
    private final static QName _PagaresFirmadosDto_QNAME = new QName("http://deceval.com/sdl/services/", "pagaresFirmadosDto");
    private final static QName _ListaCancelacionPagaresServiceDTO_QNAME = new QName("http://deceval.com/sdl/services/", "listaCancelacionPagaresServiceDTO");
    private final static QName _RespuestaDesembolsoAnotarCuentaDTO_QNAME = new QName("http://deceval.com/sdl/services/", "RespuestaDesembolsoAnotarCuentaDTO");
    private final static QName _SolicitudFirmarPagareDTO_QNAME = new QName("http://deceval.com/sdl/services/", "solicitudFirmarPagareDTO");
    private final static QName _RespuestaConsultarPagaresDTO_QNAME = new QName("http://deceval.com/sdl/services/", "RespuestaConsultarPagaresDTO");

    /**
     * Create a new ObjectFactory that can be used to create new instances of
     * schema derived classes for package: com.deceval.sdl.services
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link SolicitudCrearPagareDaneServiceDTO }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://deceval.com/sdl/services/", name = "crearPagareDaneServiceDTO")
    public JAXBElement<SolicitudCrearPagareDaneServiceDTO> createCrearPagareDaneServiceDTO(SolicitudCrearPagareDaneServiceDTO value) {
        return new JAXBElement<SolicitudCrearPagareDaneServiceDTO>(_CrearPagareDaneServiceDTO_QNAME, SolicitudCrearPagareDaneServiceDTO.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link RespuestaPagaresFirmadosDTO }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://deceval.com/sdl/services/", name = "RespuestaPagaresFirmadosDTO")
    public JAXBElement<RespuestaPagaresFirmadosDTO> createRespuestaPagaresFirmadosDTO(RespuestaPagaresFirmadosDTO value) {
        return new JAXBElement<RespuestaPagaresFirmadosDTO>(_RespuestaPagaresFirmadosDTO_QNAME, RespuestaPagaresFirmadosDTO.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link RespuestaCrearGiradorServiceDTO }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://deceval.com/sdl/services/", name = "RespuestaCrearGiradorServiceDTO")
    public JAXBElement<RespuestaCrearGiradorServiceDTO> createRespuestaCrearGiradorServiceDTO(RespuestaCrearGiradorServiceDTO value) {
        return new JAXBElement<RespuestaCrearGiradorServiceDTO>(_RespuestaCrearGiradorServiceDTO_QNAME, RespuestaCrearGiradorServiceDTO.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link RespuestaCancelacionPagaresServiceDTO }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://deceval.com/sdl/services/", name = "RespuestaCancelacionPagaresServiceDTO")
    public JAXBElement<RespuestaCancelacionPagaresServiceDTO> createRespuestaCancelacionPagaresServiceDTO(RespuestaCancelacionPagaresServiceDTO value) {
        return new JAXBElement<RespuestaCancelacionPagaresServiceDTO>(_RespuestaCancelacionPagaresServiceDTO_QNAME, RespuestaCancelacionPagaresServiceDTO.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link RespuestaAmortizacionSaldosServiceDTO }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://deceval.com/sdl/services/", name = "RespuestaAmortizacionSaldosServiceDTO")
    public JAXBElement<RespuestaAmortizacionSaldosServiceDTO> createRespuestaAmortizacionSaldosServiceDTO(RespuestaAmortizacionSaldosServiceDTO value) {
        return new JAXBElement<RespuestaAmortizacionSaldosServiceDTO>(_RespuestaAmortizacionSaldosServiceDTO_QNAME, RespuestaAmortizacionSaldosServiceDTO.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link RespuestaCrearGiradorDaneServiceDTO }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://deceval.com/sdl/services/", name = "RespuestaCrearGiradorDaneServiceDTO")
    public JAXBElement<RespuestaCrearGiradorDaneServiceDTO> createRespuestaCrearGiradorDaneServiceDTO(RespuestaCrearGiradorDaneServiceDTO value) {
        return new JAXBElement<RespuestaCrearGiradorDaneServiceDTO>(_RespuestaCrearGiradorDaneServiceDTO_QNAME, RespuestaCrearGiradorDaneServiceDTO.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link SolicitudCrearGiradorServiceDTO }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://deceval.com/sdl/services/", name = "crearGiradorServiceDto")
    public JAXBElement<SolicitudCrearGiradorServiceDTO> createCrearGiradorServiceDto(SolicitudCrearGiradorServiceDTO value) {
        return new JAXBElement<SolicitudCrearGiradorServiceDTO>(_CrearGiradorServiceDto_QNAME, SolicitudCrearGiradorServiceDTO.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link RespuestaDocumentoPagareServiceDTO }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://deceval.com/sdl/services/", name = "RespuestaDocumentoPagareServiceDTO")
    public JAXBElement<RespuestaDocumentoPagareServiceDTO> createRespuestaDocumentoPagareServiceDTO(RespuestaDocumentoPagareServiceDTO value) {
        return new JAXBElement<RespuestaDocumentoPagareServiceDTO>(_RespuestaDocumentoPagareServiceDTO_QNAME, RespuestaDocumentoPagareServiceDTO.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link SolicitudAmortizacionSaldosServiceDTO }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://deceval.com/sdl/services/", name = "solicitudAmortizacionSaldosServiceDTO")
    public JAXBElement<SolicitudAmortizacionSaldosServiceDTO> createSolicitudAmortizacionSaldosServiceDTO(SolicitudAmortizacionSaldosServiceDTO value) {
        return new JAXBElement<SolicitudAmortizacionSaldosServiceDTO>(_SolicitudAmortizacionSaldosServiceDTO_QNAME, SolicitudAmortizacionSaldosServiceDTO.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link RespuestaFirmarPagaresDTO }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://deceval.com/sdl/services/", name = "RespuestaFirmarPagaresDTO")
    public JAXBElement<RespuestaFirmarPagaresDTO> createRespuestaFirmarPagaresDTO(RespuestaFirmarPagaresDTO value) {
        return new JAXBElement<RespuestaFirmarPagaresDTO>(_RespuestaFirmarPagaresDTO_QNAME, RespuestaFirmarPagaresDTO.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link SolicitudCrearGiradorDaneServiceDTO }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://deceval.com/sdl/services/", name = "crearGiradorDaneServiceDTO")
    public JAXBElement<SolicitudCrearGiradorDaneServiceDTO> createCrearGiradorDaneServiceDTO(SolicitudCrearGiradorDaneServiceDTO value) {
        return new JAXBElement<SolicitudCrearGiradorDaneServiceDTO>(_CrearGiradorDaneServiceDTO_QNAME, SolicitudCrearGiradorDaneServiceDTO.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link RespuestaDocumentoPagareDaneServiceDTO }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://deceval.com/sdl/services/", name = "RespuestaDocumentoPagareDaneServiceDTO")
    public JAXBElement<RespuestaDocumentoPagareDaneServiceDTO> createRespuestaDocumentoPagareDaneServiceDTO(RespuestaDocumentoPagareDaneServiceDTO value) {
        return new JAXBElement<RespuestaDocumentoPagareDaneServiceDTO>(_RespuestaDocumentoPagareDaneServiceDTO_QNAME, RespuestaDocumentoPagareDaneServiceDTO.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link SolicitudCrearPagareServiceDTO }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://deceval.com/sdl/services/", name = "solicitud")
    public JAXBElement<SolicitudCrearPagareServiceDTO> createSolicitud(SolicitudCrearPagareServiceDTO value) {
        return new JAXBElement<SolicitudCrearPagareServiceDTO>(_Solicitud_QNAME, SolicitudCrearPagareServiceDTO.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link SolicitudDesembolsoAnotarCuentaDTO }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://deceval.com/sdl/services/", name = "desembolsoAnotarCuentaDto")
    public JAXBElement<SolicitudDesembolsoAnotarCuentaDTO> createDesembolsoAnotarCuentaDto(SolicitudDesembolsoAnotarCuentaDTO value) {
        return new JAXBElement<SolicitudDesembolsoAnotarCuentaDTO>(_DesembolsoAnotarCuentaDto_QNAME, SolicitudDesembolsoAnotarCuentaDTO.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link SolicitudConsultarPagareDTO }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://deceval.com/sdl/services/", name = "listaConsultarPagaresDTO")
    public JAXBElement<SolicitudConsultarPagareDTO> createListaConsultarPagaresDTO(SolicitudConsultarPagareDTO value) {
        return new JAXBElement<SolicitudConsultarPagareDTO>(_ListaConsultarPagaresDTO_QNAME, SolicitudConsultarPagareDTO.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link SolicitudPagaresFirmadosDTO }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://deceval.com/sdl/services/", name = "pagaresFirmadosDto")
    public JAXBElement<SolicitudPagaresFirmadosDTO> createPagaresFirmadosDto(SolicitudPagaresFirmadosDTO value) {
        return new JAXBElement<SolicitudPagaresFirmadosDTO>(_PagaresFirmadosDto_QNAME, SolicitudPagaresFirmadosDTO.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link SolicitudCancelacionPagaresServiceDTO }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://deceval.com/sdl/services/", name = "listaCancelacionPagaresServiceDTO")
    public JAXBElement<SolicitudCancelacionPagaresServiceDTO> createListaCancelacionPagaresServiceDTO(SolicitudCancelacionPagaresServiceDTO value) {
        return new JAXBElement<SolicitudCancelacionPagaresServiceDTO>(_ListaCancelacionPagaresServiceDTO_QNAME, SolicitudCancelacionPagaresServiceDTO.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link RespuestaDesembolsoAnotarCuentaDTO }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://deceval.com/sdl/services/", name = "RespuestaDesembolsoAnotarCuentaDTO")
    public JAXBElement<RespuestaDesembolsoAnotarCuentaDTO> createRespuestaDesembolsoAnotarCuentaDTO(RespuestaDesembolsoAnotarCuentaDTO value) {
        return new JAXBElement<RespuestaDesembolsoAnotarCuentaDTO>(_RespuestaDesembolsoAnotarCuentaDTO_QNAME, RespuestaDesembolsoAnotarCuentaDTO.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link SolicitudFirmarPagaresDTO }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://deceval.com/sdl/services/", name = "solicitudFirmarPagareDTO")
    public JAXBElement<SolicitudFirmarPagaresDTO> createSolicitudFirmarPagareDTO(SolicitudFirmarPagaresDTO value) {
        return new JAXBElement<SolicitudFirmarPagaresDTO>(_SolicitudFirmarPagareDTO_QNAME, SolicitudFirmarPagaresDTO.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link RespuestaConsultarPagaresDTO }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://deceval.com/sdl/services/", name = "RespuestaConsultarPagaresDTO")
    public JAXBElement<RespuestaConsultarPagaresDTO> createRespuestaConsultarPagaresDTO(RespuestaConsultarPagaresDTO value) {
        return new JAXBElement<RespuestaConsultarPagaresDTO>(_RespuestaConsultarPagaresDTO_QNAME, RespuestaConsultarPagaresDTO.class, null, value);
    }
}
