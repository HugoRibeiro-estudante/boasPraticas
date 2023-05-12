package Ex1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ContaBancaria {

    private int number;
    private double saldo;
    private ArrayList<String> historicoTransacoes = new ArrayList<>();

    public ContaBancaria(int number, double saldo) {
        this.number = number;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        this.saldo += valor;
        this.historicoTransacoes.add("depositado o valor de :"+valor);
    }

    public void sacar(double valor){
        this.saldo -= valor;
        this.historicoTransacoes.add("sacado  o valor de :"+valor);
    }

    public void exibirSaldo(){

        System.out.println("seu saldo é de : "+this.saldo);

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ArrayList<String> getHistoricoTransacoes() {
        return historicoTransacoes;
    }

    public void setHistoricoTransacoes(ArrayList<String> historicoTransacoes) {
        this.historicoTransacoes = historicoTransacoes;
    }
}
