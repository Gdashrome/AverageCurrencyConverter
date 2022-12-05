/**
 * 
 */
package application;

/**
 * Displays the Currency of the user and the converted currency
 * 
 * @author gerome,maria,hugo
 *
 */
public class DisplayResult {
	
	private double toConvertNumber;
	private double ConvertedNumber;
	private String fromCurrency;
	private String toCurrency;
	
	public DisplayResult() {
		
	}
	
	public DisplayResult(double toConvert, double converted, String from, String to) throws InvalidCurrencyException{
		toConvertNumber = toConvert;
		ConvertedNumber = converted;
		fromCurrency = new String(from);
		toCurrency = new String(to);
	}
	
	@Override
	public String toString() {
		return String.format(" Converted:           %.2f  %s      =      %.2f  %s",toConvertNumber, fromCurrency, ConvertedNumber, toCurrency);
	}

}
