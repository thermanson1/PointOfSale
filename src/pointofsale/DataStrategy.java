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
public interface DataStrategy {
    public abstract Product findProduct(String productID);
    public abstract Customer findCustomer(String custID);
}
