package Ex4;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        LojaVirtual LV = new LojaVirtual("LV","Rua A", new ArrayList<>());

        Produto p1 = new Produto("chave","descricao",20);
        Produto p2 = new Produto("celular","descricao",20000);

        Catalogo cat = new Catalogo();

    }
}
