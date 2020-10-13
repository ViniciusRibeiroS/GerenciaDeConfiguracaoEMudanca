package classes;

import exception.OperacaoCanceladaException;

public class TransferenciaService {
	
	//Transferencia
	public void transferencia(Cliente cliente1, Cliente cliente2, int valorTransferido, int numeroConta) throws OperacaoCanceladaException {
		
		if(numeroConta != cliente2.getNumeroConta()) {
			throw new OperacaoCanceladaException("Conta não Existe");
		} else {
			cliente2.setSaldo(cliente2.getSaldo() + valorTransferido);
		}
	}

	//Debito
	public void debito(Cliente cliente, int valorDebitado) throws OperacaoCanceladaException {
		if((cliente.getSaldo() - valorDebitado) < 0) {
			throw new OperacaoCanceladaException("Debito maior que valor em Conta");
		}
		else {
			cliente.setSaldo(cliente.getSaldo() - valorDebitado);
		}
	}
	
	//Credito
	public void credito(Cliente cliente, int valorCreditado) throws OperacaoCanceladaException {
		if(valorCreditado < 0) {
			throw new OperacaoCanceladaException("Valor Creditado não pode ser negativo");
		}
		else {
			cliente.setSaldo(cliente.getSaldo() + valorCreditado);
		}
	}
}
