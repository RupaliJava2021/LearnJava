package Day01;

import java.util.LinkedHashSet;

public class ClassLinkedList {

	public static void main(String[] args) {
		LinkedHashSet <String> products= new  LinkedHashSet<String>();
		{
			products.add("mango");
			products.add("potato");
			products.add(null);
			products.add("kiwi");
			products.add("mango");
			//products.add(  );
			for(String sproduct:products)
			{
				System.out.println(sproduct);
			}
			System.out.println(products);
			System.out.println(products.contains("kiwi"));
			System.out.println(products.remove(null));
			System.out.println(products);
			System.out.println(products.size());
			products.clear();
					
			System.out.println(products);
			products.add("butter");
			System.out.println(products);
			products.addAll(products);
		}
		
	}

}
