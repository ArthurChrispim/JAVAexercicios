public class jogador {
    
    private String nome;
    private float pontuaçao = 0;
    private int nivel = 1;

    public jogador(String nome, float pontuaçao, int nivel){
        this.nome = nome;
        this.pontuaçao = pontuaçao;
        this.nivel = nivel;
    }

    public String getNome(){
        return nome;
    }
    public float getPontuaçao(){
        return pontuaçao;
    }
    public int getNivel(){
        return nivel;
    }

    // Métodos para modificar as informações
    public void aumentarPontuacao(int pontos) {
        this.pontuaçao += pontos;
    }

    public void subirNivel() {
        this.nivel++;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Pontuação: " + pontuaçao);
        System.out.println("Nível: " + nivel);
    }
}

