package ar.com.ada.online.clasesymetodosabstractosejercicio01;

import java.util.Objects;

public abstract class Figure {

    //Defino la variable comun a todas las figuras: area

    protected Double area;

    //Creo los constructores

    public Figure() {
    }

    //Creo los getters and setters


    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    //Defino los metodos abstractos que utilizare

    public abstract void calculateArea();

    //Creo los equals y hashcode

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Figure that = (Figure) obj;
        return area.equals(that.area);

    }

    @Override
    public int hashCode() {
        return Objects.hash(area);
    }
}
