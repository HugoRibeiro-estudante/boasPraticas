package Ex4;

import java.util.List;

public class HistoricoDeCompra {

    private List<Compra> listaHistorico;

    public void adicionar(Compra c){
        listaHistorico.add(c);
    }

    public void remover(Compra c){
        listaHistorico.remove(c);
    }

    public List<Compra> getListaHistorico() {
        return listaHistorico;
    }

    public void setListaHistorico(List<Compra> listaHistorico) {
        this.listaHistorico = listaHistorico;
    }
}
