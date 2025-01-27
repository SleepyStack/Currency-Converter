package Currency_Converter;
import java.util.HashMap;
import java.util.Map;
public class Conversion {
    private Map<String, Double> conversionRates = new HashMap<>();
    public Conversion(){
        conversionRates.put("USD", 1.0);
        conversionRates.put("EUR", 0.85);
        conversionRates.put("JPY", 110.0);
        conversionRates.put("GBP", 0.75);
        conversionRates.put("AUD", 1.35);
        conversionRates.put("CAD", 1.3);
        conversionRates.put("CHF", 0.92);
        conversionRates.put("CNY", 6.92);
        conversionRates.put("SEK", 8.55);
        conversionRates.put("NZD", 1.45);

    }
    public double convert(String fromCurrency, String toCurrency, double amount){
        double exchangeRate = conversionRates.get(toCurrency) / conversionRates.get(fromCurrency);
        return amount * exchangeRate;
    }
    public void updateConversionRate(String currency, double newRate){
        conversionRates.put(currency, newRate);
    }
    public void addCurrency(String currency, double rate){
        conversionRates.put(currency, rate);
    }
}
