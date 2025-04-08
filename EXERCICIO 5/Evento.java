public class Evento {
    public static void main(String[] args){

        Carro carro = new Carro("Volvo", "XC60", 2016, "DJN-3421");

        carro.exibirinfos();

        carro.acelerar(30);
        carro.frear(15);

        carro.exibirinfos();
    }
}
