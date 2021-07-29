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
public class Resta {

    Scanner teclado = new Scanner(System.in);
    private double minuendo, sustraendo, resultado;

    public Resta() {

    }

    public double operacion() {
        System.out.println("ingrese el primer numero");
        double minuendo = teclado.nextDouble();
        System.out.println("ingrese el segundo numero");
        double sustraendo = teclado.nextDouble();
        this.minuendo = minuendo;
        this.sustraendo = sustraendo;
        resultado = minuendo - sustraendo;
        return (resultado);
    }

    public double Imprimir() {

        System.out.println("el resultado de la resta de " + minuendo + "-" + sustraendo + " es: " + resultado);
        return resultado;
    }

}
