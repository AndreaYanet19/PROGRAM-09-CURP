/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyec09curp;

/**
 *
 * @author andys
 */
public class Proyect09Curp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DATOS curp = new DATOS ();
        DATOS curp1 = new DATOS ("ANDREA", "DOMINGUEZ","ORDOÑEZ", "H", "2002", "06", "29", "TOLUCA");
        
        curp1.getResultado();
        System.out.print(curp1.getResultado());
    }
    
}
