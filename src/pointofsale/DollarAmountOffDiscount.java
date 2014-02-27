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
public class DollarAmountOffDiscount implements DiscountStrategy {
    private double dollarAmtOff = 1.00;
    private double productCost;
    private double quantity;
    
    public DollarAmountOffDiscount(double dollarsOff){
        this.dollarAmtOff = dollarsOff;
    }
    @Override
    public double getDiscountAmt(double productCost, int quantity){
        return (productCost * quantity) - dollarAmtOff;
    }

 
    public double getDollarAmtOff() {
        return dollarAmtOff;
    }

    public void setDollarAmtOff(double dollarAmtOff) {
        this.dollarAmtOff = dollarAmtOff;
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
