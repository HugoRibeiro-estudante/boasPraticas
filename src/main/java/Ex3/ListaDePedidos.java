package Ex3;

import java.util.ArrayList;
import java.util.List;

public class ListaDePedidos {

    private List<Pedido> listaDePedidos = new ArrayList<>();

    public void adicionar(Pedido p){
        listaDePedidos.add(p);
    }

    public void remover(Pedido p){
        listaDePedidos.remove(p);
    }

    public List<Pedido> getListaDePedidos() {
        return listaDePedidos;
    }

    public void setListaDePedidos(List<Pedido> listaDePedidos) {
        this.listaDePedidos = listaDePedidos;
    }

    public double calculaValorTotal(){

        double total = 0;

        for (int i = 0; i < listaDePedidos.size(); i++){
            total = listaDePedidos.get(i).getValor();
        }
        return total;
    }

    public void exibir(){
        System.out.println("PEDIDOS");
        for(int i = 0; i < listaDePedidos.size(); i++){
            System.out.println("codigo :"+listaDePedidos.get(i).getCodPrato()
            +"\nnome do cliente "+listaDePedidos.get(i).getNomeCliente()+"\n"
            );
        }

    }
}
