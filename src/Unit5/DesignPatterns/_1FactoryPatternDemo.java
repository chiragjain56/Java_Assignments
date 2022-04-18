package Unit5.DesignPatterns;

import java.sql.DriverManager;

public class _1FactoryPatternDemo {
    //helpdesk
    //tell the county name and get the currency object which prints symbol
    public static void main(String[] args) {
        //example in Java API
        //DriverManager.getConnection("oracle:4434");

        Currency currency=MyCurrencyFactory.createCurrency(Country.India);
        System.out.println(currency.getCurrencySymbol());
    }
}
//Some other application
class MyCurrencyFactory{
    public static Currency createCurrency(Country country){
        //changing a body can be fine, but changing it's return type is not.
        //String (p,r,t) -> ()
        switch (country){
            case USA : return new USCurrency();
            case India:return new IndiaCurrency();
        }
        return null;
    }
}



interface Currency{

    public String getCurrencySymbol();
}

//another way
/*abstract class Currency1{
    String symbol;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}

class ThaiCurrency extends Currency1{
    ThaiCurrency(){
        symbol="THB";
    }
}*/


class USCurrency implements Currency{
    @Override
    public String getCurrencySymbol(){
        return "$";
    }
}

class IndiaCurrency implements Currency{
    @Override
    public String getCurrencySymbol() {
        return "₹";
    }
}

enum Country {USA, India};
