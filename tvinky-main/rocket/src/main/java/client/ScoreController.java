package client;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.stage.Stage;


public class ScoreController {

    @FXML
    private Button ExitGameButton;

    @FXML
    public TableColumn<String, String> Score;

    @FXML
    private Button PlayAgainButton;

    @FXML
    public TableColumn<String, String> Nick;

    @FXML
    void ExitGame(ActionEvent event) {
        final Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
        GameController.Exit = true;
    }

    @FXML
    void PlayAgain(ActionEvent event) {
        final Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
        GameController.again = true;
    }

}