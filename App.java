import java.util.Scanner;

public class App {

    public static int potencialQuadratica(int potencia){
        if(potencia!=0){
            return 2*potencialQuadratica(potencia-1);
        }else{
            return 1;
        }
            
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("CALCULADORA DE POTÊNCIA QUADRÁTICA NATURAL");
        System.out.println("Escolha um número para elevar à 2:");

        int numero = sc.nextInt();

        System.out.println(App.potencialQuadratica(numero));

        sc.close();
    }
}
