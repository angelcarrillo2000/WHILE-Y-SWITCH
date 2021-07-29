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
public class Division {

    Scanner teclado = new Scanner(System.in);
    private double dividendo, divisor, resultado;

    public double operacion() {
        System.out.println("ingrese el primer numero");
        double dividendo = teclado.nextDouble();
        System.out.println("ingrese el segundo numero");
        double divisor = teclado.nextDouble();
        this.dividendo = dividendo;
        this.divisor = divisor;

        resultado = dividendo / divisor;
        return (resultado);
    }

    public double Imprimir() {

        System.out.println("el resultado de la division  de " + dividendo + "/" + divisor + " es: " + resultado);
        return resultado;
    }
}
