import java.util.List;

public interface ClientRepository {
//создать метод который перевернут имя и логин клиента и вернет его найдя по айди
    List<Clients> reverseNameAndloginFindById(int id);
}
