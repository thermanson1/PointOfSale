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
    private final DataStrategy database;
    private final Customer customer;
    private final ReceiptOutputStrategy output;
    private LineItem[] lineItems = new LineItem[0];
    private int receiptNumber;
    
   public Receipt(String custID, DataStrategy database, ReceiptOutputStrategy output){
       this.database = database;
       this.customer = findCustomer(custID);
       this.output = output;
       receiptNumber++;
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
       String tab = "\t";
       String tabTab = "\t\t";
       String newLine = "\n";
       
       //heading
       StringBuilder receiptPrint = new StringBuilder("Thank you for Shopping at Kohl's Department Store!\n\n");
       receiptPrint.append("Customer Name: ").append(customer.getFirstName()).append(customer.getLastName()).append(newLine);
       receiptPrint.append("Receipt Number: ").append(receiptNumber).append(newLine);
       
       receiptPrint.append("Product ID\tItem\tPrice\tQuantity\tSubtotal\tDiscount").append(newLine);
       receiptPrint.append("************************************************************************************").append(newLine);
       
       for (LineItem item : lineItems){
           receiptPrint.append(item.getProduct().getProductId()).append("\t");
           receiptPrint.append(item.getProduct().getProductDescription()).append("\t");
           receiptPrint.append(item.getProduct().getUnitPrice()).append("\t");
           receiptPrint.append(item.getQuantity()).append("\t\t");
           receiptPrint.append(item.getOriginalPriceSubTtl()).append("\t\t");
           receiptPrint.append(item.getDiscountAmt()).append(newLine);
       }
       double netTotal = getTotalBeforeDiscount();
       double discountAmt = getTransactionDiscount();
       double totalOwed = netTotal - discountAmt;
       receiptPrint.append(newLine);
       receiptPrint.append(newLine);
       receiptPrint.append("\t\t\t\t\t\t\t\tNet Total: ").append(netTotal).append(newLine);
       receiptPrint.append("\t\t\t\t\t\t\t\tAmount Saved: ").append(discountAmt).append(newLine);
       receiptPrint.append("\t\t\t\t\t\t\t\tTotal Due: ").append(totalOwed).append(newLine);
       
       output.OutputReceipt(receiptPrint.toString());
       
   }
}
