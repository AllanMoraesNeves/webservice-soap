
package br.gov.ce.sefaz.pge.wsdl.inscricao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de situacaoDae complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="situacaoDae">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datPagamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="identificador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="localPgto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msgErro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="staDae" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="vlrPago" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "situacaoDae", propOrder = {
    "datPagamento",
    "identificador",
    "localPgto",
    "msgErro",
    "staDae",
    "vlrPago"
})
public class SituacaoDae {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datPagamento;
    protected String identificador;
    protected String localPgto;
    protected String msgErro;
    protected int staDae;
    protected double vlrPago;

    /**
     * Obt�m o valor da propriedade datPagamento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatPagamento() {
        return datPagamento;
    }

    /**
     * Define o valor da propriedade datPagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatPagamento(XMLGregorianCalendar value) {
        this.datPagamento = value;
    }

    /**
     * Obt�m o valor da propriedade identificador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificador() {
        return identificador;
    }

    /**
     * Define o valor da propriedade identificador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificador(String value) {
        this.identificador = value;
    }

    /**
     * Obt�m o valor da propriedade localPgto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalPgto() {
        return localPgto;
    }

    /**
     * Define o valor da propriedade localPgto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalPgto(String value) {
        this.localPgto = value;
    }

    /**
     * Obt�m o valor da propriedade msgErro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgErro() {
        return msgErro;
    }

    /**
     * Define o valor da propriedade msgErro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgErro(String value) {
        this.msgErro = value;
    }

    /**
     * Obt�m o valor da propriedade staDae.
     * 
     */
    public int getStaDae() {
        return staDae;
    }

    /**
     * Define o valor da propriedade staDae.
     * 
     */
    public void setStaDae(int value) {
        this.staDae = value;
    }

    /**
     * Obt�m o valor da propriedade vlrPago.
     * 
     */
    public double getVlrPago() {
        return vlrPago;
    }

    /**
     * Define o valor da propriedade vlrPago.
     * 
     */
    public void setVlrPago(double value) {
        this.vlrPago = value;
    }

}
