package application;

public class Conversion{
	
	private double toConvert;
	private double rate;
	
	public double getToConvert() {
		return toConvert;
	}
	
	public void setToConvert(double toConvert) {
		this.toConvert = toConvert;
	}
	
	public double getRate() {
		return rate;
	}

	public double getConverted() throws InvalidCurrencyException {
		return (toConvert * rate);
	}
	
	public Conversion(String valueToConvert, double newRate) throws InvalidCurrencyException {
		try {
			rate = newRate;
			toConvert = Double.parseDouble(valueToConvert);
			
		}catch (NumberFormatException nfe) {
			throw new InvalidCurrencyException("Do not include characters: '" + valueToConvert 
					+ "'. Value to convert should be a number");
		}
	}
}
