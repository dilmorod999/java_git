public class Cars {
    private Integer id;
    private String name;
    private int price;
    private String number;
    Cars(Integer id, String name , int price, String number){
        this.id=id;
        this.name=name;
        this.price=price;
        this.number=number;
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

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", number='" + number + '\'' +
                '}';
    }
}
