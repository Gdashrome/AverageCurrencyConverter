package application;

import java.io.IOException;
import java.util.ArrayList;

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
	
	/**
	 * Receives amount of currency and sets the textbox for this GUI
	 * Transferring data between GUIs
	 * @param money
	 * @throws InvalidCurrencyException
	 */
	@FXML
	public void passCurrencyAmount(String money) throws InvalidCurrencyException {
		try {
			amountTextField.setText(money);
		}catch (NullPointerException npe) {
			throw new InvalidCurrencyException("Please put a valid value in the text field.");
		}
	}
	/**
	 * Receives type of currency and sets the ChoiceBox for this GUI
	 * Transferring data between GUIs
	 * @param currency
	 * @throws InvalidCurrencyException
	 */
	@FXML
	public void passCurrency(String currency) throws InvalidCurrencyException {
		try {
			fromConvertChoiceBox.setValue(currency);
		}catch (NullPointerException npe) {
			throw new InvalidCurrencyException("Please put a valid value in the text field.");
		}
	}
	/**
	 * Executes when the Convert button on MultipleConversionGUI is pressed.
	 * @param event
	 * @throws InvalidCurrencyException
	 */
	@FXML
	void convertValue(ActionEvent event) throws InvalidCurrencyException {
		
		amountErrorLabel.setText("");
		
		try {
			
			MultipleCurrencies list = new MultipleCurrencies();
			
			if (toConvertChoiceBox.getValue() != null) {
				//create a new money with amount and currency type
				Currency money = new Currency(amountTextField.getText(), fromConvertChoiceBox.getValue());
				//add to the multicurrency object
				list.add(money, toConvertChoiceBox.getValue());
				
			}
			if (toConvertChoiceBox1.getValue() != null) {
				//create a new money with amount and currency type
				Currency money1 = new Currency(amountTextField.getText(), fromConvertChoiceBox.getValue());
				//add to the multicurrency object
				list.add(money1, toConvertChoiceBox1.getValue());
			}
			if (toConvertChoiceBox2.getValue() != null) {
				//create a new money with amount and currency type
				Currency money2 = new Currency(amountTextField.getText(), fromConvertChoiceBox.getValue());
				//add to the multicurrency object
				list.add(money2, toConvertChoiceBox2.getValue());
			}
			
			if (toConvertChoiceBox.getValue() == null && toConvertChoiceBox1.getValue() == null
					&& toConvertChoiceBox2.getValue() == null) {
				throw new InvalidCurrencyException("Please select a currency.");
			}
			
			ArrayList<String> temp = new ArrayList<String>();
			temp = new ArrayList<String>(list.getResultList());
			if (temp.size() == 1) {
				resultLabel.setText(temp.get(0));
			}
			else if (temp.size() == 2) {
				resultLabel.setText(temp.get(0));
				resultLabel3.setText(temp.get(1));
			}
			else if (temp.size() == 3) {
				resultLabel.setText(temp.get(0));
				resultLabel3.setText(temp.get(1));
				resultLabel2.setText(temp.get(2));
			}
			
		} catch (InvalidCurrencyException e) {
			amountErrorLabel.setText(e.getMessage());
		}
	}
}
