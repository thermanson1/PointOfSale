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
public class PercentageDiscount implements DiscountStrategy{
    private double percent = 0.10;
    private double productCost;
    private double quantity;
    
    public PercentageDiscount(double rate){
        this.percent = rate;
    }
    @Override
    public double getDiscountAmt(double productCost, int quantity){
        return productCost * quantity * percent;
    }

 
    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }


    @Override
    public double getProductCost() {
        return productCost;
    }

    @Override
    public void setProductCost(double productCost) {
        this.productCost = productCost;
    }

    @Override
    public double getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
    
    
    
}
