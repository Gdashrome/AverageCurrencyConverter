package application;

public class Convert {
	
	private double toConvert;
	private String fromCurrency;
	private String toCurrency;
	private double converted;
	
	public double getToConvert() {
		return toConvert;
	}
	
	public void setToConvert(double toConvert) {
		this.toConvert = toConvert;
	}
	
	public String getCurrency() {
		return fromCurrency;
	}
	
	public void setCurrency(String currency) {
		this.fromCurrency = currency;
	}
	
	public double getConverted() {
		return converted;
	}
	
	public String getNewCurrency() {
		return toCurrency;
	}

	public void setNewCurrency(String newCurrency) {
		this.toCurrency = newCurrency;
	}
	
	public Convert(double valueToConvert, String oldCurrency, String newCurrency) {
		toConvert = valueToConvert;
		fromCurrency = new String(oldCurrency);
		toCurrency = new String (newCurrency);
	}

}
