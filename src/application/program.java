package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class program {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller = sellerDao.findById(3);

        System.out.println("=== Teste 1: Seller findById ===");
        System.out.println(seller);
        System.out.println("=== Teste 2: Seller findById ===");
        System.out.println("=== Teste 1: Seller findById ===");
    }
}
