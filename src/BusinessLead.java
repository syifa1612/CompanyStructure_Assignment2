import java.util.ArrayList;

public class BusinessLead extends BusinessEmployee {
    private ArrayList<Accountant> team;

    public BusinessLead(String name) {
        super(name);
        this.baseSalary *= 2; // Base salary is double that of an Accountant
        this.headcount = 10;  // Default headcount
        this.team = new ArrayList<>();
    }

    public boolean hasHeadCount() {
        return team.size() < headcount;
    }

    public boolean addReport(Accountant e, TechnicalLead supportTeam) {
        if (hasHeadCount()) {
            team.add(e);
            e.setManager(this);
            e.supportTeam(supportTeam);
            this.bonusBudget += e.getBaseSalary() * 1.1;
            return true;
        }
        return false;
    }

    @Override
    public double getBonus() {
        return bonus;
    }

    public boolean requestBonus(EMPLOYEE e, double bonus) {
        if (bonus <= bonusBudget) {
            bonusBudget -= bonus;
            e.bonus += bonus;
            return true;
        }
        return false;
    }

    public boolean approveBonus(EMPLOYEE e, double bonus) {
        for (Accountant acc : team) {
            if (acc.getTeamSupported().equals(e.getManager()) && acc.canApproveBonus(bonus)) {
                acc.bonusBudget -= bonus;
                e.bonus += bonus;
                return true;
            }
        }
        return false;
    }

    public String getTeamStatus() {
        if (team.isEmpty()) {
            return this.employeeStatus() + " and no direct reports yet.";
        } else {
            StringBuilder status = new StringBuilder(this.employeeStatus() + " and is managing:\n");
            for (Accountant acc : team) {
                status.append("    ").append(acc.employeeStatus()).append("\n");
            }
            return status.toString();
        }
    }
}
