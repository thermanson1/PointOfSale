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
public interface DiscountStrategy {

    public abstract double getDiscountAmt(double unitPrice, int quantity);
    public abstract double getProductCost();
    public abstract double getQuantity();
    public abstract void setProductCost(double productCost);
    public abstract void setQuantity(double quantity);

}
