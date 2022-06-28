package cartao;

import agencia.Agencia;
import cliente.Cliente;
import interfaceUsuario.dados.DadosCartao;
import utilsBank.GeracaoAleatoria;
import utilsBank.databank.Data;
import utilsBank.databank.DataBank;

public abstract class Cartao {
	protected String numeroCartao;
	protected int cvc;
	protected String apelidoCartao;
	protected String nomeTitular;
	protected Data validade;
	protected String tipoCartao; // @Lembrando, tipo se refere ao tipo de conta
	protected FuncaoCartao funcaoCartao; // @Lembrando Se refere a ser debito ou credito

	protected Cartao(Cliente cliente, DadosCartao dadosCartao) {
		this.numeroCartao = Agencia.ID_AGENCIA + GeracaoAleatoria.gerarNumeroCartao();
		this.cvc = Integer.parseInt(GeracaoAleatoria.gerarNumeros(3));
		this.apelidoCartao = dadosCartao.getApelidoCartao();
		this.nomeTitular = cliente.getNome();
		//Possível implementação de método para somar datas (na classe Data)
		this.validade = DataBank.criarData(DataBank.SEM_HORA);
		this.funcaoCartao = dadosCartao.getFuncaoCartao();
	}

	public String getTipoCartao() {
		return this.tipoCartao;
	}

	public FuncaoCartao getFuncaoCartao() {
		return funcaoCartao;
	}
}
