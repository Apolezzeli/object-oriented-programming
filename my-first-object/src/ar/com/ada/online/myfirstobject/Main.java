package ar.com.ada.online.myfirstobject;

public class Main {

    public static void main(String[] args) {
    //Se crean los objetos:
	Person almendra = new Person();
	Person giuliana = new Person();
	Person paulina = new Person();

	//Se les asigna valor a los atributos:
	almendra.name = "Almendra";
	almendra.lastName = "Polezzeli";

	giuliana.name = "Giuliana";
	giuliana.lastName = "Fertonani";

	paulina.name = "Paulina";
	paulina.lastName = "Stanic";

	//Se ejecuta el metodo:
     almendra.showAttributeValues();
     giuliana.showAttributeValues();
     paulina.showAttributeValues();

     //(Ejemplo con la clase Calculator) Se crean los objetos:
	Calculator myCalculator = new Calculator();

	//Se asigna valor a los atributos:
	myCalculator.numberA = 10;
	myCalculator.numberB = 2;

	//Se ejecutan los metodos:
	Integer resultSum = myCalculator.sumAttributes();
	Integer resultMultiply = myCalculator.multiplyAttributes();

		System.out.printf("Los resultados son los siguientes: \nSuma: %d \nMultiplicacion: %d" , resultSum, resultMultiply );



    }
}
