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
public class Receipt {
    private DataStrategy database;
    private Customer customer;
    private ReceiptOutputStrategy output;
    private LineItem[] lineItems;
    
   public Receipt(String custID, DataStrategy database, ReceiptOutputStrategy output){
       this.database = database;
       this.customer = findCustomer(custID);
       this.output = output;
   }
   
   public Customer findCustomer(String custID){
       if (custID == null || custID.length() == 0) {
           System.out.println("The customer ID number is invalid");  
       }
       Customer cust = database.findCustomer(custID);
       if (cust == null){
           System.out.println("Customer is invalid");
       }
       return cust;
   }
   
   public double getTransactionDiscount(){
       double totalDiscount = 0.0;
       for (LineItem item : lineItems){
           totalDiscount = totalDiscount + item.getDiscountAmt();
       }
       return totalDiscount;
   }
   
   public double getTotalBeforeDiscount(){
       double subTotal = 0.0;
       for (LineItem item : lineItems){
           subTotal = subTotal + item.getOriginalPriceSubTtl();
       }
       return subTotal;
   }
   
   public void addLineItem(String productId, int quantity){
       LineItem item = new LineItem(productId, database, quantity);
       addToArray(item);
   }
   
   public void addToArray(LineItem item){
       LineItem[] tempItems = new LineItem[lineItems.length + 1];
       System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
       tempItems[lineItems.length] = item;
       lineItems = tempItems;
   }
   public void outputReceipt(){
       
   }
}
