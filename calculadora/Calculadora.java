
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        int n1;
        int n2;
        int resultado;
        int opcion;
        int salida;

        Scanner constructor  = new Scanner(System.in);

        do{
            System.out.println("Ingrese el primer numero para operar ");
            n1 = constructor.nextInt();
            System.out.println("Ingrese el segundo numero para operar ");
            n2 = constructor.nextInt();
            System.out.println("Ingrese la operacion que desea realizar: #1 Suma, #2 Resta, #3 Multiplicacion y #4 Division ");
            opcion = constructor.nextInt();

            switch (opcion) {
                case 1:
                    resultado = Suma(n1, n2);
                    System.out.println("El resultado de la suma es " + resultado);
                    break;
                case 2:
                    resultado =Resta(n1, n2);
                    System.out.println("El resultado de la resta es " + resultado);
                    break;
                case 3:
                    resultado =Multiplicacion(n1, n2);
                    System.out.println("El resultado de la multiplicacion es " + resultado);
                    break;
                case 4:
                    resultado =Division(n1, n2);
                    System.out.println("El resultado de la division es " + resultado);
                    break;
            
                default:
                    break;
            }
            System.out.println("Si desea seguir operando presione #1, si desea salir presione #2 ");
            salida = constructor.nextInt();


        }while(salida != 2);
        
        
    }
    public static int Suma (int a, int b) {
        return a+b;
    }
    public static int Resta (int a, int b) {
        return a-b;
    }
    public static int Multiplicacion (int a, int b) {
        return a*b;
    }
    public static int Division (int a, int b) {
        
        if (b > 0) {
            return a/b;
        }else{
            return 0;
        }
    }
}


    

