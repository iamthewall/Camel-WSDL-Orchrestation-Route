package com.deceval.comunes.modelos.xsd.encabezados;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the
 * com.deceval.comunes.modelos.xsd.encabezados package.
 * <p>An ObjectFactory allows you to programatically construct new instances of
 * the Java representation for XML content. The Java representation of XML
 * content can consist of schema derived interfaces and classes representing the
 * binding of schema type definitions, element declarations and model groups.
 * Factory methods for each of these are provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EncabezadoEntrada_QNAME = new QName("http://www.deceval.com/comunes/modelos/xsd/Encabezados", "EncabezadoEntrada");
    private final static QName _EncabezadoSalida_QNAME = new QName("http://www.deceval.com/comunes/modelos/xsd/Encabezados", "EncabezadoSalida");

    /**
     * Create a new ObjectFactory that can be used to create new instances of
     * schema derived classes for package:
     * com.deceval.comunes.modelos.xsd.encabezados
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EncabezadoEntradaType }
     *
     */
    public EncabezadoEntradaType createEncabezadoEntradaType() {
        return new EncabezadoEntradaType();
    }

    /**
     * Create an instance of {@link EncabezadoSalidaType }
     *
     */
    public EncabezadoSalidaType createEncabezadoSalidaType() {
        return new EncabezadoSalidaType();
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link EncabezadoEntradaType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.deceval.com/comunes/modelos/xsd/Encabezados", name = "EncabezadoEntrada")
    public JAXBElement<EncabezadoEntradaType> createEncabezadoEntrada(EncabezadoEntradaType value) {
        return new JAXBElement<EncabezadoEntradaType>(_EncabezadoEntrada_QNAME, EncabezadoEntradaType.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link EncabezadoSalidaType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.deceval.com/comunes/modelos/xsd/Encabezados", name = "EncabezadoSalida")
    public JAXBElement<EncabezadoSalidaType> createEncabezadoSalida(EncabezadoSalidaType value) {
        return new JAXBElement<EncabezadoSalidaType>(_EncabezadoSalida_QNAME, EncabezadoSalidaType.class, null, value);
    }
}
