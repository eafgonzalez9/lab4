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
public class ProgramaInterfaz {

    public static void main(String arg[]) {
        //se crea objeto llamado pavaroti de la clase persona
        Persona pavaroti = new Persona();
        //se llama al metodo hacerCantar para que el objeto pavaroti imprima
        hacerCantar(pavaroti);
        //se crea objeto llamado pavaroti de la clase Canario
        Canario piolin = new Canario();
        //se llama al metodo hacerCantar para que el objeto piolin imprima
        hacerCantar(piolin);
        //se crea objeto llamado pavaroti de la clase Burro
        Burro alverto = new Burro();
        //se llama al metodo hacerCantar para que el objeto alverto imprima
        hacerCantar(alverto);
    }

    public static void hacerCantar(PuedeCantar cantor) {
        //se llama al metodo abstracto
        cantor.cantar();
    }
}
