package ar.com.ada.online.second.objectexercise02two;

import java.util.Date;

public class Item {
    String name;
    Double price;
    Double tax;
    Date expirationDate;

    Double getTotalToPay() {

        return this.price + this.tax;
    }
    void calculateTax(){
        tax = this.price * 0.21;

    }
    Boolean canItBeSold(){

        return expirationDate.getTime() <= System.currentTimeMillis() ;
    }
}
