package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FunFactsController {

	@FXML
	private Label factLabel;
	

	@FXML
	void getFact(ActionEvent event) {

			double num = Math.floor(Math.random() * 9) +1;
			System.out.println(num);
			
			if (num == 1) {
				factLabel.setText("US dollar fun fact: " + "\n" + "The Federal Reserve spends about 6 cents to produce every 1$ dollar bill.");
			}
			else if (num == 2) {
				factLabel.setText("Euro fun fact: " + "\n" + "It is estimated that between 20% and 25% of the euro banknotes in circulation" + "\n" + "are held outside the euro area, mainly in neighboring countries.");
			}
			else if (num == 3) {
				factLabel.setText("Japansese Yen fun fact: " + "\n" + "Japan has had almost 25 years of fiscal stimulus policies to kickstart the economy, " + "\n" + "making deflation a constant source of concern surrounding the Yen.");
			}
			else if (num == 4) {
				factLabel.setText("Pound sterling fun fact: " + "\n" + "The pound sterling is the oldest existing currency");
			}
			else if (num == 5) {
				factLabel.setText("Australian dollar  fun fact: " + "\n" + "Australia was the first country to pioneer plastic, or polymer, money.");
			}
			else if (num == 6) {
				factLabel.setText("Canadian dollar: " + "\n" + "The Canadian dollar is the fifth-most held reserve currency in the world.");
			}
			else if (num == 7) {
				factLabel.setText("Swiss franc: " + "\n" + "Euros are accepted all over Switzerland, the change is given in Swiss francs" + "\n" + "according to daily exchange rates.");
			}
			else if (num == 8) {
				factLabel.setText("Chinese Yuan: " + "\n" + "The term yuan refers to a single unit of the currency, " + "\n" + "while the term renminbi refers to the actual name of the currency itself.");
			}
			else if (num == 9) {
				factLabel.setText("Hong Kong dollar: " + "\n" + "Hong Kong is a key financing conduit and provides large stock markets for investors" + "\n"+  "with a currency that has generated much strength.");
			}
	}	

}
