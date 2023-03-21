package homework_3_3.entity;

public class Course {

    private int id;
    private String Name;
    private double price;

    public Course() {
    }

    public Course(int id, String name, double price) {
        this.id = id;
        Name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
