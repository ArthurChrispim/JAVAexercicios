public class ContanBancaria {

    private int numeroConta;
    private String nome;
    private double saldo;


    public ContanBancaria(int numeroConta, String nome, double saldoinicio){

        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = saldoinicio;
    }
    public void depositar(double valor){
        if(valor > 0){
         saldo += valor;
            System.out.println("Depósito de R$"+ valor + " realizado");
        } else{
            System.out.println("Valor inválido");
        }
    }

    public void sacar(double valor){
        if (valor > 0 && valor <= saldo){
          saldo -= valor;
            System.out.println("Saque de R$" +valor + " realizado");
        } else {
            System.out.println("Saque inválido.");
        }
    }
    public double getSaldo(){
        return saldo;
    }
    public void exibirDados(){
        System.out.println("Conta: "+ numeroConta);
        System.out.println("Nome do Titular: "+ nome);
        System.out.println("Saldo: R$ "+ saldo);
    }

}
