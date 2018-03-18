import javafx.application.Application;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
/**
 * The main class for Calculater. It holds the gui and decides most of the 
 * behavior for the app.
 * @author Kyle Bouwman
 * @version Mar17 2018
 */
public class Calculater extends Application {
  private GridPane buttonPane;
  private double currentValue;
  private double lastValue;
  private StackPane viewPane;

  public Calculater() {
    this.buttonPane = new GridPane();
    this.currentValue = 0;
    this.lastValue = 0;
    this.viewPane = new StackPane();
  }
  private void setUpPane(Stage stage) {
    VBox topPane = new VBox(5);
    Scene scene = new Scene(topPane);
    Text visibleValue = new Text("0");
    visibleValue.setFont(Font.font("Lucida Sans Typewriter"));

    
    this.viewPane.getChildren().add(visibleValue);
    topPane.getChildren().addAll(this.viewPane, this.buttonPane);
  }

  @Override
  public void start(Stage stage) {
    setUpPane(stage);
    
  }
  public static void main(String[] args) {
    new Calculater().launch();
  }
}
