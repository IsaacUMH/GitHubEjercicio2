/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githubpractica;

/**
 *
 * @author Ivan Avila
 */

public class Perro {
    private String name;
    private int age;
    private double size;
    private String specie;
    
    public void run() {
        System.out.println("Corriendo...");
    }
    
    public void bark() {
        System.out.println("Ladrando...");
    }
    
    public void walk() {
        System.out.println("Caminando...");
    }
    
    public void eat(String food) {
        System.out.println("Comiendo: " + food);
    }
}
