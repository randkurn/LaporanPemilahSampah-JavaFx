
import java.io.File;
import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;





/**
 *
 * @author Rand
 */
public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        URL url = new File("src/main/java/view/SampahView.fxml").toURI().toURL();
        Scene s = new Scene(FXMLLoader.load(url));
        
        stage.setScene(s);
        stage.setTitle("Laporan Pemilahan Sampah");
        stage.show();
        
    }
}
