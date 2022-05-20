/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyec09curp;

/**
 *
 * @author andys
 */
public class Datos {
    
    private String nombre;
    private String paterno;
    private String materno;
    private String genero;
    private String anio;
    private String mes;
    private String dia;
    private String lugar;
    private String resultado;
    random random=new random();
    
    public String getResultado() {

        String la = String.valueOf(paterno.charAt(0));
        la = la.toUpperCase();
        String l2 = String.valueOf(paterno.charAt(1));
        l2 = l2.toUpperCase();
        String l3 = String.valueOf(materno.charAt(0));
        l3 = l3.toUpperCase();
        String l4 = String.valueOf(nombre.charAt(0));
        l4 = l4.toUpperCase();
        String an = String.valueOf(anio.charAt(2));
        String an2 = String.valueOf(anio.charAt(3));
        String m = String.valueOf(mes.charAt(0));
        String m2 = String.valueOf(mes.charAt(1));
        String n = String.valueOf(dia.charAt(0));
        String n2 = String.valueOf(dia.charAt(1));
        String g = String.valueOf(genero.charAt(0));
        g = g.toUpperCase();
        String lug = String.valueOf(lugar.charAt(0));
        lug = lug.toUpperCase();
        String lugar1 = String.valueOf(lugar.charAt(1));
        lugar1 = lugar1.toUpperCase();
        String conso = String.valueOf(paterno.charAt(2));
        conso = conso.toUpperCase();
        String conso1 = String.valueOf(materno.charAt(2));
        conso1 = conso1.toUpperCase();
        String conso2 = String.valueOf(nombre.charAt(2));
        conso2 = conso2.toUpperCase();
        char randomcaracter = (char) (random.nextInt(26) + 'A');
        int na = (int) (Math.random() * 10 + 1);
        resultado=la + l2 + l3 + l4 + an + an2 + m + m2 + n + n2 + g + lug + lugar1 + conso + conso1 + conso2 + randomcaracter + na;
        return resultado;
            
    
}
