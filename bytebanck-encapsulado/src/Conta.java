

public class Conta {
		private double saldo;
		private int agencia;
		private int numero;
		private Cliente cliente;
		private static int total =0;
	
	public Conta(double saldo,int agencia, int numero,Cliente cliente) {
		Conta.total++;
		System.out.println("o total de conta ?: " + Conta.total);
		this.agencia = agencia;
		this.saldo = saldo;
		
		this.numero = numero;
		this.cliente = cliente;
	}
	
	public void deposita(double valor) {
		this.saldo+=valor;
	}
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo-=valor;
			return true;
		}
		else {
			return false;
		}
	}
	public boolean transfere(double valor,Conta destino){
		if(this.saldo >= valor){
			this.saldo-=valor;
			destino.saldo+= valor;
			return true;
		}
		
			return false;
		
	}
	public double getSaldo(){
		return this.saldo;
	}
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero) {
		if(numero <=0){
			System.out.println("Numero de agencia não pode ser menor igual a 0");
			return;
		}
		this.numero = numero;
	}
	public int getAgencia() {
		return this.agencia;
	}
	public void setAgencia(int agencia) {
		if(agencia > 0){
			this.agencia = agencia;
		}
	System.out.println("Agencia n?o pode ter valor menor ou igual a zero");
	return;
		
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public static int getTotal() {
		return Conta.total;
	}
	@Override
	public String toString() {
		return "Saldo: " + this.saldo + "Titular: " + this.cliente + "Agencia: " + this.agencia;
	}
	
}
