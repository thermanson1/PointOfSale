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
public class FakeDatabase {
    private final Customer[] customers = {
        new Customer("Rachel", "Green", "G548624"),
        new Customer("Ross", "Gellar", "G692157"),
        new Customer("Phoebe", "Buffet", "B167982"),
        new Customer("Joey", "Tribiani", "T642953"),
        new Customer("Monica", "Gellar", "G847536"),
        new Customer("Chandler", "Bing", "B615423")
    };
    
    private final Product[] products = {
        new Product("A101", "Women's Dress Shoe", 59.99, new DollarAmountOffDiscount(10.00)),
        new Product("B202", "Men's Sweater", 29.99, new PercentageDiscount(.15)),
        new Product("C303", "Children's Book", 8.99, new NoDiscount()),
        new Product("D404", "Men's Watch", 79.99, new PercentageDiscount(.30)),
        new Product("E505", "Women's Socks", 12.99, new NoDiscount()),
        new Product("F606", "Infant Toy", 5.99, new DollarAmountOffDiscount(1.50)),
        new Product("G707", "Blender", 39.99, new PercentageDiscount(.20))
    };
    
    public Product findProduct(String productID){
        if(productID == null || productID.length() == 0){
            System.out.println("The product ID is invalid");
            return null;
        }
        Product product = null;
        for (Product pro : products){
            if(productID.equals(pro.getProductId())){
                product = pro;
                break;
            }
        }
        return product;
    }
    
    public Customer findCustomer(String custID){
        if(custID == null || custID.length() == 0){
            System.out.println("The customer ID is invalid");
            return null;
        }
        
        Customer customer = null;
        for(Customer cust : customers){
            if(custID.equals(cust.getCustID())){
                customer = cust;
                break;
            }
        }
        return customer;
    }
    
    
}
