package Ex4;

import java.util.List;

public class LojaVirtual {

    private String nome, endereco;
    private List<Venda> vendas;

    public LojaVirtual(String nome, String endereco, List<Venda> vendas) {
        this.nome = nome;
        this.endereco = endereco;
        this.vendas = vendas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(List<Venda> vendas) {
        this.vendas = vendas;
    }
}
