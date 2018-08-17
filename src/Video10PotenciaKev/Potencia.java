/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Video10PotenciaKev;

/**
 *
 * @author HP ENVY
 */
public class Potencia {
    
    public void pow(){
        
        double base = 25 ;
        double exponente = 3;
       
        int resultado =(int)Math.pow(base, exponente);
        
        System.out.println("Programa que eleva potencias");
        System.out.println();
        System.out.println("Base: " + base +" elevado a " + exponente + " = " + resultado);
    }
    
}
