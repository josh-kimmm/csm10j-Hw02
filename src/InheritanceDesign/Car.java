package InheritanceDesign;

public class Car extends Property
{
    public Car(String carname, double value, double debt)
    {
        name = carname;
        assetvalue = value;
        setDebtAmount(debt);
    }
    
    @Override
    public String getAssetValue()
    {
        return name + ", Car, Value: $" + assetvalue + ", Debt: $" + getDebtAmount();
    }
    
    @Override
    public String toString()
    {
        return getAssetValue();
    }
}
