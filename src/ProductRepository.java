import java.util.List;

public interface ProductRepository {
    Products findById(int id);
    int total();
    List<Products> findByPriseRage(int min, int max);
    int amount(int price);
//    Создать метод репозитории как будет который будет возвращать самый дорогой продукт
    Products findMaxProduct();
//Создать метод по истории которые будут возвращать сумму самого дорогого и самого дешёвого продуктов
    List<Products> findMaxMinProduct();

}