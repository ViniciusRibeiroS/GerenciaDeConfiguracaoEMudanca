package classes;

import exception.OperacaoCanceladaException;

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
	
	private void setSaldo(int saldo) {
		this.saldoCliente = saldo;
	}
	
	public int getSaldo() {
		return saldoCliente;
	}
	
	private int getNumeroConta() {
		return numeroConta;
	}


	//Transferencia
	public void transferencia(Cliente cliente, int valorTransferido, int numeroConta) throws OperacaoCanceladaException {
			
		if(numeroConta != cliente.getNumeroConta()) {
		throw new OperacaoCanceladaException("Conta não Existe");
		} else {
			cliente.debito(valorTransferido);
			this.credito(valorTransferido);
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
		}
	}
}