/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videojuegos;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author franc
 */
public class Videojuego {

    private String nombre;
    private Genero genero; //agregacion
    private ArrayList<Entrega> numeroDeEntregas; //compocision
    private int numeroDeVentas;
    private Date fechaDeCreacion;
    private int popularidad;
    private Clasificacion clasificacion; //agregacion

    public Videojuego(String nombre, Genero genero, int numeroDeVentas, Date fechaDeCreacion, int popularidad, Clasificacion clasificacion) {
        this.nombre = nombre;
        this.genero = genero;
        this.numeroDeEntregas = new ArrayList<Entrega>();
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
    public void actualizarEntregas(Entrega nuevaEntrega) {
        this.numeroDeEntregas.add(nuevaEntrega);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getNumeroDeEntregas() {
        return numeroDeEntregas.size();
    }

    public int getNumeroDeVentas() {
        return numeroDeVentas;
    }

    public void setNumeroDeVentas(int numeroDeVentas) {
        this.numeroDeVentas = numeroDeVentas;
    }

    public Date getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(Date fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public Clasificacion getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(Clasificacion clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(int popularidad) {
        this.popularidad = popularidad;
    }
}
