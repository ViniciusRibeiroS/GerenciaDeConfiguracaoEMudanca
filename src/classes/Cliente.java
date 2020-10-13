package classes;
public class Cliente {
	
	private String nomeCliente;
	private int saldoCliente;
	private int numeroConta;
	
	public Cliente(String nomecliente, int saldoCliente, int numeroConta) {
		this.nomeCliente = nomecliente;
		this.saldoCliente = saldoCliente;
		this.numeroConta = numeroConta;
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


	public int getNumeroConta() {
		return numeroConta;
	}


	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

}