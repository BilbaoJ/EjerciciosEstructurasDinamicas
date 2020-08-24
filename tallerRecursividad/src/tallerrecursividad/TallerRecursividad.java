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
        System.out.println(r.tribonacciPrincipal(11,0));
        int[] datos = new int[]{1,5,2,5,8,2,9};
        int t = datos.length - 1;
        System.out.println(" ");
        System.out.println(r.determinarSiExiste(datos,1,t));
        System.out.println(r.verificarPalindromo("awsrtrtgr"));
        System.out.println(r.numerologia(4864521));
        String x = "4864521";
        int tam = x.length(); 
        System.out.println(r.numerologia2(x, tam));
    }
    
}
