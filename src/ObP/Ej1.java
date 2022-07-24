package ObP;

import javax.swing.*;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {

        //Ejerccio IF:
        int numeroIF = 0;
        if (numeroIF > 0 ){
            System.out.println("El numero es Positivo");
        }
        else if (numeroIF == 0 ){
            System.out.println("El numero es 0");
        }
        else {
            System.out.println("El numero es Negvtivo");
        }
        System.out.println("=====================================================");
        //Ejerccio While;
        int numeroWhile = 1;
        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        System.out.println("=====================================================");
        //Ejercicio DoWhile
        int numeroDO = 1;
        do {
            System.out.println(numeroDO);
            numeroDO++;
        }while (numeroDO>3);
        System.out.println("=====================================================");
        //Ejercicio FOR
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }
        System.out.println("=====================================================");

        System.out.print("Ingrese la Estacion: ");
        Scanner in = new Scanner(System.in);
        String estacion = in.next();
        switch (estacion){
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            case "Primavera":
                System.out.println("Es Primavera");

        }
    }

}