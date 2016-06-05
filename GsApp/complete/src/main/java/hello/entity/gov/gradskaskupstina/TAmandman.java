//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.05 at 04:51:05 PM CEST 
//


package hello.entity.gov.gradskaskupstina;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TAmandman complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TAmandman">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="PredmetIzmene" type="{http://www.gradskaskupstina.gov/}TReferenca"/>
 *         &lt;element name="TipIzmene" type="{http://www.gradskaskupstina.gov/}TTipIzmene"/>
 *         &lt;element name="Obrazlozenje" type="{http://www.gradskaskupstina.gov/}TSemiStruktuiraniTekst"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RedniBroj" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAmandman", propOrder = {
    "predmetIzmeneAndTipIzmeneAndObrazlozenje"
})
public class TAmandman {

    @XmlElements({
        @XmlElement(name = "PredmetIzmene", required = true, type = TReferenca.class),
        @XmlElement(name = "TipIzmene", required = true, type = TTipIzmene.class),
        @XmlElement(name = "Obrazlozenje", required = true, type = TSemiStruktuiraniTekst.class)
    })
    protected List<Object> predmetIzmeneAndTipIzmeneAndObrazlozenje;
    @XmlAttribute(name = "RedniBroj")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger redniBroj;

    /**
     * Gets the value of the predmetIzmeneAndTipIzmeneAndObrazlozenje property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the predmetIzmeneAndTipIzmeneAndObrazlozenje property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPredmetIzmeneAndTipIzmeneAndObrazlozenje().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TReferenca }
     * {@link TTipIzmene }
     * {@link TSemiStruktuiraniTekst }
     * 
     * 
     */
    public List<Object> getPredmetIzmeneAndTipIzmeneAndObrazlozenje() {
        if (predmetIzmeneAndTipIzmeneAndObrazlozenje == null) {
            predmetIzmeneAndTipIzmeneAndObrazlozenje = new ArrayList<Object>();
        }
        return this.predmetIzmeneAndTipIzmeneAndObrazlozenje;
    }

    /**
     * Gets the value of the redniBroj property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRedniBroj() {
        return redniBroj;
    }

    /**
     * Sets the value of the redniBroj property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRedniBroj(BigInteger value) {
        this.redniBroj = value;
    }

}
