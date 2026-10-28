public interface ProductRepository {
    Products findById(int id);
    int total();

}