public class SoftwareEngineer extends TechnicalEmployee {
    private boolean codeAccess;

    public SoftwareEngineer(String name) {
        super(name);
        this.codeAccess = false;
    }

    public boolean getCodeAccess() {
        return codeAccess;
    }

    public void setCodeAccess(boolean access) {
        this.codeAccess = access;
    }

    public int getSuccessfulCheckIns() {
        return checkins;
    }

    public boolean checkInCode() {
        if (this.getManager() instanceof TechnicalLead) {
            TechnicalLead manager = (TechnicalLead) this.getManager();
            if (manager.approveCheckIn(this)) {
                checkins++;
                return true;
            } else {
                codeAccess = false;
                return false;
            }
        }
        return false;
    }
}
