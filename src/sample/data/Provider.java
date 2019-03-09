package sample.data;

public class Provider implements IUserData {
    private String name;
    private String phone;
    private String email;

    public Provider(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public int compareTo(IUserData o) {
        return name.compareTo(((Provider)o).getName());
    }

    @Override
    public String toString() {
        return "Provider{" +
                "name: " + name +
                ", phone: " + phone  +
                ", email: " + email +
                '}';
    }
}
