import java.time.LocalDate;

public class Products {
    private Integer id;
    private String name;
    private int price;
    private LocalDate date;

    Products(Integer id, String name, int price, LocalDate date) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", date=" + date +
                '}';
    }
}