public class TechnicalEmployee extends EMPLOYEE {
    protected int checkins; // Changed to protected

    public TechnicalEmployee(String name) {
        super(name, 75000.00);
        this.checkins = 0;
    }

    @Override
    public String employeeStatus() {
        return super.toString() + " has " + checkins + " successful check-ins";
    }

    @Override
    public double getBonus() {
        return 0; // Implement bonus logic if needed
    }

    public void incrementCheckins() {
        checkins++;
    }

    public int getCheckins() {
        return checkins;
    }
}
