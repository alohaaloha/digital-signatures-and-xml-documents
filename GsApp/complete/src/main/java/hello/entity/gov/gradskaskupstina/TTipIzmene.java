//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.05 at 08:38:43 PM CEST 
//


package hello.entity.gov.gradskaskupstina;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TTipIzmene.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TTipIzmene">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="izmena"/>
 *     &lt;enumeration value="dopuna"/>
 *     &lt;enumeration value="brisanje"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TTipIzmene")
@XmlEnum
public enum TTipIzmene {

    @XmlEnumValue("izmena")
    IZMENA("izmena"),
    @XmlEnumValue("dopuna")
    DOPUNA("dopuna"),
    @XmlEnumValue("brisanje")
    BRISANJE("brisanje");
    private final String value;

    TTipIzmene(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TTipIzmene fromValue(String v) {
        for (TTipIzmene c: TTipIzmene.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
