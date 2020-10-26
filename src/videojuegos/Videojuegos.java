package videojuegos;

import java.util.Date;

public class Videojuegos {
    
    public static void main(String[] args) {
        
        Genero gen1 = new Genero("roleplay", "adquieres el papel de un personaje y tomas decisiones las cuales definen el final de la historia");
        Clasificacion clasif1 = new Clasificacion("T", 13);
        Entrega entre1 = new Entrega("ver. 1.0", 1, "la primera version del juego");
        
        Videojuego videojuegoUno = new Videojuego(
                "undertale",
                gen1,
                1000000,
                new Date(),
                42,
                clasif1
        );        
        
        Genero gen2 = new Genero("accion y aventura, mundo abierto", "tienes la oportunidad de hacer lo que quieras en un mundo sin limites ni condiciones");
        Clasificacion clasif2 = new Clasificacion("M", 16);
        Entrega entre2 = new Entrega("san andres", 7, "el protagonista ahora es cj");
        
        Videojuego videojuegoDos = new Videojuego(
                "grand theft auto",
                gen2,
                235000000,
                new Date(),
                1,
                clasif2
        );
        
        System.out.println(videojuegoDos.getNumeroDeVentas());
        System.out.println(videojuegoDos.getPopularidad());
        System.out.println(videojuegoDos.getNumeroDeEntregas());
        
        videojuegoDos.actualizarVentas();
        videojuegoDos.actualizarEntregas(entre2);
        
        System.out.println(videojuegoDos.getNumeroDeVentas());
        System.out.println(videojuegoDos.getPopularidad());
        System.out.println(videojuegoDos.getNumeroDeEntregas());
    }
    
}
