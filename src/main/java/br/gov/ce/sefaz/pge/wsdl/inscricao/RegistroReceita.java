
package br.gov.ce.sefaz.pge.wsdl.inscricao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de registroReceita complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="registroReceita">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codBarras" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codCgcCpf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codCgf" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codEmissor" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codMuninicipio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codProduto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codReceita" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codRetorno" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="datValidade" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="datVenciento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="docOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="msgErro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numIdentificador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numParcela" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="periodo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipCgcCpf" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tipOrigem" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="vetIdContribuinte1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vetIdContribuinte2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vetIdContribuinte3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vetIdContribuinte4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vetIdContribuinte5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vetIdContribuinte6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vetInfComplementar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vetInfComplementar2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vetInfComplementar3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vetInfComplementar4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vetInfComplementar5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vlrAtualMulta" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="vlrAtualPrincipal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="vlrDescontos" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="vlrJuros" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="vlrMulta" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="vlrPrincipal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registroReceita", propOrder = {
    "codBarras",
    "codCgcCpf",
    "codCgf",
    "codEmissor",
    "codMuninicipio",
    "codProduto",
    "codReceita",
    "codRetorno",
    "datValidade",
    "datVenciento",
    "docOrigem",
    "msgErro",
    "numIdentificador",
    "numParcela",
    "periodo",
    "tipCgcCpf",
    "tipOrigem",
    "vetIdContribuinte1",
    "vetIdContribuinte2",
    "vetIdContribuinte3",
    "vetIdContribuinte4",
    "vetIdContribuinte5",
    "vetIdContribuinte6",
    "vetInfComplementar1",
    "vetInfComplementar2",
    "vetInfComplementar3",
    "vetInfComplementar4",
    "vetInfComplementar5",
    "vlrAtualMulta",
    "vlrAtualPrincipal",
    "vlrDescontos",
    "vlrJuros",
    "vlrMulta",
    "vlrPrincipal"
})
public class RegistroReceita {

    protected String codBarras;
    protected String codCgcCpf;
    protected int codCgf;
    protected int codEmissor;
    protected int codMuninicipio;
    protected int codProduto;
    protected int codReceita;
    protected int codRetorno;
    protected int datValidade;
    protected int datVenciento;
    protected String docOrigem;
    protected String msgErro;
    protected String numIdentificador;
    protected int numParcela;
    protected String periodo;
    protected int tipCgcCpf;
    protected int tipOrigem;
    protected String vetIdContribuinte1;
    protected String vetIdContribuinte2;
    protected String vetIdContribuinte3;
    protected String vetIdContribuinte4;
    protected String vetIdContribuinte5;
    protected String vetIdContribuinte6;
    protected String vetInfComplementar1;
    protected String vetInfComplementar2;
    protected String vetInfComplementar3;
    protected String vetInfComplementar4;
    protected String vetInfComplementar5;
    protected double vlrAtualMulta;
    protected double vlrAtualPrincipal;
    protected double vlrDescontos;
    protected double vlrJuros;
    protected double vlrMulta;
    protected double vlrPrincipal;

    /**
     * Obt�m o valor da propriedade codBarras.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodBarras() {
        return codBarras;
    }

    /**
     * Define o valor da propriedade codBarras.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodBarras(String value) {
        this.codBarras = value;
    }

    /**
     * Obt�m o valor da propriedade codCgcCpf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCgcCpf() {
        return codCgcCpf;
    }

    /**
     * Define o valor da propriedade codCgcCpf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCgcCpf(String value) {
        this.codCgcCpf = value;
    }

    /**
     * Obt�m o valor da propriedade codCgf.
     * 
     */
    public int getCodCgf() {
        return codCgf;
    }

    /**
     * Define o valor da propriedade codCgf.
     * 
     */
    public void setCodCgf(int value) {
        this.codCgf = value;
    }

    /**
     * Obt�m o valor da propriedade codEmissor.
     * 
     */
    public int getCodEmissor() {
        return codEmissor;
    }

    /**
     * Define o valor da propriedade codEmissor.
     * 
     */
    public void setCodEmissor(int value) {
        this.codEmissor = value;
    }

    /**
     * Obt�m o valor da propriedade codMuninicipio.
     * 
     */
    public int getCodMuninicipio() {
        return codMuninicipio;
    }

