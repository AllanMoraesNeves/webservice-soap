
package br.gov.ce.sefaz.pge.wsdl.inscricao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de codigoDAE complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="codigoDAE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codBarra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificadorDae" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "codigoDAE", propOrder = {
    "codBarra",
    "identificadorDae"
})
public class CodigoDAE {

    protected String codBarra;
    protected String identificadorDae;

    /**
     * Obt�m o valor da propriedade codBarra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodBarra() {
        return codBarra;
    }

    /**
     * Define o valor da propriedade codBarra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodBarra(String value) {
        this.codBarra = value;
    }

    /**
     * Obt�m o valor da propriedade identificadorDae.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorDae() {
        return identificadorDae;
    }

    /**
     * Define o valor da propriedade identificadorDae.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorDae(String value) {
        this.identificadorDae = value;
    }

}
