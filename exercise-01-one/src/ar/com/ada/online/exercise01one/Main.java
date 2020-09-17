package ar.com.ada.online.exercise01one;

public class Main {

    public static void main(String[] args) {
        //Se crean los objetos
        Animal dog = new Animal();
        Vehicle car = new Vehicle();
        Person almendra = new Person();

        //Se le asignan valores a los objetos

        //Animal
        dog.breed = "Labrador";
        dog.color = "Yellow";
        dog.name = "Junior";

        //Auto
        car.brand = "Ford";
        car.maxSpeed = 150;
        car.color = "Black";

        //Persona
        almendra.name = "Almendra";
        almendra.lastName = "Polezzeli";
        almendra.age = 33;

        //Se muestran los valores de los objetos
        System.out.println(dog.breed + " " + dog.color + " " + dog.name);
        System.out.println(car.brand + " " + car.color + " " + car.maxSpeed + " Km/h");
        System.out.println(almendra.name + " " + almendra.lastName + " " + almendra.age + " years old");


        //Se ejecuta un metodo de cada clase
        dog.sleep();
        car.moveOn();
        almendra.talk();
    }
}
