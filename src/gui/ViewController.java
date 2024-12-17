package gui;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

import gui.util.Alerts;
import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class ViewController implements Initializable{
	
	@FXML
	private TextField textNumber1;
	
	@FXML
	private TextField textNumber2;
	
	@FXML
	private Label labelResult;
	
	@FXML
	private Button btSum;

	
	@FXML
	public void onBtSumAction() {
		try {
			Locale.setDefault(Locale.US);
			
			double number1 = Double.parseDouble(textNumber1.getText());
			
			double number2 = Double.parseDouble(textNumber2.getText());
			
			double sum = number1 + number2;
			
			labelResult.setText(String.format("%.2f", sum));
		}
		catch (NumberFormatException e) {
			Alerts.showAlert("Error", "Parse Error", e.getMessage(), AlertType.ERROR);
		}
	}


	@Override
	public void initialize(URL url, ResourceBundle rb) {
		Constraints.setTextFieldDouble(textNumber1);
		Constraints.setTextFieldDouble(textNumber2);
		Constraints.setTextFieldMaxLength(textNumber1, 12);
		Constraints.setTextFieldMaxLength(textNumber2, 12);
	}
}
