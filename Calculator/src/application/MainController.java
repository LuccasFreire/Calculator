package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController {
	@FXML
	private long n1 = 0;
	private String operator = "";
	private boolean start = true;
	private Label result;
	
	@FXML
	public void processNumbers(ActionEvent event) {
		if (start = true) {
			result.setText("");
			start = false;
		}
		String value = ((Button)event.getSource()).getText();
		result.setText(result.getText() + value);
	}
	@FXML
	public void processOperators(ActionEvent event) {	
	}
}
