package unidad3;

import Colas.Cola;
import java.util.Scanner;

public class Unidad3 {

    public static void main(String[] args) {
        Cola c = new Cola();
        Scanner V = new Scanner(System.in);
        boolean salir = false;
        int opc, dato;
        do {
            salir = false;
            System.out.println("Operaciones de una cola"
                    + "\n[1]Encolar"
                    + "\n[2]Desencolar"
                    + "\n[3]Primer elemento"
                    + "\n[4]Ultimo elemento"
                    + "\n[5]Tamaño de la cola"
                    + "\n[6]Comprobar si esta vacia"
                    + "\n[7]Mostrar cola"
                    + "\n[8]Salir");
            opc = V.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Ingresa un numero ");
                    dato = V.nextInt();
                    c.enqueue(dato);
                    break;
                case 2:
                    if (!c.isEmpty()) {
                        dato = c.dequeue();
                        System.out.println("Numero eliminado " + dato);
                    } else {
                        System.out.println("La cola esta vacia");
                    }
                    break;
                case 3:
                    if (!c.isEmpty()) {
                        dato = c.first();
                        System.out.println("El primer elemento de la cola es: " + dato);
                    } else {
                        System.out.println("La cola esta vacia");
                    }
                    break;
                case 4:

                    if (!c.isEmpty()) {
                        dato = c.last();
                        System.out.println("El ultimo elemento de la cola es: " + dato);
                    } else {
                        System.out.println("La cola esta vacia");
                    }
                    break;
                case 5:
                    if (!c.isEmpty()) {
                        dato = c.size();
                        System.out.println("El tamaño de la cola es:: " + dato);
                    } else {
                        System.out.println("La cola esta vacia");
                    }
                    break;
                case 6:
                    if (!c.isEmpty()) {
                        System.out.println("La cola no esta vacia");
                    } else {
                        System.out.println("La cola esta vacia");
                    }
                    break;
                case 7:

                    if (!c.isEmpty()) {
                        c.show();
                    } else {
                        System.out.println("La cola esta vacia");
                    }
                    break;
                case 8:
                    salir = true;
                default:
                    System.out.println("Opcion erronea");

            }
        } while (!salir);
    }
}
