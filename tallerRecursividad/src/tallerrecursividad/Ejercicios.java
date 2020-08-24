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
public class Ejercicios {
    
    public String tribonacciPrincipal(int n, int i) {
        
        if(i < n){
            System.out.print(tribonacci(i) + " ");
            i++;
            return tribonacciPrincipal(n, i);
        }else{
            return "";
        }
    }
      
    private int tribonacci(int n){
        if (n == 0) {  
            return 0;
        } else if (n == 1) {
            return 0;
        }else if(n == 2){
            return 1;
        }else {    
            return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
        }
        
    }
    
  
    public boolean determinarSiExiste(int[] a, int d, int i){
        
        if(i < 0){
            return false;
        }else if(a[i] == d){
            return true;
        }else{
            i--;
            return determinarSiExiste(a, d, i);
        }
    }
    

    public boolean verificarPalindromo(String s){
      
        if(s.length() == 0){
            return true;
        }else if (s.length() == 1){
            return true;
        }else if(s.charAt(0) == s.charAt(s.length()-1)){
            s = s.substring(1, s.length() - 1);
            return verificarPalindromo(s);     
        }else{
            return false;
        }
    }
    
    public int numerologia(int n){
        
        String num = String.valueOf(n);
        
        if(num.length() == 1){
            return n;
        }else{
            return n%10 + numerologia(n/10);
        }
    }
    
    
    int  b;
    int a;
    char otro;
    int resultado;
    String c; 
    
    public String numerologia2(String n, int t){
        
        resultado = numerologia3(Integer.parseInt(n), n, t);
        c = String.valueOf(resultado);
        if(c.length() == 1){
            return c;
        }else{
            return numerologia2(c, c.length());
        }     
    }
    
    
    private int numerologia3(int n, String num, int b){
       
        if (b == 1){
            return n;
        }else{
            otro = num.charAt(0);
            a = Character.getNumericValue(otro);
            num = num.substring(1);
            b = num.length();
            n = Integer.parseInt(num);
            return a + numerologia3(n, num, b);
        }
    }
}
