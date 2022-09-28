import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double tempF, tempC = 0 ;
        
        System.out.println("Digite a temperatura em Fahrenheit: ");
        tempF = sc.nextDouble();

        tempC =  5 * ((tempF-32) / 9);

        System.out.println("A temperatura em Celsius:" + tempC);

    }
}
