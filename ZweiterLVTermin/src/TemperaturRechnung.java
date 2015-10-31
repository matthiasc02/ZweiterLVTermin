
public class TemperaturRechnung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Celsius=30;
		double Fahrenheit=86;

		System.out.println(Celsius +"° Celsius = "+ celsius2Fahrenheit(Celsius)+ "° Fahrenheit");
		System.out.println(Fahrenheit +"° Fahrenheit = "+ Fahrenheit2Celsius(Fahrenheit)+ "° Celsius");
	}
	public static double celsius2Fahrenheit(double Celsius)
	{
	double Fahrenheit = (1.8*Celsius)+32;
	return Fahrenheit;
	}
	public static double Fahrenheit2Celsius(double Fahrenheit)
	{
	double Celsius = (Fahrenheit-32)/1.8;
	return Celsius;
	}
}
