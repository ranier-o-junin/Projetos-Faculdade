import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       double x;
        System.out.println("digte a medida do lado do quadrado : ");
        x = sc.nextDouble();

        Double y =(Math.pow(x, 2) * 2 );
        Double z = x * 2;

       System.out.println(" A area do quadrado e: " + z);
    


    }
}
