import java.util.List;

public interface ClientRepository {
//создать метод который перевернут имя и логин клиента и вернет его найдя по айди
    Clients reverseNameAndloginFindById(int id);
//    Метод который увеличит баланс клиента у всех клиентов которые в блоке на значение переданого через аргумент
//Метод который найдет всех клиентов с балансом меньше нуля и которые заканчиваются на 2 и вернет их
    List<Clients> findClientBalanceLess0And2();
}
