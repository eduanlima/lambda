package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import util.ProductPredicate;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.00));
		list.add(new Product("HD case", 80.90));
		
		list.removeIf(new ProductPredicate());
		print(list);
		
	}
	
	public static void print(List<Product> list) {
		for (Product p : list) {
			System.out.println(p);
		}
		
		System.out.println();
	} 
}
