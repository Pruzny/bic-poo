package agencia;

import cliente.Cliente;

import java.util.ArrayList;
import java.util.List;

public class Agencia {
	private static List<Cliente> clientes = new ArrayList<>(); //Talvez mudaremos o tipo de estrutura que usaremos para guardar os clientes
	public static final String ID_AGENCIA = "6721";

	public boolean addCliente(Cliente cliente) {
		if (!clientes.contains(cliente)) {
			clientes.add(cliente);
			return true;
		}
		return false;
	}

	public boolean buscarCliente() {
		return false;
	}


}
