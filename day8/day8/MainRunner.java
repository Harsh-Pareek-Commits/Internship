package day8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class MainRunner {
	public static void main(String[] args) {
		HashSet<Product> set = new HashSet<>();

		Product p1 = new Product("HP-LAPTOP", 2000, 5);
		set.add(p1);
		Product p2 = new Product("Dell-Laptop", 2000, 5);
		set.add(p2);
		Product p3 = new Product("Apple-Laptop", 2000, 5);
		set.add(p3);
		Product p4 = new Product("HP-Laptop", 2000, 5);
		set.add(p4);
		System.out.println("Please enter your price  range: ");
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		System.out.println("Please enter your rating  range: ");
		int rstart = sc.nextInt();
		int rend = sc.nextInt();
		displayByPrice(set, start, end);
		displayByRating(set, rstart, rend);
	}

	public static void displayByPrice(HashSet<Product> s, int start, int end) {
		Iterator<Product> prod = s.iterator();
		int i=0;
		System.out.println("===============PRODUCTS BY PRICE=================");
		while (prod.hasNext()) {
			Product temp = prod.next();
			if (temp.getProductCost() > start && (temp.getProductCost() < end)) {
				System.out.println("\nProdeuct Details by price  "+ ++i);
				temp.displayProd(temp);
			}
		}
		System.out.println("===============END OF PRODUCTS BY PRICE=================\n");
		
	}
	public static void displayByRating(HashSet<Product> s, int start, int end) {
		Iterator<Product> prod = s.iterator();
		int i=0;
		System.out.println("===============PRODUCTS BY RATING=================");
		
		while (prod.hasNext()) {
			Product temp = prod.next();
			if (temp.getStartRating() > start && (temp.getStartRating() < end)) {
				System.out.println("\nProdeuct Details  "+ ++i);
				temp.displayProd(temp);
			}
		}
		System.out.println("===============END OF PRODUCTS BY RATING=================");
			
	}

}
