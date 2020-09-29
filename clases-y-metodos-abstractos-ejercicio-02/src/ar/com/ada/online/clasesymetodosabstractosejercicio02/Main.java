/* Se requiere hacer un programa en java que calcule el monto total que debe pagar un usuario en el local
 “Te sacamos un ojo”. Todos los productos están clasificados por categorías: alimentos, ropa, herramientas
  y juguetes.Todos los productos deben tener un precio de lista. Por cada categoría hay 3 productos en concreto
 y los precios varían según lo siguiente:
● Para los productos de la categoría de alimentación, tienen un 10% de descuento si el
dia es martes o jueves
● Para los productos de la categoría de juguetes tendrá un 25% de descuento si
compran mas de 3 ó el precio excede a los 3.000 pesos.
● Para los productos de la categoría de ropa tendrá un 15% de descuento si es una
prenda para mujer o niño.
● Para los productos de la categoría de herramientas tendrá un 5% de la compra será
efectuada con TDC.
La salida debe dar como resultado la cantidad de productos que el cliente lleva y su precio de lista. También
debe decir cuánto hubiese gastado sin descuentos. Diseñe e implemente un esquema de jerarquía de clases para dar
solución a este requerimiento. Utilice todo lo aprendido en clase. */

package ar.com.ada.online.clasesymetodosabstractosejercicio02;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        ArrayList<Products> products = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println("Seleccione una categoria de  producto para iniciar la compra:\n\t1) Comida\n\t2) Ropa\n\t3) Juguetes\n\t3) Herramientas");
            int option = keyboard.nextInt();

            switch (option) {
                case 1:
                    Food food = createFood(keyboard);
                    products.add(Food);
                    break;

                case 2:
                    Clothes clothes = createClothes(keyboard);
                    products.add(Clothes);
                    break;

                case 3:
                    Tools tools = createTools(keyboard);
                    products.add(Tools);
                    break;

                case 4:
                    Toys toys = createToys(keyboard);
                    products.add(Toys);
                    break;

                default:
                    System.out.print("Opcion incorrecta");

            }
        }




            System.out.print("Ingrese las unidades que desea comprar: ");
            int units = keyboard.nextInt();
        }


    }





}

