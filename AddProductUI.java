import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddProductUI {

    public JFrame view;

    public JButton btnAdd = new JButton("Add");
    public JButton btnCancel = new JButton("Cancel");

    public JTextField txtProductID = new JTextField(20);
    public JTextField txtBarcode = new JTextField(20);
    public JTextField txtName = new JTextField(20);
    public JTextField txtExpiration = new JTextField(20);
    public JTextField txtDate = new JTextField(20);
    public JTextField txtPrice = new JTextField(20);
    public JTextField txtTaxRate = new JTextField(20);
    public JTextField txtQuantity = new JTextField(20);
    public JTextField txtSupplier = new JTextField(20);
    public JTextField txtManufacturedDate = new JTextField(20);


    public AddProductUI()   {
        this.view = new JFrame();

        view.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        view.setTitle("Add New Product");
        view.setSize(600, 400);
        view.getContentPane().setLayout(new BoxLayout(view.getContentPane(), BoxLayout.PAGE_AXIS));

        String[] labels = {"ProductID ", "Barcode ", "Name ", "Expiration ", "Date ", "Price ", "TaxRate ", "Quantity ","Supplier ","ManufacturedDate "};

        JPanel line1 = new JPanel(new FlowLayout());
        line1.add(new JLabel("ProductID "));
        line1.add(txtProductID);
        view.getContentPane().add(line1);

        JPanel line2 = new JPanel(new FlowLayout());
        line2.add(new JLabel("Barcode "));
        line2.add(txtBarcode);
        view.getContentPane().add(line2);

        JPanel line3 = new JPanel(new FlowLayout());
        line3.add(new JLabel("Name "));
        line3.add(txtName);
        view.getContentPane().add(line3);

        JPanel line4 = new JPanel(new FlowLayout());
        line4.add(new JLabel("Expiration "));
        line4.add(txtExpiration);
        view.getContentPane().add(line4);

        JPanel line5 = new JPanel(new FlowLayout());
        line5.add(new JLabel("Date "));
        line5.add(txtDate);
        view.getContentPane().add(line5);

        JPanel line6 = new JPanel(new FlowLayout());
        line6.add(new JLabel("Price "));
        line6.add(txtPrice);
        view.getContentPane().add(line6);

        JPanel line7 = new JPanel(new FlowLayout());
        line7.add(new JLabel("TaxRate "));
        line7.add(txtTaxRate);
        view.getContentPane().add(line7);

        JPanel line8 = new JPanel(new FlowLayout());
        line8.add(new JLabel("Quantity "));
        line8.add(txtQuantity);
        view.getContentPane().add(line8);

        JPanel line9 = new JPanel(new FlowLayout());
        line9.add(new JLabel("Supplier "));
        line9.add(txtSupplier);
        view.getContentPane().add(line9);

        JPanel line10 = new JPanel(new FlowLayout());
        line10.add(new JLabel("ManufacturedDate "));
        line10.add(txtManufacturedDate);
        view.getContentPane().add(line10);

        JPanel panelButtons = new JPanel(new FlowLayout());
        panelButtons.add(btnAdd);
        panelButtons.add(btnCancel);
        view.getContentPane().add(panelButtons);

        btnAdd.addActionListener(new AddButtonListerner());

        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                view.dispose();
            }
        });

    }

    public void run() {
        view.setVisible(true);
    }

    class AddButtonListerner implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            ProductModel product = new ProductModel();
            String productID = txtProductID.getText();
            if (productID.length() == 0) {
                JOptionPane.showMessageDialog(null, "ProductID cannot be null!");
                return;
            }
            try {
                product.mProductID = Integer.parseInt(productID);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "ProductID is invalid!");
                return;
            }
            String barcode = txtBarcode.getText();
            if (barcode.length() == 0) {
                JOptionPane.showMessageDialog(null, "Barcode cannot be null!");
                return;
            }
            try {
                product.mBarcode = Integer.parseInt(barcode);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Barcode is invalid!");
                return;
            }
            String name = txtName.getText();
            if (name.length() == 0) {
                JOptionPane.showMessageDialog(null, "Product name cannot be empty!");
                return;
            }
            try {
                product.mName = name;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Name is invalid!");
                return;
            }
            String Expiration = txtExpiration.getText();
            if (Expiration.length() == 0) {
                JOptionPane.showMessageDialog(null, "Product Expiration cannot be empty!");
                return;
            }
            product.mExpiration = Expiration;
            String Date = txtDate.getText();
            if (Date.length() == 0) {
                JOptionPane.showMessageDialog(null, "Product Date cannot be empty!");
                return;
            }
            product.mDate = Date;
            String price = txtPrice.getText();
            if (price.length() == 0) {
                JOptionPane.showMessageDialog(null, "Product Price cannot be empty!");
                return;
            }
            try {
                product.mPrice = Double.parseDouble(price);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Product Price is invalid!");
                return;
            }

            String TaxRate = txtTaxRate.getText();
            if (TaxRate.length() == 0) {
                JOptionPane.showMessageDialog(null, "Product TaxRate cannot be empty!");
                return;
            }
            try {
                product.mTaxRate = Double.parseDouble(TaxRate);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Product TaxRate is invalid!");
                return;
            }

            String Quantity = txtQuantity.getText();
            if (Quantity.length() == 0) {
                JOptionPane.showMessageDialog(null, "Product Quantity cannot be empty!");
                return;
            }
            try {
                product.mQuantity = Integer.parseInt(Quantity);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Product Quantity is invalid!");
                return;
            }

            String Supplier = txtSupplier.getText();
            if (Supplier.length() == 0) {
                JOptionPane.showMessageDialog(null, "Product Supplier cannot be empty!");
                return;
            }
            product.mSupplier = Supplier;

            String ManufacturedDate = txtManufacturedDate.getText();
            if (ManufacturedDate.length() == 0) {
                JOptionPane.showMessageDialog(null, "Product ManufacturedDate cannot be empty!");
                return;
            }
            product.mManufacturedDate = ManufacturedDate;

            switch (StoreManager.getInstance().getDataAdapter().saveProduct(product)) {
                case SQLiteDataAdapter.PRODUCT_DUPLICATE_ERROR:
                    JOptionPane.showMessageDialog(null, "Product NOT added successfully! Duplicate product ID!");
                default:
                    JOptionPane.showMessageDialog(null, "Product added successfully!" + product);
            }
        }
    }

}