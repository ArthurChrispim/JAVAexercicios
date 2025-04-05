public class Livro {
    
    private String titulo;
    private String autor;
    private int anopublicaçao;

    public Livro(String titulo, String autor, int anopublicaçao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anopublicaçao = anopublicaçao;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }
    public int getAnoPublicaçao(){
        return anopublicaçao;
    }


}
