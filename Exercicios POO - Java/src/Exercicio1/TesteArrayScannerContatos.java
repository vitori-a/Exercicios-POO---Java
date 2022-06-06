package Exercicio1;
import java.util.Scanner;

public class TesteArrayScannerContatos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Contato[] agenda = new Contato[5];

        for(int i = 0; i< agenda.length; i++){
            System.out.println("Dados do contato " + (i + 1) + ":"); // 1°, 2°, 3°.......
            System.out.println("Nome: ");
            String nome = ler.nextLine();
            System.out.println("Telefone: ");
            String telefone = ler.nextLine();
            agenda[i] = new Contato(nome, telefone);
        }

        System.out.println(" ------- Minha agenda de contatos -------");
        for(int i = 0; i < agenda.length; i++){
            System.out.println("Nome: "+ agenda[i].getNome() + "/");
            System.out.println("Telefone: " + agenda[i].getTelefone());
        }
    }
}
