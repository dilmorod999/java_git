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
    public List<Clients> findClientBalanceLess0And2() {
        List<Clients> result = new ArrayList<>();
        String empty = "";
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getBalance() < 0) {
                String balance = clients.get(i).getBalance() + "";
                String last = balance.substring(balance.length()-1);
                if (last.charAt(i) == 2){
                    empty = empty + last.charAt(i);
                }

            }
        }
        return result;
    }


}
