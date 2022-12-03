package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.event.ActionEvent;

public class CurrencyController {
	Stage applicationStage;

	@FXML
    private ChoiceBox<String> fromConvertChoiceBox;
	
	@FXML
    private ChoiceBox<String> toConvertChoiceBox;
	
	@FXML
	private Label amountErrorLabel;
	
	@FXML
	private Label resultLabel;
	
	@FXML
	private TextField amountTextField;

	
	@FXML
	void convertValue(ActionEvent event) throws InvalidCurrencyException {
		
		amountErrorLabel.setText("");
		
		try {
			//create a new money with amount and currency type
			Currency money = new Currency(amountTextField.getText(), fromConvertChoiceBox.getValue());
			//passing that new Currency object to the Rates class to be converted
			Rates selectRates = new Rates(money,toConvertChoiceBox.getValue());
			//display the result
			DisplayResult result = new DisplayResult(money.getAmount(),selectRates.getConverted(), money.getCountryCurrency(), selectRates.getToCurrency());
			System.out.println(selectRates.getRate());
			resultLabel.setText(result.toString());
		} catch (InvalidCurrencyException e) {
			amountErrorLabel.setText(e.getMessage());
		}
	}
	
	@FXML
	private void funFact (ActionEvent funF) throws IOException {
		
		//load the multiple convert scene
		FXMLLoader loader = new FXMLLoader (getClass().getResource("FunFactsGUI.fxml"));
		Parent root = loader.load();
		
		
		
		
		Stage stage = new Stage();
		stage.setScene(new Scene(root));
		stage.setTitle("Fun Facts");
		stage.show();
	}
	
	
	
	@FXML
    private void multipleConverts (ActionEvent multipleC) throws InvalidCurrencyException, IOException {
		
		//load the multiple convert scene
		FXMLLoader loader = new FXMLLoader (getClass().getResource("MultipleConversionGUI.fxml"));
		Parent root = loader.load();
		
		MultiCurrencyController multiSceneController = loader.getController();
		
		//passes in the amount of money to convert inputed by the user in main scene.
		multiSceneController.passCurrencyAmount(amountTextField.getText());
		multiSceneController.passCurrency(fromConvertChoiceBox.getValue());
		
		Stage stage = new Stage();
		stage.setScene(new Scene(root));
		stage.setTitle("Multiple Currency Conversion");
		stage.show();
	}
}
