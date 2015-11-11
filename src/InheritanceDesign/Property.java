package InheritanceDesign;

abstract class Property extends Asset
{
    private double debt;
    public double getDebtAmount()
    {
        return debt;
    }
    
    protected void setDebtAmount(double debt)
    {
        this.debt = debt;
    }
}
