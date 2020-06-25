
package application;

import java.sql.Date;
import model.entities.Department;
import model.entities.Seller;


public class program {
    public static void main(String[] args) {
        Department obj = new Department(1, "books");
        
        Seller vendedor = new Seller(21, "Bob", "bob@gmail.com", new Date(2), 3000.0, obj);
        
        System.out.println(vendedor);
    }
    
}
