public class Clients {
    private Integer id;
    private String name;
    private String login;
    private int balance;
    private String password;
    private boolean block;

    Clients(Integer id, String name, String login, int balance, String password, boolean block) {
        this.id = id;
        this.name = name;
        this.login = login;
        this.balance = balance;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Clients{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", balance=" + balance +
                ", password='" + password + '\'' +
                ", block=" + block +
                '}';
    }
}
