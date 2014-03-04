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
public class Product {
    private String productId;
    private String productDescription;
    private double unitPrice;
    private DiscountStrategy discount;

    public Product(String productId, String productDescription, double unitPrice, DiscountStrategy discount) {
        this.productId = productId;
        this.productDescription = productDescription;
        this.unitPrice = unitPrice;
        this.discount = discount;
    }

    public DiscountStrategy getDiscount() {
        return discount;
    }

    public void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public double getDiscountAmt(int quantity){
        return getDiscount().getDiscountAmt(unitPrice, quantity);
    }
    
    
    
}
//line item should only store the subtotal, everything else should be stored elsewhere