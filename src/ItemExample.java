import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import model.Items;


/**
 * @author sundaresan
 *
 */
public class ItemExample {
	
	public static void main(String[] args) {
		List<Items> resultList;
	    List<Items> itemList = new ArrayList<>();
		itemList.add(new Items(101, "Ted", "Creative", true, 10000));
		itemList.add(new Items(107, "Nexus", "Smartphone", true, 20000));
		itemList.add(new Items(108, "Timex", "watch", true, 70000));
		itemList.add(new Items(108, "Apple Watch", "Apple", false, 9000));
		itemList.add(new Items(110, "Torino", "Laptop", true, 90000));
		itemList.add(new Items(115, "Dell", "Laptop", true, 7000));
		itemList.add(new Items(120, "Samsung", "Smatphone", false, 100000));
		itemList.add(new Items(127, "Lenovo", "Tablet", true, 120000));
		itemList.add(new Items(105, "Think", "Tablet", false, 4000));
		itemList.add(new Items(109, "Sony Vaio", "Laptop", false, 8000));
		itemList.add(new Items(102, "Oneplus", "smartphone", true, 33000));
		resultList = itemList.stream().filter(x -> x.getBrand().startsWith("T")).sorted(Comparator.comparing(Items::getPrice).reversed())
		.collect(Collectors.toList());
		resultList.stream().forEach(System.out::println);
	}

}
