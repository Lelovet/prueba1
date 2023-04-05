/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package servicios;

import entidades.cafetera;
import java.util.Scanner;

public class serviciosCafetera {

    Scanner in = new Scanner(System.in);

    public cafetera CrearCafetera() {

        cafetera c1 = new cafetera();

        c1.setCapacidadMaxima(100);

        c1.setCantidadActual(0);
        return c1;
    }

    public void llenar(cafetera c1) {
        System.out.println("Se ha llenado la cafetera");
        c1.setCantidadActual(100);
    }

    public void servirTaza(cafetera c1) {
        int taza;
        do {
            System.out.println("Introduzca el tamaño de la taza");

            taza = in.nextInt();
        } while (taza != 75 && taza != 25 && taza != 50);

        if (c1.getCantidadActual() < taza) {
            System.out.println("Lo sentimos, la cafetera no tiene suficiente cafe");

        } else {
            System.out.println("Se ha servido el cafe correctamente");
            c1.setCantidadActual(c1.getCantidadActual() - taza);
        }

    }

    public void VaciarCafetera(cafetera c1) {
        System.out.println("Se ha vaciado la cafetera");
        c1.setCantidadActual(0);
    }

    public void ingresarCafe(cafetera c1) {
        System.out.println("Introduzca cuanto cafe quiere añadir a la cafetera");
        int cafe;
        cafe = in.nextInt();
        if (c1.getCantidadActual() + cafe > c1.getCapacidadMaxima()) {
            System.out.println("Eso es demasiado cafe para esta pequeña cafetera");

        } else {
            System.out.println("La cantidad solicitada de cafe ha sido añadida a la cafetera");
            c1.setCantidadActual(c1.getCantidadActual() + cafe);
        }

    }
}
