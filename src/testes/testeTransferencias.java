package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.Cliente;
import classes.TransferenciaService;
import exception.OperacaoCanceladaException;

public class testeTransferencias {
	
	//Transferencia Completa
	@Test
	public void testTransferencia() {
		Cliente c = new Cliente("Vinicius", 800, 1);
		Cliente c2 = new Cliente("Victor", 800, 2);
		
		TransferenciaService t = new TransferenciaService();
		try {
			t.transferencia(c, c2, 24, 2);
		} catch (OperacaoCanceladaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(824, c2.getSaldo());
	}
	
	//Transferencia para Conta que não Existe
	@Test(expected = OperacaoCanceladaException.class)
	public void testTransferenciaException() throws OperacaoCanceladaException {
		Cliente c = new Cliente("Vinicius", 800, 1);
		Cliente c2 = new Cliente("Victor", 800, 2);
		
		TransferenciaService t = new TransferenciaService();
		try {
			t.transferencia(c, c2, 24, 3);
		} catch (OperacaoCanceladaException e) {
			throw e;
		}
	}
	
	//Credito Positivo
	@Test
	public void testCredito() {
		Cliente c = new Cliente("Vinicius", 800, 1);
 		
		TransferenciaService t = new TransferenciaService();
		try {
			t.credito(c, 20);
		} catch (OperacaoCanceladaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(820, c.getSaldo());
	}
	
	//Credito de valor negativo
	@Test(expected = OperacaoCanceladaException.class)
	public void testCreditoException() throws OperacaoCanceladaException {
	Cliente c = new Cliente("Vinicius", 800, 1);

	TransferenciaService t = new TransferenciaService();
	try {
		t.credito(c, -5);
		} catch (OperacaoCanceladaException e) {
			throw e;
		}
	}
	
	//Credito Positivo
	@Test
	public void testDebito() {
	Cliente c = new Cliente("Vinicius", 800, 1);
	 		
	TransferenciaService t = new TransferenciaService();
	try {
		t.debito(c, 20);
	} catch (OperacaoCanceladaException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		assertEquals(780, c.getSaldo());
	}
	
	//Credito de valor negativo
	@Test(expected = OperacaoCanceladaException.class)
	public void testDebitoException() throws OperacaoCanceladaException {
	Cliente c = new Cliente("Vinicius", 800, 1);

	TransferenciaService t = new TransferenciaService();
	try {
		t.debito(c, 830);
		} catch (OperacaoCanceladaException e) {
			throw e;
		}
	}
		
}
