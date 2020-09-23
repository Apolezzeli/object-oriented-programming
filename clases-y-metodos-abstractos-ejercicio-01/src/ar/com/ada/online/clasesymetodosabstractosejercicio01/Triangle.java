package ar.com.ada.online.clasesymetodosabstractosejercicio01;

import java.util.Objects;

public class Triangle extends Figure {
    //Defino variables

    private Double base;
    private Double height;

    //Defino constructores


    public Triangle() {
    }

    public Triangle(Double base, Double height) {
        this.base = base;
        this.height = height;
    }

    //Defino getter and setter

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    //Implemento metodos de la clase abstracta Figure (ctrl + shift + a -> Implement methods)

    @Override
    public void calculateArea() {
        area = base * height / 2;

    }
    //Defino equals y hash code


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Triangle that = (Triangle) obj;
        return super.equals(obj) &&
                base.equals(that.base) &&
                height.equals(that.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), base, height);
    }

    //Defino toString

    @Override
    public String toString() {
        return String.format(
                "Triangle { base = %f, height = %f, area = %f }",
                base,
                height,
                area
        );

    }
}
