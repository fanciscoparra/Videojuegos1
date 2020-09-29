package videojuegos;

import java.util.Date;

public class Videojuegos {
    
    private String nombre;
    private String genero;
    private int numeroDeEntregas;
    private int numeroDeVentas;
    private Date fechaDeCreacion;
    private int popularidad;
    private Boolean clasificacionA;
    

    public Videojuegos(String nombre, String genero,int numeroDeEntregas,int numeroDeVentas, Date fechaDeCreacion, int popularidad, Boolean clasificacionA) {
        this.nombre = nombre;
        this.genero = genero;
        this.numeroDeEntregas = numeroDeEntregas;
        this.numeroDeVentas = numeroDeVentas;
        this.fechaDeCreacion = fechaDeCreacion;
        this.popularidad = popularidad;
        this.clasificacionA = clasificacionA;
    }
        
    /**
     * este metodo le suma 300 ventas al juego
     * y aumenta la popularidad en 2
     */
    
    public void actualizarVentas() {
        this.numeroDeVentas += 300;
        this.popularidad += 2;
        }
    
     /**
     * este metodo actualiza el numero de entregas cuando sale una nueva
     * y cambia el nombre al de la nueva entrega
     * @param nuevaEntrega
     */
    
    public void actualizarEntregas(String nuevaEntrega) {
        this.numeroDeEntregas +=1;
        this.nombre = nuevaEntrega;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public int getNumeroDeEntregas() {
        return numeroDeEntregas;
    }

    public void setNumeroDeEntregas(int numeroDeEntregas) {
        this.numeroDeEntregas = numeroDeEntregas;
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

    public Boolean getClasificacionA() {
        return clasificacionA;
    }

    public void setClasificacionA(Boolean clasificacionA) {
        this.clasificacionA = clasificacionA;
    }

    public int getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(int popularidad) {
        this.popularidad = popularidad;
    }
    
    
     
    
    public static void main(String[] args) {
        Videojuegos videojuegoUno = new Videojuegos(
                   "undertale",
                   "rolplay",
                    1,
                    1000000,
                    new Date (),
                    42,
                    false);
        Videojuegos videojuegoDos = new Videojuegos(
                   "grand theft auto",
                   "accion y aventura, mundo abierto",
                    16,
                    235000000,
                    new Date (),
                    1,
                    true);
        
        System.out.println(videojuegoDos.getNumeroDeVentas());
        System.out.println(videojuegoDos.getPopularidad());
        
        videojuegoDos.actualizarVentas();
        
        System.out.println(videojuegoDos.getNumeroDeVentas());
        System.out.println(videojuegoDos.getPopularidad());
    }
    
}


