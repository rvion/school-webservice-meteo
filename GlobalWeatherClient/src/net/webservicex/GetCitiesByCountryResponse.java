
package net.webservicex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetCitiesByCountryResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getCitiesByCountryResult"
})
@XmlRootElement(name = "GetCitiesByCountryResponse")
public class GetCitiesByCountryResponse {

    @XmlElement(name = "GetCitiesByCountryResult")
    protected String getCitiesByCountryResult;

    /**
     * Obtient la valeur de la propri�t� getCitiesByCountryResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetCitiesByCountryResult() {
        return getCitiesByCountryResult;
    }

    /**
     * D�finit la valeur de la propri�t� getCitiesByCountryResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetCitiesByCountryResult(String value) {
        this.getCitiesByCountryResult = value;
    }

}
