package co.com.deceval.tecnologia.auditoria.utilidad.xsd.auditoria;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the
 * co.com.deceval.tecnologia.auditoria.utilidad.xsd.auditoria package.
 * <p>An ObjectFactory allows you to programatically construct new instances of
 * the Java representation for XML content. The Java representation of XML
 * content can consist of schema derived interfaces and classes representing the
 * binding of schema type definitions, element declarations and model groups.
 * Factory methods for each of these are provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ResultadoAuditoria_QNAME = new QName("http://www.deceval.com.co/tecnologia/auditoria/utilidad/xsd/Auditoria", "ResultadoAuditoria");
    private final static QName _Auditoria_QNAME = new QName("http://www.deceval.com.co/tecnologia/auditoria/utilidad/xsd/Auditoria", "Auditoria");

    /**
     * Create a new ObjectFactory that can be used to create new instances of
     * schema derived classes for package:
     * co.com.deceval.tecnologia.auditoria.utilidad.xsd.auditoria
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResultadoAuditoriaType }
     *
     */
    public ResultadoAuditoriaType createResultadoAuditoriaType() {
        return new ResultadoAuditoriaType();
    }

    /**
     * Create an instance of {@link AuditoriaType }
     *
     */
    public AuditoriaType createAuditoriaType() {
        return new AuditoriaType();
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link ResultadoAuditoriaType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.deceval.com.co/tecnologia/auditoria/utilidad/xsd/Auditoria", name = "ResultadoAuditoria")
    public JAXBElement<ResultadoAuditoriaType> createResultadoAuditoria(ResultadoAuditoriaType value) {
        return new JAXBElement<ResultadoAuditoriaType>(_ResultadoAuditoria_QNAME, ResultadoAuditoriaType.class, null, value);
    }

    /**
     * Create an instance of
     * {@link JAXBElement }{@code <}{@link AuditoriaType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.deceval.com.co/tecnologia/auditoria/utilidad/xsd/Auditoria", name = "Auditoria")
    public JAXBElement<AuditoriaType> createAuditoria(AuditoriaType value) {
        return new JAXBElement<AuditoriaType>(_Auditoria_QNAME, AuditoriaType.class, null, value);
    }
}
