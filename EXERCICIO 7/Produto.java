public class Produto {

    int quantidadeestoque;
    double preco;
    String nome;
    String codigo;

    public Produto(String nome, String codigo, double preco, int quantidadeestoque){
        this.quantidadeestoque = quantidadeestoque;
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;

    }

    public double somavalor(){
        return preco * quantidadeestoque;
    }
    public void exibirInformacoes(){
        System.out.println("Nome: "+ nome);
        System.out.println("Código: " + codigo);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidadeestoque);
        System.out.println("Valor total em estoque: R$ " + somavalor());
    }





}
