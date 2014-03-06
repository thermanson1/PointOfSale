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
    private double discountAmt=0.00;
    @Override
    public double getDiscountTotalOff(double unitPrice, int quantity){
        return discountAmt;
    }
    
    
    @Override
    public double getDiscountAmt(double unitPrice, int quantity){
        return discountAmt;
    }
    
    
    
}
