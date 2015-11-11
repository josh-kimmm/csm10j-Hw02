package InheritanceDesign;
import java.util.*;

public class Wealth 
{
    private Vector<Asset> assetList;
    private double totalAssets, totalDebts;
    
    public Wealth()
    {
        assetList = new Vector<>();
        totalAssets = totalDebts = 0;
    }        
    
    public void addAsset(BankAccount bank)
    {
        assetList.addElement(bank);
        totalAssets += bank.assetvalue;
    }
    
    public void addAsset(House home)
    {
        assetList.addElement(home);
        totalAssets += home.assetvalue;
        totalDebts += home.getDebtAmount();
    }
    
    public void addAsset(Car vehicle)
    {
        assetList.addElement(vehicle);
        totalAssets += vehicle.assetvalue;
        totalDebts += vehicle.getDebtAmount();
    }
    
    public void addAsset(Stock stock)
    {
        assetList.addElement(stock);
        totalAssets += stock.assetvalue;
    }
    
    public void addAsset(Bond bond)
    {
        assetList.addElement(bond);
        totalAssets += bond.assetvalue;
    }
    
    public String getTotalAssets()
    {
        return "Assets: $" + totalAssets;
    }
    
    public String getTotalDebts()
    {
        return String.format("Debts: $%.2f", totalDebts);
    }
    
    public String getNetWorth()
    {
        return "Total Net Worth: $" + (totalAssets - totalDebts);
    }
    
    @Override
    public String toString()
    {
        return getNetWorth() + " " + getTotalAssets() + " " + getTotalDebts();
    }
    
    public String getAssetSummary()
    {
        String temp = "";
        for(int count = 0; count < assetList.size(); count++)
        {
            temp += (assetList.get(count)).getAssetValue();
            temp += "\n";
        }
        return temp;
    }
    
    public void ListAssets()
    {
        for(int i = 0; i < assetList.size(); i++)
        {
            System.out.println(assetList.get(i).name);
        }
    }
    
    public void AssetInfo(String info)
    {
        for(int i = 0; i < assetList.size(); i++)
        {
            if(assetList.get(i).name == info)
            {
                System.out.println(assetList.get(i).getAssetValue());
                return;
            }
        }
    }
            
}
