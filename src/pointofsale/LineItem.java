/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pointofsale;

/**
 *
 * @author Teraesa
 */
public class LineItem {
    private Product product;
    int quantity;
    DataStrategy database;
    
    public LineItem(DataStrategy database, Product product, int qty){
        this.product = product;
        this.quantity = qty;
        this.database = database;
    }
    
    private Product FindProduct(String productID){
        return database.findProduct(productID);
    }
    public double getOriginalPriceSubTtl(){
        return product.getUnitPrice() * quantity;
    }
    public double getDiscountAmt(){
        return product.getDiscount().getDiscountAmt(product.getUnitPrice(), quantity);
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public DataStrategy getDatabase() {
        return database;
    }

    public void setDatabase(DataStrategy database) {
        this.database = database;
    }
    
    
    
}
