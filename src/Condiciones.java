import java.util.Scanner;

public class Condiciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad=sc.nextInt();

        if (edad>=18) {
            System.out.println("Puedes conducir");
        } else if (edad==0) {
            System.out.println("Edad no válida");
        } else {
            System.out.println("No puedes conducir");
        }

        switch (edad) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            default:
                System.out.println("Otra cosa");
        }


    }
}
