package CarRentalSystem.PriceCalculatingStratergy;

public class Factory {


    public static PriceStrategyInterface getStrategy(StratergyType stratergyType){
        PriceStrategyInterface priceCalculator=null;
        if (stratergyType==StratergyType.DISCOUNT){
            priceCalculator=new Discount();
        }
        else{
            priceCalculator=new WithoutDiscount();
        }
        return priceCalculator;
    }


}
