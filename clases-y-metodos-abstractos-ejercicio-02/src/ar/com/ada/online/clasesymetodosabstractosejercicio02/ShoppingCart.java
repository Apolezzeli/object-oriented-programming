package ar.com.ada.online.clasesymetodosabstractosejercicio02;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class ShoppingCart {

    public static String dayOfWeek;
    public static Integer amountOfToys = 0;
    public static double toysFinalPrice = 0;
    public static Integer paymentMethod = 0;

    private ArrayList<Products> products;

    public ShoppingCart() {
        DateFormat formatter = new SimpleDateFormat("EEEE", Locale.US);
        Date now = new Date();
        ShoppingCart.dayOfWeek =formatter.format(now);
        this.products = new ArrayList<>();
    }

    public ArrayList<Products> getProduct() {return products;}

    public void setProduct(ArrayList<Products> product) {this.products = products;}

    public void addProduct(Products product) {
        if (product instanceof Toys) amountOfToys++;
        this.products.add(products);
    }

    public void addProduct(Products product) {
        if (product instanceof Toys) amountOfToys++;
        this.products.add(products);
    }


}
