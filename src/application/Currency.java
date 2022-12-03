package application;

public class Currency {
	
	private double amount;
	private String countryCurrency;
	
	public double getAmount() {
		return amount;
	}

	public String getCountryCurrency() {
		return countryCurrency;
	}
	
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
	
	public Currency(Currency currencyToCopy) {
		amount = currencyToCopy.amount;
		countryCurrency = new String (currencyToCopy.getCountryCurrency());
	}

}
