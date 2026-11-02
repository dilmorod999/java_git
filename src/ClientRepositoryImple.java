import java.util.ArrayList;
import java.util.List;

public class ClientRepositoryImple implements ClientRepository {
    private List<Clients> clients;

    ClientRepositoryImple(List<Clients> clients) {
        this.clients = clients;
    }

    public List<Clients> clients() {
        return clients;
    }

    @Override
    public Clients reverseNameAndloginFindById(int id) {
        Clients found = null;
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getId() == id) {
                String emptyName = "";
                for (int j = clients.get(i).getName().length() - 1; j >= 0; j--) {
                    emptyName = emptyName + clients.get(i).getName().charAt(j);
                }
                String emptyLogin = "";
                for (int j = clients.get(i).getLogin().length() - 1; j >= 0; j--) {
                    emptyLogin = emptyLogin + clients.get(i).getLogin().charAt(j);
                }
                clients.get(i).setName(emptyName);
                clients.get(i).setLogin(emptyLogin);
                found = clients.get(i);

            }
        }
        return found;
    }

    @Override
    public List<Clients> findBalanceBlock(int value) {
        List<Clients> result = new ArrayList<>();
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getBlock() == true) {
                clients.get(i).setBalance(value);
                result.add(clients.get(i));
            }
        }
        return result;
    }
//Метод который найдет всех клиентов с балансом меньше нуля и которые заканчиваются на 2 и вернет их

    @Override
    public List<Clients> findClientBalanceLess0And2() {
        List<Clients> result = new ArrayList<>();
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getBalance() < 0) {
                String balance = clients.get(i).getBalance() + "";
                String last = balance.substring(balance.length() - 1);
                if (last.equals("2")) {
                    result.add(clients.get(i));
                }
            }
        }
        return result;
    }

    //метод который перевернет и удалить букву а и б из пароля клиента если логин клиента больше 10
    @Override
    public List<Clients> deleteABpasswordLogin10() {
        List<Clients> result = new ArrayList<>();
        for (int i = 0; i < clients.size(); i++) {
            String empty = "";
            if (clients.get(i).getLogin().length() < 10) {
                for (int j = 0; j < clients.get(i).getPassword().length(); j++) {
                    if (clients.get(i).getPassword().charAt(j) != 'a' && clients.get(i).getPassword().charAt(j) != 'b') {
                        empty = empty + clients.get(i).getPassword().charAt(j);
                    }
                }
                clients.get(i).setPassword(empty);
                result.add(clients.get(i));
            }
        }
        return result;
    }


}
