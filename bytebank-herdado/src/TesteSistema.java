public class TesteSistema {
    public static void main(String[] args) {
        Gerente g = new Gerente("Valeria", "45454", 1500.0);
        g.setSenha(22223);
        Administrador adm = new Administrador("Weslley Alberto", "45545455", 2500.00);
        adm.setSenha(2222);
        adm.autentica(2222);
        SistemaInterno si = new SistemaInterno();
        si.autentica(g);
        si.autentica(adm);
    }
}
