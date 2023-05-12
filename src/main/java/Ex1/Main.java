package Ex1;

public class Main {

    public static void main(String[] args) {

        ContaBancaria c1 = new ContaBancaria(1, 3000);
        ContaBancaria c2 = new ContaBancaria(2, 30000);

        c1.depositar(300);
        c2.depositar(100);

        c1.sacar(1);
        c2.sacar(1);

        c1.exibirSaldo();
        c2.exibirSaldo();

        System.out.println(c1.getHistoricoTransacoes());

    }
}
