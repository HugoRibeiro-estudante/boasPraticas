package Ex4;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    List<Produto> listaDeProdutos = new ArrayList<>();

    public void adcionar(Produto p ){
        listaDeProdutos.add(p);
    }

    public void remover(Produto p ){
        listaDeProdutos.remove(p);
    }

    public void fecharCompra(){

        new Compra(Carrinho.this);

    }
}
