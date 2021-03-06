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
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.2.4-b01 Generated
 * source version: 2.2
 *
 */
@WebService(name = "SDLService", targetNamespace = "http://deceval.com/sdl/services/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    com.deceval.sdl.services.ObjectFactory.class,
    co.com.deceval.sdl.services.ObjectFactory.class,
    co.com.deceval.sdl.services.dto.ObjectFactory.class
})
public interface SDLService {

    /**
     *
     * @param listaConsultarPagaresDTO
     * @return returns
     * java.com_deceval_sdl_services_dto.RespuestaConsultarPagaresDTO
     */
    @WebMethod(action = "ConsultarPagares")
    @WebResult(name = "RespuestaConsultarPagaresDTO", targetNamespace = "http://deceval.com/sdl/services/", partName = "RespuestaConsultarPagaresDTO")
    public RespuestaConsultarPagaresDTO consultarPagares(
            @WebParam(name = "listaConsultarPagaresDTO", targetNamespace = "http://deceval.com/sdl/services/", partName = "listaConsultarPagaresDTO") SolicitudConsultarPagareDTO listaConsultarPagaresDTO);

    /**
     *
     * @param listaCancelacionPagaresServiceDTO
     * @return returns
     * java.com_deceval_sdl_services_dto.RespuestaCancelacionPagaresServiceDTO
     */
    @WebMethod(action = "CancelacionPagares")
    @WebResult(name = "RespuestaCancelacionPagaresServiceDTO", targetNamespace = "http://deceval.com/sdl/services/", partName = "RespuestaCancelacionPagaresServiceDTO")
    public RespuestaCancelacionPagaresServiceDTO cancelacionPagares(
            @WebParam(name = "listaCancelacionPagaresServiceDTO", targetNamespace = "http://deceval.com/sdl/services/", partName = "listaCancelacionPagaresServiceDTO") SolicitudCancelacionPagaresServiceDTO listaCancelacionPagaresServiceDTO);

    /**
     *
     * @param crearPagareDaneServiceDTO
     * @return returns
     * java.com_deceval_sdl_services_dto.RespuestaDocumentoPagareDaneServiceDTO
     */
    @WebMethod(operationName = "CreacionPagaresCodificado", action = "CreacionPagaresCodificado")
    @WebResult(name = "RespuestaDocumentoPagareDaneServiceDTO", targetNamespace = "http://deceval.com/sdl/services/", partName = "RespuestaDocumentoPagareDaneServiceDTO")
    public RespuestaDocumentoPagareDaneServiceDTO creacionPagaresCodificado(
            @WebParam(name = "crearPagareDaneServiceDTO", targetNamespace = "http://deceval.com/sdl/services/", partName = "crearPagareDaneServiceDTO") SolicitudCrearPagareDaneServiceDTO crearPagareDaneServiceDTO);

    /**
     *
     * @param solicitud
     * @return returns
     * java.com_deceval_sdl_services_dto.RespuestaDocumentoPagareServiceDTO
     */
    @WebMethod(action = "CreacionPagares")
    @WebResult(name = "RespuestaDocumentoPagareServiceDTO", targetNamespace = "http://deceval.com/sdl/services/", partName = "RespuestaDocumentoPagareServiceDTO")
    public RespuestaDocumentoPagareServiceDTO creacionPagares(
            @WebParam(name = "solicitud", targetNamespace = "http://deceval.com/sdl/services/", partName = "solicitud") SolicitudCrearPagareServiceDTO solicitud);

    /**
     *
     * @param crearGiradorServiceDto
     * @return returns
     * java.com_deceval_sdl_services_dto.RespuestaCrearGiradorServiceDTO
     */
    @WebMethod(operationName = "CreacionGiradores", action = "CreacionGiradores")
    @WebResult(name = "RespuestaCrearGiradorServiceDTO", targetNamespace = "http://deceval.com/sdl/services/", partName = "RespuestaCrearGiradorServiceDTO")
    public RespuestaCrearGiradorServiceDTO creacionGiradores(
            @WebParam(name = "crearGiradorServiceDto", targetNamespace = "http://deceval.com/sdl/services/", partName = "crearGiradorServiceDto") SolicitudCrearGiradorServiceDTO crearGiradorServiceDto);

