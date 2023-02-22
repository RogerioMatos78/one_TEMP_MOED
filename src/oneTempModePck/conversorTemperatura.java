package oneTempModePck;

public class conversorTemperatura {
	private String text;
	private String text2;

	//conversor de Temperatura
	public String CelsiusToFahrenheit(double valor) {
		setText(null);
		double fahrenheit = (valor * 1.8) + 32;
	    return setText(fahrenheit+"º Fahrenheit");
	}
	
	public String FahrenheitToCelsius(double valor) {
		setText2(null);
		double celsius = (valor - 32) / 1.8;
	    return setText2(celsius+"º Celsius");
	}

	public String getText() {
		return text;
	}

	public String setText(String text) {
		this.text = text;
		return text;
	}

	public String getText2() {
		return text2;
	}

	public String setText2(String text2) {
		this.text2 = text2;
		return text2;
	}
}
