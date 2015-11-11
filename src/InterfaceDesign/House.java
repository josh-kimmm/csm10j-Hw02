package InterfaceDesign;


public class House implements Debt, Asset
{
    private final String name;
    private final double assetvalue, debt;
    
    
    public House(String housename, double value, double debt)
    {
        name = housename;
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
        return name + ", House, Value: $" + assetvalue + ", Debt: $" + debt;
    }
    
    @Override
    public String getAssetName()
    {
        return name;
    }
}
