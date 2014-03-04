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
public class ReceiptOutput implements ReceiptOutputStrategy{
    
    @Override
    public void OutputReceipt(String SaleInfo){
        System.out.println(SaleInfo);
    }
}
