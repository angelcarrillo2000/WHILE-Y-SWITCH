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
public class Resta {
    private double minuendo , sustraendo , resultado ;

    public  Resta(double minuendo,double sustraendo) {
        this.minuendo = minuendo;
        this.sustraendo = sustraendo;
        
    }

    public double operacion() {
        resultado = minuendo-sustraendo;
         return(resultado);
    }

    public double Imprimir( ) {
        
        System.out.println("el resultado de la resta de "+minuendo+"-"+sustraendo+" es: "+resultado);
      return resultado ;
    }

}
