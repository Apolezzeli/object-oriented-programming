package ar.com.ada.online.clasesymetodosabstractosejercicio02;

public abstract class Products {

    //Defino la variable comun a todas los productos: precio de lista

    protected double listPrice;
    protected String productName;
    protected double discount;
    protected double totalToPay;
    protected int units;
    protected double grossPrice; //precio bruto (sin descuento)


    //Creo los constructores


    public Products() {
    }

    public Products(double listPrice, String productName, double discount, double totalToPay, int units, double grossPrice) {
        this.listPrice = listPrice;
        this.productName = productName;
        this.discount = discount;
        this.totalToPay = totalToPay;
        this.units = units;
        this.grossPrice = grossPrice;
    }


    //Creo los getters and setters

    public double getListPrice() {
        return listPrice;
    }

    public void setListPrice(double listPrice) {
        this.listPrice = listPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getTotalToPay() {
        return totalToPay;
    }

    public void setTotalToPay(double totalToPay) {
        this.totalToPay = totalToPay;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public double getGrossPrice() {
        return grossPrice;
    }

    public void setGrossPrice(double grossPrice) {
        this.grossPrice = grossPrice;
    }


    //Defino los metodos abstractos que utilizare

    public abstract void calculateDiscount();

    public Double calculateDiscountPrice() {
        return listPrice - discount;
    }

    public Double calculateTotalToPay(){
        return totalToPay;
    }

    //Creo los equals y hashcode

    //ToString


    @Override
    public String toString() {
        return String.format(
                "Products{ Nombre del Producto = %s, Precio de lista = %f, Unidades = %s, Descuento = %f, Total a pagar = %f, Precio sin descuentos: %f}",

                productName,
                listPrice,
                units,
                discount,
                totalToPay,
                grossPrice

        );
    }
}
