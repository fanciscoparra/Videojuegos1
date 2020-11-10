/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videojuegos;

import java.util.ArrayList;

/**
 *
 * @author franc
 */
public class Videojuego {

    private String nombre;
    private ArrayList<Genero> genero = null; //agregacion
    private int numeroDeEntregas; //compocision
    private int numeroDeVentas;
    private String fechaDeCreacion;
    private int popularidad;
    private Clasificacion clasificacion; //agregacion

    public Videojuego(String nombre, String genero, int numeroDeEntregas, int numeroDeVentas, String fechaDeCreacion, int popularidad, Clasificacion clasificacion) {
        this.nombre = nombre;
        this.genero = new ArrayList<>();
        this.numeroDeEntregas = numeroDeEntregas;
        this.numeroDeVentas = numeroDeVentas;
        this.fechaDeCreacion = fechaDeCreacion;
        this.popularidad = popularidad;
        this.clasificacion = clasificacion;

    }

    /**
     * este metodo le suma 300 ventas al juego y aumenta la popularidad en 2
     */
    public void actualizarVentas() {
        this.numeroDeVentas += 300;
        this.popularidad += 2;
    }

    /**
     * este metodo actualiza el numero de entregas cuando sale una nueva y
     * cambia el nombre al de la nueva entrega
     *
     * @param nuevaEntrega
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGenero() {
        return genero.size();
    }

    public int getNumeroDeEntregas() {
        return numeroDeEntregas;
    }

    public void setNumeroDeEntregas(int nuevaEntrega) {
        this.numeroDeEntregas = nuevaEntrega;
    }

    public int getNumeroDeVentas() {
        return numeroDeVentas;
    }

    public void setNumeroDeVentas(int numeroDeVentas) {
        this.numeroDeVentas = numeroDeVentas;
    }

    public String getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(String fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public String getClasificacion() {
        return clasificacion.toString();
    }

    public int getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(int popularidad) {
        this.popularidad = popularidad;
    }

    public void setGenero(ArrayList genero) {
        this.genero = genero;
    }

    public void setClasificacion(Clasificacion clasificacion) {
        this.clasificacion = clasificacion;
    }
}
