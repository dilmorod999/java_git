import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Products products = new Products(1, "Iphone", -2000, LocalDate.now());
        Products products1 = new Products(2, "aSamsunga", 1400, LocalDate.now());
        Products products2 = new Products(3, "Redmia", 900, LocalDate.now());
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
//        Home
//        Products max = productRepositoryImple.findMaxProduct();
//        System.out.println(max);
//        List<Products> maxMinProduct = productRepositoryImple.findMaxMinProduct();
//        System.out.println(maxMinProduct);
//        int totalLatsA = productRepositoryImple.findTotalLastA();
//        System.out.println(totalLatsA);
//        int AmountProductFirstLast = productRepositoryImple.AmountFirstLast();
//        System.out.println(AmountProductFirstLast);
//        int amountProductLast = productRepositoryImple.AmountLastName("a");
//        System.out.println(amountProductLast);
//        List<Products> reverseNegativePrice = productRepositoryImple.findReverseProductNegative();
//        System.out.println(reverseNegativePrice);
//        List<Products> NegativePrice = productRepositoryImple.findProductsNegativePrice();
//        System.out.println(NegativePrice);g
        Clients clients = new Clients(1, "Sasha", "Sasha67fgfhgfh", 4000,  "qab",true);
        Clients clients1 = new Clients(2, "Mixail", "Mixa", 3000, "qab",true);
        Clients clients2 = new Clients(3, "Dimitriy", "Dimas", -12, "wefwef",false);
        Clients clients3 = new Clients(4, "Pavel", "Koshka", 9999, "fewfew",false);
        ArrayList<Clients> clientsArrayList = new ArrayList<>();
        clientsArrayList.add(clients);
        clientsArrayList.add(clients1);
        clientsArrayList.add(clients2);
        clientsArrayList.add(clients3);
        ClientRepositoryImple clientRepositoryImple = new ClientRepositoryImple(clientsArrayList);
//        Clients reverseFindId = clientRepositoryImple.reverseNameAndloginFindById(2);
//        System.out.println(reverseFindId);
//        List<Clients> block = clientRepositoryImple.findBalanceBlock(1000);
//        System.out.println(block);
//        List<Clients> findBalanceless = clientRepositoryImple.findClientBalanceLess0And2();
//        System.out.println(findBalanceless);
        List<Clients> finddeleteABwithPasswordLogin10 = clientRepositoryImple.deleteABpasswordLogin10();
        System.out.println(finddeleteABwithPasswordLogin10);

    }
}