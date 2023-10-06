import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("\nBienvenido a MAKAI, alquiler de embarcaciones");

        List<Velero> listVelero = new ArrayList<>();
        List<Yate> listYate = new ArrayList<>();
        Capitan objCapitan = new Capitan("Eduar", "Pizo", "256978");
        System.out.println("El capitán encargado de la embarcación es: \n");
        System.out.println(objCapitan.toString());
        int contVelero =0;
        int contYate=0;
        int opcion = 0;
        do {
            System.out.println("***************************************************");
            System.out.println("*            Alquiler de embarcación              *");
            System.out.println("***************************************************");
            System.out.println("* 1. Velero                                       *");
            System.out.println("* 2. Yate                                         *");
            System.out.println("* 3. Salir                                        *");
            System.out.println("***************************************************");
            System.out.println("Seleccione la acción que desea realizar:");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    int numMastlies=0;
                    int anioFabVelero = 0;

                    contVelero += 1;
                    System.out.println("Ingrese el año de fabricación: ");
                    anioFabVelero = leer.nextInt();
                    System.out.println("Ingrese el numero de mastiles: ");
                    numMastlies = leer.nextInt();

                    Velero velero = new Velero(objCapitan, 150000, 20000.0, anioFabVelero, 8.5, numMastlies);
                    listVelero.add(velero);
                    System.out.println("El velero " + contVelero+ " tiene un costo de alquiler: $ " + velero.calcularAlquiler());
                    System.out.println(velero.validar());
                    break;
                case 2:
                    int numCamarotes = 0;
                    int anioFabYate = 0;

                    contYate += 1;
                    System.out.println("Ingrese el año de fabricación: ");
                    anioFabYate = leer.nextInt();
                    System.out.println("Ingrese el numero de camarotes: ");
                    numCamarotes = leer.nextInt();

                    Yate yate = new Yate(objCapitan, 1900000, 20000.0, anioFabYate, 9.0, numCamarotes);
                    listYate.add(yate);
                    System.out.println("El yate " + contYate+ " tiene un costo de alquiler: $ " + yate.calcularAlquiler());
                    System.out.println(yate.validar());
                    break;
                case 3:
                    System.out.println("Gracias por utilizar nuestro software!!!");
                    break;
            }
        } while (opcion != 3);
    }
}