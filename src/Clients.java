public class Clients {
    private Integer id;
    private String name;
    private String login;
    private int balance;
    private boolean block;

    Clients(Integer id, String name, String login, int balance, boolean block) {
        this.id = id;
        this.name = name;
        this.login = login;
        this.balance = balance;
        this.block = block;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public int getBalance() {
        return balance;
    }

    public boolean getBlock() {
        return block;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "Clients{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", balance=" + balance +
                ", block=" + block +
                '}';
    }
}
