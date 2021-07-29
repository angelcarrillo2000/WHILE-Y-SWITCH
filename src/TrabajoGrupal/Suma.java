/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoGrupal;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Suma {

    Scanner teclado = new Scanner(System.in);

    private double sumando1, sumando2, sumando3, resultado;

    public Suma() {

    }

    public double operacion() {
        
        System.out.println("ingrese el primer numero");
        double sumando1 = teclado.nextDouble();
        System.out.println("ingrese el segundo numero");
        double sumando2 = teclado.nextDouble();
        System.out.println("ingrese el tercer numero");
        double sumando3 = teclado.nextDouble();
        
        
        this.sumando1 = sumando1;
        this.sumando2 = sumando2;
        this.sumando3 = sumando3;
        
        
        resultado = (sumando1 + sumando2 + sumando3);
        return (resultado);
    }

    public double Imprimir() {

        System.out.println("el resultado de la suma de: " + sumando1 + " + " + sumando2 + " + "
                + sumando3 + " es: " + resultado);
        return resultado;
    }

}
