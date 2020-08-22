/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerrecursividad;

/**
 *
 * @author jessi
 */
public class TallerRecursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Ejercicios r = new Ejercicios();
        r.tribonacciPrincipal(11);
        int[] datos = new int[]{1,5,2,5,8,2,1,9};
        int t = datos.length - 1;
        System.out.println(" ");
        System.out.println(r.determinarSiExiste(datos,10,t));
        System.out.println(r.verificarPalindromo("aa"));
        System.out.println(r.numerologia(29857));
    }
    
}
