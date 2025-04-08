public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private double velocidadeatual;

    public Carro(String marca, String modelo, int ano, String placa){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velocidadeatual = 0;
    }

    public void acelerar(int valor){
        if(valor > 0){
            velocidadeatual += valor;
            System.out.println("Aumentou +" + valor +"Km/m. velocidade atual: " +velocidadeatual + "km/h");
        }else {
            System.out.println("Valor de inválido");
        }
    }
    public void frear(int valor){
        if(valor > 0){
            velocidadeatual -= valor;
            if (velocidadeatual < 0){
                velocidadeatual = 0;

            }
            System.out.println("Freou -" +valor+ "Km/h atual: " +velocidadeatual+"Km/h");
        } else {
            System.out.println("Valor inválido");
        }
    }
    public void exibirinfos(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo:" + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Placa:" + placa);
        System.out.println("Velocidade atual: " + velocidadeatual);
    }
}
