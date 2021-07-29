/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrabajoGrupal;

import java.util.Scanner;

/**
 *
 * @author DESKTOP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Division dv =new Division();

        //dv.operacion();
        //dv.Imprimir();
         //Suma sm=new Suma();
         //sm.operacion();
         //sm.Imprimir();
//        int suma = 0;
//       int i = 0;
//        while (suma <= 100) {
//          i++;
//          if (i % 2 == 0) {
//              System.out.println("valor de i: " + i);
//              suma = suma + i;
//              System.out.println("suma: " + suma);
//          }
//      }
//      System.out.println("la suma de i:1.." + 1 + " es " + suma);
        int ejec = 1;
        while (ejec == 1) {
            Scanner n = new Scanner(System.in); 
            System.out.println("Ingresa la operacion a realizar 1.SUMA, 2.RESTA, 3.MULTIPLICACION, 4.DIVISION");
            int a =n.nextInt();
            switch (a){
                case 1:
                    System.out.println("SUMA");
                    Suma s=new Suma();
                    s.operacion();
                    s.Imprimir();
                    break;
                case 2:
                    System.out.println("RESTA");
                    Resta r=new Resta();
                    r.operacion();
                    r.Imprimir();
                    break;
                case 3:
                    System.out.println("MULTIPLICACION");
                    Multiplicacion m=new Multiplicacion();
                    m.operacion();
                    m.Imprimir();
                    break;
                case 4:
                    System.out.println("DIVISION");
                    Division d=new Division();
                    d.operacion();
                    d.Imprimir();
                default:
                    System.out.println("Valor ingresado incorrecto");
            }
            System.out.println("Desea continuar haciendo operaciones ingrese 1 o sino ingrese 2");
            ejec=n.nextInt();
        }
    }
}
