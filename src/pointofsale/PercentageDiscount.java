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
    private double percentDiscount = .10;
    
    public PercentageDiscount(double percent){
        this.percentDiscount = percent;
    }
    @Override
    public double getDiscountAmt(double unitPrice, int quantity){
        return (unitPrice * quantity)-((unitPrice * quantity) * percentDiscount);
    }
    @Override
    public double getDiscountTotalOff(double unitPrice, int quantity){
        return ((unitPrice * quantity) - (unitPrice*quantity) *percentDiscount);
    }

 
    
    
    
}
