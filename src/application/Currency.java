package application;
/**
 * This class handles the money that the user wants to convert.
 * It needs the amount and the type of the currency the user wants to convert.
 * 
 * @author gerome,maria,hugo
 *
 */
public class Currency {
	
	private double amount;
	private String countryCurrency;
	/**
	 * Returns the amount of money for this Currency object.
	 * @return returns a double value of the amount.
	 */
	public double getAmount() {
		return amount;
	}
	/**
	 * Returns the type of Currency.
	 * @return returns a String.
	 */
	public String getCountryCurrency() {
		return countryCurrency;
	}
	
	/**
	 * Initiates the amount of money and the type of currency.
	 * @param amountOfMoney is a string from the textfield.
	 * @param currentCurrencyType is a string from the ChoiceBox
	 * @throws InvalidCurrencyException
	 */
	public Currency(String amountOfMoney, String currentCurrencyType) throws InvalidCurrencyException {
		try {
			amount = Double.parseDouble(amountOfMoney);
			countryCurrency = new String(currentCurrencyType.substring(currentCurrencyType.indexOf('(') + 1, currentCurrencyType.indexOf(')')));
			if (amount < 0) {
				amount = 0;
				throw new InvalidCurrencyException("Please use a positive value.");
			}
		}catch (NullPointerException ice) {
			throw new InvalidCurrencyException("Input a valid amount");
		}catch (NumberFormatException nfe) {
			throw new InvalidCurrencyException("The amount should be a number.");
		}
	}
	
	/**
	 * Copies the Currency's amount and type.
	 * @param currencyToCopy is a Currency object.
	 */
	public Currency(Currency currencyToCopy) {
		amount = currencyToCopy.amount;
		countryCurrency = new String (currencyToCopy.getCountryCurrency());
	}

}
