public class TestaGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("Weslley", "1212122", 1599.90);
        System.out.println(g1.getNome());
        g1.setNome("Mariano");
        System.out.println(g1.getNome());
        Funcionario g2 = new Gerente("Maria", "1211212", 1200.50);
        System.out.println(g2);
        Funcionario f5 = new EditorVideo("Marina", "5454545", 990.0);
        boolean autentica =g1.autentica(2222);
        System.out.println(autentica);
        g1.setSenha(2222);
        autentica = g1.autentica(22222);
        System.out.println(autentica);
        System.out.println(f5);
        System.out.println(g1.getBonificacao());
        System.out.println(g2.getBonificacao());
        System.out.println(f5.getBonificacao());
    }
}
