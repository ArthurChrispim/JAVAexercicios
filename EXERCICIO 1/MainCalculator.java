import java.util.Scanner;

public class MainCalculator {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        int  num1;
        int num2;

        System.out.print("Digite o primeiro numero: ");
         num1 = leitor.nextInt();

         System.out.print("Digite o segundo numero: ");
         num2 = leitor.nextInt();

         System.out.println("Escolha uma Opção");
         System.out.println("1: ADIÇÃO");
         System.out.println("2: DIVISÃO");
         System.out.println("3: SUBTRAÇÃO");
         System.out.println("4: MULTIPLICAÇÃO");

         int operador = leitor.nextInt();

         switch (operador){
             case 1:
                 System.out.println("Resultado: " + Calculator.soma(num1, num2));
                 break;
             case 2:
                 System.out.println("Resultado: " + Calculator.div(num1, num2));
                 break;
             case 3:
                 System.out.println("Resultado: " + Calculator.sub(num1, num2));
                 break;
             case 4:
                 System.out.println("Resultado: " + Calculator.mult(num1, num2));
                 break;

                 }
         }

     }
