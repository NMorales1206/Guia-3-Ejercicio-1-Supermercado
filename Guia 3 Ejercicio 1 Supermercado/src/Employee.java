public class Employee {

    private int id;
    private String name;
    private double salary;
    private String department;
    private String charge;

    public Employee() {
        this(0, "Default name", 0000, "No department", "No Charge");
    }

    public Employee(int id, String name, double salary, String department, String charge) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.charge = charge;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    @Override
    public String toString() {
        return ("Employee's ID: " + this.getId() + "\n" +
                "Employee's Name: " + this.getName() + "\n" +
                "Employee's Salary: " + this.getSalary() + "\n" +
                "Employees's Department: " + this.getDepartment() + "\n" +
                "Employee's Charge: " + this.getCharge());
    }
}