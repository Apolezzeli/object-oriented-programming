package ar.com.ada.online.clasesymetodosabstractosejerciciocorregido;

import java.util.Objects;

public abstract class Product {
    protected String name;
    protected Double price;
    protected Double discount;

//Crear constructores

    public Product() {
    }

//Crear getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }


//Implementar los métodos de la clase abstracta

    public abstract void calculateDiscount();

//Crear equals y hash code

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) &&
                Objects.equals(price, product.price) &&
                Objects.equals(discount, product.discount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, discount);
    }

}
