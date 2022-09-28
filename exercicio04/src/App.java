import java.util.Scanner;

;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
      
        float n1,n2,n3,n4;
    
        System.out.println("digite a primeira nota: ");
        n1=sc.nextFloat();
        System.out.println("digite a segunda nota: ");
        n2= sc.nextFloat();
        System.out.println("digite a terceira nota: ");
        n3 =  sc.nextFloat();
        System.out.println("digite a quarta  nota: ");
        n4 = sc.nextFloat();
      
        float x = n1 + n2 + n3 + n4 /4;
        System.out.println("a media das notas foi: " + x );

       if (x >= 70) {
        System.out.println("Aprovado");  
        
       } else { System.out.println("Reaprovado");
        
       }
          
         
    
            
      

    }
}
