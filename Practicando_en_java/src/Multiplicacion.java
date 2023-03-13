import java.util.Scanner; // Es una clase que nos permite obtener la entrada de datos primitivos

public class Multiplicacion {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Declaramos la clase "Scanner"
        // Pedimos el primer numero
        System.out.println("Ingrese el primer numero : ");
        // "nextInt()" lee valores int introducidos por el usario
        int numero1 = entrada.nextInt();
        // pedimos el segundo numero
        System.out.println("Ingrese el segundo numero : ");
        // "nextInt()" lee valores int introducidos por el usario
        int numero2 = entrada.nextInt();
        // hacemos la multiplicaion
        int resultado = numero1 * numero2;
        // Imprimos el resultado
              System.out.println(numero1 * numero2);

    }

}
