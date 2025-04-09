import java.util.ArrayList;
import java.util.Scanner;

public class SistemaAgenda {
    private static ArrayList<Contato> listaDeContatos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nMenu da Agenda de Contatos:");
            System.out.println("1. Adicionar novo contato");
            System.out.println("2. Exibir todos os contatos");
            System.out.println("3. Buscar contato por nome");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarContato();
                    break;
                case 2:
                    exibirContatos();
                    break;
                case 3:
                    buscarContato();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private static void adicionarContato() {
        System.out.print("Digite o nome do contato: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o telefone do contato: ");
        String telefone = scanner.nextLine();

        Contato novo = new Contato(nome, telefone);
        listaDeContatos.add(novo);
        System.out.println("Contato adicionado com sucesso!");
    }

    private static void exibirContatos() {
        if (listaDeContatos.isEmpty()) {
            System.out.println("Nenhum contato cadastrado.");
        } else {
            for (int i = 0; i < listaDeContatos.size(); i++) {
                Contato c = listaDeContatos.get(i);
                c.exibirInformacoes();
                System.out.println("--------------------------");
            }
        }
    }

    private static void buscarContato() {
        System.out.print("Digite o nome para busca: ");
        String nomeBusca = scanner.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < listaDeContatos.size(); i++) {
            Contato c = listaDeContatos.get(i);
            if (c.getNome().equalsIgnoreCase(nomeBusca)) {
                c.exibirInformacoes();
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Contato não encontrado.");
        }
    }
}
    





