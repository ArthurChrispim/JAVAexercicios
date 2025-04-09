import java.util.Scanner;

public class Estoque {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[100]; // até 100 produtos
        Scanner sc = new Scanner(System.in);
        int totalProdutos = 0;
        int opcao;

        do {
            System.out.println("\n===== MENU DO ESTOQUE =====");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Ver todos os produtos");
            System.out.println("3 - Atualizar produto");
            System.out.println("4 - Remover produto");
            System.out.println("5 - Mostrar valor total do estoque");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Código: ");
                    String codigo = sc.nextLine();
                    System.out.print("Preço: ");
                    double preco = sc.nextDouble();
                    System.out.print("Quantidade: ");
                    int quantidade = sc.nextInt();
                    produtos[totalProdutos] = new Produto(nome, codigo, preco, quantidade);
                    totalProdutos++;
                    System.out.println("Produto adicionado!");
                    break;

                case 2:
                    System.out.println("\n--- Produtos Cadastrados ---");
                    for (int i = 0; i < totalProdutos; i++) {
                        if (produtos[i] != null) {
                            produtos[i].exibirInformacoes();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Código do produto a atualizar: ");
                    String codAtualizar = sc.nextLine();
                    boolean achouAtualizar = false;
                    for (int i = 0; i < totalProdutos; i++) {
                        if (produtos[i] != null && produtos[i].codigo.equals(codAtualizar)) {
                            System.out.print("Novo preço: ");
                            produtos[i].preco = sc.nextDouble();
                            System.out.print("Nova quantidade: ");
                            produtos[i].quantidadeestoque = sc.nextInt();
                            achouAtualizar = true;
                            System.out.println("Produto atualizado!");
                            break;
                        }
                    }
                    if (!achouAtualizar) {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Código do produto a remover: ");
                    String codRemover = sc.nextLine();
                    boolean achouRemover = false;
                    for (int i = 0; i < totalProdutos; i++) {
                        if (produtos[i] != null && produtos[i].codigo.equals(codRemover)) {
                            produtos[i] = null;
                            achouRemover = true;
                            System.out.println("Produto removido.");
                            break;
                        }
                    }
                    if (!achouRemover) {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 5:
                    double total = 0;
                    for (int i = 0; i < totalProdutos; i++) {
                        if (produtos[i] != null) {
                            total += produtos[i].preco * produtos[i].quantidadeestoque;
                        }
                    }
                    System.out.println("Valor total do estoque: R$" + total);
                    break;

                case 6:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 6);

        sc.close();
    }
}
