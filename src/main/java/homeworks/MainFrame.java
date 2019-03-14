package homeworks;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainFrame extends Application {

  @Override
  public void start(Stage primaryStage) {

    initForm(primaryStage);
  }

  public static void main(String[] args) {
    launch(args);
  }

  private void initForm(Stage primaryStage) {
    try {
      Image circleImage = new Image(getClass().getResourceAsStream("Circle.jfif"));
      Button circle = new Button();
      circle.setGraphic(new ImageView(circleImage));
      BorderPane root = new BorderPane();
      root.setCenter(circle);
      Scene scene = new Scene(root, 400, 400);
      scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
      primaryStage.setScene(scene);
      primaryStage.show();
      circle.setOnAction((e) -> System.out.println("Hello"));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
