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
			Rates selectRates = new Rates(fromConvertChoiceBox.getValue(),toConvertChoiceBox.getValue());
			Conversion money = new Conversion(amountTextField.getText(),selectRates.getRate());
			DisplayResult result = new DisplayResult(money.getToConvert(), money.getConverted(), selectRates.getFromCurrency(), selectRates.getToCurrency());
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
