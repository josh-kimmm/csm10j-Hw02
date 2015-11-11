package InterfaceDesign;


public class Car implements Debt, Asset
{
    private final String name;
    private final double assetvalue, debt;
    
    
    
    public Car(String carname, double value, double debt)
    {
        name = carname;
        assetvalue = value;
        this.debt = debt;
    }
    
    @Override
    public double getAssetValue()
    {
        return assetvalue;
    }
    
    @Override
    public double getDebtAmount()
    {
        return debt;
    }
    
    @Override
    public String toString()
    {
        return name + ", Car, Value: $" + assetvalue + ", Debt: $" + debt;
    }
    
    @Override
    public String getAssetName()
    {
        return name;
    }
}
