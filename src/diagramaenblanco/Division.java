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
public class Division {
    private double dividiendo,divisor ,resultado;

    public  Division(double divididendo,double divisor) {
        this.dividiendo = divididendo;
        this.divisor = divisor;
        
    }

    public double operacion() {
        resultado = dividiendo/divisor;
         return(resultado);
    }

    public double Imprimir( ) {
        
        System.out.println("el resultado de la division  de "+dividiendo+"/"+divisor+" es: "+resultado);
      return resultado ;
    }
}
