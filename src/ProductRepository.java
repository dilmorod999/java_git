import java.util.List;

public interface ProductRepository {
    Products findById(int id);
    int total();
    List<Products> findByPriseRage(int min, int max);
}