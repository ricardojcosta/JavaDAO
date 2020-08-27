package application;

import java.util.List;
import java.util.Scanner;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class program2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DepartmentDao departamentoDao = DaoFactory.createDepartmentDao();

        System.out.println("==== Teste 1: Teste Insersão ====");
        Department novoDepartamento = new Department(0, "Marketing");
        departamentoDao.insert(novoDepartamento);
        System.out.println("Inserido! Novo id = " + novoDepartamento.getId());

        System.out.println("==== Teste 2: Departamento por ID ====");
        Department departamento = departamentoDao.findById(24);
        System.out.println(departamento);

        System.out.println("==== Teste 3: Teste Update ====");
        departamento = departamentoDao.findById(24);
        departamento.setName("Informática");
        departamentoDao.update(departamento);
        System.out.println("Atualização completada");
        System.out.println(departamento);
        
        
        System.out.println("==== Teste 4: Deletar Departamento ====");
         System.out.println("Digite o Id para deletar");
        int id = sc.nextInt();
        departamentoDao.deleteById(id);
        System.out.println("Deletado");
        
        System.out.println("==== Teste 5: Todos Departamentos ====");
        List<Department> lista = departamentoDao.findAll();
        for (Department obj : lista) {
            System.out.println(obj);
        }
    }

}
