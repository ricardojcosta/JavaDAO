
package application;

import java.sql.Date;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;


public class program {
    public static void main(String[] args) {
                
        SellerDao vendedorDao = DaoFactory.createSellerDao();
        
        System.out.println("==== Teste 1: Vendedor por ID ====");
        Seller seller = vendedorDao.findById(1);
        
        System.out.println(seller);
    }
    
}
