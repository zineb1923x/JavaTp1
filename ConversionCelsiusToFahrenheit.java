public class ConversionCelsiusToFahrenheit {
    public static void main(String[] args) {
        int temperatureDegresCelsius = Integer.parseInt(args[0]);
        double temperatureDegresFahrenheit = (9/5)*temperatureDegresCelsius+ 32 ;
        System.out.println("température passée en argument en degrés Celsius :" + temperatureDegresCelsius);
        System.out.println(temperatureDegresCelsius+" degrés Celsius est équivalent à "+ temperatureDegresFahrenheit + " degrés Fahrenheit");
    }
}