    /**
     * Define o valor da propriedade codMuninicipio.
     * 
     */
    public void setCodMuninicipio(int value) {
        this.codMuninicipio = value;
    }

    /**
     * Obt�m o valor da propriedade codProduto.
     * 
     */
    public int getCodProduto() {
        return codProduto;
    }

    /**
     * Define o valor da propriedade codProduto.
     * 
     */
    public void setCodProduto(int value) {
        this.codProduto = value;
    }

    /**
     * Obt�m o valor da propriedade codReceita.
     * 
     */
    public int getCodReceita() {
        return codReceita;
    }

    /**
     * Define o valor da propriedade codReceita.
     * 
     */
    public void setCodReceita(int value) {
        this.codReceita = value;
    }

    /**
     * Obt�m o valor da propriedade codRetorno.
     * 
     */
    public int getCodRetorno() {
        return codRetorno;
    }

    /**
     * Define o valor da propriedade codRetorno.
     * 
     */
    public void setCodRetorno(int value) {
        this.codRetorno = value;
    }

    /**
     * Obt�m o valor da propriedade datValidade.
     * 
     */
    public int getDatValidade() {
        return datValidade;
    }

    /**
     * Define o valor da propriedade datValidade.
     * 
     */
    public void setDatValidade(int value) {
        this.datValidade = value;
    }

    /**
     * Obt�m o valor da propriedade datVenciento.
     * 
     */
    public int getDatVenciento() {
        return datVenciento;
    }

    /**
     * Define o valor da propriedade datVenciento.
     * 
     */
    public void setDatVenciento(int value) {
        this.datVenciento = value;
    }

    /**
     * Obt�m o valor da propriedade docOrigem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocOrigem() {
        return docOrigem;
    }

    /**
     * Define o valor da propriedade docOrigem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocOrigem(String value) {
        this.docOrigem = value;
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
     * Obt�m o valor da propriedade numIdentificador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumIdentificador() {
        return numIdentificador;
    }

    /**
     * Define o valor da propriedade numIdentificador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumIdentificador(String value) {
        this.numIdentificador = value;
    }

    /**
     * Obt�m o valor da propriedade numParcela.
     * 
     */
    public int getNumParcela() {
        return numParcela;
    }

    /**
     * Define o valor da propriedade numParcela.
     * 
     */
    public void setNumParcela(int value) {
        this.numParcela = value;
    }

    /**
     * Obt�m o valor da propriedade periodo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodo() {
        return periodo;
    }

    /**
     * Define o valor da propriedade periodo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodo(String value) {
        this.periodo = value;
    }

    /**
     * Obt�m o valor da propriedade tipCgcCpf.
     * 
     */
    public int getTipCgcCpf() {
        return tipCgcCpf;
    }

    /**
     * Define o valor da propriedade tipCgcCpf.
     * 
     */
    public void setTipCgcCpf(int value) {
        this.tipCgcCpf = value;
    }

    /**
     * Obt�m o valor da propriedade tipOrigem.
     * 
     */
    public int getTipOrigem() {
        return tipOrigem;
    }

    /**
     * Define o valor da propriedade tipOrigem.
     * 
     */
    public void setTipOrigem(int value) {
        this.tipOrigem = value;
    }

