package tabtest;

//   https://stackoverflow.com/questions/8106497/javafx-2-0-with-fxml-tabs-at-bottom-instead-of-top  //
	
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class TabTest extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 300, 250);

        TabPane tabPane = new TabPane();
        Tab tab1 = new Tab("Tab 1");
        tabPane.getTabs().add(tab1);

        root.setBottom(tabPane);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
