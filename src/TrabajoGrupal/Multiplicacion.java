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
public class Multiplicacion {

    Scanner teclado = new Scanner(System.in);
    private double multiplicando, multiplicador, resultado;

    public Multiplicacion() {

    }

    public double operacion() {
        System.out.println("ingrese el primer numero");
        double multiplicando = teclado.nextDouble();
        System.out.println("ingrese el segundo numero");
        double multiplicador = teclado.nextDouble();
        this.multiplicando = multiplicando;
        this.multiplicador = multiplicador;
        resultado = multiplicando * multiplicador;
        return (resultado);
    }

    public double Imprimir() {

        System.out.println("el resultado de la multiplicacion  de " + multiplicando + "*" + multiplicador + " es: " + resultado);
        return resultado;
    }

}
