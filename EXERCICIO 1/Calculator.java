public class Calculator {


    public static double soma (int n1, int n2){
        return n1 + n2;
    }
    public static double div (int n1, int n2){
        if(n2 == 0){
            System.out.println("Não é possivel o valor de zero");
            return 0;
        }
        return n1 / n2;
    }
    public static double mult(int n1, int n2){
        return n1 * n2;
    }
    public static double sub(int n1, int n2){
        return n1 - n2;
    }

}
