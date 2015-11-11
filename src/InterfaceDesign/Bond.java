package InterfaceDesign;



public class Bond implements Asset
{
    private final String name;
    private final double price;
    private final int quantity;
    
    public Bond(String stockname, double price, int quantity)
    {
        name = stockname;
        this.price = price;
        this.quantity = quantity;
    }
    
    @Override
    public double getAssetValue()
    {
        return price * quantity;
    }
    
    @Override
    public String toString()
    {
        return name + ", Stock, Shared Owned: " + quantity + ", Price: $" 
                + price + String.format(", Value: $%.2f", quantity * price);
    }
    
    @Override
    public String getAssetName()
    {
        return name;
    }
}
