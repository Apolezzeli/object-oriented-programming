//Para los productos de la categoría de juguetes tendrá un 25% de descuento si
//compran mas de 3 ó el precio excede a los 3.000 pesos.

package ar.com.ada.online.clasesymetodosabstractosejercicio02;

public class Toys extends Products {

     //Defino variables


    //Creo los constructores


    // Creo los getters and setters



    // Implemento metodos de la clase abstracta Product (ctrl + shift + a -> Implement methods)

    @Override
    public void calculateDiscount() {
        if (units > 3 || grossPrice  > 3000){
            discount=listPrice*0.25;
        }

    }

    public void selectToys () {

        for (int i = 0; i < 3; i++) {
            System.out.println("Seleccione un producto:\n\t1) Bingo\n\t2) Jenga\n\t3) Puzzle");
            int option = keyboard.nextInt();

            switch (option) {
                case 1:
                    Bingo bingo = createBingo(keyboard);
                    products.add(bingo);
                    break;

                case 2:
                    Jenga jenga = createJenga(keyboard);
                    products.add(Jenga);
                    break;

                case 3:
                    Puzzle puzzle = createPuzzle(keyboard);
                    products.add(puzzle);
                    break;

                default:
                    System.out.print("Opcion incorrecta");

            }
        }
    }


    //Creo los equals y hashcode
}
