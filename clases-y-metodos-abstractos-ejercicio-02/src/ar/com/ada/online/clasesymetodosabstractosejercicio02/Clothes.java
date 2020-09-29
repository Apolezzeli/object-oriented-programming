//Para los productos de la categoría de ropa tendrá un 15% de descuento si es una
//prenda para mujer o niño

package ar.com.ada.online.clasesymetodosabstractosejercicio02;

public class Clothes extends Products {

  //Defino variables

    public static String clotheUser;
    public static double clothingDiscount;





    //Creo los constructores



    // Creo los getters and setters



    // Implemento metodos de la clase abstracta Product (ctrl + shift + a -> Implement methods)




    @Override
    public Double calculateDiscount() {
        if (clotheUser == "niño" || clotheUser == "mujer") {
            clothingDiscount = 0.15;
        } else {
            clothingDiscount = 0.0;
        }
        return discount = listPrice * clothingDiscount;
    }


    public void selectClothes () {

        for (int i = 0; i < 3; i++) {
            System.out.println("Seleccione un producto:\n\t1)Campera \n\t2) Pantalón\n\t3) Remera");
            int option = keyboard.nextInt();

            switch (option) {
                case 1:
                    Campera campera = createCampera(keyboard);
                    products.add(campera);
                    break;

                case 2:
                    Pantalon pantalon = createPantalon(keyboard);
                    products.add(pantalon);
                    break;

                case 3:
                    Remera remera = createRemera(keyboard);
                    products.add(remera);
                    break;

                default:
                    System.out.print("Opcion incorrecta");

            }
        }


    //Creo los equals y hashcode


}
