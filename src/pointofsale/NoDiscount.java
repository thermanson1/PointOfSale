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

    @Override
    public double getDiscountTotalOff(double unitPrice, int quantity){
        return 0;
    }
    
    
    @Override
    public double getDiscountAmt(double unitPrice, int quantity){
        return 0;
    }
    
    
    
}
