
public class TesteValores {
	public static void main(String[] args) {
		Conta conta = new Conta(10,54545,0,new Cliente());
		Conta conta2 = new Conta(20,111,0,new Cliente());
		System.out.println(Conta.getTotal());
		
	}
}
