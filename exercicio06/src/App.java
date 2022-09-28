import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();

        double x;    
    
        System.out.println("Qual o raio do circulo:");
        x = sc.nextDouble();
        

       double z = Math.PI * Math.pow(x,2 );

       System.out.println("a area do circulo e :" + df.format(z )  + "cm2" );

    }
}
