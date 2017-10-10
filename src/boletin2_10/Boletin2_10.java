
package boletin2_10;

import java.util.Scanner;

public class Boletin2_10 {

    public static void main(String[] args) {
        float sueldoFijo, km, kilometros, sBruto,sLiquido;
        int ventas, diasDesplazamiento, comision, dietas;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el sueldo fijo");
        sueldoFijo = sc.nextFloat();
        System.out.println("Introduce el número de ventas");
        ventas = sc.nextInt();
        System.out.println("Introduce el número de kilómetros");
        km = sc.nextFloat();
        System.out.println("Introduce los días de desplazamiento");
        diasDesplazamiento = sc.nextInt();
        kilometros = km*2;
        comision = ventas * 2;
        dietas = diasDesplazamiento * 30;
        sBruto = sueldoFijo + kilometros + comision + dietas;
        sLiquido = (sBruto - (sBruto*(float)0.18)-36);
        System.out.println("Sueldo Bruto = " + sBruto + " euros");
        System.out.println("Sueldo Líquido = " + sLiquido + " euros");
    } 
}
