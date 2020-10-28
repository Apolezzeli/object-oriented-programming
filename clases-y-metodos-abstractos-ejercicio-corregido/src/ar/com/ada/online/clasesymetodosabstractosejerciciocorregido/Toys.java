package ar.com.ada.online.clasesymetodosabstractosejerciciocorregido;

public class Toys extends Product {

    @Override
    public void calculateDiscount() {
        if (ShoppingCart.amountOfToys > 3 || ShoppingCart.partialPriceToys >= 3000)
            discount = price * 0.25;
        else
            discount = 0d;
    }
}
