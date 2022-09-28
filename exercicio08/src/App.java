import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
       float x,y;   
    
        System.out.println("Quantas horas voce trablha por semana?: ");
        x = sc.nextFloat();
        System.out.println("Quanto voce recebe por hora?: ");
        y = sc.nextFloat();

        float z = (x * y)*4;
        
        System.out.println("O seu salario e de : " + z);

    }
}
