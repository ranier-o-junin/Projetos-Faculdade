import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int numero = sc.nextInt();
        sc.close();
        
        System.out.println("o numero digitado foi: "+ numero);
    }
}
