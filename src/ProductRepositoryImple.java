import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImple implements ProductRepository {
    private List<Products> products;

    ProductRepositoryImple(List<Products> products) {
        this.products = products;
    }

    public List<Products> getProducts() {
        return products;
    }

    @Override
    public Products findById(int id) {
        Products product = null;
        for (int i = 0; i < products.size(); i++) {
            if (product.getId() == id) {
                product = products.get(i);
            }
        }
        return product;
    }

    @Override
    public int total() {
        int total = 0;
        for (int i = 0; i < products.size(); i++) {
            total = total + products.get(i).getPrice();
        }
        return total;
    }

    @Override
    public List<Products> findByPriseRage(int min, int max) {
        List<Products> result = new ArrayList<>();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getPrice() > min && products.get(i).getPrice() < max) {
                result.add(products.get(i));
            }
        }
        return result;
    }

    @Override
    public int amount(int price) {
        int amount = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getPrice() > price) {
                amount++;
            }
        }
        return amount;
    }

}