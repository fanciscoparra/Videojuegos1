/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videojuegos;

/**
 *
 * @author franc
 */
public class Genero {

    private String nombre;
    private String caracterisiticas;

    public Genero(String nombre, String caracterisiticas) {
        this.nombre = nombre;
        this.caracterisiticas = caracterisiticas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCaracterisiticas() {
        return caracterisiticas;
    }

    public void setCaracterisiticas(String caracterisiticas) {
        this.caracterisiticas = caracterisiticas;
    }

}
