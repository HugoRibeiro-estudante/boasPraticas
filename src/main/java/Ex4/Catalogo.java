package Ex4;

import java.util.ArrayList;

public class Catalogo {

    ArrayList<Produto>  catalogo = new ArrayList<>();


    public void adcionar(Produto p){
        catalogo.add(p);
    }

    public void remover(Produto p){
        catalogo.remove(p);
    }

}
