package sample.data;

public class Company implements IUserData {
    private String name;
    private String nameDirector;
    private int code;

    public Company(String name, String nameDirector, int code) {
        this.name = name;
        this.nameDirector = nameDirector;
        this.code = code;
    }

    @Override
    public int compareTo(IUserData o) {
        return name.compareTo(((Company)o).getName());
    }

    public String getName() {
        return name;
    }

    public String getNameDirector() {
        return nameDirector;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return   name +
                ", director: " + nameDirector +
                ", code: " + code;
    }
}
