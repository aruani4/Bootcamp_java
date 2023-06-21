package clase_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner cargaDeDatos = new Scanner(System.in);


        //peso / altura al cuadrado = a imc
        System.out.println("ingrese su peso en KG");
        double peso = cargaDeDatos.nextDouble();
        System.out.println("ingrese su altura en Metros");
        double altura = cargaDeDatos.nextDouble();
        double imc = peso / (altura * altura);
        System.out.println("tu indice de masa corporal es de: " + imc);

        if(imc >= 30){
            System.out.println("sos obeso");
        }
        if(imc >= 25 && imc < 30) {
            System.out.println("tenes sobrepeso");
        }
        if (imc >= 20 && imc < 25){
            System.out.println("estas joya negrito");
        }
    }
}
