package eightfeatures.collectors.demo;

import eightfeatures.collectors.model.Product;
import eightfeatures.functionalinterface.service.Doable;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsExample1 {

    public static void main(String[] args) {

        List<Product> productsList = new ArrayList<>();
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));

        List<Float> productPriceList = productsList.stream().map(x -> x.getPrice()).collect(Collectors.toList()); // fetching price and collecting as list

        Set<Float> productPriceSet = productsList.stream().map(x -> x.getPrice()).collect(Collectors.toSet()); // fetching price and collecting as a Set

        Double sumPrices = productsList.stream().collect(Collectors.summingDouble(x -> x.getPrice()));
        Integer sumIds = productsList.stream().collect(Collectors.summingInt(x -> x.getId()));
        Double priceAverage = productsList.stream().collect(Collectors.averagingDouble(x -> x.getPrice()));

        Long noOfElements = productsList.stream().collect(Collectors.counting());

        System.out.println("Collecting List\n");
        System.out.println(productPriceList +"\n\n");

        System.out.println("Collecting Set\n");
        System.out.println(productPriceSet);

        System.out.println("\n Sum of prices: "+ sumPrices);
        System.out.println("\n Sum of id's: "+ sumIds);
        System.out.println("\n Average price: "+ priceAverage);
        System.out.println("\n Total elements: "+ noOfElements);
    }
}
