//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.05 at 04:50:48 PM CEST 
//


package hello.entity.gov.gradskaskupstina;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TZavrsniDeo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TZavrsniDeo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrelazneOdredbe" type="{http://www.gradskaskupstina.gov/}TGlava" minOccurs="0"/>
 *         &lt;element name="ZavrsneOdredbe" type="{http://www.gradskaskupstina.gov/}TGlava" minOccurs="0"/>
 *         &lt;element name="Organ" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Broj" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Datum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Potpisnik" type="{http://www.gradskaskupstina.gov/}TPotpisnik"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TZavrsniDeo", propOrder = {
    "prelazneOdredbe",
    "zavrsneOdredbe",
    "organ",
    "broj",
    "datum",
    "potpisnik"
})
public class TZavrsniDeo {

    @XmlElement(name = "PrelazneOdredbe")
    protected TGlava prelazneOdredbe;
    @XmlElement(name = "ZavrsneOdredbe")
    protected TGlava zavrsneOdredbe;
    @XmlElement(name = "Organ", required = true)
    protected String organ;
    @XmlElement(name = "Broj", required = true)
    protected String broj;
    @XmlElement(name = "Datum", required = true)
    protected String datum;
    @XmlElement(name = "Potpisnik", required = true)
    protected TPotpisnik potpisnik;

    /**
     * Gets the value of the prelazneOdredbe property.
     * 
     * @return
     *     possible object is
     *     {@link TGlava }
     *     
     */
    public TGlava getPrelazneOdredbe() {
        return prelazneOdredbe;
    }

    /**
     * Sets the value of the prelazneOdredbe property.
     * 
     * @param value
     *     allowed object is
     *     {@link TGlava }
     *     
     */
    public void setPrelazneOdredbe(TGlava value) {
        this.prelazneOdredbe = value;
    }

    /**
     * Gets the value of the zavrsneOdredbe property.
     * 
     * @return
     *     possible object is
     *     {@link TGlava }
     *     
     */
    public TGlava getZavrsneOdredbe() {
        return zavrsneOdredbe;
    }

    /**
     * Sets the value of the zavrsneOdredbe property.
     * 
     * @param value
     *     allowed object is
     *     {@link TGlava }
     *     
     */
    public void setZavrsneOdredbe(TGlava value) {
        this.zavrsneOdredbe = value;
    }

    /**
     * Gets the value of the organ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgan() {
        return organ;
    }

    /**
     * Sets the value of the organ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgan(String value) {
        this.organ = value;
    }

    /**
     * Gets the value of the broj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBroj() {
        return broj;
    }

    /**
     * Sets the value of the broj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBroj(String value) {
        this.broj = value;
    }

    /**
     * Gets the value of the datum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatum() {
        return datum;
    }

    /**
     * Sets the value of the datum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatum(String value) {
        this.datum = value;
    }

    /**
     * Gets the value of the potpisnik property.
     * 
     * @return
     *     possible object is
     *     {@link TPotpisnik }
     *     
     */
    public TPotpisnik getPotpisnik() {
        return potpisnik;
    }

    /**
     * Sets the value of the potpisnik property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPotpisnik }
     *     
     */
    public void setPotpisnik(TPotpisnik value) {
        this.potpisnik = value;
    }

}
