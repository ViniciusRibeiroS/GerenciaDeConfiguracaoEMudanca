package classes;
public class Cliente {
	
	private String nomeCliente;
	private int saldoCliente;
	
	public Cliente(String nomecliente, int saldoCliente) {
		this.nomeCliente = nomecliente;
		this.saldoCliente = saldoCliente;
	}
	
	
	public Cliente() {
		this.nomeCliente = "Cliente1";
		this.saldoCliente = 845;
	}
	
	public void setSaldo(int saldo) {
		this.saldoCliente = saldo;
	}
	
	public int getSaldo() {
		return saldoCliente;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}

}