package application;

public class Convert extends Rates {
	
	private double toConvert;
	
	public double getToConvert() {
		return toConvert;
	}
	
	public void setToConvert(double toConvert) {
		this.toConvert = toConvert;
	}

	public double getConverted() throws InvalidCurrencyException {
		return Calculate();
	}
	
	public Convert(String valueToConvert, String oldCurrency, String newCurrency) throws InvalidCurrencyException {
		super(oldCurrency, newCurrency);
		try {
			toConvert = Double.parseDouble(valueToConvert);
			if (toConvert < 0) {
				toConvert = 0;
				throw new InvalidCurrencyException("Please use a positive value.");
			}
		}catch (NumberFormatException nfe) {
			throw new InvalidCurrencyException("Do not include characters: '" + valueToConvert 
					+ "'. Value to convert should be a number");
		}
	}
	
	private Double Calculate() throws InvalidCurrencyException {
		return (toConvert * this.getRate());
	}
	
	@Override
	public String toString() {
		try {
			return " Converted:           " + getToConvert() + " " + this.getFromCurrency() +
					"      =      " + getConverted() + " " + this.getToCurrency();
		} catch (InvalidCurrencyException e) {
			return e.getMessage();
		}
	}

}
