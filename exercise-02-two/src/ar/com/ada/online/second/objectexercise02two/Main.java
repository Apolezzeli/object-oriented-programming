package ar.com.ada.online.second.objectexercise02two;

import java.util.Scanner;

// Agrego esta libreria para poder habilitar la modificacion de formato de fecha de vencimiento
import java.text.SimpleDateFormat;

//Esta libreria es para manejar la exepcion.
import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws ParseException {

        // Item item = new item () (asi se define el objeto en una sola linea)
        Item item;
        item = new Item();

        //con esta declaracion creo el objeto para formatear la fecha
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el nombre del Item: ");
        item.name = keyboard.next();

        System.out.print("Ingrese el precio del producto: $");
        item.price = keyboard.nextDouble();

        item.calculateTax();

        System.out.print("Ingrese la fecha de vencimiento (dd-MM-yyyy): ");
        item.expirationDate = formatter.parse(keyboard.next());

        if (item.canItBeSold()){
            System.out.print("Este Ítem no está habilitado para la venta");
        }
        else System.out.printf(
                "- Producto: %s\n- Precio: %.2f\n- Impuestos: %.2f\n- Total a pagar: %.2f",
                item.name,
                item.price,
                item.tax,
                item.getTotalToPay()
        );






    }
}
