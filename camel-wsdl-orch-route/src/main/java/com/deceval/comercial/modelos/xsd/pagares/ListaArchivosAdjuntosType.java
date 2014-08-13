
package com.deceval.comercial.modelos.xsd.pagares;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListaArchivosAdjuntosType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListaArchivosAdjuntosType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArchivoAdjuntoType" type="{http://www.deceval.com/comercial/modelos/xsd/Pagares}ArchivoAdjuntoType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListaArchivosAdjuntosType", propOrder = {
    "archivoAdjuntoType"
})
public class ListaArchivosAdjuntosType {

    @XmlElement(name = "ArchivoAdjuntoType")
    protected List<ArchivoAdjuntoType> archivoAdjuntoType;

    /**
     * Gets the value of the archivoAdjuntoType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the archivoAdjuntoType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArchivoAdjuntoType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArchivoAdjuntoType }
     * 
     * 
     */
    public List<ArchivoAdjuntoType> getArchivoAdjuntoType() {
        if (archivoAdjuntoType == null) {
            archivoAdjuntoType = new ArrayList<ArchivoAdjuntoType>();
        }
        return this.archivoAdjuntoType;
    }

}
