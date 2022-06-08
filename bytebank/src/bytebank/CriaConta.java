package bytebank;

public class CriaConta {
	public static void main(String[] ars) {
		Conta conta = new Conta(0,141245,555555,"Weslley Alberto");
		conta.agencia = 141245;
		conta.saldo = 1500.99;
		conta.titular = "Weslley Alberto";
		System.out.println(conta.titular + " " + conta.agencia);
		System.out.println(conta);
		Conta segundaConta = conta;
		System.out.println(segundaConta);
		
		//System.out.println(conta.saca(1500.0));
		System.out.println(conta.saldo);

		Conta contaMarcela = new Conta(0, 541, 141, "Marcela Pereira");
		conta.transfere(1000.00, contaMarcela);
		System.out.println("Conta 1: " +conta.saldo);
		System.out.println("Conta Marcela: " + contaMarcela.saldo);
		contaMarcela.transfere(100, conta);
		System.out.println("*************************************************");
		System.out.println(conta.saldo);
		System.out.println(contaMarcela.saldo);

	}
}
