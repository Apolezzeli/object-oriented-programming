package ar.com.ada.online.clasesymetodosabstractosejercicio01;

import java.util.Objects;

public class Circle extends Figure {

    //Defino variables

    private Double radio;

    //Defino constructores

    public Circle() {
    }

    public Circle(Double radio) {
        this.radio = radio;
    }

    //Defino getter and setter

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    //Implemento metodos de la clase abstracta Figure (ctrl + shift + a -> Implement methods)

    @Override
    public void calculateArea() {
        area = Math.PI * Math.pow(radio, 2); //pow es potencia, asi puedo obtener el cuadrado del radio
    }

    //Defino equals y hash code

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Circle that = (Circle) obj;
        return super.equals(obj) && radio.equals(that.radio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radio);
    }

    //Defino el toString

    @Override
    public String toString() {
        return String.format(
                "Circle { radio = %f, area = %f }",
                radio,
                area
        );

    }
}
