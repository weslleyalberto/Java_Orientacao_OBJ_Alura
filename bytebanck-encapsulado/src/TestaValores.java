public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(0,0,0,"Weslley Alberto");
        conta.setAgencia(-1212);
        conta.setNumero(-2555);
        System.out.println(conta.getAgencia());
    }
}
