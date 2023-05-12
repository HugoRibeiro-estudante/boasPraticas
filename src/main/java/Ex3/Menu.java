package Ex3;

import java.util.ArrayList;

public class Menu {

    private ArrayList<Pedido> menuList = new ArrayList<>();



    public void adicionar(Pedido p){
        menuList.add(p);
    }

    public void remover(Pedido p){
        menuList.remove(p);
    }

    public void exibir(){
        System.out.println("MENU");
        for(int i = 0; i < menuList.size(); i++){
            System.out.println("codigo :"+menuList.get(i).getCodPrato()
                    +"\n descricao :"+menuList.get(i).getDescricao()+"\n"
            );
        }

    }



}
