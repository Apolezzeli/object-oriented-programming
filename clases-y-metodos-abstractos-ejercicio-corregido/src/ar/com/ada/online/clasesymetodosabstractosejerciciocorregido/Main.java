package ar.com.ada.online.clasesymetodosabstractosejerciciocorregido;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart();
        Scanner keyboard = new Scanner(System.in);

        menu(shoppingCart, keyboard);
        shoppingCart.generateAndPrintTicket(keyboard);
    }

    static void menu(ShoppingCart shoppingCart, Scanner keyboard) {
        int continueMenu;
        do {
            System.out.println("Elija la categoria de productos:\n\t1) Alimentos\n\t2) Ropa\n\t3) Juguetes\n\t4) Herramientas");
            int option = keyboard.nextInt();

            switch (option) {
                case 1:
                    Food food = getFoodItem(keyboard);
                    if (food != null)
                        shoppingCart.addProduct(food);
                    break;

                case 2:
                    Clothes clothes = getClothesItem(keyboard);
                    if (clothes != null)
                        shoppingCart.addProduct(clothes);
                    break;

                case 3:
                    Toys toys = getToysItem(keyboard);
                    if (toys != null)
                        shoppingCart.addProduct(toys);
                    break;

                case 4:
                    Tool tool = getToolItem(keyboard);
                    if (tool != null)
                        shoppingCart.addProduct(tool);
                    break;
            }
            System.out.println("Desea agregar otro producto?:\n\t1) SI\n\t2) NO");
            continueMenu = keyboard.nextInt();
        }
        while (continueMenu == 1);
    }

    static Food getFoodItem(Scanner keyboard) {
        System.out.println("Seleccione un producto de la lista");
        System.out.println("\t1) Arroz\t\t$50");
        System.out.println("\t2) Atún\t\t\t$150");
        System.out.println("\t3) Fideos\t\t$60");
        System.out.println("\t4) Harina\t\t$40");

        Food food = new Food();

        int option = keyboard.nextInt();

        switch (option) {
            case 1:
                food.setName("Arroz");
                food.setPrice(50d);
                break;

            case 2:
                food.setName("Atún");
                food.setPrice(150d);
                break;

            case 3:
                food.setName("Fideos");
                food.setPrice(60d);
                break;

            case 4:
                food.setName("Harina");
                food.setPrice(40d);
                break;

            default:
                System.out.println("Debe elegir una opcion valida");
                food = null;
        }

        return food;
    }

    static Clothes getClothesItem(Scanner keyboard) {
        System.out.println("Seleccione un producto de la lista");
        System.out.println("\t1) Zapatos Niños\t$2000");
        System.out.println("\t2) Vestido\t\t\t$1500");
        System.out.println("\t3) Camisa Hombre\t$1000");
        System.out.println("\t4) Sweter\t\t\t$1200");

        Clothes clothes = new Clothes();

        int option = keyboard.nextInt();

        switch (option) {
            case 1:
                clothes.setName("Zapatos Niños");
                clothes.setPrice(2000d);
                clothes.setDepartement("Kids");
                break;

            case 2:
                clothes.setName("Vestido");
                clothes.setPrice(1500d);
                clothes.setDepartement("Women");
                break;

            case 3:
                clothes.setName("Camisa Hombre");
                clothes.setPrice(1000d);
                clothes.setDepartement("Men");
                break;

            case 4:
                clothes.setName("Sweter");
                clothes.setPrice(1200d);
                clothes.setDepartement("Unisex");
                break;

            default:
                System.out.println("Debe elegir una opcion valida");
                clothes = null;
        }

        return clothes;
    }

    static Toys getToysItem(Scanner keyboard) {
        System.out.println("Seleccione un producto de la lista");
        System.out.println("\t1) Cartas UNO\t\t$600");
        System.out.println("\t2) lEGO 1000 pzas\t$1500");
        System.out.println("\t3) PS4\t\t\t\t$30000");
        System.out.println("\t4) Barbie\t\t\t$1200");

        Toys toys = new Toys();

        int option = keyboard.nextInt();

        switch (option) {
            case 1:
                toys.setName("Cartas UNO");
                toys.setPrice(600d);
                break;

            case 2:
                toys.setName("lEGO 1000 pzas");
                toys.setPrice(1500d);
                break;

            case 3:
                toys.setName("PS4");
                toys.setPrice(30000d);
                break;

            case 4:
                toys.setName("Barbie");
                toys.setPrice(1200d);
                break;

            default:
                System.out.println("Debe elegir una opcion valida");
                toys = null;
        }

        return toys;

    }

    static Tool getToolItem(Scanner keyboard) {
        System.out.println("Seleccione un producto de la lista");
        System.out.println("\t1) Taladro\t\t\t$6000");
        System.out.println("\t2) Destornillador\t$500");
        System.out.println("\t3) Pinza \t\t\t$600");
        System.out.println("\t4) Martillo\t\t\t$800");

        Tool tool = new Tool();

        int option = keyboard.nextInt();

        switch (option) {
            case 1:
                tool.setName("Taladro");
                tool.setPrice(6000d);
                break;

            case 2:
                tool.setName("Destornillador");
                tool.setPrice(500d);
                break;

            case 3:
                tool.setName("Pinza");
                tool.setPrice(600d);
                break;

            case 4:
                tool.setName("Martillo");
                tool.setPrice(800d);
                break;

            default:
                System.out.println("Debe elegir una opcion valida");
                tool = null;
        }

        return tool;

    }


}


