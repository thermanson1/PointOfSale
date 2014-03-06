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
    
    public DollarAmountOffDiscount(double dollarsOff){
        this.dollarAmtOff = dollarsOff;
    }
    @Override
    public double getDiscountAmt(double productCost, int quantity){
        return dollarAmtOff;
    }
    @Override 
    public double getDiscountTotalOff(double unitPrice, int quantity){
        return dollarAmtOff;
    }

 
    public double getDollarAmtOff() {
        return dollarAmtOff;
    }

    public void setDollarAmtOff(double dollarAmtOff) {
        this.dollarAmtOff = dollarAmtOff;
    }


   
    
}
