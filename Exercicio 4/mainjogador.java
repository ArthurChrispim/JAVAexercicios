import java.util.ArrayList;
import java.util.Scanner;

public class mainjogador {
     private static ArrayList<jogador> perfil = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        perfil.add(new jogador("PlayerOne", 5, 1200));
        perfil.add(new jogador("GamerGirl", 10, 2000));
        perfil.add(new jogador("NoobMaster", 2, 300));
        
            while (true) {
                System.out.println("\nMenu de Gerenciamento de Jogadores:");
                System.out.println("1. Adicionar novo perfil");
                System.out.println("2. Exibir todos os perfis");
                System.out.println("3. Aumentar pontuação de um jogador");
                System.out.println("4. Subir nível de um jogador");
                System.out.println("5. Sair");
                System.out.print("Escolha uma opção: ");
    
                int opcao = scanner.nextInt();
                scanner.nextLine(); // consumir a quebra de linha
    
                switch (opcao) {
                    case 1:
                        adicionarPerfil();
                        break;
                    case 2:
                        exibirTodosPerfis();
                        break;
                    case 3:
                        aumentarPontuacao();
                        break;
                    case 4:
                        subirNivel();
                        break;
                    case 5:
                        System.out.println("Saindo do sistema...");
                        return;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            }
        }
    
        public static void adicionarPerfil() {
            System.out.print("Digite o nome do jogador: ");
            String nome = scanner.nextLine();
    
            System.out.print("Digite a pontuação inicial: ");
            int pontuacao = scanner.nextInt();
    
            System.out.print("Digite o nível inicial: ");
            int nivel = scanner.nextInt();
            scanner.nextLine();
    
            jogador novoJogador = new jogador(nome, pontuacao, nivel);
             perfil.add(novoJogador);
            System.out.println("Perfil adicionado com sucesso!");
        }
    
        public static void exibirTodosPerfis() {
            if (perfil.isEmpty()) {
                System.out.println("Nenhum perfil cadastrado.");
            } else {
                for (int i = 0; i < perfil.size(); i++) {
                    jogador j = perfil.get(i);
                    j.exibirInformacoes();
                    System.out.println("--------------------------");
                }
            }
        }
    
        public static void aumentarPontuacao() {
            System.out.print("Digite o nome do jogador: ");
            String nome = scanner.nextLine();
            jogador jogador = buscarJogador(nome);
    
            if (jogador != null) {
                System.out.print("Quantos pontos deseja adicionar? ");
                int pontos = scanner.nextInt();
                scanner.nextLine();
                jogador.aumentarPontuacao(pontos);
                System.out.println("Pontuação atualizada com sucesso!");
            } else {
                System.out.println("Jogador não encontrado.");
            }
        }
    
        public static void subirNivel() {
            System.out.print("Digite o nome do jogador: ");
            String nome = scanner.nextLine();
            jogador jogador = buscarJogador(nome);
    
            if (jogador != null) {
                jogador.subirNivel();
                System.out.println("Nível aumentado com sucesso!");
            } else {
                System.out.println("Jogador não encontrado.");
            }
        }
    
        public static jogador buscarJogador(String nome) {
            for (int i = 0; i < perfil.size(); i++) {
                jogador j = perfil.get(i);
                if (j.getNome().equalsIgnoreCase(nome)) {
                    return j;
                }
            }
            return null;
        }
    }
    

    





