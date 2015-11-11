package InterfaceDesign;


public class BankAccount implements Asset
{
    private final String name;
    private final double assetvalue;
    
    public BankAccount(String bank_name, double bank_money)
    {
        name = bank_name;
        assetvalue = bank_money;
    }
    
    @Override
    public double getAssetValue() 
    {
        return assetvalue;     
    }
    
    @Override
    public String toString()
    {
        return name + ", bank, Value: $" + assetvalue;
    }
    
    @Override
    public String getAssetName()
    {
        return name;
    }
}
