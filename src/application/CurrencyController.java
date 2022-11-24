package application;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
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
	
	//void printRandomFunFact(Scene mainScene, );
		
	@FXML
    void funFact (ActionEvent getFunFacts){
    	//creates access to the main scene
    	Scene mainScene = applicationStage.getScene();
    	
    	//Sets new window
		VBox funFacts = new VBox();
		Scene scene = new Scene(funFacts,300,400);
		funFacts.setAlignment(Pos.CENTER);
		applicationStage.setScene(scene);
		applicationStage.setTitle("Fun Facts");
		applicationStage.show();
		
		//Title and names
		Label currencyFunFact = new Label ("Currencies Fun Facts");
		currencyFunFact.setStyle("-fx-font-weight: bold");
    	funFacts.getChildren().add(currencyFunFact);
    	Label blankSpace = new Label ("");
    	funFacts.getChildren().add(blankSpace);
    	
    	// Contains Label and ChoiceBox
    	HBox chooseCurrency = new HBox(); 
    	chooseCurrency.setPadding(new Insets (1,1,1,1));
    	chooseCurrency.setAlignment(Pos.CENTER);
    	
    	Label chooseLabel = new Label ("Press to get a random fun fact: ");
    	chooseCurrency.getChildren().add(chooseLabel);
    	funFacts.getChildren().add(chooseCurrency);
    	
    	
    	
    	
    	
    	
    	Button funButton = new Button ("Fun Fact");
    	funFacts.getChildren().add(funButton);
    	Label blankSpace2 = new Label ("");
    	funFacts.getChildren().add(blankSpace2);
    	
    	Button doneButton = new Button ("Done");
    	//doneButton.setOnAction(finishEvent -> funFact(mainScene, funFacts));
    	funFacts.getChildren().add(doneButton);

		
	}
	
	
	@FXML
    void multipleConverts (ActionEvent multipleC){
		//creates access to the main scene
    	Scene mainScene = applicationStage.getScene();
    	
    	//Sets new window
		VBox multipleCurrency = new VBox();
		Scene scene = new Scene(multipleCurrency,550,550);
		applicationStage.setScene(scene);
		applicationStage.setTitle("Multiple Currency Converter");
		applicationStage.show();
		
		//Title and names
		Label titleMC = new Label ("Multiple Currency Converter");
		titleMC.setStyle("-fx-font-weight: bold");
		multipleCurrency.getChildren().add(titleMC);
    	Label blankSpace = new Label ("");
    	multipleCurrency.getChildren().add(blankSpace);
    	
    	// Contains Label and ChoiceBox  YOU NEED TO CHANGE THIS
    	HBox choseCurrency = new HBox(); 
    	choseCurrency.setPadding(new Insets (1,1,1,1));
    	
    	Label choseLabel = new Label ("Chose a Currency you want to convert: ");
    	choseCurrency.getChildren().add(choseLabel);
    	Label blankSpace3 = new Label ("");
    	multipleCurrency.getChildren().add(blankSpace3);
    	
    	ChoiceBox<String> chooseChoiceBox = new ChoiceBox<String>();
    	chooseChoiceBox.getItems().add("US Dollar (USD)");
    	chooseChoiceBox.getItems().add("Euro (EUR)");
    	chooseChoiceBox.getItems().add("Japanese Yen (JPY)");
    	chooseChoiceBox.getItems().add("Pound Sterling (GBP)");
    	chooseChoiceBox.getItems().add("Australian Dollar (AUD)");
    	chooseChoiceBox.getItems().add("Canadian Dollar (CAD)");
    	chooseChoiceBox.getItems().add("Swiss Franc (CHF)");
    	chooseChoiceBox.getItems().add("Chinese Renminbi (CNH)");
    	chooseChoiceBox.getItems().add("Hong Kong Dollar (HKD))");
    	chooseChoiceBox.getItems().add("New Zealand Dollar (NZD)");
    	
    	choseCurrency.getChildren().add(chooseChoiceBox);
    	
    	// Contains Label and ChoiceBox 2
    	HBox choseCurrencyToConvert = new HBox(); 
    	choseCurrencyToConvert.setPadding(new Insets (1,1,1,1));
    	
    	Label choseToLabel = new Label ("Chose the first Currency you want to convert to: ");
    	choseCurrencyToConvert.getChildren().add(choseToLabel);
    	
    	ChoiceBox<String> chooseToChoiceBox = new ChoiceBox<String>();
    	chooseToChoiceBox.getItems().add("US Dollar (USD)");
    	chooseToChoiceBox.getItems().add("Euro (EUR)");
    	chooseToChoiceBox.getItems().add("Japanese Yen (JPY)");
    	chooseToChoiceBox.getItems().add("Pound Sterling (GBP)");
    	chooseToChoiceBox.getItems().add("Australian Dollar (AUD)");
    	chooseToChoiceBox.getItems().add("Canadian Dollar (CAD)");
    	chooseToChoiceBox.getItems().add("Swiss Franc (CHF)");
    	chooseToChoiceBox.getItems().add("Chinese Renminbi (CNH)");
    	chooseToChoiceBox.getItems().add("Hong Kong Dollar (HKD))");
    	chooseToChoiceBox.getItems().add("New Zealand Dollar (NZD)");
    	
    	choseCurrencyToConvert.getChildren().add(chooseToChoiceBox);
    	
    	// Contains Label and ChoiceBox 3
    	HBox choseCurrencyToConvert2 = new HBox(); 
    	choseCurrencyToConvert.setPadding(new Insets (1,1,1,1));
    	
    	Label choseToLabel2 = new Label ("Chose the second Currency you want to convert to: ");
    	choseCurrencyToConvert2.getChildren().add(choseToLabel2);
    	
    	ChoiceBox<String> chooseToChoiceBox2 = new ChoiceBox<String>();
    	chooseToChoiceBox2.getItems().add("US Dollar (USD)");
    	chooseToChoiceBox2.getItems().add("Euro (EUR)");
    	chooseToChoiceBox2.getItems().add("Japanese Yen (JPY)");
    	chooseToChoiceBox2.getItems().add("Pound Sterling (GBP)");
    	chooseToChoiceBox2.getItems().add("Australian Dollar (AUD)");
    	chooseToChoiceBox2.getItems().add("Canadian Dollar (CAD)");
    	chooseToChoiceBox2.getItems().add("Swiss Franc (CHF)");
    	chooseToChoiceBox2.getItems().add("Chinese Renminbi (CNH)");
    	chooseToChoiceBox2.getItems().add("Hong Kong Dollar (HKD))");
    	chooseToChoiceBox2.getItems().add("New Zealand Dollar (NZD)");
    	
    	choseCurrencyToConvert2.getChildren().add(chooseToChoiceBox2);
    	
    	
    	multipleCurrency.getChildren().addAll(choseCurrency, choseCurrencyToConvert, choseCurrencyToConvert2 );
    	
    	
    	//return to main scene
    	Button doneButton = new Button ("Done");  
    	multipleCurrency.getChildren().add(doneButton);

    	
	}
	

}
