package classes;
public class TransferenciaService {
	
	//Saldo, Crédito, Débito e Transferência
	
	public void transferencia(Cliente cliente1, Cliente cliente2, int valorTransferido) {
		cliente2.setSaldo(cliente2.getSaldo() + valorTransferido);
	}

	public static void main(String args[]) {
		Cliente c = new Cliente();
		Cliente c2 = new Cliente();
		
		TransferenciaService t = new TransferenciaService();
		t.transferencia(c, c2, 24);
		
		System.out.println(c2.getSaldo());
		
	}
}
