// Clase principal: contiene el menú del programa
import java.util.Scanner;

public class ArbolBinarioApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArbolBinario arbol = new ArbolBinario();

        int opcion;
        do {
            System.out.println("\n===== MENÚ ÁRBOL BINARIO =====");
            System.out.println("1. Insertar número");
            System.out.println("2. Mostrar recorrido inorden");
            System.out.println("3. Buscar número");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese número: ");
                    int numero = sc.nextInt();
                    arbol.insertar(numero);
                    System.out.println("Número insertado correctamente.");
                    break;
                case 2:
                    arbol.mostrarInorden();
                    break;
                case 3:
                    System.out.print("Ingrese número a buscar: ");
                    int buscado = sc.nextInt();
                    boolean encontrado = arbol.buscar(buscado);
                    if (encontrado) {
                        System.out.println("El número " + buscado + " SÍ está en el árbol.");
                    } else {
                        System.out.println("El número " + buscado + " NO se encuentra en el árbol.");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 4);
    }
}
