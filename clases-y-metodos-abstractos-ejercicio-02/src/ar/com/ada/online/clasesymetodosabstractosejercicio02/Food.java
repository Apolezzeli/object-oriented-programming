//Para los productos de la categoría de alimentación, tienen un 10% de descuento si el
//dia es martes o jueves

package ar.com.ada.online.clasesymetodosabstractosejercicio02;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Food extends Products {

    protected ArrayList <Food> foodArrayList;
    Scanner keyboard = new Scanner(System.in);




    //Creo los constructores


    // Creo los getters and setters


    // Implemento metodos de la clase abstracta Product (ctrl + shift + a -> Implement methods)


    @Override
    public void calculateDiscount() {
        System.out.println("Es hoy Martes o Jueves? S/N");
        if (dayOfTheWeek = "S") {
            discount = listPrice * 0.10;
        }
    }

    public void selectFood() {

        for (int i = 0; i < 3; i++) {
            System.out.println("Seleccione un producto:\n\t1) Pizza\n\t2) Empanada\n\t3) Hamburguesa");
            int option = keyboard.nextInt();

            switch (option) {
                case 1:
                    Pizza pizza = createPizza(keyboard);
                    products.add(pizza);
                    break;

                case 2:
                    Empanada empanada = createEmpanada(keyboard);
                    products.add(empanada);
                    break;

                case 3:
                    Hamburguesa hamburguesa = createHamburguesa(keyboard);
                    products.add(hamburguesa);
                    break;

                default:
                    System.out.print("Opcion incorrecta");

            }
        }

    }

    public static Food createFood(Scanner keyboard) {
        Food food = new Food();
        return food;
    }


    public static Clothes createClothes(Scanner keyboard) {
        Clothes clothes = new Clothes();
        return clothes;
    }


    public static Tools createTools(Scanner keyboard) {
        Tools tools = new Tools();
        return tools;
    }

    public static Toys createToys(Scanner keyboard) {
        Toys toys = new Toys();
        return toys;
    }


    public static Pizza createPizza() {
        Pizza pizza = new Pizza();
        return null;
    }

    public static Empanada createEmpanada() {
        Empanada empanada = new Empanada();
        return null;
    }

    public static Hamburguesa createHamburguesa() {
        Hamburguesa hamburguesa = new Hamburguesa();
        return null;
    }


    //Creo los equals y hashcode


}






