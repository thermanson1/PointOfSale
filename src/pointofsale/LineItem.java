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
    
    public LineItem(Product product, DataStrategy database, int quantity){
        this.product = product;
        this.database = database;
        this.quantity = quantity;
    }
    
    private Product FindProduct(String productID){
        return database.findProduct(productID);
    }
    public double getOriginalPriceSubTtl(Product product, int quantity){
        return product.getUnitPrice() * quantity;
    }
    public double getDiscountAmt(Product product, int quantity){
        return product.getDiscount().getDiscountAmt(product.getUnitPrice(), quantity);
    }

    

    public DataStrategy getDatabase() {
        return database;
    }

    public void setDatabase(DataStrategy database) {
        this.database = database;
    }
    
    
    
}
