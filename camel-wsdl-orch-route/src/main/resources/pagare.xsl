<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:xalan="http://xml.apache.org/xslt"
                xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
                xmlns:enc="http://www.deceval.com/comunes/modelos/xsd/Encabezados"
                xmlns:soap="http://www.w3.org/2003/05/soap-envelope"
                xmlns:ser="http://deceval.com/sdl/services/"
                xmlns:pag="http://www.deceval.com/comercial/modelos/xsd/Pagares"
                xmlns:java="java:com.deceval.sdl.services.dto.request"
                xmlns:java1="java:com.deceval.sdl.services.dto.common"
                xmlns:java2="java:com.deceval.sdl.services.dto"
                exclude-result-prefixes="soap enc pag xalan" version="1.0">
    <xsl:output method="xml" omit-xml-declaration="no" indent="yes" xalan:indent-amount="4"/>
    <xsl:strip-space elements="*"/>

    <xsl:template match="soap:Envelope">
        <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ser="http://deceval.com/sdl/services/" xmlns:java="java:com.deceval.sdl.services.dto.request" xmlns:java1="java:com.deceval.sdl.services.dto.common" xmlns:java2="java:com.deceval.sdl.services.dto">
            <xsl:apply-templates select="soap:Header"/>
            <xsl:apply-templates select="soap:Body"/>
        </soapenv:Envelope>
    </xsl:template>

    <xsl:template match="soap:Header">
        <soapenv:Header/>
    </xsl:template>

    <xsl:template match="soap:Body">
        <soapenv:Body>
            <ser:solicitud>
                <xsl:apply-templates select="/soap:Envelope/soap:Header/enc:EncabezadoEntrada"/>
                <xsl:apply-templates select="pag:Pagares"/>
            </ser:solicitud>
        </soapenv:Body>
    </xsl:template>

    <xsl:template match="/soap:Envelope/soap:Header/enc:EncabezadoEntrada">
        <java:Header>
            <xsl:apply-templates select="enc:Fecha"/>
            <xsl:apply-templates select="enc:Hora"/>
            <xsl:apply-templates select="enc:Usuario"/>
            <xsl:apply-templates select="enc:CodigoUsuario"/>
        </java:Header>
    </xsl:template>

    <xsl:template match="enc:Fecha">
        <java1:Fecha>
            <xsl:value-of select="."/>
        </java1:Fecha>
    </xsl:template>
    <xsl:template match="enc:Hora">
        <java1:Hora>
            <xsl:value-of select="."/>
        </java1:Hora>
    </xsl:template>
    <xsl:template match="enc:Usuario">
        <java1:Usuario>
            <xsl:value-of select="."/>
        </java1:Usuario>
    </xsl:template>
    <xsl:template match="enc:CodigoUsuario">
        <java1:CodigoDepositante>
            <xsl:value-of select="."/>
        </java1:CodigoDepositante>
    </xsl:template>

    <xsl:template match="pag:Pagare">
        <java:DocumentoPagareServiceDTO>
            <xsl:apply-templates select="pag:NitEmisor"/>
            <xsl:apply-templates select="pag:idClaseDefinicionDocumento"/>
            <xsl:apply-templates select="pag:FechaGrabacion"/>
            <xsl:apply-templates select="pag:TipoPagare"/>
            <xsl:apply-templates select="pag:NumeroPagareEntidad"/>
            <xsl:apply-templates select="pag:NumeroCredito"/>
            <xsl:apply-templates select="pag:NumeroReferencia"/>
            <xsl:apply-templates select="pag:FechaDesembolso"/>
            <xsl:apply-templates select="pag:TipoOtorgante"/>
            <xsl:apply-templates select="pag:OtorganteNumId"/>
            <xsl:apply-templates select="pag:OtorganteCuenta"/>
            <xsl:apply-templates select="pag:ApoderadoTipoId"/>
            <xsl:apply-templates select="pag:ApoderadoNumId"/>
            <xsl:apply-templates select="pag:ApoderadoCuenta"/>
            <xsl:apply-templates select="pag:ListaCodeudoresAvalistasPagare/pag:girador"/>
            <xsl:apply-templates select="pag:CreditoReembolsableEn"/>
            <xsl:apply-templates select="pag:NumUnidadesUVR"/>
            <xsl:apply-templates select="pag:ValorPesosDesembolso"/>
            <xsl:apply-templates select="pag:ValorPesosDiligenciamiento"/>
            <xsl:apply-templates select="pag:TasaInteresRenumEA"/>
            <xsl:apply-templates select="pag:BaseLiquidacionTasa"/>
            <xsl:apply-templates select="pag:TasaInteres"/>
            <xsl:apply-templates select="pag:Modalidad"/>
            <xsl:apply-templates select="pag:DtfDessembolso"/>
            <xsl:apply-templates select="pag:Spreed"/>
            <xsl:apply-templates select="pag:TasaRedescuento"/>
            <xsl:apply-templates select="pag:DtfEA"/>
            <xsl:apply-templates select="pag:BaseLiquidacionPlazo"/>
            <xsl:apply-templates select="pag:PlazoCreditoDe"/>
            <xsl:apply-templates select="pag:PlazoCreditoHasta"/>
            <xsl:apply-templates select="pag:PeriodoGracia"/>
            <xsl:apply-templates select="pag:PeriodoGraciaDe"/>
            <xsl:apply-templates select="pag:PeriodoGraciaHasta"/>
            <xsl:apply-templates select="pag:PeriodoMuerto"/>
            <xsl:apply-templates select="pag:PeriodoMuertoDe"/>
            <xsl:apply-templates select="pag:PeriodoMuertoHasta"/>
            <xsl:apply-templates select="pag:ModalidadPagosInteres"/>
            <xsl:apply-templates select="pag:FechaPagoPrimerCuota"/>
            <xsl:apply-templates select="pag:ModalidadPagoCapital"/>
            <xsl:apply-templates select="pag:FechaPagoPrimerCuotaCapital"/>
            <xsl:apply-templates select="pag:OtraModalidadPago"/>
            <xsl:apply-templates select="pag:Cuotas"/>
            <xsl:apply-templates select="pag:FechaPagoPrimerCuotaInteres"/>
            <xsl:apply-templates select="pag:ValorCuotaPesos"/>
            <xsl:apply-templates select="pag:ValorCuotaUVR"/>
            <xsl:apply-templates select="pag:PorcentAmortizacionMensual"/>
            <xsl:apply-templates select="pag:FechaPagoPrimerCuotaMensual"/>
            <xsl:apply-templates select="pag:PorcentAmortizacionSemestral"/>
            <xsl:apply-templates select="pag:FechaPagoPrimerCuotaSemestral"/>
            <xsl:apply-templates select="pag:CiudadDesembolso"/>
            <xsl:apply-templates select="pag:Departamento"/>
            <xsl:apply-templates select="pag:Pais"/>
            <xsl:apply-templates select="pag:CodOficina"/>
            <xsl:apply-templates select="pag:Regional"/>
            <xsl:apply-templates select="pag:AutorizaDebitoAutomatico"/>
            <xsl:apply-templates select="pag:Cuenta"/>
            <xsl:apply-templates select="pag:AdquisicionVivienda"/>
            <xsl:apply-templates select="pag:ConstruccionViviendaIndividual"/>
            <xsl:apply-templates select="pag:MejoramientoViviendaInterSoci"/>
            <xsl:apply-templates select="pag:OtroDestino"/>
            <xsl:apply-templates select="pag:DestinoOperacion"/>
            <xsl:apply-templates select="pag:Vis"/>
            <xsl:apply-templates select="pag:NoVis"/>
            <xsl:apply-templates select="pag:ListaAmortizaciones"/>
            <xsl:apply-templates select="pag:CiConCuotasExtras"/>
            <xsl:apply-templates select="pag:CiValorCuotaExtra"/>
            <xsl:apply-templates select="pag:CiNumCuotasExtras"/>
            <xsl:apply-templates select="pag:CiCEPagaderaCada"/>
            <xsl:apply-templates select="pag:CiCEApartirDelMes"/>
            <xsl:apply-templates select="pag:IdDocumentoPagare"/>
            <xsl:apply-templates select="pag:MensajeRespuesta"/>
            <xsl:apply-templates select="pag:ListaGiradoresType/pag:girador"/>
            <xsl:apply-templates select="pag:EmpresaOtorgante"/>
            <xsl:apply-templates select="pag:CiudadCreacion"/>
            <xsl:apply-templates select="pag:DeptoCreacion"/>
            <xsl:apply-templates select="pag:PaisCreacion"/>
            <xsl:apply-templates select="pag:ValorPesosDesembolsoLetras"/>
            <xsl:apply-templates select="pag:ValorPesosActual"/>
            <xsl:apply-templates select="pag:ValorCapitalNumero"/>
            <xsl:apply-templates select="pag:ValorCapitalLetras"/>
            <xsl:apply-templates select="pag:MargenRedescuento"/>
            <xsl:apply-templates select="pag:PuntosPorcentualesRedescuento"/>
            <xsl:apply-templates select="pag:ValorDesembolsoUVRLetras"/>
            <xsl:apply-templates select="pag:TasaInteresRenumEALetras"/>
            <xsl:apply-templates select="pag:TasaInteresMora"/>
            <xsl:apply-templates select="pag:FechaVencimientoFinanciero"/>
            <xsl:apply-templates select="pag:PlazoNumero"/>
            <xsl:apply-templates select="pag:PlazoLetras"/>
            <xsl:apply-templates select="pag:PeriodicidadPlazo"/>
            <xsl:apply-templates select="pag:PeriodoGraciaNumero"/>
            <xsl:apply-templates select="pag:PeriodoGraciaLetras"/>
            <xsl:apply-templates select="pag:PeriodicidadGracia"/>
            <xsl:apply-templates select="pag:PeriodoMuertoNumero"/>
            <xsl:apply-templates select="pag:PeriodoMuertoLetras"/>
            <xsl:apply-templates select="pag:PeriodicidadMuerto"/>
            <xsl:apply-templates select="pag:NumCuotasLetras"/>
            <xsl:apply-templates select="pag:ValorCuotaPesosLetras"/>
            <xsl:apply-templates select="pag:ValorCuotaUVRLetras"/>
            <xsl:apply-templates select="pag:ValorInteresesNumero"/>
            <xsl:apply-templates select="pag:ValorInteresesLetras"/>
            <xsl:apply-templates select="pag:PorcentajeComision"/>
            <xsl:apply-templates select="pag:PorcentajeCobertura"/>
            <xsl:apply-templates select="pag:GarantiaAdicional"/>
            <xsl:apply-templates select="pag:DiaPago"/>
            <xsl:apply-templates select="pag:CiConPeriodoGracia"/>
            <xsl:apply-templates select="pag:TasaNominal"/>
            <xsl:apply-templates select="pag:TasaNominalLetras"/>
            <xsl:apply-templates select="pag:TasaInteresMoraLetras"/>
            <xsl:apply-templates select="pag:TextoAdicional"/>
            <xsl:apply-templates select="pag:ListaArchivosAdjuntosType/pag:ArchivoAdjuntoType"/>
            <xsl:apply-templates select="pag:SeguroVida"/>
            <xsl:apply-templates select="pag:Aval"/>
        </java:DocumentoPagareServiceDTO>
    </xsl:template>

    <xsl:template match="pag:NitEmisor">
        <java2:NitEmisor>
            <xsl:value-of select="."/>
        </java2:NitEmisor>
    </xsl:template>
    <xsl:template match="pag:idClaseDefinicionDocumento">
        <java2:IdClaseDefinicionDocumento>
            <xsl:value-of select="."/>
        </java2:IdClaseDefinicionDocumento>
    </xsl:template>
    <xsl:template match="pag:FechaGrabacion">
        <java2:FechaGrabacionPagare>
            <xsl:value-of select="."/>
        </java2:FechaGrabacionPagare>
    </xsl:template>
    <xsl:template match="pag:TipoPagare">
        <java2:TipoPagare>
            <xsl:value-of select="."/>
        </java2:TipoPagare>
    </xsl:template>
    <xsl:template match="pag:NumeroPagareEntidad">
        <java2:NumPagareEntidad>
            <xsl:value-of select="."/>
        </java2:NumPagareEntidad>
    </xsl:template>
    <xsl:template match="pag:NumeroCredito">
        <java2:NumCredito>
            <xsl:value-of select="."/>
        </java2:NumCredito>
    </xsl:template>
    <xsl:template match="pag:NumeroReferencia">
        <java2:NumReferencia>
            <xsl:value-of select="."/>
        </java2:NumReferencia>
    </xsl:template>
    <xsl:template match="pag:FechaDesembolso">
        <java2:FechaDesembolso>
            <xsl:value-of select="."/>
        </java2:FechaDesembolso>
    </xsl:template>
    <xsl:template match="pag:TipoOtorgante">
        <java2:OtorganteTipoId>
            <xsl:value-of select="."/>
        </java2:OtorganteTipoId>
    </xsl:template>
    <xsl:template match="pag:OtorganteNumId">
        <java2:OtorganteNumId>
            <xsl:value-of select="."/>
        </java2:OtorganteNumId>
    </xsl:template>
    <xsl:template match="pag:OtorganteCuenta">
        <java2:OtorganteCuenta>
            <xsl:value-of select="."/>
        </java2:OtorganteCuenta>
    </xsl:template>
    <xsl:template match="pag:ApoderadoTipoId">
        <java2:ApoderadoTipoId>
            <xsl:value-of select="."/>
        </java2:ApoderadoTipoId>
    </xsl:template>
    <xsl:template match="pag:ApoderadoNumId">
        <java2:ApoderadoNumId>
            <xsl:value-of select="."/>
        </java2:ApoderadoNumId>
    </xsl:template>
    <xsl:template match="pag:ApoderadoCuenta">
        <java2:ApoderadoCuenta>
            <xsl:value-of select="."/>
        </java2:ApoderadoCuenta>
    </xsl:template>

    <xsl:template match="pag:ListaCodeudoresAvalistasPagare/pag:girador">
        <java2:ListaCodeudoresAvalistasPagare>
            <xsl:apply-templates select="pag:Tipo"/>
            <xsl:apply-templates select="pag:Identificacion"/>
            <xsl:apply-templates select="pag:Cuenta"/>
            <xsl:apply-templates select="pag:Rol"/>
            <xsl:apply-templates select="pag:PersonaRepresentada"/>
        </java2:ListaCodeudoresAvalistasPagare>
    </xsl:template>
    <xsl:template match="pag:Tipo">
        <java2:GiradorTipoId>
            <xsl:value-of select="."/>
        </java2:GiradorTipoId>
    </xsl:template>
    <xsl:template match="pag:Identificacion">
        <java2:GiradorNumId>
            <xsl:value-of select="."/>
        </java2:GiradorNumId>
    </xsl:template>
    <xsl:template match="pag:Cuenta">
        <java2:GiradorCuenta>
            <xsl:value-of select="."/>
        </java2:GiradorCuenta>
    </xsl:template>
    <xsl:template match="pag:Rol">
        <java2:IdRol>
            <xsl:value-of select="."/>
        </java2:IdRol>
    </xsl:template>
    <xsl:template match="pag:PersonaRepresentada">
        <java2:IdPersonaRepresentada>
            <xsl:value-of select="."/>
        </java2:IdPersonaRepresentada>
    </xsl:template>

    <xsl:template match="pag:CreditoReembolsableEn">
        <java2:CreditoReembolsableEn>
            <xsl:value-of select="."/>
        </java2:CreditoReembolsableEn>
    </xsl:template>
    <xsl:template match="pag:NumUnidadesUVR">
        <java2:NumUnidadesUVR>
            <xsl:value-of select="."/>
        </java2:NumUnidadesUVR>
    </xsl:template>
    <xsl:template match="pag:ValorPesosDesembolso">
        <java2:ValorPesosDesembolso>
            <xsl:value-of select="."/>
        </java2:ValorPesosDesembolso>
    </xsl:template>
    <xsl:template match="pag:ValorPesosDiligenciamiento">
        <java2:ValorPesosDiligenciamiento>
            <xsl:value-of select="."/>
        </java2:ValorPesosDiligenciamiento>
    </xsl:template>
    <xsl:template match="pag:TasaInteresRenumEA">
        <java2:TasaInteresRenumEA>
            <xsl:value-of select="."/>
        </java2:TasaInteresRenumEA>
    </xsl:template>
    <xsl:template match="pag:BaseLiquidacionTasa">
        <java2:BaseLiquidacionTasa>
            <xsl:value-of select="."/>
        </java2:BaseLiquidacionTasa>
    </xsl:template>
    <xsl:template match="pag:TasaInteres">
        <java2:TasaInteres>
            <xsl:value-of select="."/>
        </java2:TasaInteres>
    </xsl:template>
    <xsl:template match="pag:Modalidad">
        <java2:Modalidad>
            <xsl:value-of select="."/>
        </java2:Modalidad>
    </xsl:template>
    <xsl:template match="pag:DtfDessembolso">
        <java2:DtfDessembolso>
            <xsl:value-of select="."/>
        </java2:DtfDessembolso>
    </xsl:template>
    <xsl:template match="pag:Spreed">
        <java2:Spreed>
            <xsl:value-of select="."/>
        </java2:Spreed>
    </xsl:template>
    <xsl:template match="pag:TasaRedescuento">
        <java2:TasaRedescuento>
            <xsl:value-of select="."/>
        </java2:TasaRedescuento>
    </xsl:template>
    <xsl:template match="pag:DtfEA">
        <java2:DtfEA>
            <xsl:value-of select="."/>
        </java2:DtfEA>
    </xsl:template>
    <xsl:template match="pag:BaseLiquidacionPlazo">
        <java2:BaseLiquidacionPlazo>
            <xsl:value-of select="."/>
        </java2:BaseLiquidacionPlazo>
    </xsl:template>
    <xsl:template match="pag:PlazoCreditoDe">
        <java2:PlazoCreditoDe>
            <xsl:value-of select="."/>
        </java2:PlazoCreditoDe>
    </xsl:template>
    <xsl:template match="pag:PlazoCreditoHasta">
        <java2:PlazoCreditoHasta>
            <xsl:value-of select="."/>
        </java2:PlazoCreditoHasta>
    </xsl:template>
    <xsl:template match="pag:PeriodoGracia">
        <java2:PeriodoGracia>
            <xsl:value-of select="."/>
        </java2:PeriodoGracia>
    </xsl:template>
    <xsl:template match="pag:PeriodoGraciaDe">
        <java2:PeriodoGraciaDe>
            <xsl:value-of select="."/>
        </java2:PeriodoGraciaDe>
    </xsl:template>
    <xsl:template match="pag:PeriodoGraciaHasta">
        <java2:PeriodoGraciaHasta>
            <xsl:value-of select="."/>
        </java2:PeriodoGraciaHasta>
    </xsl:template>
    <xsl:template match="pag:PeriodoMuerto">
        <java2:PeriodoMuerto>
            <xsl:value-of select="."/>
        </java2:PeriodoMuerto>
    </xsl:template>
    <xsl:template match="pag:PeriodoMuertoDe">
        <java2:PeriodoMuertoDe>
            <xsl:value-of select="."/>
        </java2:PeriodoMuertoDe>
    </xsl:template>
    <xsl:template match="pag:PeriodoMuertoHasta">
        <java2:PeriodoMuertoHasta>
            <xsl:value-of select="."/>
        </java2:PeriodoMuertoHasta>
    </xsl:template>
    <xsl:template match="pag:ModalidadPagosInteres">
        <java2:ModalidadPagosInteres>
            <xsl:value-of select="."/>
        </java2:ModalidadPagosInteres>
    </xsl:template>
    <xsl:template match="pag:FechaPagoPrimerCuota">
        <java2:FechaPagoPrimerCuota>
            <xsl:value-of select="."/>
        </java2:FechaPagoPrimerCuota>
    </xsl:template>
    <xsl:template match="pag:ModalidadPagoCapital">
        <java2:ModalidadPagoCapital>
            <xsl:value-of select="."/>
        </java2:ModalidadPagoCapital>
    </xsl:template>
    <xsl:template match="pag:FechaPagoPrimerCuotaCapital">
        <java2:FechaPagoPrimerCuotaCapital>
            <xsl:value-of select="."/>
        </java2:FechaPagoPrimerCuotaCapital>
    </xsl:template>
    <xsl:template match="pag:OtraModalidadPago">
        <java2:OtraModalidadPago>
            <xsl:value-of select="."/>
        </java2:OtraModalidadPago>
    </xsl:template>
    <xsl:template match="pag:Cuotas">
        <java2:NumCuotas>
            <xsl:value-of select="."/>
        </java2:NumCuotas>
    </xsl:template>
    <xsl:template match="pag:FechaPagoPrimerCuotaInteres">
        <java2:FechaPagoPrimerCuotaInteres>
            <xsl:value-of select="."/>
        </java2:FechaPagoPrimerCuotaInteres>
    </xsl:template>
    <xsl:template match="pag:ValorCuotaPesos">
        <java2:ValorCuotaPesos>
            <xsl:value-of select="."/>
        </java2:ValorCuotaPesos>
    </xsl:template>
    <xsl:template match="pag:ValorCuotaUVR">
        <java2:ValorCuotaUVR>
            <xsl:value-of select="."/>
        </java2:ValorCuotaUVR>
    </xsl:template>
    <xsl:template match="pag:PorcentAmortizacionMensual">
        <java2:PorcentAmortizacionMensual>
            <xsl:value-of select="."/>
        </java2:PorcentAmortizacionMensual>
    </xsl:template>
    <xsl:template match="pag:FechaPagoPrimerCuotaMensual">
        <java2:FechaPagoPrimerCuotaMensual>
            <xsl:value-of select="."/>
        </java2:FechaPagoPrimerCuotaMensual>
    </xsl:template>
    <xsl:template match="pag:PorcentAmortizacionSemestral">
        <java2:PorcentAmortizacionSemestral>
            <xsl:value-of select="."/>
        </java2:PorcentAmortizacionSemestral>
    </xsl:template>
    <xsl:template match="pag:FechaPagoPrimerCuotaSemestral">
        <java2:FechaPagoPrimerCuotaSemestral>
            <xsl:value-of select="."/>
        </java2:FechaPagoPrimerCuotaSemestral>
    </xsl:template>
    <xsl:template match="pag:CiudadDesembolso">
        <java2:CiudadDesembolso>
            <xsl:value-of select="."/>
        </java2:CiudadDesembolso>
    </xsl:template>
    <xsl:template match="pag:Departamento">
        <java2:Departamento>
            <xsl:value-of select="."/>
        </java2:Departamento>
    </xsl:template>
    <xsl:template match="pag:Pais">
        <java2:Pais>
            <xsl:value-of select="."/>
        </java2:Pais>
    </xsl:template>
    <xsl:template match="pag:CodOficina">
        <java2:CodOficina>
            <xsl:value-of select="."/>
        </java2:CodOficina>
    </xsl:template>
    <xsl:template match="pag:Regional">
        <java2:Regional>
            <xsl:value-of select="."/>
        </java2:Regional>
    </xsl:template>
    <xsl:template match="pag:AutorizaDebitoAutomatico">
        <java2:AutorizaDebitoAutomatico>
            <xsl:value-of select="."/>
        </java2:AutorizaDebitoAutomatico>
    </xsl:template>
    <xsl:template match="pag:Pagare/pag:Cuenta">
        <java2:Cuenta>
            <xsl:value-of select="."/>
        </java2:Cuenta>
    </xsl:template>
    <xsl:template match="pag:AdquisicionVivienda">
        <java2:AdquisicionVivienda>
            <xsl:value-of select="."/>
        </java2:AdquisicionVivienda>
    </xsl:template>
    <xsl:template match="pag:ConstruccionViviendaIndividual">
        <java2:ConstruccionViviendaIndividual>
            <xsl:value-of select="."/>
        </java2:ConstruccionViviendaIndividual>
    </xsl:template>
    <xsl:template match="pag:MejoramientoViviendaInterSoci">
        <java2:MejoramientoViviendaInterSoci>
            <xsl:value-of select="."/>
        </java2:MejoramientoViviendaInterSoci>
    </xsl:template>
    <xsl:template match="pag:OtroDestino">
        <java2:OtroDestino>
            <xsl:value-of select="."/>
        </java2:OtroDestino>
    </xsl:template>
    <xsl:template match="pag:DestinoOperacion">
        <java2:DestinoOperacion>
            <xsl:value-of select="."/>
        </java2:DestinoOperacion>
    </xsl:template>
    <xsl:template match="pag:Vis">
        <java2:Vis>
            <xsl:value-of select="."/>
        </java2:Vis>
    </xsl:template>
    <xsl:template match="pag:NoVis">
        <java2:NoVis>
            <xsl:value-of select="."/>
        </java2:NoVis>
    </xsl:template>
    <xsl:template match="pag:ListaAmortizaciones">
        <java2:ListaAmortizaciones>
            <xsl:value-of select="."/>
        </java2:ListaAmortizaciones>
    </xsl:template>
    <xsl:template match="pag:CiConCuotasExtras">
        <java2:CiConCuotasExtras>
            <xsl:value-of select="."/>
        </java2:CiConCuotasExtras>
    </xsl:template>
    <xsl:template match="pag:CiValorCuotaExtra">
        <java2:CiValorCuotaExtra>
            <xsl:value-of select="."/>
        </java2:CiValorCuotaExtra>
    </xsl:template>
    <xsl:template match="pag:CiNumCuotasExtras">
        <java2:CiNumCuotasExtras>
            <xsl:value-of select="."/>
        </java2:CiNumCuotasExtras>
    </xsl:template>
    <xsl:template match="pag:CiCEPagaderaCada">
        <java2:CiCEPagaderaCada>
            <xsl:value-of select="."/>
        </java2:CiCEPagaderaCada>
    </xsl:template>
    <xsl:template match="pag:CiCEApartirDelMes">
        <java2:CiCEApartirDelMes>
            <xsl:value-of select="."/>
        </java2:CiCEApartirDelMes>
    </xsl:template>
    <xsl:template match="pag:IdDocumentoPagare">
        <java2:IdDocumentoPagare>
            <xsl:value-of select="."/>
        </java2:IdDocumentoPagare>
    </xsl:template>
    <xsl:template match="pag:MensajeRespuesta">
        <java2:MensajeRespuesta>
            <xsl:value-of select="."/>
        </java2:MensajeRespuesta>
    </xsl:template>

    <xsl:template match="pag:ListaGiradoresType/pag:girador">
        <java2:ListaApoderadoRepresentantePagare>
            <xsl:apply-templates select="pag:Tipo"/>
            <xsl:apply-templates select="pag:Identificacion"/>
            <xsl:apply-templates select="pag:Cuenta"/>
            <xsl:apply-templates select="pag:Rol"/>
            <xsl:apply-templates select="pag:PersonaRepresentada"/>
        </java2:ListaApoderadoRepresentantePagare>
    </xsl:template>

    <xsl:template match="pag:EmpresaOtorgante">
        <java2:EmpresaOtorgante>
            <xsl:value-of select="."/>
        </java2:EmpresaOtorgante>
    </xsl:template>
    <xsl:template match="pag:CiudadCreacion">
        <java2:CiudadCreacion>
            <xsl:value-of select="."/>
        </java2:CiudadCreacion>
    </xsl:template>
    <xsl:template match="pag:DeptoCreacion">
        <java2:DeptoCreacion>
            <xsl:value-of select="."/>
        </java2:DeptoCreacion>
    </xsl:template>
    <xsl:template match="pag:PaisCreacion">
        <java2:PaisCreacion>
            <xsl:value-of select="."/>
        </java2:PaisCreacion>
    </xsl:template>
    <xsl:template match="pag:ValorPesosDesembolsoLetras">
        <java2:ValorPesosDesembolsoLetras>
            <xsl:value-of select="."/>
        </java2:ValorPesosDesembolsoLetras>
    </xsl:template>
    <xsl:template match="pag:ValorPesosActual">
        <java2:ValorPesosActual>
            <xsl:value-of select="."/>
        </java2:ValorPesosActual>
    </xsl:template>
    <xsl:template match="pag:ValorCapitalNumero">
        <java2:ValorCapitalNumero>
            <xsl:value-of select="."/>
        </java2:ValorCapitalNumero>
    </xsl:template>
    <xsl:template match="pag:ValorCapitalLetras">
        <java2:ValorCapitalLetras>
            <xsl:value-of select="."/>
        </java2:ValorCapitalLetras>
    </xsl:template>
    <xsl:template match="pag:MargenRedescuento">
        <java2:MargenRedescuento>
            <xsl:value-of select="."/>
        </java2:MargenRedescuento>
    </xsl:template>
    <xsl:template match="pag:PuntosPorcentualesRedescuento">
        <java2:PuntosPorcentualesRedescuento>
            <xsl:value-of select="."/>
        </java2:PuntosPorcentualesRedescuento>
    </xsl:template>
    <xsl:template match="pag:ValorDesembolsoUVRLetras">
        <java2:ValorDesembolsoUVRLetras>
            <xsl:value-of select="."/>
        </java2:ValorDesembolsoUVRLetras>
    </xsl:template>
    <xsl:template match="pag:TasaInteresRenumEALetras">
        <java2:TasaInteresRenumEALetras>
            <xsl:value-of select="."/>
        </java2:TasaInteresRenumEALetras>
    </xsl:template>
    <xsl:template match="pag:TasaInteresMora">
        <java2:TasaInteresMora>
            <xsl:value-of select="."/>
        </java2:TasaInteresMora>
    </xsl:template>
    <xsl:template match="pag:FechaVencimientoFinanciero">
        <java2:FechaVencimientoFinanciero>
            <xsl:value-of select="."/>
        </java2:FechaVencimientoFinanciero>
    </xsl:template>
    <xsl:template match="pag:PlazoNumero">
        <java2:PlazoNumero>
            <xsl:value-of select="."/>
        </java2:PlazoNumero>
    </xsl:template>
    <xsl:template match="pag:PlazoLetras">
        <java2:PlazoLetras>
            <xsl:value-of select="."/>
        </java2:PlazoLetras>
    </xsl:template>
    <xsl:template match="pag:PeriodicidadPlazo">
        <java2:PeriodicidadPlazo>
            <xsl:value-of select="."/>
        </java2:PeriodicidadPlazo>
    </xsl:template>
    <xsl:template match="pag:PeriodoGraciaNumero">
        <java2:PeriodoGraciaNumero>
            <xsl:value-of select="."/>
        </java2:PeriodoGraciaNumero>
    </xsl:template>
    <xsl:template match="pag:PeriodoGraciaLetras">
        <java2:PeriodoGraciaLetras>
            <xsl:value-of select="."/>
        </java2:PeriodoGraciaLetras>
    </xsl:template>
    <xsl:template match="pag:PeriodicidadGracia">
        <java2:PeriodicidadGracia>
            <xsl:value-of select="."/>
        </java2:PeriodicidadGracia>
    </xsl:template>
    <xsl:template match="pag:PeriodoMuertoNumero">
        <java2:PeriodoMuertoNumero>
            <xsl:value-of select="."/>
        </java2:PeriodoMuertoNumero>
    </xsl:template>
    <xsl:template match="pag:PeriodoMuertoLetras">
        <java2:PeriodoMuertoLetras>
            <xsl:value-of select="."/>
        </java2:PeriodoMuertoLetras>
    </xsl:template>
    <xsl:template match="pag:PeriodicidadMuerto">
        <java2:PeriodicidadMuerto>
            <xsl:value-of select="."/>
        </java2:PeriodicidadMuerto>
    </xsl:template>
    <xsl:template match="pag:NumCuotasLetras">
        <java2:NumCuotasLetras>
            <xsl:value-of select="."/>
        </java2:NumCuotasLetras>
    </xsl:template>
    <xsl:template match="pag:ValorCuotaPesosLetras">
        <java2:ValorCuotaPesosLetras>
            <xsl:value-of select="."/>
        </java2:ValorCuotaPesosLetras>
    </xsl:template>
    <xsl:template match="pag:ValorCuotaUVRLetras">
        <java2:ValorCuotaUVRLetras>
            <xsl:value-of select="."/>
        </java2:ValorCuotaUVRLetras>
    </xsl:template>
    <xsl:template match="pag:ValorInteresesNumero">
        <java2:ValorInteresesNumero>
            <xsl:value-of select="."/>
        </java2:ValorInteresesNumero>
    </xsl:template>
    <xsl:template match="pag:ValorInteresesLetras">
        <java2:ValorInteresesLetras>
            <xsl:value-of select="."/>
        </java2:ValorInteresesLetras>
    </xsl:template>
    <xsl:template match="pag:PorcentajeComision">
        <java2:PorcentajeComision>
            <xsl:value-of select="."/>
        </java2:PorcentajeComision>
    </xsl:template>
    <xsl:template match="pag:PorcentajeCobertura">
        <java2:PorcentajeCobertura>
            <xsl:value-of select="."/>
        </java2:PorcentajeCobertura>
    </xsl:template>
    <xsl:template match="pag:GarantiaAdicional">
        <java2:GarantiaAdicional>
            <xsl:value-of select="."/>
        </java2:GarantiaAdicional>
    </xsl:template>
    <xsl:template match="pag:DiaPago">
        <java2:DiaPago>
            <xsl:value-of select="."/>
        </java2:DiaPago>
    </xsl:template>
    <xsl:template match="pag:CiConPeriodoGracia">
        <java2:CiConPeriodoGracia>
            <xsl:value-of select="."/>
        </java2:CiConPeriodoGracia>
    </xsl:template>
    <xsl:template match="pag:TasaNominal">
        <java2:TasaNominal>
            <xsl:value-of select="."/>
        </java2:TasaNominal>
    </xsl:template>
    <xsl:template match="pag:TasaNominalLetras">
        <java2:TasaNominalLetras>
            <xsl:value-of select="."/>
        </java2:TasaNominalLetras>
    </xsl:template>
    <xsl:template match="pag:TasaInteresMoraLetras">
        <java2:TasaInteresMoraLetras>
            <xsl:value-of select="."/>
        </java2:TasaInteresMoraLetras>
    </xsl:template>
    <xsl:template match="pag:TextoAdicional">
        <java2:TextoAdicional>
            <xsl:value-of select="."/>
        </java2:TextoAdicional>
    </xsl:template>

    <xsl:template match="pag:ListaArchivosAdjuntosType/pag:ArchivoAdjuntoType">
        <java2:ArchivosAdjuntos>
            <xsl:apply-templates select="pag:NombreArchivo"/>
            <xsl:apply-templates select="pag:Contenido"/>
        </java2:ArchivosAdjuntos>
    </xsl:template>
    <xsl:template match="pag:NombreArchivo">
        <java2:NombreArchivo>
            <xsl:value-of select="."/>
        </java2:NombreArchivo>
    </xsl:template>
    <xsl:template match="pag:Contenido">
        <java2:Contenido>
            <xsl:value-of select="."/>
        </java2:Contenido>
    </xsl:template>

    <xsl:template match="pag:SeguroVida">
        <java2:SeguroVida>
            <xsl:value-of select="."/>
        </java2:SeguroVida>
    </xsl:template>
    <xsl:template match="pag:Aval">
        <java2:Aval>
            <xsl:value-of select="."/>
        </java2:Aval>
    </xsl:template>
</xsl:stylesheet> 
