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
    public List<Clients> reverseNameAndloginFindById(int id) {
        List<Clients> result = new ArrayList<>();
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i).getId() == id) {
                String empty = "";
                for (int j = clients.get(i).getName().length() - 1; j >= 0; j--) {
                    empty = empty + clients.get(i).getName().charAt(j);
                }
                for (int j = clients.get(i).getLogin().length() - 1; j >= 0; j--) {
                    empty = empty + clients.get(i).getLogin().charAt(j);
                }
                clients.get(i).setName(empty);
                result.add(clients.get(i));
                clients.get(i).setLogin(empty);
                result.add(clients.get(i));
            }
        }
        return result;
    }
}
