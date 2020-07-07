package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    private StringProperty expression = new SimpleStringProperty();
    private String res = "";

    public StringProperty expressionProperty() {
        return expression;
    }

    public String getExpression() {
        return expression.get();
    }

    public void setExpression(String expression) {
        this.expression.set(expression);
    }

    @FXML
    private TextField tfRes;

    @FXML
    private Button btnChia;

    @FXML
    private Button btnNum7;

    @FXML
    private Button btnNum8;

    @FXML
    private Button btnNum9;

    @FXML
    private Button btnNhan;

    @FXML
    private Button btnNum4;

    @FXML
    private Button btnNum5;

    @FXML
    private Button btnNum6;

    @FXML
    private Button btnTru;

    @FXML
    private Button btnNum1;

    @FXML
    private Button btnNum2;

    @FXML
    private Button btnNum3;

    @FXML
    private Button btnCong;

    @FXML
    private Button btnNum0;

    @FXML
    private Button btnBang;

    @FXML
    void handleButtonClick(MouseEvent event) {
        String temp = ((Button)event.getSource()).getText();
        if(!temp.equals("=")){
            res += temp;
            expression.setValue(res);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        expression.setValue("5");
        tfRes.textProperty().bindBidirectional(expression);
    }
}
