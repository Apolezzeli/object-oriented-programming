package ar.com.ada.online.clasesymetodosabstractosejerciciocorregido;

public class Clothes extends Product {

    private String departement;

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    @Override
    public void calculateDiscount() {
        if (departement.equals("Kids") || departement.equals("Women"))
            discount = price * 0.15;
        else
            discount = 0d;
    }
}
