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
		
		displayByPrice(set, start, end);
	}

	public static void displayByPrice(HashSet<Product> s, int start, int end) {
		Iterator<Product> prod = s.iterator();
		while (prod.hasNext()) {
			Product temp = prod.next();
			if (temp.getProductCost() > start && (temp.getProductCost() < end)) {
				System.out.println("\nProdeuct Details");
				prod.next().displayProd(temp);
			}
		}

	}

}
