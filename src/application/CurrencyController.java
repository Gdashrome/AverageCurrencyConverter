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
		
	/*@FXML
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

		
	}*/
	@FXML
	private void funFact (ActionEvent funF) throws IOException {
		
		//load the multiple convert scene
		FXMLLoader loader = new FXMLLoader (getClass().getResource("funFacts.fxml"));
		Parent root = loader.load();
		
		
		
		
		Stage stage = new Stage();
		stage.setScene(new Scene(root));
		stage.setTitle("Fun Facts");
		stage.show();
	}
	
	
	
	@FXML
    private void multipleConverts (ActionEvent multipleC) throws InvalidCurrencyException, IOException {
		
		//load the multiple convert scene
		FXMLLoader loader = new FXMLLoader (getClass().getResource("multipleConv.fxml"));
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
