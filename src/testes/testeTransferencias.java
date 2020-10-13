package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import classes.Cliente;
import classes.TransferenciaService;

public class testeTransferencias {

	@Test
	public void test() {
		Cliente c = new Cliente();
		Cliente c2 = new Cliente();
		
		TransferenciaService t = new TransferenciaService();
		t.transferencia(c, c2, 24);
		
		assertEquals(869, c2.getSaldo());
	}

}
