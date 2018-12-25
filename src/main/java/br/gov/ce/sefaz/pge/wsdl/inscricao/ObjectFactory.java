
package br.gov.ce.sefaz.pge.wsdl.inscricao;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.gov.ce.sefaz.pge.wsdl.inscricao package. 
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

    private final static QName _Exception_QNAME = new QName("http://inscricao.wsdl.pge.sefaz.ce.gov.br/", "Exception");
    private final static QName _GerarDaeResponse_QNAME = new QName("http://inscricao.wsdl.pge.sefaz.ce.gov.br/", "gerarDaeResponse");
    private final static QName _RegistroReceita_QNAME = new QName("http://inscricao.wsdl.pge.sefaz.ce.gov.br/", "registroReceita");
    private final static QName _VerificarDiaUtilResponse_QNAME = new QName("http://inscricao.wsdl.pge.sefaz.ce.gov.br/", "verificarDiaUtilResponse");
    private final static QName _GerarDaeInternoSefaz_QNAME = new QName("http://inscricao.wsdl.pge.sefaz.ce.gov.br/", "gerarDaeInternoSefaz");
    private final static QName _GerarDae_QNAME = new QName("http://inscricao.wsdl.pge.sefaz.ce.gov.br/", "gerarDae");
    private final static QName _VerificarDiaUtil_QNAME = new QName("http://inscricao.wsdl.pge.sefaz.ce.gov.br/", "verificarDiaUtil");
    private final static QName _ConsultarPgtoDae_QNAME = new QName("http://inscricao.wsdl.pge.sefaz.ce.gov.br/", "consultarPgtoDae");
    private final static QName _ConsultarPgtoDaeResponse_QNAME = new QName("http://inscricao.wsdl.pge.sefaz.ce.gov.br/", "consultarPgtoDaeResponse");
    private final static QName _ConsultarDaeResponse_QNAME = new QName("http://inscricao.wsdl.pge.sefaz.ce.gov.br/", "consultarDaeResponse");
    private final static QName _ConsultarDae_QNAME = new QName("http://inscricao.wsdl.pge.sefaz.ce.gov.br/", "consultarDae");
    private final static QName _GerarDaeInternoSefazResponse_QNAME = new QName("http://inscricao.wsdl.pge.sefaz.ce.gov.br/", "gerarDaeInternoSefazResponse");
    private final static QName _ReimpressaoDae_QNAME = new QName("http://inscricao.wsdl.pge.sefaz.ce.gov.br/", "reimpressaoDae");
    private final static QName _ReimpressaoDaeResponse_QNAME = new QName("http://inscricao.wsdl.pge.sefaz.ce.gov.br/", "reimpressaoDaeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.gov.ce.sefaz.pge.wsdl.inscricao
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GerarDae }
     * 
     */
    public GerarDae createGerarDae() {
        return new GerarDae();
    }

    /**
     * Create an instance of {@link VerificarDiaUtil }
     * 
     */
    public VerificarDiaUtil createVerificarDiaUtil() {
        return new VerificarDiaUtil();
    }

    /**
     * Create an instance of {@link GerarDaeInternoSefaz }
     * 
     */
    public GerarDaeInternoSefaz createGerarDaeInternoSefaz() {
        return new GerarDaeInternoSefaz();
    }

    /**
     * Create an instance of {@link RegistroReceita }
     * 
     */
    public RegistroReceita createRegistroReceita() {
        return new RegistroReceita();
    }

    /**
     * Create an instance of {@link VerificarDiaUtilResponse }
     * 
     */
    public VerificarDiaUtilResponse createVerificarDiaUtilResponse() {
        return new VerificarDiaUtilResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link GerarDaeResponse }
     * 
     */
    public GerarDaeResponse createGerarDaeResponse() {
        return new GerarDaeResponse();
    }

    /**
     * Create an instance of {@link GerarDaeInternoSefazResponse }
     * 
     */
    public GerarDaeInternoSefazResponse createGerarDaeInternoSefazResponse() {
        return new GerarDaeInternoSefazResponse();
    }

    /**
     * Create an instance of {@link ReimpressaoDae }
     * 
     */
    public ReimpressaoDae createReimpressaoDae() {
        return new ReimpressaoDae();
    }

    /**
     * Create an instance of {@link ReimpressaoDaeResponse }
     * 
     */
    public ReimpressaoDaeResponse createReimpressaoDaeResponse() {
        return new ReimpressaoDaeResponse();
    }

    /**
     * Create an instance of {@link ConsultarDaeResponse }
     * 
     */
    public ConsultarDaeResponse createConsultarDaeResponse() {
        return new ConsultarDaeResponse();
    }

    /**
     * Create an instance of {@link ConsultarDae }
     * 
     */
    public ConsultarDae createConsultarDae() {
        return new ConsultarDae();
    }

    /**
     * Create an instance of {@link ConsultarPgtoDae }
     * 
     */
    public ConsultarPgtoDae createConsultarPgtoDae() {
        return new ConsultarPgtoDae();
    }

    /**
     * Create an instance of {@link ConsultarPgtoDaeResponse }
     * 
     */
    public ConsultarPgtoDaeResponse createConsultarPgtoDaeResponse() {
        return new ConsultarPgtoDaeResponse();
    }

    /**
     * Create an instance of {@link CodigoDAE }
     * 
     */
    public CodigoDAE createCodigoDAE() {
        return new CodigoDAE();
    }

    /**
     * Create an instance of {@link SituacaoDae }
     * 
     */
    public SituacaoDae createSituacaoDae() {
        return new SituacaoDae();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://inscricao.wsdl.pge.sefaz.ce.gov.br/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GerarDaeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://inscricao.wsdl.pge.sefaz.ce.gov.br/", name = "gerarDaeResponse")
    public JAXBElement<GerarDaeResponse> createGerarDaeResponse(GerarDaeResponse value) {
        return new JAXBElement<GerarDaeResponse>(_GerarDaeResponse_QNAME, GerarDaeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistroReceita }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://inscricao.wsdl.pge.sefaz.ce.gov.br/", name = "registroReceita")
    public JAXBElement<RegistroReceita> createRegistroReceita(RegistroReceita value) {
        return new JAXBElement<RegistroReceita>(_RegistroReceita_QNAME, RegistroReceita.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificarDiaUtilResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://inscricao.wsdl.pge.sefaz.ce.gov.br/", name = "verificarDiaUtilResponse")
    public JAXBElement<VerificarDiaUtilResponse> createVerificarDiaUtilResponse(VerificarDiaUtilResponse value) {
        return new JAXBElement<VerificarDiaUtilResponse>(_VerificarDiaUtilResponse_QNAME, VerificarDiaUtilResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GerarDaeInternoSefaz }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://inscricao.wsdl.pge.sefaz.ce.gov.br/", name = "gerarDaeInternoSefaz")
    public JAXBElement<GerarDaeInternoSefaz> createGerarDaeInternoSefaz(GerarDaeInternoSefaz value) {
        return new JAXBElement<GerarDaeInternoSefaz>(_GerarDaeInternoSefaz_QNAME, GerarDaeInternoSefaz.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GerarDae }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://inscricao.wsdl.pge.sefaz.ce.gov.br/", name = "gerarDae")
    public JAXBElement<GerarDae> createGerarDae(GerarDae value) {
        return new JAXBElement<GerarDae>(_GerarDae_QNAME, GerarDae.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificarDiaUtil }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://inscricao.wsdl.pge.sefaz.ce.gov.br/", name = "verificarDiaUtil")
    public JAXBElement<VerificarDiaUtil> createVerificarDiaUtil(VerificarDiaUtil value) {
        return new JAXBElement<VerificarDiaUtil>(_VerificarDiaUtil_QNAME, VerificarDiaUtil.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarPgtoDae }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://inscricao.wsdl.pge.sefaz.ce.gov.br/", name = "consultarPgtoDae")
    public JAXBElement<ConsultarPgtoDae> createConsultarPgtoDae(ConsultarPgtoDae value) {
        return new JAXBElement<ConsultarPgtoDae>(_ConsultarPgtoDae_QNAME, ConsultarPgtoDae.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarPgtoDaeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://inscricao.wsdl.pge.sefaz.ce.gov.br/", name = "consultarPgtoDaeResponse")
    public JAXBElement<ConsultarPgtoDaeResponse> createConsultarPgtoDaeResponse(ConsultarPgtoDaeResponse value) {
        return new JAXBElement<ConsultarPgtoDaeResponse>(_ConsultarPgtoDaeResponse_QNAME, ConsultarPgtoDaeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarDaeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://inscricao.wsdl.pge.sefaz.ce.gov.br/", name = "consultarDaeResponse")
    public JAXBElement<ConsultarDaeResponse> createConsultarDaeResponse(ConsultarDaeResponse value) {
        return new JAXBElement<ConsultarDaeResponse>(_ConsultarDaeResponse_QNAME, ConsultarDaeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarDae }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://inscricao.wsdl.pge.sefaz.ce.gov.br/", name = "consultarDae")
    public JAXBElement<ConsultarDae> createConsultarDae(ConsultarDae value) {
        return new JAXBElement<ConsultarDae>(_ConsultarDae_QNAME, ConsultarDae.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GerarDaeInternoSefazResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://inscricao.wsdl.pge.sefaz.ce.gov.br/", name = "gerarDaeInternoSefazResponse")
    public JAXBElement<GerarDaeInternoSefazResponse> createGerarDaeInternoSefazResponse(GerarDaeInternoSefazResponse value) {
        return new JAXBElement<GerarDaeInternoSefazResponse>(_GerarDaeInternoSefazResponse_QNAME, GerarDaeInternoSefazResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReimpressaoDae }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://inscricao.wsdl.pge.sefaz.ce.gov.br/", name = "reimpressaoDae")
    public JAXBElement<ReimpressaoDae> createReimpressaoDae(ReimpressaoDae value) {
        return new JAXBElement<ReimpressaoDae>(_ReimpressaoDae_QNAME, ReimpressaoDae.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReimpressaoDaeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://inscricao.wsdl.pge.sefaz.ce.gov.br/", name = "reimpressaoDaeResponse")
    public JAXBElement<ReimpressaoDaeResponse> createReimpressaoDaeResponse(ReimpressaoDaeResponse value) {
        return new JAXBElement<ReimpressaoDaeResponse>(_ReimpressaoDaeResponse_QNAME, ReimpressaoDaeResponse.class, null, value);
    }

}
