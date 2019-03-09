package sample.data;

public class ShoppingChain implements IUserData {
    private String name;
    private String region;
    private int countCompanyFromChain;

    public ShoppingChain(String name, String region) {
        this.name = name;
        this.region = region;
        this.countCompanyFromChain = 0;
    }

    @Override
    public int compareTo(IUserData o) {
        return 0;
    }

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public int getCountCompanyFromChain() {
        return countCompanyFromChain;
    }

    public void addCompanyFromChain() {
        this.countCompanyFromChain++;
    }

    @Override
    public String toString() {
        return   name +
                ", region: " + region +
                ", countCompanyFromChain=" + countCompanyFromChain;
    }
}
