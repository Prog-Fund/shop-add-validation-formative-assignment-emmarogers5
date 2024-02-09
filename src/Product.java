
public class Product {

    private String productName = "";
    private int productCode = 5000;
    private double unitCost = 1;
    private boolean inCurrentProductLine;

    public Product(String productName, int productCode, double unitCost, boolean inCurrentProductLine) {

        setProductCode(productCode);

        if (productName != null) {
            if (productName.length() <= 20)
                this.productName = productName;
            else
                this.productName = productName.substring(0, 20);
        }

        setUnitCost(unitCost);
        this.inCurrentProductLine = inCurrentProductLine;
    }

    public String getProductName(){
    return productName;
    }

    public double getUnitCost(){
        return unitCost;
    }

    public int getProductCode(){
        return productCode;
    }
    public boolean isInCurrentProductLine(){
        return inCurrentProductLine;
    }
}




