package application;

public class Convert extends Rates {
	
	private double toConvert;
	
	public double getToConvert() {
		return toConvert;
	}
	
	public void setToConvert(double toConvert) {
		this.toConvert = toConvert;
	}

	public double getConverted() {
		return Calculate();
	}
	
	public Convert(String valueToConvert, String oldCurrency, String newCurrency) throws InvalidCurrencyException {
		super(oldCurrency, newCurrency);
		try {
			toConvert = Double.parseDouble(valueToConvert);
		}catch (NumberFormatException nfe) {
			throw new InvalidCurrencyException("Do not include characters: " + valueToConvert 
					+ "Value to convert should be a number");
		}
	}
	
	private Double Calculate() {
		return (toConvert * this.getRate());
	}
	
	@Override
	public String toString() {
		return "Converted " + getToConvert() + " " + this.getFromCurrency() +
				" to " + getConverted() + " " + this.getToCurrency();
	}

}
