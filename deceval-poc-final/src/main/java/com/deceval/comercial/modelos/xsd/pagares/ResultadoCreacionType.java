
package com.deceval.comercial.modelos.xsd.pagares;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultadoCreacionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultadoCreacionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ListaRespusta" type="{http://www.deceval.com/comercial/modelos/xsd/Pagares}PagareType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultadoCreacionType", propOrder = {
    "listaRespusta"
})
public class ResultadoCreacionType {

    @XmlElement(name = "ListaRespusta", nillable = true)
    protected List<PagareType> listaRespusta;

    /**
     * Gets the value of the listaRespusta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaRespusta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaRespusta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PagareType }
     * 
     * 
     */
    public List<PagareType> getListaRespusta() {
        if (listaRespusta == null) {
            listaRespusta = new ArrayList<PagareType>();
        }
        return this.listaRespusta;
    }

}
