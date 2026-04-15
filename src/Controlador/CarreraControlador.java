package Controlador;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import Modelo.Personaje;


public class CarreraControlador {
    @FXML private ImageView Img1;
    @FXML private ImageView Img2;
    @FXML private ImageView Img3;
    @FXML
    public void iniciarCarrera(){
        System.out.println("Iniciando Carrera");
        Personaje.reiniciarCarrera();

        Img1.setTranslateX(0);
        Img2.setTranslateX(0);
        Img3.setTranslateX(0);

        Personaje p1= new Personaje("Arthas ", pos -> Img1.setTranslateX(pos));
        Personaje p2 = new Personaje("Illidan " , pos -> Img2.setTranslateX(pos));
        Personaje p3 = new Personaje("Thrall ", pos -> Img3.setTranslateX(pos));

        p1.start();
        p2.start();
        p3.start();
    }
}