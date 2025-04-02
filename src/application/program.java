package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class program {
    public static void main(String[] args) {
        //fazer um remove para remover os funcionários repetidos no banco
        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller = sellerDao.findById(3);

        System.out.println("=== Teste 1: Seller findById ===");
        System.out.println(seller);

        System.out.println("\n=== Teste 2: Seller findByDepartment ===");
        Department dep = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(dep);
        for(Seller s : list){
            System.out.println(s);
        }

        System.out.println("\n=== Teste 3: Seller findAll ===");
        list = sellerDao.findAll();
        for(Seller s : list){
            System.out.println(s);
        }

        System.out.println("\n=== Teste 4: Seller Insert ===");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, dep);
        sellerDao.insert(newSeller);
        System.out.println("Inserted ! New id = " + newSeller.getID());
    }
}
