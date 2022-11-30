package JavaFX;

import Figure.IShape;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import static JavaFX.AlertController.DeleteSuccess;
import static JavaFX.AlertController.Fail;

public class DeleteController implements Initializable {
    public ArrayList<IShape> shapes = AppController.shapes;
    public ChoiceBox<String> listOfShapes;

    @FXML
    void Delete() throws Exception {
        int i = listOfShapes.getSelectionModel().getSelectedIndex();
        if(i < 0)
            throw Fail("Не выбрана фигура");
        shapes.remove(i);

        if (MainController.getAppController().canvas != null) {
            MainController.getAppController().ReDraw(shapes);
            DeleteSuccess();
            Exit();
        }
    }

    @FXML
    void Exit() {
        Stage stage = (Stage) listOfShapes.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        for (IShape shape : shapes) {
            listOfShapes.getItems().addAll(shape.toString());
        }
    }
}

