
package br.gov.ce.sefaz.pge.wsdl.inscricao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de gerarDae complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="gerarDae">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://inscricao.wsdl.pge.sefaz.ce.gov.br/}registroReceita" minOccurs="0"/>
 *         &lt;element name="arg1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gerarDae", propOrder = {
    "arg0",
    "arg1"
})
public class GerarDae {

    protected RegistroReceita arg0;
    protected String arg1;

    /**
     * Obt�m o valor da propriedade arg0.
     * 
     * @return
     *     possible object is
     *     {@link RegistroReceita }
     *     
     */
    public RegistroReceita getArg0() {
        return arg0;
    }

    /**
     * Define o valor da propriedade arg0.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistroReceita }
     *     
     */
    public void setArg0(RegistroReceita value) {
        this.arg0 = value;
    }

    /**
     * Obt�m o valor da propriedade arg1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArg1() {
        return arg1;
    }

    /**
     * Define o valor da propriedade arg1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArg1(String value) {
        this.arg1 = value;
    }

}
