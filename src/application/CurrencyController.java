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
		
	@FXML
    void funFact (ActionEvent getFunFacts){
    	//creates access to the main scene
    	Scene mainScene = applicationStage.getScene();
    	
    	//Sets new window
		VBox funFacts = new VBox();
		Scene scene = new Scene(funFacts,290,550);
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
    	
    	Label chooseLabel = new Label ("Choose a Currency: ");
    	chooseCurrency.getChildren().add(chooseLabel);
    	funFacts.getChildren().add(chooseCurrency);
    	
    	
    	
    	Button doneButton = new Button ("Done");  
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
    	
    	Label choseLabel = new Label ("Chose a Currency: ");
    	choseCurrency.getChildren().add(choseLabel);
    	
    	multipleCurrency.getChildren().add(choseCurrency);
    	
    	
    	//return to main scene
    	Button doneButton = new Button ("Done");  
    	multipleCurrency.getChildren().add(doneButton);

    	
	}
	

}
