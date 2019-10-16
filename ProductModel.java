public class ProductModel {
    public int mProductID, mBarcode, mQuantity;
    public String mName, mExpiration, mDate, mManufacturedDate, mSupplier;
    public double mPrice, mTaxRate;

    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(mProductID).append(",");
        sb.append(mBarcode).append(",");
        sb.append("\"").append(mName).append("\"").append(",");
        sb.append("\"").append(mExpiration).append("\"").append(",");
        sb.append("\"").append(mDate).append("\"").append(",");
        sb.append(mPrice).append(",");
        sb.append(mTaxRate).append(",");
        sb.append(mQuantity).append(",");
        sb.append("\"").append(mSupplier).append("\"").append(",");
        sb.append("\"").append(mManufacturedDate).append("\"").append(")");
        return sb.toString();
    }
}
