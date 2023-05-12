package Ex3;

import java.util.Date;

public class Pedido {

    private int id,codPrato;
    private String nomeCliente, descricao;

    private double valor;


    public Pedido(int id, int codPrato, String nomeCliente, String descricao, double valor) {
        this.id = id;
        this.codPrato = codPrato;
        this.nomeCliente = nomeCliente;
        this.descricao = descricao;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodPrato() {
        return codPrato;
    }

    public void setCodPrato(int codPrato) {
        this.codPrato = codPrato;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
