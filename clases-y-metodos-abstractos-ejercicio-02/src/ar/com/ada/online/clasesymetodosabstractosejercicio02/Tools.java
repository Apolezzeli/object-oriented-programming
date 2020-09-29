//Para los productos de la categoría de herramientas tendrá un 5% de la compra será
//efectuada con TDC

package ar.com.ada.online.clasesymetodosabstractosejercicio02;

public class Tools extends Products {

 //Defino variables


    //Creo los constructores



    // Creo los getters and setters


    // Implemento metodos de la clase abstracta Product (ctrl + shift + a -> Implement methods)

    @Override
    public void calculateDiscount() {
        if (paymentMethod = TDC) {
            discount = listPrice * 0.05;
        }
    }

    public void selectTools () {

        for (int i = 0; i < 3; i++) {
            System.out.println("Seleccione un producto:\n\t1) Destornillador\n\t2) Martillo\n\t3) Pala");
            int option = keyboard.nextInt();

            switch (option) {
                case 1:
                    Destornillador destornillador = createDestornillador(keyboard);
                    products.add(destornillador);
                    break;

                case 2:
                    Martillo martillo = createMartillo(keyboard);
                    products.add(martillo);
                    break;

                case 3:
                    Pala pala = createPala(keyboard);
                    products.add(pala);
                    break;

                default:
                    System.out.print("Opcion incorrecta");

            }
        }
    }

    //Creo los equals y hashcode

}
