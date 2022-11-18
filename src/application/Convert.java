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
	
	public Convert(double valueToConvert, String oldCurrency, String newCurrency) {
		super(oldCurrency, newCurrency);
		toConvert = valueToConvert;
	}
	
	private Double Calculate() {
		return toConvert * this.getRate();
	}
	
	@Override
	public String toString() {
		return "Converted " + getToConvert() + " " + this.getFromCurrency() +
				" to " + getConverted() + " " + this.getToCurrency();
	}

}
