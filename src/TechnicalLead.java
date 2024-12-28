import java.util.ArrayList;

public class TechnicalLead extends TechnicalEmployee {
    private ArrayList<SoftwareEngineer> team;

    public TechnicalLead(String name) {
        super(name);
        this.baseSalary *= 1.3;
        this.headcount = 4;
        this.team = new ArrayList<>();
    }

    public boolean hasHeadCount() {
        return team.size() < headcount;
    }

    public boolean addReport(SoftwareEngineer e) {
        if (hasHeadCount()) {
            team.add(e);
            e.setManager(this);
            return true;
        }
        return false;
    }

    public boolean approveCheckIn(SoftwareEngineer e) {
        return e.getManager().equals(this) && e.getCodeAccess();
    }

    public String getTeamStatus() {
        if (team.isEmpty()) {
            return employeeStatus() + " and no direct reports yet.";
        }
        StringBuilder status = new StringBuilder(employeeStatus() + " and is managing: \n");
        for (SoftwareEngineer engineer : team) {
            status.append("    ").append(engineer.employeeStatus()).append("\n");
        }
        return status.toString();
    }

    public boolean requestBonus(SoftwareEngineer e, double bonus) {
        BusinessLead businessLead = (BusinessLead) this.getAccountantSupport().getManager();
        return businessLead != null && businessLead.requestBonus(e, bonus);
    }

    public ArrayList<SoftwareEngineer> getTeam() {
        return team;
    }

    @Override
    public double getBonus() {
        return bonus;
    }
}
