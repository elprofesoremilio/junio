import java.util.Scanner;

public class EjercicioAdivinar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int elegido = 23;
        System.out.println("Adivina el número: ");
        while ((numero=sc.nextInt()) != elegido) {
            System.out.println("Número no válido, inténtalo otra vez: ");
        }
        System.out.println("¡Acestaste!");
    }
}
