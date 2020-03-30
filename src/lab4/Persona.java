/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author Kevin
 */
public class Persona implements PuedeCantar {
    //llama metodo abstracto cantar y le manda la impresion
    public void cantar() {
        System.out.println("do re mi fa sol la si");
    }
}
