public class Banco {
    public static void main(String[] args){

        ContanBancaria conta = new ContanBancaria(433, "Julius", 680);

        conta.exibirDados();

        conta.depositar(200);


        conta.sacar(100);

        System.out.println("Saldo: R$"+ conta.getSaldo());
    }
}
