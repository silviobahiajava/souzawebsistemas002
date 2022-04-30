package br.com.souzawebsistemas.enums;

public enum BairroCidadeEnum {
	
	CENTRO("CENTRO"),
	CIDADEVERDE("CIDADE VERDE"),
	CONJUNTOAVIACAO("CONJUNTO AVIAÇÃO"),
	CONUNTOHABITACIONALSANFERNANDO("CONJUNTO HABITACIONAL SAN FERNANDO"),
	CONJUNTOHABITACIONALSANTIAGO("CONJUNTO HABITACIONAL SANTIAGO"),
	DISTRITOINDUSTRIAL("DISTRITO INDUSTRIAL"),
	
	JARDIMALTODABOAVISTA("JARDIM ALTO DA BOA VISTA"),
	JARDIMAMERICA("JARDIM AMÉRICA"),
	JARDIMCASAGRANDE("JARDIM CASA GRANDE"),
	JARDIMCAVIUNA("JARDIM CAVIUNA"),
	JARDIMDOLAGO("JARDIM DO LAGO"),
	JARDIMELDORADO("JARDIM ELDORADO"),
	JARDIMEUROPA("JARDIM EUROPA"),
	JARDIMNOBRE("JARDIM NOBRE"),
	
	JARDIMNOVOHORIZONTE("JARDIM NOVO HORIZONTE"),
	JARDIMROSANGELO("JARDIM ROSANGELO"),
	JARDIMJOSEERDEI("JARDIM JOSÉ ERDEI"),
	
	JARDIMITALIA("JARDIM ITÁLIA"),
	JARDIMPIONEIROS("JARDIM PIONEIROS"),
	
	LOTESRUAHAREAPENNACCHI("LOTES RUA H ÁREA PENNACCHI"),
	MANOELMULLER("MANOEL MULLER"),
	
	PADREANGELO("PADRE ÂNGELO"),
	PARQUEINDROLAND("PARQUE IND ROLAND"),
	
	PARQUEINDUSTRIAL("PARQUE INDUSTRIAL"),
	PARQUEINDUSTRIALBANDEIRANTES("PARQUE INDUSTRIAL BANDEIRANTES"),
	PARQUEINDUSTRIALCAFEZAL("PARQUE INDUSTRIAL CAFEZAL"),
	PARQUEINDUSTRIALMONTESINAI("PARQUE INDUSTRIAL MONTE SINAI"),
	RESIDENCIALMONTECARLO("RESIDENCIAL MONTE CARLO"),

	ROLANDIARUAL("ROLÂNDIA RURAL"),
	
	VILAOLIVEIRA("VILA OLIVEIRA"),
	ZONARURAL("ZONA RURAL"),
	
	BAIRRODEAPUCARANA("BAIRRO DE APUCARANA"),
	BAIRRODEARAPONGAS("BAIRRO DE ARAPONGAS"),
	BAIRRODECAMBE("BAIRRO DE CAMBÉ"),
	BAIRRODELONDRINA("BAIRRO DE LONDRINA");
	
	
	
	
	private String descricao;
	
	private BairroCidadeEnum( String descricao){
		this.descricao=descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	


	
	 
}






