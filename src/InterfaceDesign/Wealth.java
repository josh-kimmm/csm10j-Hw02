package InterfaceDesign;
import java.util.*;

public class Wealth 
{
    private Vector<Asset> assetList;
    private Vector<Debt> debtList;
       
    public Wealth()
    {
        assetList = new Vector<>();
        debtList = new Vector<>();
    }        
    
    public void addAsset(BankAccount bank)
    {
        assetList.addElement(bank);
    }
    
    public void addAsset(House home)
    {
        assetList.addElement(home);
        debtList.addElement(home);
    }
    
    public void addAsset(Car vehicle)
    {
        assetList.addElement(vehicle);
        debtList.addElement(vehicle);
    }
    
    public void addAsset(Stock stock)
    {
        assetList.addElement(stock);
    }
    
    public void addAsset(Bond bond)
    {
        assetList.addElement(bond);
    }
    
    public String getTotalAssets()
    {
        double temp = 0;
        for(int count = 0; count < assetList.size(); count++)
        {
            temp += (assetList.get(count)).getAssetValue();
        }
        
        return String.format("Assets: $%.2f", temp);
    }
    
    public String getTotalDebts()
    {
        double temp = 0;
        for(int count = 0; count < assetList.size(); count++)
        {
            if(assetList.get(count) instanceof House)
            {
                temp += ((House)(assetList.get(count))).getDebtAmount();
            }
            else if(assetList.get(count) instanceof Car)
            {
                temp += ((Car)(assetList.get(count))).getDebtAmount();
            }
        }
        
        return String.format("Debts: $%.2f", temp);
    }
    
    public String getNetWorth()
    {
        double temp = 0, hold = 0;
        for(int count = 0; count < assetList.size(); count++)
        {
            if(assetList.get(count) instanceof House)
            {
                temp += ((House)(assetList.get(count))).getDebtAmount();
            }
            else if(assetList.get(count) instanceof Car)
            {
                temp += ((Car)(assetList.get(count))).getDebtAmount();
            }
        }
        for(int count = 0; count < assetList.size(); count++)
        {
            hold += (assetList.get(count)).getAssetValue();
        }
        
        return String.format("Total Net Worth: $%.2f", (hold - temp));
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
            temp += (assetList.get(count)).toString();
            temp += "\n";
        }
        return temp;
    }
    
    public void ListAssets()
    {
        for(int i = 0; i < assetList.size(); i++)
        {
            System.out.println(assetList.get(i).getAssetName());
        }
    }
    
    public void AssetInfo(String info)
    {
        for(int i = 0; i < assetList.size(); i++)
        {
            if(assetList.get(i).getAssetName() == info)
            {
                System.out.println(assetList.get(i).toString());
                return;
            }
        }
    }
    
}
