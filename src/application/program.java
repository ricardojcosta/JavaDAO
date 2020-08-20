package application;

import java.util.List;
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

        System.out.println("==== Teste 2: Vendedor por Departamento ====");
        Department dep = new Department(2, null);
        List<Seller> lista = vendedorDao.findByDepartment(dep);
        for (Seller obj : lista) {
            System.out.println(obj);
        }
        
        System.out.println("==== Teste 3: Todos vendedores ====");
        lista = vendedorDao.findAll();
        for (Seller obj : lista) {
            System.out.println(obj);
        }
    }
}


