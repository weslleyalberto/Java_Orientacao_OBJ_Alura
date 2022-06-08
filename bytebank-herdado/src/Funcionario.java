//Não pode criar /instanciar objetos dessa classe porque é abstrata.
public abstract class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	
	public Funcionario(String nome,String cpf,double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	//Método sem corpo, não há implementação.
	public abstract double getBonificacao();
		
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "Nome: " + this.nome + " CPF: " + this.cpf + "Salário: " + String.format("%.2f",this.salario);
	}
	
}
