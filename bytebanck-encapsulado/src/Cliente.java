
public class Cliente {

	private String nome;
	private String cpf;
	private String profissao;
	
	
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		if(cpf.isEmpty()) {
			System.out.println("CPF nao pode ficar em branco");
			return;
		}
		this.cpf = cpf;
	}
	public String getProfissao() {
		return this.profissao;
	}
	public void setProfissao(String profissao) {
		if(profissao.isBlank()) {
			System.out.println("Profissao nao pode ficar vazia");
			return;
		}
		this.profissao = profissao;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		if(nome.isBlank()) {
			System.out.println("");
		}
		this.nome = nome;
	}
	/*private boolean verificaStringVazia(String string,String propriedade) {
		if(string.isBlank()) {
			System.out.println(propriedade + " não pode ficar vazia!");
			return false;
		}
		return true;
	}*/
	
	
	
}
