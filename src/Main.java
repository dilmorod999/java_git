import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Products products = new Products(1, "Iphone", 2000, LocalDate.now());
        Products products1 = new Products(2, "Samsung", 1400, LocalDate.now());
        Products products2 = new Products(3, "Redmi", 900, LocalDate.now());
        ArrayList<Products> productsArrayList = new ArrayList<>();
        productsArrayList.add(products);
        productsArrayList.add(products1);
        productsArrayList.add(products2);
    }
}