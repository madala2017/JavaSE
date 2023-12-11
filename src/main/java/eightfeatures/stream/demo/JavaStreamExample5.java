package eightfeatures.stream.demo;

import eightfeatures.stream.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamExample5 {

    public static void main(String[] args) {

        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",35000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));

        // Using Collector's method to sum the prices

        double totalPrice = productsList.stream().collect(Collectors.summingDouble(product -> product.getPrice()));
        System.out.println(totalPrice);
    }
}
