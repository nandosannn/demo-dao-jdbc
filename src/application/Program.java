package application;

import java.util.Date;
import java.util.List;

import model.dao.FactoryDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

    public static void main(String[] args) {
        SellerDao sellerDao = FactoryDao.createSellerDao();

        Seller seller = sellerDao.findById(3);

        System.out.println("=== TESTE 1: FIND BY ID ===");
        System.out.println(seller);
        Department department = new Department(2, null);
        List<Seller> listSeller = sellerDao.findByDepartments(department.getId());
        
        System.out.println("\n=== TESTE 2: FIND BY DEPARTMENTS ===");
        for(Seller sl : listSeller){
            System.out.println(sl);
        }

        List<Seller> listAllSeller = sellerDao.findAll();

        System.out.println("\n=== TESTE 3: FIND ALL ===");
        for(Seller sl : listAllSeller){
            System.out.println(sl);
        }

        System.out.println("\n=== TESTE 4: INSERT ===");
        Seller sellerNew = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
        sellerDao.insert(sellerNew);
        System.out.println("Inserted! New id = " + sellerNew.getId());

        System.out.println("\n=== TEST 5: seller update =====");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Update completed");
        
    }
}