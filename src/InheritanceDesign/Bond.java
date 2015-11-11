package InheritanceDesign;

public class Bond extends Security
{
    public Bond(String stockname, double price, int quantity)
    {
        name = stockname;
        this.price = price;
        this.quantity = quantity;
    }
    
    @Override
    public String getAssetValue()
    {
        return name + ", Bond, Shared Owned: " + quantity + ", Price: $" 
                + price + String.format(", Value: $%.2f", quantity * price);
    }
    
    @Override
    public String toString()
    {
        return getAssetValue();
    }
}
