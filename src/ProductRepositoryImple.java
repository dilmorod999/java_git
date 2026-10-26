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
}
