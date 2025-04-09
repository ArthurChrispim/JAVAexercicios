import java.util.ArrayList;
import java.util.Scanner;

public class SistemaPizzaria {
    private static ArrayList<Pedido> pedidos = new ArrayList<>();
    private static ArrayList<Pizza> cardapio = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Pizzas iniciais no cardápio
        cardapio.add(new Pizza("Calabresa", 35.0, "Calabresa, cebola, mussarela"));
        cardapio.add(new Pizza("Marguerita", 32.0, "Mussarela, tomate, manjericão"));
        cardapio.add(new Pizza("Frango com Catupiry", 38.0, "Frango desfiado, catupiry, mussarela"));

        while (true) {
            System.out.println("\n--- Menu da Pizzaria ---");
            System.out.println("1. Fazer novo pedido");
            System.out.println("2. Cancelar pedido");
            System.out.println("3. Exibir relatório de pedidos");
            System.out.println("4. Adicionar sabor ao cardápio");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    fazerPedido();
                    break;
                case 2:
                    cancelarPedido();
                    break;
                case 3:
                    exibirRelatorio();
                    break;
                case 4:
                    adicionarPizza();
                    break;
                case 5:
                    System.out.println("Encerrando o sistema...");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private static void fazerPedido() {
        System.out.println("\n--- Cardápio ---");
        for (int i = 0; i < cardapio.size(); i++) {
            Pizza p = cardapio.get(i);
            System.out.println((i + 1) + ". " + p.getNome() + " - R$" + p.getValor());
            System.out.println("Ingredientes: " + p.getIngredientes());
        }

        System.out.print("Escolha o número da pizza: ");
        int indicePizza = scanner.nextInt() - 1;
        scanner.nextLine();

        if (indicePizza < 0 || indicePizza >= cardapio.size()) {
            System.out.println("Escolha inválida.");
            return;
        }

        Pizza pizzaEscolhida = cardapio.get(indicePizza);

        System.out.print("Informe o endereço de entrega: ");
        String endereco = scanner.nextLine();

        Pedido novoPedido = new Pedido(pizzaEscolhida, endereco);
        pedidos.add(novoPedido);

        System.out.println("Pedido realizado com sucesso!");
    }

    private static void cancelarPedido() {
        if (pedidos.isEmpty()) {
            System.out.println("Nenhum pedido a cancelar.");
            return;
        }

        for (int i = 0; i < pedidos.size(); i++) {
            System.out.println((i + 1) + ". Pedido de " + pedidos.get(i).getPizza().getNome() + ", entregue em: " + pedidos.get(i).getEndereco());
        }

        System.out.print("Escolha o número do pedido para cancelar: ");
        int indice = scanner.nextInt() - 1;
        scanner.nextLine();

        if (indice >= 0 && indice < pedidos.size()) {
            pedidos.remove(indice);
            System.out.println("Pedido cancelado com sucesso.");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    private static void exibirRelatorio() {
        if (pedidos.isEmpty()) {
            System.out.println("Nenhum pedido registrado.");
            return;
        }

        double soma = 0;
        for (Pedido p : pedidos) {
            System.out.println("Pedido: " + p.getPizza().getNome() + " | Valor: R$" + p.getPizza().getValor() + " | Entrega: " + p.getEndereco());
            soma += p.getPizza().getValor();
        }

        double media = soma / pedidos.size();
        System.out.println("\nTotal de pedidos: " + pedidos.size());
        System.out.printf("Média de valor dos pedidos: R$%.2f\n", media);
    }

    private static void adicionarPizza() {
        System.out.print("Digite o nome da nova pizza: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o valor da nova pizza: ");
        double valor = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Digite os ingredientes da nova pizza: ");
        String ingredientes = scanner.nextLine();

        cardapio.add(new Pizza(nome, valor, ingredientes));
        System.out.println("Nova pizza adicionada ao cardápio com sucesso!");
    }
}



