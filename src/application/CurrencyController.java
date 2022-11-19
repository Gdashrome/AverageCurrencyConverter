package application;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class CurrencyController {
	
	@FXML
    private ChoiceBox<String> fromConvertChoiceBox;
	
	@FXML
    private ChoiceBox<String> toConvertChoiceBox;
	
	@FXML
	private Label amountErrorLabel;
	
	@FXML
	private Label TESTLabel;
	
	@FXML
	private TextField amountTextField;
	
	@FXML
	void convertValue(ActionEvent event) throws InvalidCurrencyException {
		
		amountErrorLabel.setText("");
		
		try {
			Convert money = new Convert(amountTextField.getText(),fromConvertChoiceBox.getValue(),toConvertChoiceBox.getValue());
			System.out.println(money.getRate());
			TESTLabel.setText(money.toString());
		} catch (InvalidCurrencyException e) {
			amountErrorLabel.setText(e.getMessage());
			Convert money = new Convert("0", fromConvertChoiceBox.getValue(), toConvertChoiceBox.getValue());
			TESTLabel.setText(money.toString());
		}
		
		
		
		
	}

}
