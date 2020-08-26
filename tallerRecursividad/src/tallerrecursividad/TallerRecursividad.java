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
        System.out.println("Secuencia Tribonacci");
        System.out.println(r.tribonacciPrincipal(11,0));
        int[] datos = new int[]{1,5,2,5,8,2,9};
        int t = datos.length - 1;
        System.out.println("");
        System.out.println("El número está en el arreglo: " + r.determinarSiExiste(datos,1,t));
        System.out.println("");
        System.out.println("La palabra es palídroma: " + r.verificarPalindromo("awsrtrtgr"));
        System.out.println("");
        String x = "4864521";
        int tam = x.length(); 
        System.out.println("Resultado: " + r.numerologia2(x, tam));
        System.out.println("Resultado: " + r.numerologia(4864521));
    }
    
}
