package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.impl.DepartmentDaoJDBC;
import model.entities.Department;

import java.util.ArrayList;
import java.util.List;

public class program2 {
    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

//        System.out.println("=== Teste 1: Department Insert ===");
//        Department dep = new Department(null, "Finances");
//        departmentDao.insert(dep);
//        System.out.println("Inserted ! New id = " + dep.getID());
//
          System.out.println("=== Teste 2: Department Update ===");
          Department dep = departmentDao.findById(7);
          dep.setName("Religion");
          departmentDao.update(dep);
          System.out.println("Update complete !");

        System.out.println("=== Teste 3: Department findBy Id ===");
        Department dep2 = departmentDao.findById(6);
        System.out.println(dep);

        System.out.println("=== Teste 4: Department deleteById ===");
        departmentDao.deleteById(8);
        System.out.println("Deletion Successful !");

        System.out.println("=== Teste 4: Department findAll ===");
        List<Department> list =  new ArrayList<>();
        list = departmentDao.findAll();

        for(Department d : list){
            System.out.println(d);
        }
    }
}
