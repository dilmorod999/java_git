import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Products products = new Products(1, "Iphone", 2000, LocalDate.now());
        Products products1 = new Products(2, "Samsung", 1400, LocalDate.now());
        Products products2 = new Products(3, "Redmi", 900, LocalDate.now());
        ArrayList<Products> productsArrayList = new ArrayList<>();
        productsArrayList.add(products);
        productsArrayList.add(products1);
        productsArrayList.add(products2);
        ProductRepositoryImple productRepositoryImple = new ProductRepositoryImple(productsArrayList);
//        int total = productRepositoryImple.total();
//        System.out.println(total);
//        List<Products> minmax = productRepositoryImple.findByPriseRage(900, 2000);
//        System.out.println(minmax);
//        int amount = productRepositoryImple.amount(900);
//        System.out.println(amount);
        Products max = productRepositoryImple.findMaxProduct();
        System.out.println(max);

    }
}