

package pointofsale;

/**
 *
 * @author Teraesa
 */
public class Startup {

   
    public static void main(String[] args) {
        CashRegister cr = new CashRegister();
        
  
        cr.startNewSale("1000", new FakeDatabase(), new ReceiptOutput());
        cr.addItem("E505", 2);
        cr.addItem("A101", 1);
        cr.endOfSalePrintReceipt();
        
   
        cr.startNewSale("4000", new FakeDatabase(), new ReceiptOutput());
        cr.addItem("C303", 4);
        cr.addItem("F606", 6);
        cr.addItem("A101", 3);
        cr.endOfSalePrintReceipt();
    }
    
}
