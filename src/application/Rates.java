package application;

public class Rates{
	
	private String fromCurrency;
	private String toCurrency;
	
	public double getRate() {
		return chooseRate();
	}
	
	public String getFromCurrency() {
		return fromCurrency;
	}

	public String getToCurrency() {
		return toCurrency;
	}
	
	public Rates(String oldCurrency, String newCurrency) throws InvalidCurrencyException {
		try {
			fromCurrency = new String(oldCurrency.substring(oldCurrency.indexOf('(') + 1, oldCurrency.indexOf(')')));
			toCurrency = new String(newCurrency.substring(newCurrency.indexOf('(') + 1, newCurrency.indexOf(')')));
		}catch (NullPointerException npe) {
			throw new InvalidCurrencyException("Please put a new currency to convert the given value to");
		}
	}
	
	double chooseRate() {
		
		double rate = 0;
		
		if (getFromCurrency().equals("GBP")) {
			if (getToCurrency().equals("EUR")) {
				rate = 1.1761;
			}
			else if (getToCurrency().equals("CHF")) {
				rate = 1.1856;
			}
			else if (getToCurrency().equals("USD")) {
				rate = 1.2405;
			}
			else if (getToCurrency().equals("CAD")) {
				rate = 1.6034;
			}
			else if (getToCurrency().equals("AUD")) {
				rate = 1.777;
			}
			else if (getToCurrency().equals("NZD")) {
				rate = 1.9485;
			}
			else if (getToCurrency().equals("CNH")) {
				rate = 8.2824;
			}
			else if (getToCurrency().equals("HKD")) {
				rate = 9.7186;
			}
			else if (getToCurrency().equals("JPY")) {
				rate = 161.3785;
			}
			else rate = 1;
		}
		
		else if (getFromCurrency().equals("EUR")) {
			if (getToCurrency().equals("GBP")) {
				rate = 0.8505;
			}
			else if (getToCurrency().equals("CHF")) {
				rate = 1.0078;
			}
			else if (getToCurrency().equals("USD")) {
				rate = 1.054;
			}
			else if (getToCurrency().equals("CAD")) {
				rate = 1.3629;
			}
			else if (getToCurrency().equals("AUD")) {
				rate = 1.5109;
			}
			else if (getToCurrency().equals("NZD")) {
				rate = 1.6571;
			}
			else if (getToCurrency().equals("CNH")) {
				rate = 7.0422;
			}
			else if (getToCurrency().equals("HKD")) {
				rate = 8.2579;
			}
			else if (getToCurrency().equals("JPY")) {
				rate = 137.2901;
			}
			else rate = 1;
		}
		
		else if (getFromCurrency().equals("CHF")) {
			if (getToCurrency().equals("GBP")) {
				rate = 0.8451;
			}
			else if (getToCurrency().equals("EUR")) {
				rate = 0.9932;
			}
			else if (getToCurrency().equals("USD")) {
				rate = 1.0455;
			}
			else if (getToCurrency().equals("CAD")) {
				rate = 1.3527;
			}
			else if (getToCurrency().equals("AUD")) {
				rate = 1.500;
			}
			else if (getToCurrency().equals("NZD")) {
				rate = 1.646;
			}
			else if (getToCurrency().equals("CNH")) {
				rate = 6.9922;
			}
			else if (getToCurrency().equals("HKD")) {
				rate = 8.1915;
			}
			else if (getToCurrency().equals("JPY")) {
				rate = 136.4526;
			}
			else rate = 1;
		}
		
		else if (getFromCurrency().equals("USD")) {
			if (getToCurrency().equals("GBP")) {
				rate = 0.8094;
			}
			else if (getToCurrency().equals("EUR")) {
				rate = 0.9511;
			}
			else if (getToCurrency().equals("CHF")) {
				rate = 0.9572;
			}
			else if (getToCurrency().equals("CAD")) {
				rate = 1.2944;
			}
			else if (getToCurrency().equals("AUD")) {
				rate = 1.436;
			}
			else if (getToCurrency().equals("NZD")) {
				rate = 1.5765;
			}
			else if (getToCurrency().equals("CNH")) {
				rate = 6.695;
			}
			else if (getToCurrency().equals("HKD")) {
				rate = 7.8354;
			}
			else if (getToCurrency().equals("JPY")) {
				rate = 130.7526;
			}
			else rate = 1;
		}
		
		else if (getFromCurrency().equals("CAD")) {
			if (getToCurrency().equals("GBP")) {
				rate = 0.6248;
			}
			else if (getToCurrency().equals("EUR")) {
				rate = 0.7344;
			}
			else if (getToCurrency().equals("CHF")) {
				rate = 0.7396;
			}
			else if (getToCurrency().equals("USD")) {
				rate = 0.7731;
			}
			else if (getToCurrency().equals("AUD")) {
				rate = 0.7731;
			}
			else if (getToCurrency().equals("NZD")) {
				rate = 1.2168;
			}
			else if (getToCurrency().equals("CNH")) {
				rate = 5.17;
			}
			else if (getToCurrency().equals("HKD")) {
				rate = 6.0571;
			}
			else if (getToCurrency().equals("JPY")) {
				rate = 100.9107;
			}
			else rate = 1;

		}
		
		else if (getFromCurrency().equals("AUD")) {
			if (getToCurrency().equals("GBP")) {
				rate = 0.5634;
			}
			else if (getToCurrency().equals("EUR")) {
				rate = 0.6624;
			}
			else if (getToCurrency().equals("CHF")) {
				rate = 0.6673;
			}
			else if (getToCurrency().equals("USD")) {
				rate = 0.6978;
			}
			else if (getToCurrency().equals("CAD")) {
				rate = 0.9022;
			}
			else if (getToCurrency().equals("NZD")) {
				rate = 1.0971;
			}
			else if (getToCurrency().equals("CNH")) {
				rate = 4.663;
			}
			else if (getToCurrency().equals("HKD")) {
				rate = 5.4673;
			}
			else if (getToCurrency().equals("JPY")) {
				rate = 90.9644;
			}
			else rate = 1;
		}
		
		else if (getFromCurrency().equals("NZD")) {
			if (getToCurrency().equals("GBP")) {
				rate = 0.5135;
			}
			else if (getToCurrency().equals("EUR")) {
				rate = 0.6039;
			}
			else if (getToCurrency().equals("CHF")) {
				rate = 0.6086;
			}
			else if (getToCurrency().equals("USD")) {
				rate = 0.6366;
			}
			else if (getToCurrency().equals("CAD")) {
				rate = 0.8229;
			}
			else if (getToCurrency().equals("AUD")) {
				rate = 0.9118;
			}
			else if (getToCurrency().equals("CNH")) {
				rate = 4.2514;
			}
			else if (getToCurrency().equals("HKD")) {
				rate = 4.9878;
			}
			else if (getToCurrency().equals("JPY")) {
				rate = 82.8776;
			}
			else rate = 1;
		}
		
		else if (getFromCurrency().equals("CNH")) {
			if (getToCurrency().equals("GBP")) {
				rate = 0.1208;
			}
			else if (getToCurrency().equals("EUR")) {
				rate = 0.1421;
			}
			else if (getToCurrency().equals("CHF")) {
				rate = 0.1431;
			}
			else if (getToCurrency().equals("USD")) {
				rate = 0.1497;
			}
			else if (getToCurrency().equals("CAD")) {
				rate = 0.1935;
			}
			else if (getToCurrency().equals("AUD")) {
				rate = 0.2145;
			}
			else if (getToCurrency().equals("NZD")) {
				rate = 0.2353;
			}
			else if (getToCurrency().equals("HKD")) {
				rate = 1.1726;
			}
			else if (getToCurrency().equals("JPY")) {
				rate = 19.5035;
			}
			else rate = 1;
		}
		
		else if (getFromCurrency().equals("HKD")) {
			if (getToCurrency().equals("GBP")) {
				rate = 0.1033;
			}
			else if (getToCurrency().equals("EUR")) {
				rate = 0.1214;
			}
			else if (getToCurrency().equals("CHF")) {
				rate = 0.1222;
			}
			else if (getToCurrency().equals("USD")) {
				rate = 0.1276;
			}
			else if (getToCurrency().equals("CAD")) {
				rate = 0.1652;
			}
			else if (getToCurrency().equals("AUD")) {
				rate = 0.1833;
			}
			else if (getToCurrency().equals("NZD")) {
				rate = 0.2012;
			}
			else if (getToCurrency().equals("CNH")) {
				rate = 0.8544;
			}
			else if (getToCurrency().equals("JPY")) {
				rate = 16.6879;
			}
			else rate = 1;
		}
		
		else if (getFromCurrency().equals("JPY")) {
			if (getToCurrency().equals("GBP")) {
				rate = 0.0062;
			}
			else if (getToCurrency().equals("EUR")) {
				rate = 0.0073;
			}
			else if (getToCurrency().equals("CHF")) {
				rate = 0.0074;
			}
			else if (getToCurrency().equals("USD")) {
				rate = 0.0077;
			}
			else if (getToCurrency().equals("CAD")) {
				rate = 0.01;
			}
			else if (getToCurrency().equals("AUD")) {
				rate = 0.011;
			}
			else if (getToCurrency().equals("NZD")) {
				rate = 0.0121;
			}
			else if (getToCurrency().equals("CNH")) {
				rate = 0.0514;
			}
			else if (getToCurrency().equals("HKD")) {
				rate = 0.0603;
			}
			else rate = 1;
		}
		else rate = 0.0;
		return rate;
	}
}