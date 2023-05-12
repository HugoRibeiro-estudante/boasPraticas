package Ex3;

public class Main {

    public static void main(String[] args) {


        Restaurante restX = new Restaurante("RestX", "Rua A");

        Pedido p1 = new Pedido(1, 1, "Hugo", "descricao",120);
        Pedido p2 = new Pedido(2, 2, "Hugo", "descricao",20);

        ListaDePedidos listaDePedidos = new ListaDePedidos();

        listaDePedidos.adicionar(p1);
        listaDePedidos.adicionar(p2);

        listaDePedidos.exibir();

        restX.setLista(listaDePedidos);

        System.out.println("valor total dos pedidos : R$"+listaDePedidos.calculaValorTotal());

        Menu menu = new Menu();

        menu.adicionar(p1);
        menu.adicionar(p2);

        menu.exibir();

        restX.setMenu(menu);
    }
}