    /**
     * Obt�m o valor da propriedade vetIdContribuinte1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVetIdContribuinte1() {
        return vetIdContribuinte1;
    }

    /**
     * Define o valor da propriedade vetIdContribuinte1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVetIdContribuinte1(String value) {
        this.vetIdContribuinte1 = value;
    }

    /**
     * Obt�m o valor da propriedade vetIdContribuinte2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVetIdContribuinte2() {
        return vetIdContribuinte2;
    }

    /**
     * Define o valor da propriedade vetIdContribuinte2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVetIdContribuinte2(String value) {
        this.vetIdContribuinte2 = value;
    }

    /**
     * Obt�m o valor da propriedade vetIdContribuinte3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVetIdContribuinte3() {
        return vetIdContribuinte3;
    }

    /**
     * Define o valor da propriedade vetIdContribuinte3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVetIdContribuinte3(String value) {
        this.vetIdContribuinte3 = value;
    }

    /**
     * Obt�m o valor da propriedade vetIdContribuinte4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVetIdContribuinte4() {
        return vetIdContribuinte4;
    }

    /**
     * Define o valor da propriedade vetIdContribuinte4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVetIdContribuinte4(String value) {
        this.vetIdContribuinte4 = value;
    }

    /**
     * Obt�m o valor da propriedade vetIdContribuinte5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVetIdContribuinte5() {
        return vetIdContribuinte5;
    }

    /**
     * Define o valor da propriedade vetIdContribuinte5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVetIdContribuinte5(String value) {
        this.vetIdContribuinte5 = value;
    }

    /**
     * Obt�m o valor da propriedade vetIdContribuinte6.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVetIdContribuinte6() {
        return vetIdContribuinte6;
    }

    /**
     * Define o valor da propriedade vetIdContribuinte6.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVetIdContribuinte6(String value) {
        this.vetIdContribuinte6 = value;
    }

    /**
     * Obt�m o valor da propriedade vetInfComplementar1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVetInfComplementar1() {
        return vetInfComplementar1;
    }

    /**
     * Define o valor da propriedade vetInfComplementar1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVetInfComplementar1(String value) {
        this.vetInfComplementar1 = value;
    }

    /**
     * Obt�m o valor da propriedade vetInfComplementar2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVetInfComplementar2() {
        return vetInfComplementar2;
    }

    /**
     * Define o valor da propriedade vetInfComplementar2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVetInfComplementar2(String value) {
        this.vetInfComplementar2 = value;
    }

    /**
     * Obt�m o valor da propriedade vetInfComplementar3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVetInfComplementar3() {
        return vetInfComplementar3;
    }

    /**
     * Define o valor da propriedade vetInfComplementar3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVetInfComplementar3(String value) {
        this.vetInfComplementar3 = value;
    }

    /**
     * Obt�m o valor da propriedade vetInfComplementar4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVetInfComplementar4() {
        return vetInfComplementar4;
    }

    /**
     * Define o valor da propriedade vetInfComplementar4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVetInfComplementar4(String value) {
        this.vetInfComplementar4 = value;
    }

    /**
     * Obt�m o valor da propriedade vetInfComplementar5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVetInfComplementar5() {
        return vetInfComplementar5;
    }

    /**
     * Define o valor da propriedade vetInfComplementar5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVetInfComplementar5(String value) {
        this.vetInfComplementar5 = value;
    }

    /**
     * Obt�m o valor da propriedade vlrAtualMulta.
     * 
     */
    public double getVlrAtualMulta() {
        return vlrAtualMulta;
    }

    /**
     * Define o valor da propriedade vlrAtualMulta.
     * 
     */
    public void setVlrAtualMulta(double value) {
        this.vlrAtualMulta = value;
    }

    /**
     * Obt�m o valor da propriedade vlrAtualPrincipal.
     * 
     */
    public double getVlrAtualPrincipal() {
        return vlrAtualPrincipal;
    }

    /**
     * Define o valor da propriedade vlrAtualPrincipal.
     * 
     */
    public void setVlrAtualPrincipal(double value) {
        this.vlrAtualPrincipal = value;
    }

    /**
     * Obt�m o valor da propriedade vlrDescontos.
     * 
     */
    public double getVlrDescontos() {
        return vlrDescontos;
    }

    /**
     * Define o valor da propriedade vlrDescontos.
     * 
     */
    public void setVlrDescontos(double value) {
        this.vlrDescontos = value;
    }

    /**
     * Obt�m o valor da propriedade vlrJuros.
     * 
     */
    public double getVlrJuros() {
        return vlrJuros;
    }

    /**
     * Define o valor da propriedade vlrJuros.
     * 
     */
    public void setVlrJuros(double value) {
        this.vlrJuros = value;
    }

    /**
     * Obt�m o valor da propriedade vlrMulta.
     * 
     */
    public double getVlrMulta() {
        return vlrMulta;
    }

    /**
     * Define o valor da propriedade vlrMulta.
     * 
     */
    public void setVlrMulta(double value) {
        this.vlrMulta = value;
    }

    /**
     * Obt�m o valor da propriedade vlrPrincipal.
     * 
     */
    public double getVlrPrincipal() {
        return vlrPrincipal;
    }

    /**
     * Define o valor da propriedade vlrPrincipal.
     * 
     */
    public void setVlrPrincipal(double value) {
        this.vlrPrincipal = value;
    }

}
