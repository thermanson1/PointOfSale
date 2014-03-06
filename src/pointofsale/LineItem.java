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
    private int quantity;
    
    DataStrategy database;
    
    public LineItem(String productId, DataStrategy database, int quantity){
        this.database = database;
        this.product = findProduct(productId);
        
        this.quantity = quantity;
    }
    
    private Product findProduct(String productId){
        return database.findProduct(productId);
    }
    public double getOriginalPriceSubTtl(){
        return product.getUnitPrice() * quantity;
    }
    public double getDiscountAmt(){
        return product.getDiscount().getDiscountAmt(product.getUnitPrice(), quantity);
    }

    

    public DataStrategy getDatabase() {
        return database;
    }

    public void setDatabase(DataStrategy database) {
        this.database = database;
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
    
    
    
}
