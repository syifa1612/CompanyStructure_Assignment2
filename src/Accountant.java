public class Accountant extends BusinessEmployee {
    private TechnicalLead teamSupported;

    public Accountant(String name) {
        super(name);
        bonusBudget = 0;
    }

    public TechnicalLead getTeamSupported() {
        return teamSupported;
    }

    public void supportTeam(TechnicalLead lead) {
        this.teamSupported = lead;
        for (SoftwareEngineer engineer : lead.getTeam()) {
            this.bonusBudget += engineer.getBaseSalary() * 1.1;
        }
    }

    public boolean canApproveBonus(double bonus) {
        return bonus <= bonusBudget;
    }

    @Override
    public String employeeStatus() {
        String teamLeadName = (teamSupported != null) ? teamSupported.getName() : "no one";
        return this.toString() + " with a budget of " + bonusBudget + " is supporting " + teamLeadName;
    }
}
