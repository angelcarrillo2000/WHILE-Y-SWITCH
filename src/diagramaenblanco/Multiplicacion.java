/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagramaenblanco;

/**
 *
 * @author Usuario
 */
public class Multiplicacion {
    private double multiplipcando, multiplpicador ,resultado;

    public  Multiplicacion(double multiplicando,double multiplicador) {
        this.multiplipcando = multiplicando;
        this.multiplpicador = multiplicador;
        
    }

    public double operacion() {
        resultado = multiplipcando*multiplpicador;
         return(resultado);
    }

    public double Imprimir( ) {
        
        System.out.println("el resultado de la multiplicacion  de "+multiplipcando+"*"+multiplpicador+" es: "+resultado);
      return resultado ;
    }
    
}
