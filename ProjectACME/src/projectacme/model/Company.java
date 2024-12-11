package projectacme.model;

public class Company {
    private int id; // * Autoincrement
    private String name;
    private String phone;

    public Company(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public Company(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
