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

    @Override
    public Products findMaxProduct() {
        Products maxProduct = null;
        int max = 0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getPrice() > max) {
                max = products.get(i).getPrice();
                maxProduct = products.get(i);
            }
        }
        return maxProduct;
    }

    @Override
    public List<Products> findMaxMinProduct() {
        List<Products> result = new ArrayList<>();
        Products maxProduct = null;
        Products minProduct = null;
        int max = 0;
        int min = products.get(0).getPrice();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getPrice() > max) {
                max = products.get(i).getPrice();
                maxProduct = products.get(i);
            }
            if (products.get(i).getPrice() < min) {
                min = products.get(i).getPrice();
                minProduct = products.get(i);
                result.add(maxProduct);
                result.add(minProduct);
            }
        }
        return result;
    }

    @Override
    public int findTotalLastA() {
        int total = 0;
        for (int i = 0; i < products.size(); i++) {
            String last = products.get(i).getName().substring(products.get(i).getName().length() - 1);
            if (last.equals("a")) {
                total = total + products.get(i).getPrice();
            }
        }
        return total;
    }

    @Override
    public int AmountFirstLast() {
        int amount =0;
        for (int i = 0; i <products.size() ; i++) {
            String first = products.get(i).getName().substring(0,1);
            String last = products.get(i).getName().substring(products.get(i).getName().length()-1);
            if (first.equals(last)){
                amount++;
            }
        }
        return amount;
    }


}