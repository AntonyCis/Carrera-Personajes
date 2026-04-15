package Modelo;
import javafx.application.Platform;
import java.util.function.Consumer;

public class Personaje extends Thread{

    private String nombre;
    private int posicion = 0;
    private static boolean Ganador = false;
    private Consumer<Integer> onMove;

    public Personaje(String nombre, Consumer<Integer> onMove) {
        this.nombre = nombre;
        this.onMove = onMove;
    }
    @Override
    public void run(){
        while(!Ganador && posicion < 500) {
            posicion += (int) (Math.random() * 15);
            Platform.runLater(() -> onMove.accept(posicion));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        synchronized (Personaje.class){
            if(!Ganador && posicion >= 500){
                Ganador = true;
                System.out.println(" Ganador "+ nombre)  ;
            }
        }
    }
    public static void reiniciarCarrera(){
        Ganador = false;
    }
}