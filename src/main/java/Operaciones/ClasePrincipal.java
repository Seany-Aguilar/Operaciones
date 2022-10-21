
package Operaciones;

import java.util.InputMismatchException;

/*@author BETTERLEE */
 
public class ClasePrincipal {
    public static void main(String[] args) {
        try{
        ClaseHijaSuma suma = new ClaseHijaSuma();
        suma.PedirDatos();
        suma.Sumar();
        System.out.println("\nEl resultado de la suma es: \n");
        suma.MostarResultados();
        
        
        ClaseHija_Resta resta = new ClaseHija_Resta();
        resta.PedirDatos();
        resta.Restar();
        System.out.println("\nEl resultado de la resta es: \n");
        resta.MostarResultados();
    }catch(InputMismatchException e){
            System.out.println("\t Captura la excepcion: " + e);
    }
}
}
