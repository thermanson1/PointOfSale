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
public class NoDiscount implements DiscountStrategy{

    private double quantity;
    private double productCost;

    

   
    @Override
    public double getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getProductCost() {
        return productCost;
    }

    public void setProductCost(double productCost) {
        this.productCost = productCost;
    }
    

    
    
    @Override
    public double getDiscountAmt(double uPrice, int quantity){
        return 0;
    }
    
    
    
}
