//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.02 at 08:39:28 PM CEST 
//


package hello.entity.gov.gradskaskupstina;

import hello.entity.gov.gradskaskupstina.Amandman;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.gradskaskupstina package. 
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

    private final static QName _TSemiStruktuiraniTekstDatum_QNAME = new QName("http://www.gradskaskupstina.gov/", "Datum");
    private final static QName _TSemiStruktuiraniTekstTekst_QNAME = new QName("http://www.gradskaskupstina.gov/", "Tekst");
    private final static QName _TSemiStruktuiraniTekstReferenca_QNAME = new QName("http://www.gradskaskupstina.gov/", "Referenca");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.gradskaskupstina
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TTacka }
     * 
     */
    public TTacka createTTacka() {
        return new TTacka();
    }

    /**
     * Create an instance of {@link Akt }
     * 
     */
    public Akt createAkt() {
        return new Akt();
    }

    /**
     * Create an instance of {@link TReferenca }
     *
     *//**
     * Create an instance of {@link Amandman }
     *
     */
    public Amandman createAmandman() {
        return new Amandman();
    }

    /**
     * Create an instance of {@link TDeo }
     * 
     */
    public TDeo createTDeo() {
        return new TDeo();
    }

    /**
     * Create an instance of {@link TGlava }
     * 
     */
    public TGlava createTGlava() {
        return new TGlava();
    }

    /**
     * Create an instance of {@link TClan }
     * 
     */
    public TClan createTClan() {
        return new TClan();
    }

    /**
     * Create an instance of {@link TZavrsniDeo }
     * 
     */
    public TZavrsniDeo createTZavrsniDeo() {
        return new TZavrsniDeo();
    }

    /**
     * Create an instance of {@link TSemiStruktuiraniTekst }
     * 
     */
    public TSemiStruktuiraniTekst createTSemiStruktuiraniTekst() {
        return new TSemiStruktuiraniTekst();
    }

    /**
     * Create an instance of {@link TAmandman }
     * 
     */
    public TAmandman createTAmandman() {
        return new TAmandman();
    }

    /**
     * Create an instance of {@link TStav }
     * 
     */
    public TStav createTStav() {
        return new TStav();
    }

    /**
     * Create an instance of {@link TOdeljak }
     * 
     */
    public TOdeljak createTOdeljak() {
        return new TOdeljak();
    }

    /**
     * Create an instance of {@link TReferenca }
     * 
     */
    public TReferenca createTReferenca() {
        return new TReferenca();
    }

    /**
     * Create an instance of {@link TAmandmani }
     * 
     */
    public TAmandmani createTAmandmani() {
        return new TAmandmani();
    }

    /**
     * Create an instance of {@link TPotpisnik }
     * 
     */
    public TPotpisnik createTPotpisnik() {
        return new TPotpisnik();
    }

    /**
     * Create an instance of {@link TPotpisnici }
     * 
     */
    public TPotpisnici createTPotpisnici() {
        return new TPotpisnici();
    }

    /**
     * Create an instance of {@link TPododeljak }
     * 
     */
    public TPododeljak createTPododeljak() {
        return new TPododeljak();
    }

    /**
     * Create an instance of {@link TTacka.Podtacka }
     * 
     */
    public TTacka.Podtacka createTTackaPodtacka() {
        return new TTacka.Podtacka();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gradskaskupstina.gov/", name = "Datum", scope = TSemiStruktuiraniTekst.class)
    public JAXBElement<XMLGregorianCalendar> createTSemiStruktuiraniTekstDatum(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TSemiStruktuiraniTekstDatum_QNAME, XMLGregorianCalendar.class, TSemiStruktuiraniTekst.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gradskaskupstina.gov/", name = "Tekst", scope = TSemiStruktuiraniTekst.class)
    public JAXBElement<String> createTSemiStruktuiraniTekstTekst(String value) {
        return new JAXBElement<String>(_TSemiStruktuiraniTekstTekst_QNAME, String.class, TSemiStruktuiraniTekst.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TReferenca }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gradskaskupstina.gov/", name = "Referenca", scope = TSemiStruktuiraniTekst.class)
    public JAXBElement<TReferenca> createTSemiStruktuiraniTekstReferenca(TReferenca value) {
        return new JAXBElement<TReferenca>(_TSemiStruktuiraniTekstReferenca_QNAME, TReferenca.class, TSemiStruktuiraniTekst.class, value);
    }

}