    /**
     *
     * @param solicitudAmortizacionSaldosServiceDTO
     * @return returns
     * java.com_deceval_sdl_services_dto.RespuestaAmortizacionSaldosServiceDTO
     */
    @WebMethod(action = "RegistrarAmortizacion")
    @WebResult(name = "RespuestaAmortizacionSaldosServiceDTO", targetNamespace = "http://deceval.com/sdl/services/", partName = "RespuestaAmortizacionSaldosServiceDTO")
    public RespuestaAmortizacionSaldosServiceDTO registrarAmortizacion(
            @WebParam(name = "solicitudAmortizacionSaldosServiceDTO", targetNamespace = "http://deceval.com/sdl/services/", partName = "solicitudAmortizacionSaldosServiceDTO") SolicitudAmortizacionSaldosServiceDTO solicitudAmortizacionSaldosServiceDTO);

    /**
     *
     * @param pagaresFirmadosDto
     * @return returns
     * java.com_deceval_sdl_services_dto.RespuestaPagaresFirmadosDTO
     */
    @WebMethod(action = "NotificacionPagaresFirmados")
    @WebResult(name = "RespuestaPagaresFirmadosDTO", targetNamespace = "http://deceval.com/sdl/services/", partName = "RespuestaPagaresFirmadosDTO")
    public RespuestaPagaresFirmadosDTO notificacionPagaresFirmados(
            @WebParam(name = "pagaresFirmadosDto", targetNamespace = "http://deceval.com/sdl/services/", partName = "pagaresFirmadosDto") SolicitudPagaresFirmadosDTO pagaresFirmadosDto);

    /**
     *
     * @param solicitudFirmarPagareDTO
     * @return returns
     * java.com_deceval_sdl_services_dto.RespuestaFirmarPagaresDTO
     */
    @WebMethod(action = "FirmarPagares")
    @WebResult(name = "RespuestaFirmarPagaresDTO", targetNamespace = "http://deceval.com/sdl/services/", partName = "RespuestaFirmarPagaresDTO")
    public RespuestaFirmarPagaresDTO firmarPagares(
            @WebParam(name = "solicitudFirmarPagareDTO", targetNamespace = "http://deceval.com/sdl/services/", partName = "solicitudFirmarPagareDTO") SolicitudFirmarPagaresDTO solicitudFirmarPagareDTO);

    /**
     *
     * @param desembolsoAnotarCuentaDto
     * @return returns
     * java.com_deceval_sdl_services_dto.RespuestaDesembolsoAnotarCuentaDTO
     */
    @WebMethod(action = "NotificacionDesembolsoAnotacionEnCuenta")
    @WebResult(name = "RespuestaDesembolsoAnotarCuentaDTO", targetNamespace = "http://deceval.com/sdl/services/", partName = "RespuestaDesembolsoAnotarCuentaDTO")
    public RespuestaDesembolsoAnotarCuentaDTO notificacionDesembolsoAnotacionEnCuenta(
            @WebParam(name = "desembolsoAnotarCuentaDto", targetNamespace = "http://deceval.com/sdl/services/", partName = "desembolsoAnotarCuentaDto") SolicitudDesembolsoAnotarCuentaDTO desembolsoAnotarCuentaDto);

    /**
     *
     * @param crearGiradorDaneServiceDTO
     * @return returns
     * java.com_deceval_sdl_services_dto.RespuestaCrearGiradorDaneServiceDTO
     */
    @WebMethod(operationName = "CreacionGiradoresCodificados", action = "CreacionGiradoresCodificados")
    @WebResult(name = "RespuestaCrearGiradorDaneServiceDTO", targetNamespace = "http://deceval.com/sdl/services/", partName = "RespuestaCrearGiradorDaneServiceDTO")
    public RespuestaCrearGiradorDaneServiceDTO creacionGiradoresCodificados(
            @WebParam(name = "crearGiradorDaneServiceDTO", targetNamespace = "http://deceval.com/sdl/services/", partName = "crearGiradorDaneServiceDTO") SolicitudCrearGiradorDaneServiceDTO crearGiradorDaneServiceDTO);
}
