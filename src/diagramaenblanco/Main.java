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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        //Para la suma
        Suma s = new Suma(2.0, 2.0, 2.0);
        s.operacion();
        s.Imprimir();
        
        //Para la resta
        Resta r= new Resta(10.0,5.0);
        r.operacion();
        r.Imprimir();
        //multiplicacion
        Multiplicacion m =new Multiplicacion(2.0,5.0);
        m.operacion();
        m.Imprimir();
        //division
        Division d=new Division(10.0,2.0);
        d.operacion();
        d.Imprimir();
    }

}
