import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Clase de la aplicación.
 * Extiende la clase Application y carga el fichero XML.
 */

public class Main extends Application {

    /**
     * Método que inicia la aplicación.
     *
     * @param args argumentos de la línea de comandos
     */
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/vista/vista.fxml")); 
            Scene scene = new Scene(root);
            stage.setTitle("Gestor de empleados");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}   
