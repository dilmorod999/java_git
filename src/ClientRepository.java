import java.util.List;

public interface ClientRepository {
//создать метод который перевернут имя и логин клиента и вернет его найдя по айди
    Clients reverseNameAndloginFindById(int id);
//    Метод который увеличит баланс клиента у всех клиентов которые в блоке на значение переданого через аргумент
    List<Clients> findBalanceBlock(int value);
//Метод который найдет всех клиентов с балансом меньше нуля и которые заканчиваются на 2 и вернет их
    List<Clients> findClientBalanceLess0And2();
//    метод который перевернет и удалить букву а и б из пароля клиента если логин клиента больше 10
    List<Clients> deleteABpasswordLogin10();
//    метод который вернет клиента по айди при этом его логин будет содержать через тире его так же пароль
   List <Clients >findClientLoginPassword(int id);

}
