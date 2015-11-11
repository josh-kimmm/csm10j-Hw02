package InheritanceDesign;


public class BankAccount extends Asset
{
    
    public BankAccount(String bank_name, double bank_money)
    {
        name = bank_name;
        assetvalue = bank_money;
    }
    
    @Override
    public String getAssetValue() 
    {
        return name + ", bank, Value: $" + assetvalue;     
    }
    
    @Override
    public String toString()
    {
        return getAssetValue();
    }
    
    
    
}
