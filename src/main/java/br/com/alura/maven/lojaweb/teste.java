package br.com.alura.maven.lojaweb;

import javax.xml.ws.BindingProvider;

import br.gov.ce.sefaz.pge.wsdl.inscricao.CodigoDAE;
import br.gov.ce.sefaz.pge.wsdl.inscricao.InfoDae;
import br.gov.ce.sefaz.pge.wsdl.inscricao.InfoDaeService;
import br.gov.ce.sefaz.pge.wsdl.inscricao.RegistroReceita;

public class teste {

	public static void main(String[] args) throws Exception {
		System.setProperty("javax.net.ssl.trustStoreType", "JKS");
		System.setProperty("javax.net.ssl.trustStore", "D:\\sefaz.jks");
		System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
		InfoDaeService infoDaeService = new InfoDaeService();
		InfoDae infoDae = infoDaeService.getInfoDaePort();

		BindingProvider bp = (BindingProvider) infoDae;
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
				"https://www3.sefaz.ce.gov.br/InfoDaeService/InfoDae");

		RegistroReceita registroReceita = criaRegistroReceita();

		CodigoDAE codigoDAE = infoDae.gerarDae(registroReceita, "RECEITA");

		System.out.println(codigoDAE.getCodBarra());
		System.out.println(codigoDAE.getIdentificadorDae());
	}

	private static RegistroReceita criaRegistroReceita() {
		RegistroReceita registroReceita = new RegistroReceita();

		registroReceita.setTipCgcCpf(0);
		registroReceita.setCodCgcCpf(null);
		registroReceita.setCodCgf(61058483);
		registroReceita.setCodEmissor(25);
		registroReceita.setCodMuninicipio(4400);
		registroReceita.setCodReceita(1112);
		registroReceita.setDatValidade(20130226);
		registroReceita.setDatVenciento(20130224);
		registroReceita.setPeriodo("022012");
		registroReceita.setVetIdContribuinte1("TESTE");
		registroReceita.setVetIdContribuinte2("TESTE");
		registroReceita.setVetIdContribuinte3("TESTE");
		registroReceita.setVetIdContribuinte4("TESTE");
		registroReceita.setVetIdContribuinte5("TESTE");
		registroReceita.setVetIdContribuinte6("TESTE");
		registroReceita.setVetInfComplementar1("XXXXXX");
		registroReceita.setVetInfComplementar2("XXXXXX");
		registroReceita.setVetInfComplementar3("XXXXXX");
		registroReceita.setVetInfComplementar4("XXXXXX");
		registroReceita.setVetInfComplementar5("XXXXXX");
		registroReceita.setVlrPrincipal(5000.00);
		registroReceita.setVlrMulta(150.00);
		registroReceita.setVlrJuros(95.70);
		registroReceita.setVlrDescontos(0.00);
		return registroReceita;
	}

}