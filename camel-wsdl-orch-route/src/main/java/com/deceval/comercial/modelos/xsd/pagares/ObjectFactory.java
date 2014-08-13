
package com.deceval.comercial.modelos.xsd.pagares;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.deceval.comercial.modelos.xsd.pagares package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ResultadoCreacion_QNAME = new QName("http://www.deceval.com/comercial/modelos/xsd/Pagares", "ResultadoCreacion");
    private final static QName _Pagares_QNAME = new QName("http://www.deceval.com/comercial/modelos/xsd/Pagares", "Pagares");
    private final static QName _PagareTypeListaArchivosAdjuntosType_QNAME = new QName("http://www.deceval.com/comercial/modelos/xsd/Pagares", "ListaArchivosAdjuntosType");
    private final static QName _PagareTypeListaCodeudoresAvalistasPagare_QNAME = new QName("http://www.deceval.com/comercial/modelos/xsd/Pagares", "ListaCodeudoresAvalistasPagare");
    private final static QName _PagareTypeListaGiradoresType_QNAME = new QName("http://www.deceval.com/comercial/modelos/xsd/Pagares", "ListaGiradoresType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.deceval.comercial.modelos.xsd.pagares
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResultadoCreacionType }
     * 
     */
    public ResultadoCreacionType createResultadoCreacionType() {
        return new ResultadoCreacionType();
    }

    /**
     * Create an instance of {@link ListaPagaresType }
     * 
     */
    public ListaPagaresType createListaPagaresType() {
        return new ListaPagaresType();
    }

    /**
     * Create an instance of {@link ListaArchivosAdjuntosType }
     * 
     */
    public ListaArchivosAdjuntosType createListaArchivosAdjuntosType() {
        return new ListaArchivosAdjuntosType();
    }

    /**
     * Create an instance of {@link PagareType }
     * 
     */
    public PagareType createPagareType() {
        return new PagareType();
    }

    /**
     * Create an instance of {@link ArchivoAdjuntoType }
     * 
     */
    public ArchivoAdjuntoType createArchivoAdjuntoType() {
        return new ArchivoAdjuntoType();
    }

    /**
     * Create an instance of {@link GiradorType }
     * 
     */
    public GiradorType createGiradorType() {
        return new GiradorType();
    }

    /**
     * Create an instance of {@link ListaGiradoresType }
     * 
     */
    public ListaGiradoresType createListaGiradoresType() {
        return new ListaGiradoresType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultadoCreacionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.deceval.com/comercial/modelos/xsd/Pagares", name = "ResultadoCreacion")
    public JAXBElement<ResultadoCreacionType> createResultadoCreacion(ResultadoCreacionType value) {
        return new JAXBElement<ResultadoCreacionType>(_ResultadoCreacion_QNAME, ResultadoCreacionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaPagaresType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.deceval.com/comercial/modelos/xsd/Pagares", name = "Pagares")
    public JAXBElement<ListaPagaresType> createPagares(ListaPagaresType value) {
        return new JAXBElement<ListaPagaresType>(_Pagares_QNAME, ListaPagaresType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaArchivosAdjuntosType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.deceval.com/comercial/modelos/xsd/Pagares", name = "ListaArchivosAdjuntosType", scope = PagareType.class)
    public JAXBElement<ListaArchivosAdjuntosType> createPagareTypeListaArchivosAdjuntosType(ListaArchivosAdjuntosType value) {
        return new JAXBElement<ListaArchivosAdjuntosType>(_PagareTypeListaArchivosAdjuntosType_QNAME, ListaArchivosAdjuntosType.class, PagareType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaGiradoresType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.deceval.com/comercial/modelos/xsd/Pagares", name = "ListaCodeudoresAvalistasPagare", scope = PagareType.class)
    public JAXBElement<ListaGiradoresType> createPagareTypeListaCodeudoresAvalistasPagare(ListaGiradoresType value) {
        return new JAXBElement<ListaGiradoresType>(_PagareTypeListaCodeudoresAvalistasPagare_QNAME, ListaGiradoresType.class, PagareType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaGiradoresType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.deceval.com/comercial/modelos/xsd/Pagares", name = "ListaGiradoresType", scope = PagareType.class)
    public JAXBElement<ListaGiradoresType> createPagareTypeListaGiradoresType(ListaGiradoresType value) {
        return new JAXBElement<ListaGiradoresType>(_PagareTypeListaGiradoresType_QNAME, ListaGiradoresType.class, PagareType.class, value);
    }

}
