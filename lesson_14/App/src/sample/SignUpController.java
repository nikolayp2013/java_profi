package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField login_field;

    @FXML
    private PasswordField password_field;

    @FXML
    private Button signUpButton;

    @FXML
    private TextField signUpLastname;

    @FXML
    private TextField signUpName;

    @FXML
    private TextField signUpCountry;

    @FXML
    private CheckBox signUpCheckBpxMale;

    @FXML
    private CheckBox signUpCheckBpxFemale;

    @FXML
    void initialize() {

        signUpButton.setOnAction(event -> {

            singUpNewUser();

        });

    }

    private void singUpNewUser() {
        DatabaseHandler dbHandler = new DatabaseHandler();

        String firstName = signUpName.getText();
        String lastName = signUpLastname.getText();
        String userName = login_field.getText();
        String password = password_field.getText();
        String location = signUpCountry.getText();
        String gender = "";
        if(signUpCheckBpxMale.isSelected())
            gender = "Мужской";
        else
            gender = "Женский";

        User user = new User(firstName, lastName, userName, password, location, gender);

        dbHandler.signUpUser(user);

//        dbHandler.signUpUser(signUpName.getText(), signUpLastname.getText(), login_field.getText(), password_field.getText(),
//                signUpCountry.getText(), "Male");
    }
}
