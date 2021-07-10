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
public class Suma {

    private double sumando1 , sumando2 , sumando3 , resultado;

    public  Suma(double sumando1,double sumando2,double sumando3) {
        this.sumando1 = sumando1;
        this.sumando2 = sumando2;
        this.sumando3 = sumando3;
    }

    public double operacion() {
        resultado = (sumando1 + sumando2 + sumando3);
         return(resultado);
    }

    public double Imprimir( ) {
        
        System.out.println("el resultado de la sumad de: "+sumando1+"+"+sumando2+"+"+ 
                sumando3+" es: "+resultado);
      return resultado ;
    }

}
