import java.util.List;

public interface ProductRepository {
    Products findById(int id);
    int total();
    List<Products> findByPriseRage(int min, int max);
    int amount(int price);
//    Создать метод репозитории как будет который будет возвращать самый дорогой продукт
    Products findMaxProduct();

}