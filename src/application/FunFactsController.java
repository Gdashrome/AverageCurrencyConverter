package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FunFactsController {

	@FXML
	private Label factLabel;
	

	@FXML
	void getFact(ActionEvent event) {
		
		double num = Math.floor(Math.random() * 2) +1;
		System.out.println(num);
		
		if (num == 1) {
			factLabel.setText("US dollar fun fact: " + "The Federal Reserve spends about 6 cents to produce every $1 bill.");
		}
		else if (num == 2) {
			factLabel.setText("Euro fun fact: " + "<br>" + "It is estimated that between 20% and 25% of the euro banknotes in circulation are held outside the euro area, mainly in neighboring countries.");
		}
	}

}
