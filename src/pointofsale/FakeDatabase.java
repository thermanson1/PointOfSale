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
public class FakeDatabase implements DataStrategy{
    private final Customer[] customers = {
        new Customer("Rachel", "Green", "1000"),
        new Customer("Ross", "Gellar", "2000"),
        new Customer("Phoebe", "Buffet", "3000"),
        new Customer("Joey", "Tribiani", "4000"),
        new Customer("Monica", "Gellar", "5000"),
        new Customer("Chandler", "Bing", "6000")
    };
    
    private final Product[] products = {
        new Product("A101", "Women's Dress", 59.99, new DollarAmountOffDiscount(10.00)),
        new Product("B202", "Men's Sweater", 29.99, new PercentageDiscount(.15)),
        new Product("C303", "Children Book", 8.99, new NoDiscount()),
        new Product("D404", "Men's Watch", 79.99, new PercentageDiscount(.30)),
        new Product("E505", "Women's Socks", 12.99, new NoDiscount()),
        new Product("F606", "Infant Toy", 5.99, new DollarAmountOffDiscount(1.50)),
        new Product("G707", "Blender Bottle", 39.99, new PercentageDiscount(.20))
    };
    
    @Override
    public Product findProduct(String productId){
        if(productId == null || productId.length() == 0){
            System.out.println("The product ID is invalid");
            return null;
        }
        Product product = null;
        for (Product pro : products){
            if(productId.equals(pro.getProductId())){
                product = pro;
                break;
            }
        }
        return product;
    }
    
    @Override
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
