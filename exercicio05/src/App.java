import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     
        Scanner sc =new Scanner(System.in);
        int x;
        System.out.println("Digite a medida em metros: ");
        x = sc.nextInt();
        System.out.println("a medida em centimetros e :" + (x*100 ));
        
    }
}
