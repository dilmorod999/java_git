public class Phone {
    private Integer id;
    private String name;
    private int price;
    private String model;
    private boolean bu;

    Phone(Integer id, String name, int price, String model, boolean bu) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.model = model;
        this.bu = bu;
    }

    public void setBu(boolean bu) {
        this.bu = bu;
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

    public String getModel() {
        return model;
    }

    public boolean getBu() {
        return bu;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", model='" + model + '\'' +
                ", bu=" + bu +
                '}';
    }
}
