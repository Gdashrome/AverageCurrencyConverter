package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MultiCurrencyController {
	
	@FXML
	private TextField amountTextField;
	
	@FXML
	private ChoiceBox<String> fromConvertChoiceBox;
	
	@FXML
	private ChoiceBox<String> toConvertChoiceBox;
	
	@FXML
	private ChoiceBox<String> toConvertChoiceBox1;
	
	@FXML
	private ChoiceBox<String> toConvertChoiceBox2;
	
	@FXML
	private Label amountErrorLabel;
	
	@FXML
	private Label TESTLabel;
	
	@FXML
	private Label TESTLabel1;
	
	@FXML
	private Label TESTLabel2;
	
	@FXML
	public void passCurrencyAmount(String money) throws InvalidCurrencyException {
		try {
			amountTextField.setText(money);
		}catch (NullPointerException npe) {
			throw new InvalidCurrencyException("Please put a valid value in the text field.");
		}
	}
	
	@FXML
	public void passCurrency(String currency) throws InvalidCurrencyException {
		try {
			fromConvertChoiceBox.setValue(currency);
		}catch (NullPointerException npe) {
			throw new InvalidCurrencyException("Please put a valid value in the text field.");
		}
	}
	
	@FXML
	void convertValue(ActionEvent event) throws InvalidCurrencyException {
		
		amountErrorLabel.setText("");
		
		try {
			if (toConvertChoiceBox.getValue() != null) {
				Convert money = new Convert(amountTextField.getText(),fromConvertChoiceBox.getValue(),toConvertChoiceBox.getValue());
				System.out.println(money.getRate());
				TESTLabel.setText(money.toString());
			}
			if (toConvertChoiceBox1.getValue() != null) {
				Convert money1 = new Convert(amountTextField.getText(),fromConvertChoiceBox.getValue(),toConvertChoiceBox1.getValue());
				System.out.println(money1.getRate());
				TESTLabel1.setText(money1.toString());
			}
			if (toConvertChoiceBox2.getValue() != null) {
				Convert money2 = new Convert(amountTextField.getText(),fromConvertChoiceBox.getValue(),toConvertChoiceBox2.getValue());
				System.out.println(money2.getRate());
				TESTLabel2.setText(money2.toString());
			}
		} catch (InvalidCurrencyException e) {
			amountErrorLabel.setText(e.getMessage());
			Convert money = new Convert("0", fromConvertChoiceBox.getValue(), toConvertChoiceBox.getValue());
			TESTLabel.setText(money.toString());
			Convert money1 = new Convert("0", fromConvertChoiceBox.getValue(), toConvertChoiceBox1.getValue());
			TESTLabel.setText(money1.toString());
			Convert money2 = new Convert("0", fromConvertChoiceBox.getValue(), toConvertChoiceBox2.getValue());
			TESTLabel.setText(money2.toString());
		}
	}
}
