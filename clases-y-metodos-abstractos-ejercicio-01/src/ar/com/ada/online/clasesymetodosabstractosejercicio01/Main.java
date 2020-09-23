/*
Se requiere hacer un programa en java que calcule el área de 3 figuras geométricas a elección
del usuario (círculo, rectángulo y triángulo). Los valores para calcular las áreas se basan en los que
posean atributos de cada clase. La salida de cada resultado debe indicar también que tipo de figura es y
con qué valores se realizó el cálculo. También se debe indicar si alguna de las figuras son iguales.
Diseñe e implemente un esquema de jerarquía de clases para dar solución a este
requerimiento. Utilice todo lo aprendido en clase.
*/
package ar.com.ada.online.clasesymetodosabstractosejercicio01;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Figure> figures = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Seleccione una figura:\n\t1) Circulo\n\t2) Rectangulo\n\t3) Triangulo");
            int option = keyboard.nextInt();

            switch (option) {
                case 1:
                    Circle circle = createCircle(keyboard);
                    figures.add(circle);
                    break;

                case 2:
                    Rectangle rectangle = createRectangle(keyboard);
                    figures.add(rectangle);
                    break;

                case 3:
                    Triangle triangle = createTriangle(keyboard);
                    figures.add(triangle);
                    break;

                default:
                    System.out.print("Opcion incorrecta");

            }

        }

        showResults(figures);

    }

    public static Circle createCircle(Scanner keyboard) {
        Circle circle = new Circle();

        System.out.print("Ingrese el radio del Circulo: ");
        Double radio = keyboard.nextDouble();

        circle.setRadio(radio);
        return circle;
    }

    public static Rectangle createRectangle(Scanner keyboard) {
        Rectangle rectangle = new Rectangle();

        System.out.print("Ingrese la base del Rectangulo: ");
        Double base = keyboard.nextDouble();

        System.out.print("Ingrese la altura del Rectangulo: ");
        Double height = keyboard.nextDouble();

        rectangle.setBase(base);
        rectangle.setHeight(height);
        return rectangle;

    }

    public static Triangle createTriangle(Scanner keyboard) {
        Triangle triangle = new Triangle();

        System.out.print("Ingrese la base del Triangulo: ");
        Double base = keyboard.nextDouble();

        System.out.print("Ingrese la altura del Triangulo: ");
        Double height = keyboard.nextDouble();

        triangle.setBase(base);
        triangle.setHeight(height);
        return triangle;

    }

    public static void showResults(ArrayList<Figure> figures) {
        for (Figure figure : figures) {
            figure.calculateArea();

            switch (figure.getClass().getSimpleName()) {
                case "Circle":
                    Circle circle = (Circle) figure;
                    System.out.println("Radio: " + circle.getRadio());
                    break;
                case "Rectangle":
                    Rectangle rectangle = (Rectangle) figure;
                    System.out.println("Base: " + rectangle.getBase());
                    System.out.println("Altura: " + rectangle.getHeight());
                    break;

                case "Triangle":
                    Triangle triangle = (Triangle) figure;
                    System.out.println("Base: " + triangle.getBase());
                    System.out.println("Altura: " + triangle.getHeight());
                    break;
            }
            System.out.println("Area: " + figure.getArea());
        }

        if (hasEqualsFigures(figures)) {
            System.out.println("Existen figuras iguales");

        } else {
            System.out.println("No existen figuras iguales");
        }

    }

    public static Boolean hasEqualsFigures (ArrayList<Figure> figures) {
        Boolean equals = null;
        for (int i = 0; i < figures.size(); i++) {
            Figure figure = figures.get(i);
            for (int j = i + 1; j < figures.size(); j++) {
                equals = figure.equals(figures.get(j));
                if (equals) return equals;
                
            }
            
        }
        return equals;
    }
}
