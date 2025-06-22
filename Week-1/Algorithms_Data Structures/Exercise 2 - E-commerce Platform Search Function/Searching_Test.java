import java.util.*;

public class Searching_Test {

    public static Product linearSearch(Product[] products, String k) {  //we are returning Product class type
        for (Product p : products) {
            if (p.productName.equals(k)) {
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String k) {
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));
        int low = 0, high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = k.compareToIgnoreCase(products[mid].productName);
            if (cmp == 0) return products[mid];
            else if (cmp < 0) high = mid - 1;
            else low = mid + 1;
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Phone", "Electronics"),
            new Product(3, "Coffee", "Grocery"),
            new Product(4, "Tomatoes", "Grocery"),
            new Product(5, "CognizantHoody", "Fashion")
        };

        String s = "Coffee";

        System.out.println("Linear Search:");
        Product lr = linearSearch(products, s);
        if(lr!=null) System.out.println(lr+"    "+"Product Found");
        else System.out.println("Product Not Found");

        System.out.println("\nBinary Search:");
        Product br = binarySearch(products, s);
        if(br!=null) System.out.println(lr+"    "+"Product Found");
        else System.out.println("Product Not Found");
    }
}