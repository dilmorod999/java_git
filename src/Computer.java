public class Computer {
    private Integer id;
    private String name;
    private int price;
    private boolean bu;
    Computer(Integer id, String name, int price, boolean bu){
        this.id=id;
        this.name=name;
        this.price=price;
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

    public boolean getBu() {
        return bu;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBu(boolean bu) {
        this.bu = bu;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", bu=" + bu +
                '}';
    }
}
