/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githubpractica;

/**
 *
 * @author isaac
 */
public class Pato {
    
    private String nombre;
    private int edad;
    private double tamanio;
    private String especie;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    public void nadar()
    {
        System.out.println("Nadando...");
    }
    
    public void volar()
    {
        System.out.println("Volando...");
    }
    
    public void caminar()
    {
        System.out.println("Caminando...");
    }
    
    public void comer(String comida)
    {
        System.out.println("Comiendo: "+comida);
    }
}
