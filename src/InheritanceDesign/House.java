package InheritanceDesign;


public class House extends Property
{
    
    public House(String housename, double value, double debt)
    {
        name = housename;
        assetvalue = value;
        setDebtAmount(debt);
    }
    
    @Override
    public String getAssetValue()
    {
        return name + ", House, Value: $" + assetvalue + ", Debt: $" + getDebtAmount();
    }
    
    @Override
    public String toString()
    {
        return getAssetValue();
    }
}
