package InheritanceDesign;


public class Stock extends Security
{
    public Stock(String stockname, double price, int quantity)
    {
        name = stockname;
        this.price = price;
        this.quantity = quantity;
    }
    
    @Override
    public String getAssetValue()
    {
        return name + ", Stock, Shared Owned: " + quantity + ", Price: $" 
                + price + String.format(", Value: $%.2f", quantity * price);
    }
    
    @Override
    public String toString()
    {
        return getAssetValue();
    }
}
