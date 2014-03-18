
package com.deceval.comercial.modelos.xsd.pagares;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListaGiradoresType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListaGiradoresType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="girador" type="{http://www.deceval.com/comercial/modelos/xsd/Pagares}GiradorType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListaGiradoresType", propOrder = {
    "girador"
})
public class ListaGiradoresType {

    protected List<GiradorType> girador;

    /**
     * Gets the value of the girador property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the girador property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGirador().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GiradorType }
     * 
     * 
     */
    public List<GiradorType> getGirador() {
        if (girador == null) {
            girador = new ArrayList<GiradorType>();
        }
        return this.girador;
    }

}
