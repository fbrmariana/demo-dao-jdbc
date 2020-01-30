package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		/*

		System.out.println("=== TEST 1: seller findById =====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		 System.out.println("/n=== TEST 2: seller findByDepartment =====");
		Department department = new Department (1,null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		

		System.out.println("/n=== TEST 3: seller findAll =====");
        list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}


		
		System.out.println("/n=== TEST 4: seller insert =====");
		Department department = new Department (1,null);
		Seller newSeller = new Seller (null,"Denilson", "denilson.dlr@gmail.com", new Date() , 20000.00 , department );
		sellerDao.insert(newSeller);
		System.out.println("Insert ! New id = " + newSeller.getId());

       */
		
		System.out.println("/n=== TEST 5: seller update =====");
		Seller seller = sellerDao.findById(8);
		seller = sellerDao.findById(8);
		seller.setName("Mariana Bueno Leite");
		seller.setBaseSalary(30000.00);
		sellerDao.update(seller);
		System.out.println("Update completed");

		/*


		
		System.out.println("/n=== TEST 6: seller delete =====");
		System.out.println("Enter id for delete test:");
		int id = sc.nextInt ();
		sellerDao.deleteById(id);
		System.out.println("Delete completed");
		
		sc.close();

		*/
		


	}

}
