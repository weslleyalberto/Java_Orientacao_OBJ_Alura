public class Administrador extends Funcionario implements Autenticavel{
    private int senha;
    public Administrador(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
        
    }

    @Override
    public double getBonificacao() {
       return super.getSalario() + 50.0;
    }

    @Override
    public void setSenha(int senha) {
       this.senha = senha;
        
    }

    @Override
    public boolean autentica(int senha) {
        if(this.senha == senha){
            return true;
        }
        else{
            return false;
        }
        
    }
    
}
