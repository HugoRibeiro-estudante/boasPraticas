package Ex2;

public class Main {

    public static void main(String[] args) {


        Agenda agenda = new Agenda();
        //adicionando contato a agenda
        agenda.adicionarContato(new Contato("Hugo", "34993379397", "hugo@email.com"));
        //mostrando contatos da agenda
        System.out.println(agenda.getAgenda());
        //buscando contato por nome
        System.out.println(agenda.buscaContatoPorNome("Hugo").getNome());
        //buscando contato por nome e alterando o nome do mesmo
        agenda.atualizarInformacoesDeContato("Hugo", 1,"Hugo Ribeiro");
        //mostrando que atualizou
        System.out.println(agenda.buscaContatoPorNome("Hugo Ribeiro").getNome());
        //excluindo contato
        agenda.excluirContato("Hugo Ribeiro");
        //mostrando agenda vazia
        System.out.println(agenda.getAgenda());
    }
}
