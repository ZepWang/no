public class CustomerModel {
    int id
    public int mCustomerID, mPhone;
    public String mName, mAddress, mPaymentINFO;
    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(mCustomerID).append(",");
        sb.append("\"").append(mName).append("\"").append(",");
        sb.append("\"").append(mAddress).append("\"").append(",");
        sb.append(mPhone).append(",");
        sb.append("\"").append(mPaymentINFO).append("\"").append(")");
        return sb.toString();
    }
}
