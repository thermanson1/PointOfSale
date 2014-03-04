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
        this.product = findProduct(productId);
        this.database = database;
        this.quantity = quantity;
    }
    
    private Product findProduct(String productID){
        return database.findProduct(productID);
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
    
    
    
}
