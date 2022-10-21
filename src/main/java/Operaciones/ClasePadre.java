
package Operaciones;

import java.util.Scanner;

/*@author BETTERLEE*/
 
public class ClasePadre {
    
    protected int valor1, valor2, resultado;
    Scanner r = new Scanner (System.in);
    
    public ClasePadre(){
    }
    
    public void PedirDatos(){
        System.out.println("Dame el primer valor: ");
        valor1 = r.nextInt();
        
        System.out.println("Dame el segundo valor: ");
        valor2 = r.nextInt();
    }
    public void MostarResultados(){
        System.out.println(resultado);
    }
}
