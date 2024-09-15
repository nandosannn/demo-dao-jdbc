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

        List<Seller> listSeller = sellerDao.findByDepartments(2);

        System.out.println("\n=== TESTE 1: FIND BY DEPARTMENTS ===");
        for(Seller sl : listSeller){
            System.out.println(sl);
        }





    }
}