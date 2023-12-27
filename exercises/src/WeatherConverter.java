// Conversor de temperaturas (Celsius e Fahrenheit)

public class WeatherConverter {
    public static void main(String[] args) {

        double temperaturaCelsius = 37.5;
        double temperaturaFahrenheit = 86.5;

        // Convertendo Celsius em Fahrenheit
        double celsiusParaFahrenheit = (temperaturaCelsius * 9/5) + 32;
        System.out.println("A temperatura de " + temperaturaCelsius +
                " °C convertida para Fahrenheit é de: " +
                celsiusParaFahrenheit + " °F");

        System.out.println("----------------------------------------");

        // Convertendo Fahrenheit em Celsius
        double fahrenheitParaCelsius = (temperaturaFahrenheit - 32) * 5/9;
        System.out.println("A temperatura de " + temperaturaFahrenheit +
                " °F convertida para Celsius é de: " +
                fahrenheitParaCelsius + " °C");

        System.out.println("--------------------------------------------");

        // Temperatura Celsius em Fahrenheit 'inteira'
        int temperaturaEmFahrenheitInteira = (int) celsiusParaFahrenheit;
        String mensagemFahrenheit = String.format("A temperatura Celsius convertida em " +
                "Fahrenheit é: %d", temperaturaEmFahrenheitInteira);
        System.out.println(mensagemFahrenheit);

        // Temperatura Fahrenheit em Celsius 'inteira'
        int temperaturaEmCelsiusInteira = (int) fahrenheitParaCelsius;
        String mensagemCelsius = String.format("A temperatura Fahrenheit convertida em " +
                "Celsius é: %d", temperaturaEmCelsiusInteira);
        System.out.println(mensagemCelsius);

    }
}