package ar.com.ada.online.clasesymetodosabstractosejerciciocorregido;

public class Food extends Product {

    @Override
    public void calculateDiscount() {

        if (ShoppingCart.dayOfWeek.equals("Tuesday") || ShoppingCart.dayOfWeek.equals("Thursday"))
            discount = price * 0.10;
        else
            discount = 0d;

    }
}
