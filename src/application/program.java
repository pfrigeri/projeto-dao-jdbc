package application;

import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class program {
    public static void main(String[] args) {
        Department d = new Department(12, "Books");
        Seller seller = new Seller(21, "João", "joao@gmail.com", new Date(), 3000., d);
        System.out.println(seller);
    }
}
