package Unit4.day11.q2;

import java.util.Scanner;
import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {
        TreeSet<Productbean> products = new TreeSet<>(new productId());

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Choice of Sort");
        int choice = sc.nextInt();

        if(choice==1)
            products = new TreeSet<>(new productName());

        if(choice==2)
            products = new TreeSet<>(new ProductPrice());

        if(choice==3)
            products = new TreeSet<>(new productId());

        int count = 1;
        while(count<=4) {
            System.out.println("Enter details of product"+count++);

            System.out.println("Enter Product Id");
            int pId = sc.nextInt();

            System.out.println("Enter Product Name");
            String pName = sc.next();

            System.out.println("Enter Product Price");
            double pPrice = sc.nextDouble();

            Productbean product = new Productbean(pId, pName, pPrice);
            products.add(product);

        }




        System.out.println(products);
    }
}
