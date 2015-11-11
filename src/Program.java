import InheritanceDesign.*;
//import InterfaceDesign.*;

public class Program 
{
    public static void main(String[] args) 
    {
        Wealth xy = new Wealth();
        BankAccount bank = new BankAccount("My Bank account", 23242.23);
        House house = new House("22158 James Alan Circle", 232324.23, 124445.35);
        Car car = new Car("Ferrari", 34343.12, 31111.23);
        Stock stock = new Stock("APL" , 34.2, 41);
        Bond bond = new Bond("NASDAQ", 34.9, 23);
        xy.addAsset(bank);
        xy.addAsset(house);
        xy.addAsset(car);
        xy.addAsset(stock);
        xy.addAsset(bond);
        System.out.println(xy);
 
        System.out.println(xy.getAssetSummary());
        System.out.println(bank);
        System.out.println(stock);
        System.out.println(bond);
        System.out.println(house);
        System.out.println(car); 
        
        xy.ListAssets();
        xy.AssetInfo("Ferrari");

    }
    
}
