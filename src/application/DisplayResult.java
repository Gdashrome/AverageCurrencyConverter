/**
 * 
 */
package application;

/**
 * @author
 *
 */
public class DisplayResult {
	private double toConvertNumber;
	private double ConvertedNumber;
	private String fromCurrency;
	private String toCurrency;
	
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
