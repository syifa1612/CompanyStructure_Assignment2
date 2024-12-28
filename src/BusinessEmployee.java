public class BusinessEmployee extends EMPLOYEE {

    public BusinessEmployee(String name) {
        super(name, 50000.00);
    }

    @Override
    public double getBonus() {
        return bonus;
    }

    @Override
    public String employeeStatus() {
        String s = String.format("%.2f", bonusBudget);
        return this.toString() + " with a budget of " + s;
    }
}
