package Ex2;

import java.util.ArrayList;

public class Agenda {

    ArrayList<Contato> agenda = new ArrayList<Contato>();


    public void adicionarContato(Contato contato){
        agenda.add(contato);
    }

    public Contato buscaContatoPorNome(String nome){

        for(int i = 0; i < agenda.size(); i++){
            if(agenda.get(i).getNome() == nome){
                return agenda.get(i);
            }
            else return null;
        }

        return null;
    }

    public void atualizarInformacoesDeContato(String nome, int op, String atualizacao){

        Contato contato = buscaContatoPorNome(nome);
        switch (op) {

            case 1:
                contato.setNome(atualizacao);
            break;

            case 2:
                contato.setEmail(atualizacao);
            break;

            case 3:
                contato.setTelefone(atualizacao);
            default:
                System.out.println("Digite uma opção de um a tres : \n" +
                        "1) nome\n" +
                        "2)email\n" +
                        "3)telefone");

        }
    }

    public void excluirContato(String nome){
        agenda.remove(buscaContatoPorNome(nome));
    }

    public ArrayList<Contato> getAgenda() {
        return agenda;
    }

    public void setAgenda(ArrayList<Contato> agenda) {
        this.agenda = agenda;
    }
}
