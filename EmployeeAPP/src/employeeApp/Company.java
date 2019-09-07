package employeeApp;

// file name and class should be same
public class Company {
    private static int maxId = 0;
    public final static double match401K = 0.05;

    // discouraged to not have getters, setters and just make the variables public
    // to be able to modify
    public int id;
    public String name;
    public int debt;

    public Company(String name, int debt) {
        this.id = maxId++;
        this.name = name;
        this.debt = debt;
    }
}
