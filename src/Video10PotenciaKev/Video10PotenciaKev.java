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
public class Video10PotenciaKev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Redondear r = new Redondear();
        r.redondea();
        
        System.out.println("Ahora pasamos a la potencia");
        
        System.out.println();
        
        Potencia p = new Potencia();
        
        p.pow();
    }
    
}
