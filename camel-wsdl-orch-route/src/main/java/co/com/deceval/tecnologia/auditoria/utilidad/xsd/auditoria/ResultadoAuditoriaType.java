package co.com.deceval.tecnologia.auditoria.utilidad.xsd.auditoria;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for ResultadoAuditoriaType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 *
 * <pre>
 * &lt;complexType name="ResultadoAuditoriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResultadoLog" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultadoAuditoriaType", propOrder = {
    "resultadoLog"
})
public class ResultadoAuditoriaType {

    @XmlElement(name = "ResultadoLog")
    protected boolean resultadoLog;

    /**
     * Gets the value of the resultadoLog property.
     *
     */
    public boolean isResultadoLog() {
        return resultadoLog;
    }

    /**
     * Sets the value of the resultadoLog property.
     *
     */
    public void setResultadoLog(boolean value) {
        this.resultadoLog = value;
    }
}
