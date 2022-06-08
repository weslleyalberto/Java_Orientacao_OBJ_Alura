package bytebank;

public class TesteMetodo {

		public static void main(String[] args) {
			 Conta conta1 = new Conta(100.50,5414,111, "Weslley");
			 conta1.deposita(1000.50);
			 System.out.println(conta1.saldo);
		}
}
