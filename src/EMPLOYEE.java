public abstract class EMPLOYEE {

    private static int countID = 0;

    private final String name;
    private final int employeeID;
    protected double baseSalary; // Changed to protected
    protected double bonus;      // Changed to protected

    protected EMPLOYEE manager;  // Changed to protected
    protected Accountant accountantSupport; // Changed to protected
    protected int headcount = 0; // Changed to protected
    protected double bonusBudget; // Changed to protected

    public EMPLOYEE(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
        countID++;
        this.employeeID = countID;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public EMPLOYEE getManager() {
        return manager;
    }

    public void setManager(EMPLOYEE manager) {
        this.manager = manager;
    }

    public Accountant getAccountantSupport() {
        return accountantSupport;
    }

    public void setAccountantSupport(Accountant accountantSupport) {
        this.accountantSupport = accountantSupport;
    }

    public double getBonusBudget() {
        return bonusBudget;
    }

    public void setBonusBudget(double bonusBudget) {
        this.bonusBudget = bonusBudget;
    }

    public boolean equals(EMPLOYEE other) {
        return other != null && this.employeeID == other.employeeID;
    }

    @Override
    public String toString() {
        return employeeID + " " + name;
    }

    public abstract String employeeStatus();

    public abstract double getBonus();
}
