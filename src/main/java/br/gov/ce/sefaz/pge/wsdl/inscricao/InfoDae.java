
package br.gov.ce.sefaz.pge.wsdl.inscricao;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "InfoDae", targetNamespace = "http://inscricao.wsdl.pge.sefaz.ce.gov.br/")
@XmlSeeAlso({ ObjectFactory.class })
public interface InfoDae {

	/**
	 * 
	 * @param arg1
	 * @param arg0
	 * @return returns br.gov.ce.sefaz.pge.wsdl.inscricao.RegistroReceita
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "reimpressaoDae", targetNamespace = "http://inscricao.wsdl.pge.sefaz.ce.gov.br/", className = "br.gov.ce.sefaz.pge.wsdl.inscricao.ReimpressaoDae")
	@ResponseWrapper(localName = "reimpressaoDaeResponse", targetNamespace = "http://inscricao.wsdl.pge.sefaz.ce.gov.br/", className = "br.gov.ce.sefaz.pge.wsdl.inscricao.ReimpressaoDaeResponse")
	@Action(input = "http://inscricao.wsdl.pge.sefaz.ce.gov.br/InfoDae/reimpressaoDaeRequest", output = "http://inscricao.wsdl.pge.sefaz.ce.gov.br/InfoDae/reimpressaoDaeResponse")
	public RegistroReceita reimpressaoDae(@WebParam(name = "arg0", targetNamespace = "") String arg0,
			@WebParam(name = "arg1", targetNamespace = "") String arg1);

	/**
	 * 
	 * @param arg2
	 * @param arg1
	 * @param arg0
	 * @return returns boolean
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "verificarDiaUtil", targetNamespace = "http://inscricao.wsdl.pge.sefaz.ce.gov.br/", className = "br.gov.ce.sefaz.pge.wsdl.inscricao.VerificarDiaUtil")
	@ResponseWrapper(localName = "verificarDiaUtilResponse", targetNamespace = "http://inscricao.wsdl.pge.sefaz.ce.gov.br/", className = "br.gov.ce.sefaz.pge.wsdl.inscricao.VerificarDiaUtilResponse")
	@Action(input = "http://inscricao.wsdl.pge.sefaz.ce.gov.br/InfoDae/verificarDiaUtilRequest", output = "http://inscricao.wsdl.pge.sefaz.ce.gov.br/InfoDae/verificarDiaUtilResponse")
	public boolean verificarDiaUtil(@WebParam(name = "arg0", targetNamespace = "") String arg0,
			@WebParam(name = "arg1", targetNamespace = "") String arg1,
			@WebParam(name = "arg2", targetNamespace = "") String arg2);

	/**
	 * 
	 * @param arg1
	 * @param arg0
	 * @return returns br.gov.ce.sefaz.pge.wsdl.inscricao.CodigoDAE
	 * @throws Exception_Exception
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "gerarDae", targetNamespace = "http://inscricao.wsdl.pge.sefaz.ce.gov.br/", className = "br.gov.ce.sefaz.pge.wsdl.inscricao.GerarDae")
	@ResponseWrapper(localName = "gerarDaeResponse", targetNamespace = "http://inscricao.wsdl.pge.sefaz.ce.gov.br/", className = "br.gov.ce.sefaz.pge.wsdl.inscricao.GerarDaeResponse")
	@Action(input = "http://inscricao.wsdl.pge.sefaz.ce.gov.br/InfoDae/gerarDaeRequest", output = "http://inscricao.wsdl.pge.sefaz.ce.gov.br/InfoDae/gerarDaeResponse", fault = {
			@FaultAction(className = Exception_Exception.class, value = "http://inscricao.wsdl.pge.sefaz.ce.gov.br/InfoDae/gerarDae/Fault/Exception") })
	public CodigoDAE gerarDae(@WebParam(name = "arg0", targetNamespace = "") RegistroReceita arg0,
			@WebParam(name = "arg1", targetNamespace = "") String arg1) throws Exception_Exception;

	/**
	 * 
	 * @param arg1
	 * @param arg0
	 * @return returns br.gov.ce.sefaz.pge.wsdl.inscricao.CodigoDAE
	 * @throws Exception_Exception
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "gerarDaeInternoSefaz", targetNamespace = "http://inscricao.wsdl.pge.sefaz.ce.gov.br/", className = "br.gov.ce.sefaz.pge.wsdl.inscricao.GerarDaeInternoSefaz")
	@ResponseWrapper(localName = "gerarDaeInternoSefazResponse", targetNamespace = "http://inscricao.wsdl.pge.sefaz.ce.gov.br/", className = "br.gov.ce.sefaz.pge.wsdl.inscricao.GerarDaeInternoSefazResponse")
	@Action(input = "http://inscricao.wsdl.pge.sefaz.ce.gov.br/InfoDae/gerarDaeInternoSefazRequest", output = "http://inscricao.wsdl.pge.sefaz.ce.gov.br/InfoDae/gerarDaeInternoSefazResponse", fault = {
			@FaultAction(className = Exception_Exception.class, value = "http://inscricao.wsdl.pge.sefaz.ce.gov.br/InfoDae/gerarDaeInternoSefaz/Fault/Exception") })
	public CodigoDAE gerarDaeInternoSefaz(@WebParam(name = "arg0", targetNamespace = "") RegistroReceita arg0,
			@WebParam(name = "arg1", targetNamespace = "") String arg1) throws Exception_Exception;

	/**
	 * 
	 * @param arg1
	 * @param arg0
	 * @return returns br.gov.ce.sefaz.pge.wsdl.inscricao.RegistroReceita
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "consultarDae", targetNamespace = "http://inscricao.wsdl.pge.sefaz.ce.gov.br/", className = "br.gov.ce.sefaz.pge.wsdl.inscricao.ConsultarDae")
	@ResponseWrapper(localName = "consultarDaeResponse", targetNamespace = "http://inscricao.wsdl.pge.sefaz.ce.gov.br/", className = "br.gov.ce.sefaz.pge.wsdl.inscricao.ConsultarDaeResponse")
	@Action(input = "http://inscricao.wsdl.pge.sefaz.ce.gov.br/InfoDae/consultarDaeRequest", output = "http://inscricao.wsdl.pge.sefaz.ce.gov.br/InfoDae/consultarDaeResponse")
	public RegistroReceita consultarDae(@WebParam(name = "arg0", targetNamespace = "") String arg0,
			@WebParam(name = "arg1", targetNamespace = "") String arg1);

	/**
	 * 
	 * @param arg1
	 * @param arg0
	 * @return returns
	 *         java.util.List<br.gov.ce.sefaz.pge.wsdl.inscricao.SituacaoDae>
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "consultarPgtoDae", targetNamespace = "http://inscricao.wsdl.pge.sefaz.ce.gov.br/", className = "br.gov.ce.sefaz.pge.wsdl.inscricao.ConsultarPgtoDae")
	@ResponseWrapper(localName = "consultarPgtoDaeResponse", targetNamespace = "http://inscricao.wsdl.pge.sefaz.ce.gov.br/", className = "br.gov.ce.sefaz.pge.wsdl.inscricao.ConsultarPgtoDaeResponse")
	@Action(input = "http://inscricao.wsdl.pge.sefaz.ce.gov.br/InfoDae/consultarPgtoDaeRequest", output = "http://inscricao.wsdl.pge.sefaz.ce.gov.br/InfoDae/consultarPgtoDaeResponse")
	public List<SituacaoDae> consultarPgtoDae(@WebParam(name = "arg0", targetNamespace = "") List<String> arg0,
			@WebParam(name = "arg1", targetNamespace = "") String arg1);

}
