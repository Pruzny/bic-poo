package cliente;

import conta.Conta;

import java.io.Serializable;

public abstract class Cliente implements Serializable {
	private final int QUANTIDADE_DE_CHAVES_MAX = 4;
	private String nome;
	private String email;
	private int telefone;
	private int idade;
	private Endereco end;
	private boolean isOnline;
	private double renda;
	private int quantidadeDeChavesAtuais;

	public Cliente(String nome, String email, int telefone, int idade, Endereco end, boolean isOnline, double renda) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.idade = idade;
		this.end = end;
		this.isOnline = isOnline;
		this.renda = renda;
		this.quantidadeDeChavesAtuais = 0;
	}

	public String getNome() {
		return nome;
	}

	public abstract Conta getConta();

	public void setQuantidadeDeChavesAtuais() {
		this.quantidadeDeChavesAtuais++;
	}

	public abstract boolean equals(Cliente outroCliente);
}
