package application;

import java.util.ArrayList;
/**
 * Calculates the Currency the user provided to many different types of money the user could want.
 * 
 * @author gerome
 *
 */
public class MultipleCurrencies {
	
	private ArrayList<Currency> moneyList;
	private ArrayList<String> toConvertList;
	private ArrayList<String> resultList;
	
	
	/**
	 * Get the result list of converting multiple currencies.
	 * @return returns an ArrayList<String> of the results.
	 * @throws InvalidCurrencyException
	 */
	public ArrayList<String> getResultList() throws InvalidCurrencyException {
		return Calculate();
	}
	/**
	 * Initiates ArrayList for multiple currencies conversions
	 */
	public MultipleCurrencies() {
		moneyList = new ArrayList<Currency>();
		toConvertList = new ArrayList<String>();
		resultList = new ArrayList<String>();
	}
	
	/**
	 * Copy Constructor for MultipleCurrencies
	 * @param listToCopy of type MultipleCurrencies
	 */
	public MultipleCurrencies(MultipleCurrencies listToCopy) {
		moneyList = new ArrayList<Currency>();
		moneyList.addAll(listToCopy.moneyList);
		resultList = new ArrayList<String>();
		resultList.addAll(listToCopy.resultList);
		toConvertList = new ArrayList<String>();
		toConvertList.addAll(listToCopy.toConvertList);
	}
	
	/**
	 * Add the money and what to convert it to in the MultipleCurrencies list.
	 * @param money is of type Currency.
	 * @param toConvert is of type string received from the ChoiceBox.
	 */
	public void add(Currency money, String toConvert) {
		moneyList.add(new Currency(money));
		toConvertList.add(new String(toConvert));
		System.out.println("Added " + money.getAmount() + money.getCountryCurrency() + "MoneyList size: " + moneyList.size());
		
	}
	
	/**
	 * Calculates all the currencies in the list
	 * @return
	 * @throws InvalidCurrencyException
	 */
	private ArrayList<String> Calculate() throws InvalidCurrencyException {
		for (int i = 0; i <= moneyList.size() - 1; i++) {
			System.out.println("Getting results...");
			Rates selectRates = new Rates(moneyList.get(i), toConvertList.get(i));
			DisplayResult result = new DisplayResult(moneyList.get(i).getAmount(),selectRates.getConverted(), 
					moneyList.get(i).getCountryCurrency(), selectRates.getToCurrency());
			resultList.add(result.toString());
			System.out.println(result.toString());
		}
		return new ArrayList<String>(resultList);
	}
}
