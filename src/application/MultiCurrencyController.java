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
	private Label resultLabel;
	
	@FXML
	private Label resultLabel2;
	
	@FXML
	private Label resultLabel3;
	
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
		/**
		try {
			if (toConvertChoiceBox.getValue() != null) {
				Rates selectRates = new Rates(fromConvertChoiceBox.getValue(),toConvertChoiceBox.getValue());
				Conversion money = new Conversion(amountTextField.getText(),selectRates.getRate());
				DisplayResult result = new DisplayResult(money.getToConvert(), money.getConverted(), selectRates.getFromCurrency(), selectRates.getToCurrency());
				System.out.println(selectRates.getRate());
				resultLabel.setText(result.toString());
			}
			if (toConvertChoiceBox1.getValue() != null) {
				Rates selectRates1 = new Rates(fromConvertChoiceBox.getValue(),toConvertChoiceBox1.getValue());
				Conversion money1 = new Conversion(amountTextField.getText(),selectRates1.getRate());
				DisplayResult result1 = new DisplayResult(money1.getToConvert(), money1.getConverted(), selectRates1.getFromCurrency(), selectRates1.getToCurrency());
				System.out.println(selectRates1.getRate());
				resultLabel2.setText(result1.toString());
			}
			if (toConvertChoiceBox2.getValue() != null) {
				Rates selectRates2 = new Rates(fromConvertChoiceBox.getValue(),toConvertChoiceBox2.getValue());
				Conversion money2 = new Conversion(amountTextField.getText(),selectRates2.getRate());
				DisplayResult result2 = new DisplayResult(money2.getToConvert(), money2.getConverted(), selectRates2.getFromCurrency(), selectRates2.getToCurrency());
				System.out.println(selectRates2.getRate());
				resultLabel3.setText(result2.toString());
			}
			if (toConvertChoiceBox.getValue() == null && toConvertChoiceBox1.getValue() == null
					&& toConvertChoiceBox2.getValue() == null) {
				throw new InvalidCurrencyException("Please select a currency.");
			}
		} catch (InvalidCurrencyException e) {
			amountErrorLabel.setText(e.getMessage());
		}*/
	}
}
