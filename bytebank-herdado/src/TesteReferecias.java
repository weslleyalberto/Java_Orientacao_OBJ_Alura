public class TesteReferecias {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("Weslley", "1122121", 1200.00);
       
        EditorVideo e1 = new EditorVideo("Video", "45545", 950.00);
        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        
        controle.registra(e1);
        System.out.println(controle.getSoma());
        
       
    }
}
