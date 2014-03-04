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
public class CashRegister {
    private Receipt receipt;
    
    public void startNewSale(String custId, DataStrategy database, ReceiptOutputStrategy output){
        receipt = new Receipt(custId, database, output);
    }
     public void addItem(String productId, int quantity){
        receipt.addLineItem(productId, quantity);
    }
    
    public void endOfSalePrintReceipt(){
        receipt.outputReceipt();
    }
   
}
