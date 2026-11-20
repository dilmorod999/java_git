public class Cars {
    private Integer id;
    private String name;
    private int price;
    private String number;
    private boolean bu;
    Cars(Integer id, String name , int price, String number, boolean bu){
        this.id=id;
        this.name=name;
        this.price=price;
        this.number=number;
        this.bu=bu;

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

    public String getNumber() {
        return number;
    }

    public boolean getBu() {
        return bu;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", number='" + number + '\'' +
                ", bu=" + bu +
                '}';
    }
}
