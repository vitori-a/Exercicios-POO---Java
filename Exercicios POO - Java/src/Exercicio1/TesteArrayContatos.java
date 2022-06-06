package Exercicio1;

public class TesteArrayContatos {
    public static void main(String[] args) {
        Contato[] agenda = new Contato[5];
        agenda[0] = new Contato("Maria", "4002-8922");
        agenda[1] = new Contato("Pedro", "1050-0028");
        agenda[2] = new Contato("Antonela", "8989-8989");
        agenda[3] = new Contato("Ismael", "6666-6666");
        agenda[4] = new Contato("Godofredo","5555-5555");

        System.out.println("------- Minha agenda de contatos -------");
        for(int i = 0; i < agenda.length; i++){
            System.out.println("Nome: " + agenda[i].getNome() + " / ");
            System.out.println("Telefone: " + agenda[i].getTelefone());
        }
    }
}
