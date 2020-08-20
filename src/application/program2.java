package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class program2 {

    public static void main(String[] args) {

        DepartmentDao departamentoDao = DaoFactory.createDepartmentDao();

        System.out.println("==== Teste 1: Teste insersão ====");
        Department novoDepartamento = new Department(0, "Vendas Online");
        departamentoDao.insert(novoDepartamento);
        System.out.println("Inserido! Novo id = " + novoDepartamento.getId());

    }

}
