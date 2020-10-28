package classes;

import exception.OperacaoCanceladaException;

public class Cliente {
	
	private String nomeCliente;
	private int saldoCliente;
	private int numeroConta;
	private int bonificacao;
	
	public Cliente(String nomecliente, int saldoCliente, int numeroConta) {
		this.nomeCliente = nomecliente;
		this.saldoCliente = saldoCliente;
		this.numeroConta = numeroConta;
	}
	
	
	public Cliente() {
		this.nomeCliente = "Cliente1";
		this.saldoCliente = 845;
	}
	
	private void setSaldo(int saldo) {
		this.saldoCliente = saldo;
	}
	
	public int getSaldo() {
		return saldoCliente;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}


	//Transferencia
	public void transferencia(Cliente cliente, int valorTransferido, int numeroConta) throws OperacaoCanceladaException {
			
		if(numeroConta != cliente.getNumeroConta()) {
		throw new OperacaoCanceladaException("Conta não Existe");
		} else {
			cliente.credito(valorTransferido);
			this.debito(valorTransferido);
 		}
	}

	//Debito
	public void debito(int valorDebitado) throws OperacaoCanceladaException {	
		if((this.getSaldo()- valorDebitado) < 0 || valorDebitado < 0) {
			throw new OperacaoCanceladaException("Debito maior que valor em Conta");
		}
		else {
			this.setSaldo(this.getSaldo()- valorDebitado);
		}
	}
		
	//Credito
	public void credito(int valorCreditado) throws OperacaoCanceladaException {
		if(valorCreditado < 0) {
			throw new OperacaoCanceladaException("Valor Creditado não pode ser negativo");
		}
		else {
			this.setSaldo(this.getSaldo() + valorCreditado);
			this.setBonificacao(this.getBonificacao() + valorCreditado/100);
		}
	}


	public String getNomeCliente() {
		return this.nomeCliente;
	}


	public int getBonificacao() {
		return bonificacao;
	}


	public void setBonificacao(int bonificacao) {
		this.bonificacao = bonificacao;
	}
}