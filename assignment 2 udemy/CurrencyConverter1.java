public class CurrencyConverter1
{
    double[] exchangeRates={63,3,3,595,18,107,2};

    void printCurrencies()
    {
        System.out.println("rupee: " + exchangeRates[0]);  
        System.out.println("dirham: " + exchangeRates[1]);
        System.out.println("real: " + exchangeRates[2]);
        System.out.println("chilean_peso: " + exchangeRates[3]); 
        System.out.println("mexican_peso: " + exchangeRates[4]);
        System.out.println("_yen: " + exchangeRates[5]);
        System.out.println("$australian: " + exchangeRates[exchangeRates.length-1]); // of length in array
    
    }

    public static void main(String[] args) 
    {

        CurrencyConverter1 cc = new CurrencyConverter1();
        cc.printCurrencies();
        
    }
}
