package Ex3;

import java.util.ArrayList;


public class Restaurante {

    private String nome, endereco;

    private Menu menu = new Menu();
    private ListaDePedidos lista = new ListaDePedidos();


    public Restaurante(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public ListaDePedidos getLista() {
        return lista;
    }

    public void setLista(ListaDePedidos lista) {
        this.lista = lista;
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
}
