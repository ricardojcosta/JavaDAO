
package application;

import java.sql.Date;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;


public class program {
    public static void main(String[] args) {
                
        SellerDao vendedorDao = DaoFactory.createSellerDao();
        Seller seller = vendedorDao.findById(3);
        
        System.out.println(seller);
    }
    
}
