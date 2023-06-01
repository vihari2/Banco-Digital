public class Main {
    public static void main(String[] args) {

        Cliente vitoria = new Cliente();
        vitoria.setNome("Vitoria");

        Conta cc = new ContaCorrente(vitoria);
        Conta cp = new Poupanca(vitoria);

        cc.depositar(1000);
        cc.sacar(10);
        cc.transferir(100, cp);
        cc.imprimirExtrato();
        cp.imprimirExtrato();


    }
}
