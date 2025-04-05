import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    private static ArrayList<Livro> livros = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        livros.add(new Livro("1984", "George Orwell", 1949));
        livros.add(new Livro("Dom Casmurro", "Machado de Assis", 1899));

        while (true) {
            System.out.println("\nMenu Biblioteca");
            System.out.println("1. Ver informações de um livro");
            System.out.println("2. Adicionar um novo livro");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            
            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    verLivros();
                    break;
                case 2:
                    adicionarLivro();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }
    private static void verLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            return;
        }

        System.out.println("\nLista de Livros:");
        for (int i = 0; i < livros.size(); i++) {
            System.out.println((i + 1) + ". " + livros.get(i).getTitulo());
        }

        System.out.print("Escolha o número do livro para ver detalhes: ");
        int indice = scanner.nextInt() - 1;
        scanner.nextLine();

        if (indice >= 0 && indice < livros.size()) {
            Livro livro = livros.get(indice);
            System.out.println("Título: " + livro.getTitulo());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("Ano de Publicação: " + livro.getAnoPublicaçao());
        } else {
            System.out.println("Escolha inválida.");
        }
    }

    private static void adicionarLivro() {
        System.out.print("Digite o título do livro: ");
        String titulo = scanner.nextLine();

        System.out.print("Digite o autor do livro: ");
        String autor = scanner.nextLine();

        System.out.print("Digite o ano de publicação: ");
        int ano = scanner.nextInt();
        scanner.nextLine();

        livros.add(new Livro(titulo, autor, ano));
        System.out.println("Livro adicionado com sucesso!");
    }
}

