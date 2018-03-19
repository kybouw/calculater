import javafx.application.Application;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
/**
 * The main class for Calculater. It holds the gui and decides most of the 
 * behavior for the app.
 * @author Kyle Bouwman
 * @version Mar17 2018
 */
public class Calculater extends Application {
  /** The pane that contains all of the buttons and controls */
  private GridPane buttonPane;
  /** The value that is acted upon by math operations */
  private double currentValue;
  /** The value that is kept while the user types another */
  private double lastValue;
  /** The pane that holds the viewport of the calculator */
  private StackPane viewPane;

  /**
   * Initializes the class variables and assigns defaults.
   */
  public Calculater() {
    this.buttonPane = new GridPane();
    this.currentValue = 0;
    this.lastValue = 0;
    this.viewPane = new StackPane();
  }//end Calculater()

  /**
   * Builds the main pane for the window. Gets all needed objects that are 
   * required for a calculater to work
   * @param stage the stage object representing the window
   */
  private void setUpPane(Stage stage) {
    VBox topPane = new VBox(5);
    Scene scene = new Scene(topPane);
    Text visibleValue = new Text("TEST");
    visibleValue.setFont(Font.font("Lucida Sans Typewriter", 50));
    visibleValue.setTextAlignment(TextAlignment.RIGHT);
    

    this.viewPane.getChildren().add(visibleValue);
    topPane.getChildren().addAll(this.viewPane, this.buttonPane);
    stage.setScene(scene);
  }//end setUpPane(Stage)
  /**
   * Sets up the contents of the stage and gives it some attributes.
   * @param stage the stage object that represents the window
   */
  @Override
  public void start(Stage stage) {
    setUpPane(stage);
    stage.setTitle("Calculater");
    stage.setMinHeight(600);
    stage.setMinWidth(400);
    //stage.sizeToScene();
    stage.show();
  }//end start(Stage)
  /**
   * This is needed to run on some IDEs.
   * @param args arguments for running the program
   */
  public static void main(String[] args) {
    new Calculater().launch();
  }//end main
}//end class
