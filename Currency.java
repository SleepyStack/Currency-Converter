package Currency_Converter;

public class Currency {
    private String country;
    private String currencyName;
    private double exchangeRate$;

    public Currency(String country, String currencyName, double exchangeRate$){
        this.country = country;
        this.currencyName = currencyName;
        this.exchangeRate$ = exchangeRate$;
    }

    public double getExchangeRate$() {
        return exchangeRate$;
    }

    public String getCountry() {
        return country;
    }

    public String getCurrencyName() {
        return currencyName;
    }
}
