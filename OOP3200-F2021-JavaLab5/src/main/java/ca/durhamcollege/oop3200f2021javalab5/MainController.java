/**
 * This controller handles the calculation and events for the window in main.
 *
 * @author Gaelen Rhoads 100804776
 * @author Nimsith Fernandopulle 100806868
 * @version 1.0
 * @since December 19, 2021
 * @file Main.java
 *
 */

package ca.durhamcollege.oop3200f2021javalab5;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private Label myHeight;

    @FXML
    private Label myWeight;

    @FXML
    private TextField myHeightTextField;

    @FXML
    private TextField myWeightTextField;

    @FXML
    private TextField resultTextFieldOne;

    @FXML
    private TextField resultTextFieldTwo;

    @FXML
    private Button calculateButton;

    /**
     * Calculate button code event that processes BMI on click event.
     */
    @FXML
    protected void OnCalculateButtonClick()
    {
        // Get text but parse as double
        var height = Double.parseDouble(myHeightTextField.getText());
        var weight = Double.parseDouble(myWeightTextField.getText());
        var bmi = (weight / (height * height));
        myHeightTextField.clear();
        myWeightTextField.clear();
        resultTextFieldOne.setText("Your BMI: " + bmi);
        if(bmi <= 18.5)
        {
            resultTextFieldTwo.setText("Underweight");
        }
        else if(bmi >18.5 & bmi < 24.9)
        {
            resultTextFieldTwo.setText("Normal");
        }
        else if(bmi >= 18.5 & bmi <= 24.9)
        {
            resultTextFieldTwo.setText("Normal");
        }
        else if(bmi >= 25 & bmi <= 29.9)
        {
            resultTextFieldTwo.setText("Normal");
        }
        else
        {
            resultTextFieldTwo.setText("Obese");
        }
    }
}