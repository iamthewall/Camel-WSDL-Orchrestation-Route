<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:xalan="http://xml.apache.org/xslt"
                xmlns:env="http://schemas.xmlsoap.org/soap/envelope/"
                xmlns:S="http://schemas.xmlsoap.org/soap/envelope/"
                xmlns:enc="http://www.deceval.com/comunes/modelos/xsd/Encabezados"
                xmlns:soap="http://www.w3.org/2003/05/soap-envelope"
                xmlns:ser="http://deceval.com/sdl/services/"
                xmlns:pag="http://www.deceval.com/comercial/modelos/xsd/Pagares"
                xmlns:ns1="java:com.deceval.sdl.services.dto.response"
                xmlns:ns3="java:com.deceval.sdl.services.dto"
                xmlns:ns4="http://deceval.com/sdl/services/"
                exclude-result-prefixes="S env  ns1 ns3 ns4 xalan" version="1.0">
    <xsl:output method="xml" omit-xml-declaration="no" indent="yes" xalan:indent-amount="4"/>
    <xsl:strip-space elements="*"/>

    <xsl:template match="S:Envelope">
        <soap:Envelope xmlns:soap="http://www.w3.org/2003/05/soap-envelope" xmlns:enc="http://www.deceval.com/comunes/modelos/xsd/Encabezados" xmlns:pag="http://www.deceval.com/comercial/modelos/xsd/Pagares">
            <xsl:apply-templates select="env:Header"/>
            <xsl:apply-templates select="S:Body"/>
        </soap:Envelope>
    </xsl:template>

    <xsl:template match="env:Header">
        <soap:Header/>
    </xsl:template>

    <xsl:template match="S:Body/ns4:RespuestaDocumentoPagareServiceDTO">
        <soap:Body>
            <pag:Pagares>
                <xsl:apply-templates select="ns1:ListaRespusta"/>
            </pag:Pagares>
        </soap:Body>
    </xsl:template>

    <xsl:template match="ns1:ListaRespusta">
        <pag:Pagare>
            <xsl:apply-templates select="ns3:NitEmisor"/>
            <xsl:apply-templates select="ns3:IdClaseDefinicionDocumento"/>
            <xsl:apply-templates select="ns3:FechaGrabacionPagare"/>
            <xsl:apply-templates select="ns3:TipoPagare"/>
            <xsl:apply-templates select="ns3:NumPagareEntidad"/>
            <xsl:apply-templates select="ns3:NumCredito"/>
            <xsl:apply-templates select="ns3:NumReferencia"/>
            <xsl:apply-templates select="ns3:FechaDesembolso"/>
            <xsl:apply-templates select="ns3:OtorganteTipoId"/>
            <xsl:apply-templates select="ns3:OtorganteNumId"/>
            <xsl:apply-templates select="ns3:OtorganteCuenta"/>
            <xsl:apply-templates select="ns3:ApoderadoTipoId"/>
            <xsl:apply-templates select="ns3:ApoderadoNumId"/>
            <xsl:apply-templates select="ns3:ApoderadoCuenta"/>
            <pag:ListaCodeudoresAvalistasPagare>
                <xsl:apply-templates select="ns3:ListaCodeudoresAvalistasPagare"/>
            </pag:ListaCodeudoresAvalistasPagare>
            <xsl:apply-templates select="ns3:CreditoReembolsableEn"/>
            <xsl:apply-templates select="ns3:NumUnidadesUVR"/>
            <xsl:apply-templates select="ns3:ValorPesosDesembolso"/>
            <xsl:apply-templates select="ns3:ValorPesosDiligenciamiento"/>
            <xsl:apply-templates select="ns3:TasaInteresRenumEA"/>
            <xsl:apply-templates select="ns3:BaseLiquidacionTasa"/>
            <xsl:apply-templates select="ns3:TasaInteres"/>
            <xsl:apply-templates select="ns3:Modalidad"/>
            <xsl:apply-templates select="ns3:DtfDessembolso"/>
            <xsl:apply-templates select="ns3:Spreed"/>
            <xsl:apply-templates select="ns3:TasaRedescuento"/>
            <xsl:apply-templates select="ns3:DtfEA"/>
            <xsl:apply-templates select="ns3:BaseLiquidacionPlazo"/>
            <xsl:apply-templates select="ns3:PlazoCreditoDe"/>
            <xsl:apply-templates select="ns3:PlazoCreditoHasta"/>
            <xsl:apply-templates select="ns3:PeriodoGracia"/>
            <xsl:apply-templates select="ns3:PeriodoGraciaDe"/>
            <xsl:apply-templates select="ns3:PeriodoGraciaHasta"/>
            <xsl:apply-templates select="ns3:PeriodoMuerto"/>
            <xsl:apply-templates select="ns3:PeriodoMuertoDe"/>
            <xsl:apply-templates select="ns3:PeriodoMuertoHasta"/>
            <xsl:apply-templates select="ns3:ModalidadPagosInteres"/>
            <xsl:apply-templates select="ns3:FechaPagoPrimerCuota"/>
            <xsl:apply-templates select="ns3:ModalidadPagoCapital"/>
            <xsl:apply-templates select="ns3:FechaPagoPrimerCuotaCapital"/>
            <xsl:apply-templates select="ns3:OtraModalidadPago"/>
            <xsl:apply-templates select="ns3:NumCuotas"/>
            <xsl:apply-templates select="ns3:FechaPagoPrimerCuotaInteres"/>
            <xsl:apply-templates select="ns3:ValorCuotaPesos"/>
            <xsl:apply-templates select="ns3:ValorCuotaUVR"/>
            <xsl:apply-templates select="ns3:PorcentAmortizacionMensual"/>
            <xsl:apply-templates select="ns3:FechaPagoPrimerCuotaMensual"/>
            <xsl:apply-templates select="ns3:PorcentAmortizacionSemestral"/>
            <xsl:apply-templates select="ns3:FechaPagoPrimerCuotaSemestral"/>
            <xsl:apply-templates select="ns3:CiudadDesembolso"/>
            <xsl:apply-templates select="ns3:Departamento"/>
            <xsl:apply-templates select="ns3:Pais"/>
            <xsl:apply-templates select="ns3:CodOficina"/>
            <xsl:apply-templates select="ns3:Regional"/>
            <xsl:apply-templates select="ns3:AutorizaDebitoAutomatico"/>
            <xsl:apply-templates select="ns3:Cuenta"/>
            <xsl:apply-templates select="ns3:AdquisicionVivienda"/>
            <xsl:apply-templates select="ns3:ConstruccionViviendaIndividual"/>
            <xsl:apply-templates select="ns3:MejoramientoViviendaInterSoci"/>
            <xsl:apply-templates select="ns3:OtroDestino"/>
            <xsl:apply-templates select="ns3:DestinoOperacion"/>
            <xsl:apply-templates select="ns3:Vis"/>
            <xsl:apply-templates select="ns3:NoVis"/>
            <xsl:apply-templates select="ns3:ListaAmortizaciones"/>
            <xsl:apply-templates select="ns3:CiConCuotasExtras"/>
            <xsl:apply-templates select="ns3:CiValorCuotaExtra"/>
            <xsl:apply-templates select="ns3:CiNumCuotasExtras"/>
            <xsl:apply-templates select="ns3:CiCEPagaderaCada"/>
            <xsl:apply-templates select="ns3:CiCEApartirDelMes"/>
            <xsl:apply-templates select="ns3:IdDocumentoPagare"/>
            <xsl:apply-templates select="ns3:MensajeRespuesta"/>
            <pag:ListaGiradoresType>
                <xsl:apply-templates select="ns3:ListaApoderadoRepresentantePagare"/>
            </pag:ListaGiradoresType>
            <xsl:apply-templates select="ns3:EmpresaOtorgante"/>
            <xsl:apply-templates select="ns3:CiudadCreacion"/>
            <xsl:apply-templates select="ns3:DeptoCreacion"/>
            <xsl:apply-templates select="ns3:PaisCreacion"/>
            <xsl:apply-templates select="ns3:ValorPesosDesembolsoLetras"/>
            <xsl:apply-templates select="ns3:ValorPesosActual"/>
            <xsl:apply-templates select="ns3:ValorCapitalNumero"/>
            <xsl:apply-templates select="ns3:ValorCapitalLetras"/>
            <xsl:apply-templates select="ns3:MargenRedescuento"/>
            <xsl:apply-templates select="ns3:PuntosPorcentualesRedescuento"/>
            <xsl:apply-templates select="ns3:ValorDesembolsoUVRLetras"/>
            <xsl:apply-templates select="ns3:TasaInteresRenumEALetras"/>
            <xsl:apply-templates select="ns3:TasaInteresMora"/>
            <xsl:apply-templates select="ns3:FechaVencimientoFinanciero"/>
            <xsl:apply-templates select="ns3:PlazoNumero"/>
            <xsl:apply-templates select="ns3:PlazoLetras"/>
            <xsl:apply-templates select="ns3:PeriodicidadPlazo"/>
            <xsl:apply-templates select="ns3:PeriodoGraciaNumero"/>
            <xsl:apply-templates select="ns3:PeriodoGraciaLetras"/>
            <xsl:apply-templates select="ns3:PeriodicidadGracia"/>
            <xsl:apply-templates select="ns3:PeriodoMuertoNumero"/>
            <xsl:apply-templates select="ns3:PeriodoMuertoLetras"/>
            <xsl:apply-templates select="ns3:PeriodicidadMuerto"/>
            <xsl:apply-templates select="ns3:NumCuotasLetras"/>
            <xsl:apply-templates select="ns3:ValorCuotaPesosLetras"/>
            <xsl:apply-templates select="ns3:ValorCuotaUVRLetras"/>
            <xsl:apply-templates select="ns3:ValorInteresesNumero"/>
            <xsl:apply-templates select="ns3:ValorInteresesLetras"/>
            <xsl:apply-templates select="ns3:PorcentajeComision"/>
            <xsl:apply-templates select="ns3:PorcentajeCobertura"/>
            <xsl:apply-templates select="ns3:GarantiaAdicional"/>
            <xsl:apply-templates select="ns3:DiaPago"/>
            <xsl:apply-templates select="ns3:CiConPeriodoGracia"/>
            <xsl:apply-templates select="ns3:TasaNominal"/>
            <xsl:apply-templates select="ns3:TasaNominalLetras"/>
            <xsl:apply-templates select="ns3:TasaInteresMoraLetras"/>
            <xsl:apply-templates select="ns3:TextoAdicional"/>
            <pag:ListaArchivosAdjuntosType>
                <xsl:apply-templates select="ns3:ArchivosAdjuntos"/>
            </pag:ListaArchivosAdjuntosType>
            <xsl:apply-templates select="ns3:SeguroVida"/>
            <xsl:apply-templates select="ns3:Aval"/>
        </pag:Pagare>
    </xsl:template>

    <xsl:template match="ns3:NitEmisor">
        <pag:NitEmisor>
            <xsl:value-of select="."/>
        </pag:NitEmisor>
    </xsl:template>
    <xsl:template match="ns3:IdClaseDefinicionDocumento">
        <pag:idClaseDefinicionDocumento>
            <xsl:value-of select="."/>
        </pag:idClaseDefinicionDocumento>
    </xsl:template>
    <xsl:template match="ns3:FechaGrabacionPagare">
        <pag:FechaGrabacion>
            <xsl:value-of select="."/>
        </pag:FechaGrabacion>
    </xsl:template>
    <xsl:template match="ns3:TipoPagare">
        <pag:TipoPagare>
            <xsl:value-of select="."/>
        </pag:TipoPagare>
    </xsl:template>
    <xsl:template match="ns3:NumPagareEntidad">
        <pag:NumeroPagareEntidad>
            <xsl:value-of select="."/>
        </pag:NumeroPagareEntidad>
    </xsl:template>
    <xsl:template match="ns3:NumCredito">
        <pag:NumeroCredito>
            <xsl:value-of select="."/>
        </pag:NumeroCredito>
    </xsl:template>
    <xsl:template match="ns3:NumReferencia">
        <pag:NumeroReferencia>
            <xsl:value-of select="."/>
        </pag:NumeroReferencia>
    </xsl:template>
    <xsl:template match="ns3:FechaDesembolso">
        <pag:FechaDesembolso>
            <xsl:value-of select="."/>
        </pag:FechaDesembolso>
    </xsl:template>
    <xsl:template match="ns3:OtorganteTipoId">
        <pag:TipoOtorgante>
            <xsl:value-of select="."/>
        </pag:TipoOtorgante>
    </xsl:template>
    <xsl:template match="ns3:OtorganteNumId">
        <pag:OtorganteNumId>
            <xsl:value-of select="."/>
        </pag:OtorganteNumId>
    </xsl:template>
    <xsl:template match="ns3:OtorganteCuenta">
        <pag:OtorganteCuenta>
            <xsl:value-of select="."/>
        </pag:OtorganteCuenta>
    </xsl:template>
    <xsl:template match="ns3:ApoderadoTipoId">
        <pag:ApoderadoTipoId>
            <xsl:value-of select="."/>
        </pag:ApoderadoTipoId>
    </xsl:template>
    <xsl:template match="ns3:ApoderadoNumId">
        <pag:ApoderadoNumId>
            <xsl:value-of select="."/>
        </pag:ApoderadoNumId>
    </xsl:template>
    <xsl:template match="ns3:ApoderadoCuenta">
        <pag:ApoderadoCuenta>
            <xsl:value-of select="."/>
        </pag:ApoderadoCuenta>
    </xsl:template>

    <xsl:template match="ns3:ListaCodeudoresAvalistasPagare">
        <pag:girador>
            <xsl:apply-templates select="ns3:GiradorTipoId"/>
            <xsl:apply-templates select="ns3:GiradorNumId"/>
            <xsl:apply-templates select="ns3:GiradorCuenta"/>
            <xsl:apply-templates select="ns3:IdRol"/>
            <xsl:apply-templates select="ns3:IdPersonaRepresentada"/>
        </pag:girador>
    </xsl:template>
    <xsl:template match="ns3:GiradorTipoId">
        <pag:Tipo>
            <xsl:value-of select="."/>
        </pag:Tipo>
    </xsl:template>
    <xsl:template match="ns3:GiradorNumId">
        <pag:Identificacion>
            <xsl:value-of select="."/>
        </pag:Identificacion>
    </xsl:template>
    <xsl:template match="ns3:GiradorCuenta">
        <pag:Cuenta>
            <xsl:value-of select="."/>
        </pag:Cuenta>
    </xsl:template>
    <xsl:template match="ns3:IdRol">
        <pag:Rol>
            <xsl:value-of select="."/>
        </pag:Rol>
    </xsl:template>
    <xsl:template match="ns3:IdPersonaRepresentada">
        <pag:PersonaRepresentada>
            <xsl:value-of select="."/>
        </pag:PersonaRepresentada>
    </xsl:template>

    <xsl:template match="ns3:CreditoReembolsableEn">
        <pag:CreditoReembolsableEn>
            <xsl:value-of select="."/>
        </pag:CreditoReembolsableEn>
    </xsl:template>
    <xsl:template match="ns3:NumUnidadesUVR">
        <pag:NumUnidadesUVR>
            <xsl:value-of select="."/>
        </pag:NumUnidadesUVR>
    </xsl:template>
    <xsl:template match="ns3:ValorPesosDesembolso">
        <pag:ValorPesosDesembolso>
            <xsl:value-of select="."/>
        </pag:ValorPesosDesembolso>
    </xsl:template>
    <xsl:template match="ns3:ValorPesosDiligenciamiento">
        <pag:ValorPesosDiligenciamiento>
            <xsl:value-of select="."/>
        </pag:ValorPesosDiligenciamiento>
    </xsl:template>
    <xsl:template match="ns3:TasaInteresRenumEA">
        <pag:TasaInteresRenumEA>
            <xsl:value-of select="."/>
        </pag:TasaInteresRenumEA>
    </xsl:template>
    <xsl:template match="ns3:BaseLiquidacionTasa">
        <pag:BaseLiquidacionTasa>
            <xsl:value-of select="."/>
        </pag:BaseLiquidacionTasa>
    </xsl:template>
    <xsl:template match="ns3:TasaInteres">
        <pag:TasaInteres>
            <xsl:value-of select="."/>
        </pag:TasaInteres>
    </xsl:template>
    <xsl:template match="ns3:Modalidad">
        <pag:Modalidad>
            <xsl:value-of select="."/>
        </pag:Modalidad>
    </xsl:template>
    <xsl:template match="ns3:DtfDessembolso">
        <pag:DtfDessembolso>
            <xsl:value-of select="."/>
        </pag:DtfDessembolso>
    </xsl:template>
    <xsl:template match="ns3:Spreed">
        <pag:Spreed>
            <xsl:value-of select="."/>
        </pag:Spreed>
    </xsl:template>
    <xsl:template match="ns3:TasaRedescuento">
        <pag:TasaRedescuento>
            <xsl:value-of select="."/>
        </pag:TasaRedescuento>
    </xsl:template>
    <xsl:template match="ns3:DtfEA">
        <pag:DtfEA>
            <xsl:value-of select="."/>
        </pag:DtfEA>
    </xsl:template>
    <xsl:template match="ns3:BaseLiquidacionPlazo">
        <pag:BaseLiquidacionPlazo>
            <xsl:value-of select="."/>
        </pag:BaseLiquidacionPlazo>
    </xsl:template>
    <xsl:template match="ns3:PlazoCreditoDe">
        <pag:PlazoCreditoDe>
            <xsl:value-of select="."/>
        </pag:PlazoCreditoDe>
    </xsl:template>
    <xsl:template match="ns3:PlazoCreditoHasta">
        <pag:PlazoCreditoHasta>
            <xsl:value-of select="."/>
        </pag:PlazoCreditoHasta>
    </xsl:template>
    <xsl:template match="ns3:PeriodoGracia">
        <pag:PeriodoGracia>
            <xsl:value-of select="."/>
        </pag:PeriodoGracia>
    </xsl:template>
    <xsl:template match="ns3:PeriodoGraciaDe">
        <pag:PeriodoGraciaDe>
            <xsl:value-of select="."/>
        </pag:PeriodoGraciaDe>
    </xsl:template>
    <xsl:template match="ns3:PeriodoGraciaHasta">
        <pag:PeriodoGraciaHasta>
            <xsl:value-of select="."/>
        </pag:PeriodoGraciaHasta>
    </xsl:template>
    <xsl:template match="ns3:PeriodoMuerto">
        <pag:PeriodoMuerto>
            <xsl:value-of select="."/>
        </pag:PeriodoMuerto>
    </xsl:template>
    <xsl:template match="ns3:PeriodoMuertoDe">
        <pag:PeriodoMuertoDe>
            <xsl:value-of select="."/>
        </pag:PeriodoMuertoDe>
    </xsl:template>
    <xsl:template match="ns3:PeriodoMuertoHasta">
        <pag:PeriodoMuertoHasta>
            <xsl:value-of select="."/>
        </pag:PeriodoMuertoHasta>
    </xsl:template>
    <xsl:template match="ns3:ModalidadPagosInteres">
        <pag:ModalidadPagosInteres>
            <xsl:value-of select="."/>
        </pag:ModalidadPagosInteres>
    </xsl:template>
    <xsl:template match="ns3:FechaPagoPrimerCuota">
        <pag:FechaPagoPrimerCuota>
            <xsl:value-of select="."/>
        </pag:FechaPagoPrimerCuota>
    </xsl:template>
    <xsl:template match="ns3:ModalidadPagoCapital">
        <pag:ModalidadPagoCapital>
            <xsl:value-of select="."/>
        </pag:ModalidadPagoCapital>
    </xsl:template>
    <xsl:template match="ns3:FechaPagoPrimerCuotaCapital">
        <pag:FechaPagoPrimerCuotaCapital>
            <xsl:value-of select="."/>
        </pag:FechaPagoPrimerCuotaCapital>
    </xsl:template>
    <xsl:template match="ns3:OtraModalidadPago">
        <pag:OtraModalidadPago>
            <xsl:value-of select="."/>
        </pag:OtraModalidadPago>
    </xsl:template>
    <xsl:template match="ns3:NumCuotas">
        <pag:Cuotas>
            <xsl:value-of select="."/>
        </pag:Cuotas>
    </xsl:template>
    <xsl:template match="ns3:FechaPagoPrimerCuotaInteres">
        <pag:FechaPagoPrimerCuotaInteres>
            <xsl:value-of select="."/>
        </pag:FechaPagoPrimerCuotaInteres>
    </xsl:template>
    <xsl:template match="ns3:ValorCuotaPesos">
        <pag:ValorCuotaPesos>
            <xsl:value-of select="."/>
        </pag:ValorCuotaPesos>
    </xsl:template>
    <xsl:template match="ns3:ValorCuotaUVR">
        <pag:ValorCuotaUVR>
            <xsl:value-of select="."/>
        </pag:ValorCuotaUVR>
    </xsl:template>
    <xsl:template match="ns3:PorcentAmortizacionMensual">
        <pag:PorcentAmortizacionMensual>
            <xsl:value-of select="."/>
        </pag:PorcentAmortizacionMensual>
    </xsl:template>
    <xsl:template match="ns3:FechaPagoPrimerCuotaMensual">
        <pag:FechaPagoPrimerCuotaMensual>
            <xsl:value-of select="."/>
        </pag:FechaPagoPrimerCuotaMensual>
    </xsl:template>
    <xsl:template match="ns3:PorcentAmortizacionSemestral">
        <pag:PorcentAmortizacionSemestral>
            <xsl:value-of select="."/>
        </pag:PorcentAmortizacionSemestral>
    </xsl:template>
    <xsl:template match="ns3:FechaPagoPrimerCuotaSemestral">
        <pag:FechaPagoPrimerCuotaSemestral>
            <xsl:value-of select="."/>
        </pag:FechaPagoPrimerCuotaSemestral>
    </xsl:template>
    <xsl:template match="ns3:CiudadDesembolso">
        <pag:CiudadDesembolso>
            <xsl:value-of select="."/>
        </pag:CiudadDesembolso>
    </xsl:template>
    <xsl:template match="ns3:Departamento">
        <pag:Departamento>
            <xsl:value-of select="."/>
        </pag:Departamento>
    </xsl:template>
    <xsl:template match="ns3:Pais">
        <pag:Pais>
            <xsl:value-of select="."/>
        </pag:Pais>
    </xsl:template>
    <xsl:template match="ns3:CodOficina">
        <pag:CodOficina>
            <xsl:value-of select="."/>
        </pag:CodOficina>
    </xsl:template>
    <xsl:template match="ns3:Regional">
        <pag:Regional>
            <xsl:value-of select="."/>
        </pag:Regional>
    </xsl:template>
    <xsl:template match="ns3:AutorizaDebitoAutomatico">
        <pag:AutorizaDebitoAutomatico>
            <xsl:value-of select="."/>
        </pag:AutorizaDebitoAutomatico>
    </xsl:template>
    <xsl:template match="ns3:Cuenta">
        <pag:Cuenta>
            <xsl:value-of select="."/>
        </pag:Cuenta>
    </xsl:template>
    <xsl:template match="ns3:AdquisicionVivienda">
        <pag:AdquisicionVivienda>
            <xsl:value-of select="."/>
        </pag:AdquisicionVivienda>
    </xsl:template>
    <xsl:template match="ns3:ConstruccionViviendaIndividual">
        <pag:ConstruccionViviendaIndividual>
            <xsl:value-of select="."/>
        </pag:ConstruccionViviendaIndividual>
    </xsl:template>
    <xsl:template match="ns3:MejoramientoViviendaInterSoci">
        <pag:MejoramientoViviendaInterSoci>
            <xsl:value-of select="."/>
        </pag:MejoramientoViviendaInterSoci>
    </xsl:template>
    <xsl:template match="ns3:OtroDestino">
        <pag:OtroDestino>
            <xsl:value-of select="."/>
        </pag:OtroDestino>
    </xsl:template>
    <xsl:template match="ns3:DestinoOperacion">
        <pag:DestinoOperacion>
            <xsl:value-of select="."/>
        </pag:DestinoOperacion>
    </xsl:template>
    <xsl:template match="ns3:Vis">
        <pag:Vis>
            <xsl:value-of select="."/>
        </pag:Vis>
    </xsl:template>
    <xsl:template match="ns3:NoVis">
        <pag:NoVis>
            <xsl:value-of select="."/>
        </pag:NoVis>
    </xsl:template>
    <xsl:template match="ns3:ListaAmortizaciones">
        <pag:ListaAmortizaciones>
            <xsl:value-of select="."/>
        </pag:ListaAmortizaciones>
    </xsl:template>
    <xsl:template match="ns3:CiConCuotasExtras">
        <pag:CiConCuotasExtras>
            <xsl:value-of select="."/>
        </pag:CiConCuotasExtras>
    </xsl:template>
    <xsl:template match="ns3:CiValorCuotaExtra">
        <pag:CiValorCuotaExtra>
            <xsl:value-of select="."/>
        </pag:CiValorCuotaExtra>
    </xsl:template>
    <xsl:template match="ns3:CiNumCuotasExtras">
        <pag:CiNumCuotasExtras>
            <xsl:value-of select="."/>
        </pag:CiNumCuotasExtras>
    </xsl:template>
    <xsl:template match="ns3:CiCEPagaderaCada">
        <pag:CiCEPagaderaCada>
            <xsl:value-of select="."/>
        </pag:CiCEPagaderaCada>
    </xsl:template>
    <xsl:template match="ns3:CiCEApartirDelMes">
        <pag:CiCEApartirDelMes>
            <xsl:value-of select="."/>
        </pag:CiCEApartirDelMes>
    </xsl:template>
    <xsl:template match="ns3:IdDocumentoPagare">
        <pag:IdDocumentoPagare>
            <xsl:value-of select="."/>
        </pag:IdDocumentoPagare>
    </xsl:template>
    <xsl:template match="ns3:MensajeRespuesta">
        <pag:MensajeRespuesta>
            <xsl:value-of select="."/>
        </pag:MensajeRespuesta>
    </xsl:template>

    <xsl:template match="ns3:ListaApoderadoRepresentantePagare">
        <pag:girador>
            <xsl:apply-templates select="ns3:GiradorTipoId"/>
            <xsl:apply-templates select="ns3:GiradorNumId"/>
            <xsl:apply-templates select="ns3:GiradorCuenta"/>
            <xsl:apply-templates select="ns3:IdRol"/>
            <xsl:apply-templates select="ns3:IdPersonaRepresentada"/>
        </pag:girador>
    </xsl:template>

    <xsl:template match="ns3:EmpresaOtorgante">
        <pag:EmpresaOtorgante>
            <xsl:value-of select="."/>
        </pag:EmpresaOtorgante>
    </xsl:template>
    <xsl:template match="ns3:CiudadCreacion">
        <pag:CiudadCreacion>
            <xsl:value-of select="."/>
        </pag:CiudadCreacion>
    </xsl:template>
    <xsl:template match="ns3:DeptoCreacion">
        <pag:DeptoCreacion>
            <xsl:value-of select="."/>
        </pag:DeptoCreacion>
    </xsl:template>
    <xsl:template match="ns3:PaisCreacion">
        <pag:PaisCreacion>
            <xsl:value-of select="."/>
        </pag:PaisCreacion>
    </xsl:template>
    <xsl:template match="ns3:ValorPesosDesembolsoLetras">
        <pag:ValorPesosDesembolsoLetras>
            <xsl:value-of select="."/>
        </pag:ValorPesosDesembolsoLetras>
    </xsl:template>
    <xsl:template match="ns3:ValorPesosActual">
        <pag:ValorPesosActual>
            <xsl:value-of select="."/>
        </pag:ValorPesosActual>
    </xsl:template>
    <xsl:template match="ns3:ValorCapitalNumero">
        <pag:ValorCapitalNumero>
            <xsl:value-of select="."/>
        </pag:ValorCapitalNumero>
    </xsl:template>
    <xsl:template match="ns3:ValorCapitalLetras">
        <pag:ValorCapitalLetras>
            <xsl:value-of select="."/>
        </pag:ValorCapitalLetras>
    </xsl:template>
    <xsl:template match="ns3:MargenRedescuento">
        <pag:MargenRedescuento>
            <xsl:value-of select="."/>
        </pag:MargenRedescuento>
    </xsl:template>
    <xsl:template match="ns3:PuntosPorcentualesRedescuento">
        <pag:PuntosPorcentualesRedescuento>
            <xsl:value-of select="."/>
        </pag:PuntosPorcentualesRedescuento>
    </xsl:template>
    <xsl:template match="ns3:ValorDesembolsoUVRLetras">
        <pag:ValorDesembolsoUVRLetras>
            <xsl:value-of select="."/>
        </pag:ValorDesembolsoUVRLetras>
    </xsl:template>
    <xsl:template match="ns3:TasaInteresRenumEALetras">
        <pag:TasaInteresRenumEALetras>
            <xsl:value-of select="."/>
        </pag:TasaInteresRenumEALetras>
    </xsl:template>
    <xsl:template match="ns3:TasaInteresMora">
        <pag:TasaInteresMora>
            <xsl:value-of select="."/>
        </pag:TasaInteresMora>
    </xsl:template>
    <xsl:template match="ns3:FechaVencimientoFinanciero">
        <pag:FechaVencimientoFinanciero>
            <xsl:value-of select="."/>
        </pag:FechaVencimientoFinanciero>
    </xsl:template>
    <xsl:template match="ns3:PlazoNumero">
        <pag:PlazoNumero>
            <xsl:value-of select="."/>
        </pag:PlazoNumero>
    </xsl:template>
    <xsl:template match="ns3:PlazoLetras">
        <pag:PlazoLetras>
            <xsl:value-of select="."/>
        </pag:PlazoLetras>
    </xsl:template>
    <xsl:template match="ns3:PeriodicidadPlazo">
        <pag:PeriodicidadPlazo>
            <xsl:value-of select="."/>
        </pag:PeriodicidadPlazo>
    </xsl:template>
    <xsl:template match="ns3:PeriodoGraciaNumero">
        <pag:PeriodoGraciaNumero>
            <xsl:value-of select="."/>
        </pag:PeriodoGraciaNumero>
    </xsl:template>
    <xsl:template match="ns3:PeriodoGraciaLetras">
        <pag:PeriodoGraciaLetras>
            <xsl:value-of select="."/>
        </pag:PeriodoGraciaLetras>
    </xsl:template>
    <xsl:template match="ns3:PeriodicidadGracia">
        <pag:PeriodicidadGracia>
            <xsl:value-of select="."/>
        </pag:PeriodicidadGracia>
    </xsl:template>
    <xsl:template match="ns3:PeriodoMuertoNumero">
        <pag:PeriodoMuertoNumero>
            <xsl:value-of select="."/>
        </pag:PeriodoMuertoNumero>
    </xsl:template>
    <xsl:template match="ns3:PeriodoMuertoLetras">
        <pag:PeriodoMuertoLetras>
            <xsl:value-of select="."/>
        </pag:PeriodoMuertoLetras>
    </xsl:template>
    <xsl:template match="ns3:PeriodicidadMuerto">
        <pag:PeriodicidadMuerto>
            <xsl:value-of select="."/>
        </pag:PeriodicidadMuerto>
    </xsl:template>
    <xsl:template match="ns3:NumCuotasLetras">
        <pag:NumCuotasLetras>
            <xsl:value-of select="."/>
        </pag:NumCuotasLetras>
    </xsl:template>
    <xsl:template match="ns3:ValorCuotaPesosLetras">
        <pag:ValorCuotaPesosLetras>
            <xsl:value-of select="."/>
        </pag:ValorCuotaPesosLetras>
    </xsl:template>
    <xsl:template match="ns3:ValorCuotaUVRLetras">
        <pag:ValorCuotaUVRLetras>
            <xsl:value-of select="."/>
        </pag:ValorCuotaUVRLetras>
    </xsl:template>
    <xsl:template match="ns3:ValorInteresesNumero">
        <pag:ValorInteresesNumero>
            <xsl:value-of select="."/>
        </pag:ValorInteresesNumero>
    </xsl:template>
    <xsl:template match="ns3:ValorInteresesLetras">
        <pag:ValorInteresesLetras>
            <xsl:value-of select="."/>
        </pag:ValorInteresesLetras>
    </xsl:template>
    <xsl:template match="ns3:PorcentajeComision">
        <pag:PorcentajeComision>
            <xsl:value-of select="."/>
        </pag:PorcentajeComision>
    </xsl:template>
    <xsl:template match="ns3:PorcentajeCobertura">
        <pag:PorcentajeCobertura>
            <xsl:value-of select="."/>
        </pag:PorcentajeCobertura>
    </xsl:template>
    <xsl:template match="ns3:GarantiaAdicional">
        <pag:GarantiaAdicional>
            <xsl:value-of select="."/>
        </pag:GarantiaAdicional>
    </xsl:template>
    <xsl:template match="ns3:DiaPago">
        <pag:DiaPago>
            <xsl:value-of select="."/>
        </pag:DiaPago>
    </xsl:template>
    <xsl:template match="ns3:CiConPeriodoGracia">
        <pag:CiConPeriodoGracia>
            <xsl:value-of select="."/>
        </pag:CiConPeriodoGracia>
    </xsl:template>
    <xsl:template match="ns3:TasaNominal">
        <pag:TasaNominal>
            <xsl:value-of select="."/>
        </pag:TasaNominal>
    </xsl:template>
    <xsl:template match="ns3:TasaNominalLetras">
        <pag:TasaNominalLetras>
            <xsl:value-of select="."/>
        </pag:TasaNominalLetras>
    </xsl:template>
    <xsl:template match="ns3:TasaInteresMoraLetras">
        <pag:TasaInteresMoraLetras>
            <xsl:value-of select="."/>
        </pag:TasaInteresMoraLetras>
    </xsl:template>
    <xsl:template match="ns3:TextoAdicional">
        <pag:TextoAdicional>
            <xsl:value-of select="."/>
        </pag:TextoAdicional>
    </xsl:template>

    <xsl:template match="ns3:ArchivosAdjuntos">
        <pag:ArchivoAdjuntoType>
            <xsl:apply-templates select="ns3:NombreArchivo"/>
            <xsl:apply-templates select="ns3:Contenido"/>
        </pag:ArchivoAdjuntoType>
    </xsl:template>
    <xsl:template match="ns3:NombreArchivo">
        <pag:NombreArchivo>
            <xsl:value-of select="."/>
        </pag:NombreArchivo>
    </xsl:template>
    <xsl:template match="ns3:Contenido">
        <pag:Contenido>
            <xsl:value-of select="."/>
        </pag:Contenido>
    </xsl:template>

    <xsl:template match="ns3:SeguroVida">
        <pag:SeguroVida>
            <xsl:value-of select="."/>
        </pag:SeguroVida>
    </xsl:template>
    <xsl:template match="ns3:Aval">
        <pag:Aval>
            <xsl:value-of select="."/>
        </pag:Aval>
    </xsl:template>
</xsl:stylesheet> 
