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

    public LocalDate getDate() {
        return date;
    }

}
