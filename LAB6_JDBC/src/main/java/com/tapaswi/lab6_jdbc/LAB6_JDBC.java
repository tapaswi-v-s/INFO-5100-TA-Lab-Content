/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.tapaswi.lab6_jdbc;

import java.util.List;
import models.Product;
import utils.DatabaseUtils;

/**
 *
 * @author tapas
 */
public class LAB6_JDBC {
//    CRUD - Create Read Update Delete
    public static void main(String[] args) {
        DatabaseUtils dbUtils = new DatabaseUtils();
        
        List<Product> products = dbUtils.getProducts();
        
        for (Product product : products) {
            System.out.println(product.toString());
        }
        
        
//        System.out.println("============ Insertion ============");
//        Product p1 = new Product("Apple", 10);
//        Product p2 = new Product("Banana", 20);
//        
//        dbUtils.insertProduct(p1);
//        dbUtils.insertProduct(p2);
//        System.out.println("Insertion DONE");

//          System.out.println("============ Updation ============");
//          Product p1 = new Product(6, "Cherry", 50);
//          Product p2 = new Product(7, "Avocado", 5);
//          dbUtils.updateProduct(p1);
//          dbUtils.updateProduct(p2);

//            System.out.println("============ Deletion ============");
//            dbUtils.deleteProduct(6);
//            dbUtils.deleteProduct(7);
//            System.out.println("DELETION DONE");
            
            dbUtils.close();
            
            products = dbUtils.getProducts();
        
            for (Product product : products) {
                System.out.println(product.toString());
            }
            

    }
}
