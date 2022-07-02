package cartao;

import interfaceUsuario.VerificadorEntrada;
import interfaceUsuario.dados.DadosCartao;

public class CartaoPremium extends CartaoStandard {
	public static final Double LIMITE_MAX = (30 ^ 4) * 1.0;
	private Double limite;

	public CartaoPremium(String nomeTitular, DadosCartao dadosCartao) {
		super(nomeTitular, dadosCartao);
		this.tipoCartao = VerificadorEntrada.PREMIUM;
	}
}
