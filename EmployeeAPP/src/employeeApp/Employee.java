package employeeApp;

public class Employee {
    // fields - state - information
    // static variable same value across all objects
    private static int maxId = 0;
    private int id;
    private String fname;
    private String lname;
    private double salary; // float
    private Boolean has401K; // boolean lowercase
    private int companyId;
    private int healthPlanId;

    // constructor (method, but specific type, same name as class itself)

    public Employee(String fname, String lname, double salary, Boolean has401K, int companyId, int healthPlanId) {
        maxId++;
        id = maxId;

        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
        this.has401K = has401K;
        this.companyId = companyId;
        this.healthPlanId = healthPlanId;
    }

    // methods - behaviors

    // methods - getters and setters

    public int getId() {
        return id;
    }

    public String getName() {
        return fname + " " + lname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Boolean getHas401K() {
        return has401K;
    }

    public void setHas401K(Boolean has401K) {
        this.has401K = has401K;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public int getHealthPlanId() {
        return healthPlanId;
    }

    public void setHealthPlanId(int healthPlanId) {
        this.healthPlanId = healthPlanId;
    }

    // regular methods
    public void giveRaise(double raise) {
        double raiseAmt;
        raiseAmt = salary * raise;
        salary = salary + raiseAmt;
    }

    @Override
    public String toString() {
        String rtnStr = "id: " + id + "\n" + "fname: " + fname + "\n" + "lname: " + lname + "\n" + "salary: " + salary
                + "\n" + "has401K: " + has401K + "\n" + "companyId: " + companyId + "\n" + "healthPlanId: "
                + healthPlanId + "\n";
        return rtnStr;
    }
}
