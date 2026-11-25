package cl.duoc.registro;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage){

        FXMLLoader loader = new FXMLLoader(App.class.getResource(
                "/cl/duoc/registro/view/main-view.fxml"
        )
        );
        Scene scene = new Scene(loader.load());
        stage.setTitle("Sistema de Gestion de Transporte Escolar.");
        stage.setScene(scene);
        stage.show();
    }
}
