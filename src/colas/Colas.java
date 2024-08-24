/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colas;

/**
 *
 * @author German
 */
public class Colas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Col cola = new Col();
        cola.encolar(3);
        cola.encolar(4);
        cola.encolar(5);
        cola.encolar(6);
        cola.encolar(3);
        cola.encolar(4);
        cola.encolar(5);
        cola.encolar(6);
        
        System.out.println(cola.mostrar());
        cola.eliminar(3);
        System.out.println(cola.mostrar());
    }
    
}
