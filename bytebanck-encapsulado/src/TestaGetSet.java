
public class TestaGetSet {
	public static void main(String[] args) {
		Conta conta = new Conta(0,0,0,new Cliente());
		conta.setNumero(11337);
		conta.setAgencia(123);
		
		System.out.println(conta.getNumero());
		System.out.println(conta.getAgencia());
		
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Silveira");
		paulo.setCpf("11212112");
		conta.setCliente(paulo);
		System.out.println(conta.getCliente().getNome());
		conta.getCliente().setProfissao("Programador");
		System.out.println(conta.getCliente().getProfissao());
		
		System.out.println(conta);
		System.out.println(conta.getCliente());
		System.out.println(paulo);
	}
}
