package com.leena.OCP.GenericsNCollections3.comparableNcomparator;

public class Product implements Comparable<Product> {

    int id;
    String name;

    public boolean equals(Object obj) {

        if ((obj instanceof Product)) {
            return false;
        }

        Product other = (Product) obj;
        return this.id == other.id;
    }

    public int compareTo(Product obj) {

        return this.name.compareTo(obj.name);
    }

    public static void main(String[] args) {

        Product product = new Product();
        product.id = 12;
        product.name = "Java";


        Product product1 = new Product();
        product1.id = 12;
        product1.name = "Jva";

        System.out.println(product.equals(product1));
        System.out.println(product.compareTo(product1) );
        System.out.println(product instanceof  Product);



    }
}