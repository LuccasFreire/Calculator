package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController {
	@FXML
	private Label result;
	private float n1 = 0;
	private String operator = "";
	private boolean start = true;
	private Model model = new Model();
	
	@FXML
	public void processNumbers(ActionEvent event) {
		if (start) {
			result.setText("");
			start = false;
		}
		String value = ((Button)event.getSource()).getText();
		result.setText(result.getText() + value);
	}
	@FXML
	public void processOperators(ActionEvent event) {
		String value = ((Button)event.getSource()).getText();
		
		if (!value.equals("=")) {
			if (!operator.isEmpty())
				return;
			
			operator = value;
			n1 = Float.parseFloat(result.getText());
			result.setText("");
		} else {
			if (operator.isEmpty())
				return;
			
			float n2 = Float.parseFloat(result.getText());
			float calculo = model.calculate(n1, n2, operator);
			result.setText(Float.toString(calculo));
			operator = "";
			start = true;
		}
	}
}
