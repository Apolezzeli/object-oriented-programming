package ar.com.ada.online.myfirstobject;

public class Calculator {
    Integer numberA;
    Integer numberB;

    Integer sumAttributes (){
        Integer result = this.numberA + this.numberB;
        return result;
    }

    Integer multiplyAttributes (){
        Integer result = this.numberA * this.numberB;
        return result;
    }
}
