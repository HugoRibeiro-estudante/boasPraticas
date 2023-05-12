package Ex4;

import java.util.List;

public class Venda {

    private Cliente cliente;
    private double valor;
    private List<Produto> listaDeProdutos;

    public Venda(Cliente cliente, List<Produto> listaDeProdutos) {
        this.cliente = cliente;
        this.listaDeProdutos = listaDeProdutos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public List<Produto> getListaDeProdutos() {
        return listaDeProdutos;
    }

    public void setListaDeProdutos(List<Produto> listaDeProdutos) {
        this.listaDeProdutos = listaDeProdutos;
    }
}
